package net.mcreator.craftkaisen.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.craftkaisen.CraftKaisenMod;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CraftKaisenModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		CraftKaisenMod.addNetworkMessage(SavedDataSyncMessage.class, SavedDataSyncMessage::buffer, SavedDataSyncMessage::new, SavedDataSyncMessage::handler);
		CraftKaisenMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide())
				((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(event.getEntity());
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.race = original.race;
			clone.affiliation = original.affiliation;
			clone.reputation = original.reputation;
			clone.currentExp = original.currentExp;
			clone.maxExp = original.maxExp;
			clone.skillPoints = original.skillPoints;
			clone.currentCursedEnergy = original.currentCursedEnergy;
			clone.maxCursedEnergy = original.maxCursedEnergy;
			clone.cursedEnergyStat = original.cursedEnergyStat;
			clone.healthStat = original.healthStat;
			clone.strengthStat = original.strengthStat;
			clone.speedStat = original.speedStat;
			clone.ability1 = original.ability1;
			clone.ability2 = original.ability2;
			clone.ability3 = original.ability3;
			clone.ability4 = original.ability4;
			clone.ability5 = original.ability5;
			clone.ability6 = original.ability6;
			clone.energyControl = original.energyControl;
			clone.special = original.special;
			clone.maxOutput = original.maxOutput;
			clone.level = original.level;
			clone.abilitylist = original.abilitylist;
			clone.technique = original.technique;
			clone.characterCreated = original.characterCreated;
			clone.specialCheck = original.specialCheck;
			clone.CeNature = original.CeNature;
			clone.Squad = original.Squad;
			clone.InParty = original.InParty;
			clone.PartyRole = original.PartyRole;
			clone.PartyLabel = original.PartyLabel;
			clone.PlayerDisplayName = original.PlayerDisplayName;
			clone.CurrentMission = original.CurrentMission;
			clone.Yen = original.Yen;
			clone.ReputationStatus = original.ReputationStatus;
			clone.Miracles = original.Miracles;
			clone.CtSpecial = original.CtSpecial;
			clone.SimpleDomainType = original.SimpleDomainType;
			clone.EvadeLevel = original.EvadeLevel;
			clone.Durability = original.Durability;
			clone.Fame = original.Fame;
			clone.Grade = original.Grade;
			clone.inventorycurse = original.inventorycurse;
			clone.RenderSpecial = original.RenderSpecial;
			clone.SukunaLevel = original.SukunaLevel;
			clone.CSM4 = original.CSM4;
			clone.CSM3 = original.CSM3;
			clone.CSM2 = original.CSM2;
			clone.CSM1 = original.CSM1;
			clone.RCT = original.RCT;
			clone.RCTLevel = original.RCTLevel;
			clone.RCTExp = original.RCTExp;
			clone.Traits = original.Traits;
			clone.YutaEventHappened = original.YutaEventHappened;
			clone.Passives = original.Passives;
			clone.RCTdecoy = original.RCTdecoy;
			clone.CurrentBounties = original.CurrentBounties;
			clone.HasBounty = original.HasBounty;
			clone.Bounty = original.Bounty;
			clone.RatioMastery = original.RatioMastery;
			clone.DomainAmplificationUnlocked = original.DomainAmplificationUnlocked;
			clone.Ability9 = original.Ability9;
			clone.Ability12 = original.Ability12;
			clone.Ability8 = original.Ability8;
			clone.Ability11 = original.Ability11;
			clone.DomainExpansionUnlocked = original.DomainExpansionUnlocked;
			clone.Ability7 = original.Ability7;
			clone.Ability10 = original.Ability10;
			clone.Intelligence = original.Intelligence;
			clone.SimpleDomainUnlocked = original.SimpleDomainUnlocked;
			clone.CreatedClan = original.CreatedClan;
			clone.TojiEventHappened = original.TojiEventHappened;
			clone.Clan = original.Clan;
			clone.ClansInWorld = original.ClansInWorld;
			clone.Perk = original.Perk;
			clone.Lives = original.Lives;
			clone.SelfVow = original.SelfVow;
			clone.SfDesc = original.SfDesc;
			clone.CeMastery = original.CeMastery;
			clone.PageSelfVow = original.PageSelfVow;
			clone.FlowCooldownTimer = original.FlowCooldownTimer;
			clone.FlowCooldownActive = original.FlowCooldownActive;
			clone.PrestigeLevel = original.PrestigeLevel;
			clone.Souls = original.Souls;
			clone.Slot2 = original.Slot2;
			clone.Slot3 = original.Slot3;
			clone.Slot4 = original.Slot4;
			clone.Slot5 = original.Slot5;
			clone.Slot0 = original.Slot0;
			clone.Slot1 = original.Slot1;
			clone.Slot6 = original.Slot6;
			clone.Slot7 = original.Slot7;
			if (!event.isWasDeath()) {
				clone.currentMove = original.currentMove;
				clone.currentOutput = original.currentOutput;
				clone.Cooldown1 = original.Cooldown1;
				clone.Cooldown2 = original.Cooldown2;
				clone.Cooldown3 = original.Cooldown3;
				clone.Cooldown4 = original.Cooldown4;
				clone.Cooldown5 = original.Cooldown5;
				clone.Cooldown6 = original.Cooldown6;
				clone.InCombat = original.InCombat;
				clone.ComboCount = original.ComboCount;
				clone.DoingMission = original.DoingMission;
				clone.TenShadowDeaths = original.TenShadowDeaths;
				clone.Page = original.Page;
				clone.DomainClashCombo = original.DomainClashCombo;
				clone.flowerexpand = original.flowerexpand;
				clone.BlackFlashRarity = original.BlackFlashRarity;
				clone.MoveCombo = original.MoveCombo;
				clone.PerkDescription = original.PerkDescription;
				clone.PerkPage = original.PerkPage;
				clone.leftArmDamage = original.leftArmDamage;
				clone.rightArmDamage = original.rightArmDamage;
				clone.rightLegDamage = original.rightLegDamage;
				clone.RightLegGone = original.RightLegGone;
				clone.RightArmGone = original.RightArmGone;
				clone.LeftLegGone = original.LeftLegGone;
				clone.leftLegDamage = original.leftLegDamage;
				clone.LeftArmGone = original.LeftArmGone;
			}
		}

		@SubscribeEvent
		public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData mapdata = MapVariables.get(event.getEntity().level);
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (mapdata != null)
					CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(0, mapdata));
				if (worlddata != null)
					CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimension(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level.isClientSide()) {
				SavedData worlddata = WorldVariables.get(event.getEntity().level);
				if (worlddata != null)
					CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) event.getEntity()), new SavedDataSyncMessage(1, worlddata));
			}
		}
	}

	public static class WorldVariables extends SavedData {
		public static final String DATA_NAME = "craft_kaisen_worldvars";

		public static WorldVariables load(CompoundTag tag) {
			WorldVariables data = new WorldVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level level && !level.isClientSide())
				CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(level::dimension), new SavedDataSyncMessage(1, this));
		}

		static WorldVariables clientSide = new WorldVariables();

		public static WorldVariables get(LevelAccessor world) {
			if (world instanceof ServerLevel level) {
				return level.getDataStorage().computeIfAbsent(e -> WorldVariables.load(e), WorldVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class MapVariables extends SavedData {
		public static final String DATA_NAME = "craft_kaisen_mapvars";
		public String vesselPlayerOne = "\"\"";
		public String vesselTechnique = "\"\"";
		public String vesselPlayerTwo = "\"\"";
		public String EligibleMoves = "Simple Barrier - Hollow Wicker Basket";
		public double worldeventlocation = 0;
		public double WorldEventTimer = 0;
		public double WEZ = 0;
		public double neary = 0;
		public double nearx = 0;
		public double nearz = 0;

		public static MapVariables load(CompoundTag tag) {
			MapVariables data = new MapVariables();
			data.read(tag);
			return data;
		}

		public void read(CompoundTag nbt) {
			vesselPlayerOne = nbt.getString("vesselPlayerOne");
			vesselTechnique = nbt.getString("vesselTechnique");
			vesselPlayerTwo = nbt.getString("vesselPlayerTwo");
			EligibleMoves = nbt.getString("EligibleMoves");
			worldeventlocation = nbt.getDouble("worldeventlocation");
			WorldEventTimer = nbt.getDouble("WorldEventTimer");
			WEZ = nbt.getDouble("WEZ");
			neary = nbt.getDouble("neary");
			nearx = nbt.getDouble("nearx");
			nearz = nbt.getDouble("nearz");
		}

		@Override
		public CompoundTag save(CompoundTag nbt) {
			nbt.putString("vesselPlayerOne", vesselPlayerOne);
			nbt.putString("vesselTechnique", vesselTechnique);
			nbt.putString("vesselPlayerTwo", vesselPlayerTwo);
			nbt.putString("EligibleMoves", EligibleMoves);
			nbt.putDouble("worldeventlocation", worldeventlocation);
			nbt.putDouble("WorldEventTimer", WorldEventTimer);
			nbt.putDouble("WEZ", WEZ);
			nbt.putDouble("neary", neary);
			nbt.putDouble("nearx", nearx);
			nbt.putDouble("nearz", nearz);
			return nbt;
		}

		public void syncData(LevelAccessor world) {
			this.setDirty();
			if (world instanceof Level && !world.isClientSide())
				CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.ALL.noArg(), new SavedDataSyncMessage(0, this));
		}

		static MapVariables clientSide = new MapVariables();

		public static MapVariables get(LevelAccessor world) {
			if (world instanceof ServerLevelAccessor serverLevelAcc) {
				return serverLevelAcc.getLevel().getServer().getLevel(Level.OVERWORLD).getDataStorage().computeIfAbsent(e -> MapVariables.load(e), MapVariables::new, DATA_NAME);
			} else {
				return clientSide;
			}
		}
	}

	public static class SavedDataSyncMessage {
		private final int type;
		private SavedData data;

		public SavedDataSyncMessage(FriendlyByteBuf buffer) {
			this.type = buffer.readInt();
			CompoundTag nbt = buffer.readNbt();
			if (nbt != null) {
				this.data = this.type == 0 ? new MapVariables() : new WorldVariables();
				if (this.data instanceof MapVariables mapVariables)
					mapVariables.read(nbt);
				else if (this.data instanceof WorldVariables worldVariables)
					worldVariables.read(nbt);
			}
		}

		public SavedDataSyncMessage(int type, SavedData data) {
			this.type = type;
			this.data = data;
		}

		public static void buffer(SavedDataSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeInt(message.type);
			if (message.data != null)
				buffer.writeNbt(message.data.save(new CompoundTag()));
		}

		public static void handler(SavedDataSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer() && message.data != null) {
					if (message.type == 0)
						MapVariables.clientSide = (MapVariables) message.data;
					else
						WorldVariables.clientSide = (WorldVariables) message.data;
				}
			});
			context.setPacketHandled(true);
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("craft_kaisen", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public String race = "";
		public String affiliation = "";
		public double reputation = 0;
		public double currentExp = 0;
		public double maxExp = 0;
		public double skillPoints = 0;
		public double currentCursedEnergy = 0;
		public double maxCursedEnergy = 0;
		public double cursedEnergyStat = 0;
		public double healthStat = 0;
		public double strengthStat = 0;
		public double speedStat = 0;
		public String ability1 = "";
		public String ability2 = "";
		public String ability3 = "";
		public String ability4 = "";
		public String ability5 = "";
		public String ability6 = "";
		public String currentMove = "";
		public double energyControl = 0;
		public String special = "";
		public double maxOutput = 0;
		public double level = 0;
		public double currentOutput = 10.0;
		public String abilitylist = "";
		public String technique = "";
		public boolean characterCreated = false;
		public boolean specialCheck = false;
		public String CeNature = "\"\"";
		public boolean Cooldown1 = false;
		public boolean Cooldown2 = false;
		public boolean Cooldown3 = false;
		public double Cooldown4 = 0;
		public double Cooldown5 = 0;
		public double Cooldown6 = 0;
		public String Squad = " ";
		public boolean InParty = false;
		public String PartyRole = "";
		public String PartyLabel = "";
		public String PlayerDisplayName = "";
		public boolean InCombat = false;
		public double ComboCount = 0;
		public boolean DoingMission = false;
		public String CurrentMission = "\"\"";
		public double Yen = 0;
		public String ReputationStatus = "\"\"";
		public double Miracles = 0;
		public boolean CtSpecial = false;
		public String TenShadowDeaths = "\"\"";
		public String SimpleDomainType = "Circle";
		public String Page = "Melee";
		public double EvadeLevel = 1.0;
		public double Durability = 0;
		public double Fame = 0;
		public String Grade = "\"\"";
		public double DomainClashCombo = 0;
		public boolean inventorycurse = false;
		public String RenderSpecial = "\"\"";
		public double SukunaLevel = 0;
		public double flowerexpand = 0;
		public String CSM4 = "\"\"";
		public String CSM3 = "\"\"";
		public String CSM2 = "\"\"";
		public String CSM1 = "\"\"";
		public boolean RCT = false;
		public double RCTLevel = 0;
		public double RCTExp = 0;
		public double BlackFlashRarity = 10.0;
		public String Traits = "\"\"";
		public boolean YutaEventHappened = false;
		public String Passives = "\"\"";
		public double RCTdecoy = 0;
		public String CurrentBounties = "\"\"";
		public boolean HasBounty = false;
		public double Bounty = 0;
		public double RatioMastery = 0;
		public boolean DomainAmplificationUnlocked = false;
		public String Ability9 = "\"\"";
		public String Ability12 = "\"\"";
		public String Ability8 = "\"\"";
		public String Ability11 = "\"\"";
		public boolean DomainExpansionUnlocked = false;
		public String Ability7 = "\"\"";
		public String Ability10 = "\"\"";
		public double Intelligence = 0.0;
		public String MoveCombo = "\"\"";
		public boolean SimpleDomainUnlocked = false;
		public String CreatedClan = "\"\"";
		public boolean TojiEventHappened = false;
		public String Clan = "\"\"";
		public String ClansInWorld = "\"\"";
		public String PerkDescription = "\"\"";
		public String PerkPage = "\"\"";
		public String Perk = "\"\"";
		public double Lives = 2.0;
		public String SelfVow = "\"\"";
		public String SfDesc = "\"\"";
		public double CeMastery = 0;
		public String PageSelfVow = "Overtime";
		public double FlowCooldownTimer = 0;
		public boolean FlowCooldownActive = false;
		public double PrestigeLevel = 0;
		public double Souls = 0;
		public double leftArmDamage = 0;
		public double rightArmDamage = 0;
		public double rightLegDamage = 0;
		public boolean RightLegGone = false;
		public boolean RightArmGone = false;
		public boolean LeftLegGone = false;
		public ItemStack Slot2 = ItemStack.EMPTY;
		public ItemStack Slot3 = ItemStack.EMPTY;
		public ItemStack Slot4 = ItemStack.EMPTY;
		public ItemStack Slot5 = ItemStack.EMPTY;
		public ItemStack Slot0 = ItemStack.EMPTY;
		public double leftLegDamage = 0;
		public ItemStack Slot1 = ItemStack.EMPTY;
		public ItemStack Slot6 = ItemStack.EMPTY;
		public ItemStack Slot7 = ItemStack.EMPTY;
		public boolean LeftArmGone = false;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				CraftKaisenMod.PACKET_HANDLER.send(PacketDistributor.PLAYER.with(() -> serverPlayer), new PlayerVariablesSyncMessage(this));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putString("race", race);
			nbt.putString("affiliation", affiliation);
			nbt.putDouble("reputation", reputation);
			nbt.putDouble("currentExp", currentExp);
			nbt.putDouble("maxExp", maxExp);
			nbt.putDouble("skillPoints", skillPoints);
			nbt.putDouble("currentCursedEnergy", currentCursedEnergy);
			nbt.putDouble("maxCursedEnergy", maxCursedEnergy);
			nbt.putDouble("cursedEnergyStat", cursedEnergyStat);
			nbt.putDouble("healthStat", healthStat);
			nbt.putDouble("strengthStat", strengthStat);
			nbt.putDouble("speedStat", speedStat);
			nbt.putString("ability1", ability1);
			nbt.putString("ability2", ability2);
			nbt.putString("ability3", ability3);
			nbt.putString("ability4", ability4);
			nbt.putString("ability5", ability5);
			nbt.putString("ability6", ability6);
			nbt.putString("currentMove", currentMove);
			nbt.putDouble("energyControl", energyControl);
			nbt.putString("special", special);
			nbt.putDouble("maxOutput", maxOutput);
			nbt.putDouble("level", level);
			nbt.putDouble("currentOutput", currentOutput);
			nbt.putString("abilitylist", abilitylist);
			nbt.putString("technique", technique);
			nbt.putBoolean("characterCreated", characterCreated);
			nbt.putBoolean("specialCheck", specialCheck);
			nbt.putString("CeNature", CeNature);
			nbt.putBoolean("Cooldown1", Cooldown1);
			nbt.putBoolean("Cooldown2", Cooldown2);
			nbt.putBoolean("Cooldown3", Cooldown3);
			nbt.putDouble("Cooldown4", Cooldown4);
			nbt.putDouble("Cooldown5", Cooldown5);
			nbt.putDouble("Cooldown6", Cooldown6);
			nbt.putString("Squad", Squad);
			nbt.putBoolean("InParty", InParty);
			nbt.putString("PartyRole", PartyRole);
			nbt.putString("PartyLabel", PartyLabel);
			nbt.putString("PlayerDisplayName", PlayerDisplayName);
			nbt.putBoolean("InCombat", InCombat);
			nbt.putDouble("ComboCount", ComboCount);
			nbt.putBoolean("DoingMission", DoingMission);
			nbt.putString("CurrentMission", CurrentMission);
			nbt.putDouble("Yen", Yen);
			nbt.putString("ReputationStatus", ReputationStatus);
			nbt.putDouble("Miracles", Miracles);
			nbt.putBoolean("CtSpecial", CtSpecial);
			nbt.putString("TenShadowDeaths", TenShadowDeaths);
			nbt.putString("SimpleDomainType", SimpleDomainType);
			nbt.putString("Page", Page);
			nbt.putDouble("EvadeLevel", EvadeLevel);
			nbt.putDouble("Durability", Durability);
			nbt.putDouble("Fame", Fame);
			nbt.putString("Grade", Grade);
			nbt.putDouble("DomainClashCombo", DomainClashCombo);
			nbt.putBoolean("inventorycurse", inventorycurse);
			nbt.putString("RenderSpecial", RenderSpecial);
			nbt.putDouble("SukunaLevel", SukunaLevel);
			nbt.putDouble("flowerexpand", flowerexpand);
			nbt.putString("CSM4", CSM4);
			nbt.putString("CSM3", CSM3);
			nbt.putString("CSM2", CSM2);
			nbt.putString("CSM1", CSM1);
			nbt.putBoolean("RCT", RCT);
			nbt.putDouble("RCTLevel", RCTLevel);
			nbt.putDouble("RCTExp", RCTExp);
			nbt.putDouble("BlackFlashRarity", BlackFlashRarity);
			nbt.putString("Traits", Traits);
			nbt.putBoolean("YutaEventHappened", YutaEventHappened);
			nbt.putString("Passives", Passives);
			nbt.putDouble("RCTdecoy", RCTdecoy);
			nbt.putString("CurrentBounties", CurrentBounties);
			nbt.putBoolean("HasBounty", HasBounty);
			nbt.putDouble("Bounty", Bounty);
			nbt.putDouble("RatioMastery", RatioMastery);
			nbt.putBoolean("DomainAmplificationUnlocked", DomainAmplificationUnlocked);
			nbt.putString("Ability9", Ability9);
			nbt.putString("Ability12", Ability12);
			nbt.putString("Ability8", Ability8);
			nbt.putString("Ability11", Ability11);
			nbt.putBoolean("DomainExpansionUnlocked", DomainExpansionUnlocked);
			nbt.putString("Ability7", Ability7);
			nbt.putString("Ability10", Ability10);
			nbt.putDouble("Intelligence", Intelligence);
			nbt.putString("MoveCombo", MoveCombo);
			nbt.putBoolean("SimpleDomainUnlocked", SimpleDomainUnlocked);
			nbt.putString("CreatedClan", CreatedClan);
			nbt.putBoolean("TojiEventHappened", TojiEventHappened);
			nbt.putString("Clan", Clan);
			nbt.putString("ClansInWorld", ClansInWorld);
			nbt.putString("PerkDescription", PerkDescription);
			nbt.putString("PerkPage", PerkPage);
			nbt.putString("Perk", Perk);
			nbt.putDouble("Lives", Lives);
			nbt.putString("SelfVow", SelfVow);
			nbt.putString("SfDesc", SfDesc);
			nbt.putDouble("CeMastery", CeMastery);
			nbt.putString("PageSelfVow", PageSelfVow);
			nbt.putDouble("FlowCooldownTimer", FlowCooldownTimer);
			nbt.putBoolean("FlowCooldownActive", FlowCooldownActive);
			nbt.putDouble("PrestigeLevel", PrestigeLevel);
			nbt.putDouble("Souls", Souls);
			nbt.putDouble("leftArmDamage", leftArmDamage);
			nbt.putDouble("rightArmDamage", rightArmDamage);
			nbt.putDouble("rightLegDamage", rightLegDamage);
			nbt.putBoolean("RightLegGone", RightLegGone);
			nbt.putBoolean("RightArmGone", RightArmGone);
			nbt.putBoolean("LeftLegGone", LeftLegGone);
			nbt.put("Slot2", Slot2.save(new CompoundTag()));
			nbt.put("Slot3", Slot3.save(new CompoundTag()));
			nbt.put("Slot4", Slot4.save(new CompoundTag()));
			nbt.put("Slot5", Slot5.save(new CompoundTag()));
			nbt.put("Slot0", Slot0.save(new CompoundTag()));
			nbt.putDouble("leftLegDamage", leftLegDamage);
			nbt.put("Slot1", Slot1.save(new CompoundTag()));
			nbt.put("Slot6", Slot6.save(new CompoundTag()));
			nbt.put("Slot7", Slot7.save(new CompoundTag()));
			nbt.putBoolean("LeftArmGone", LeftArmGone);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			race = nbt.getString("race");
			affiliation = nbt.getString("affiliation");
			reputation = nbt.getDouble("reputation");
			currentExp = nbt.getDouble("currentExp");
			maxExp = nbt.getDouble("maxExp");
			skillPoints = nbt.getDouble("skillPoints");
			currentCursedEnergy = nbt.getDouble("currentCursedEnergy");
			maxCursedEnergy = nbt.getDouble("maxCursedEnergy");
			cursedEnergyStat = nbt.getDouble("cursedEnergyStat");
			healthStat = nbt.getDouble("healthStat");
			strengthStat = nbt.getDouble("strengthStat");
			speedStat = nbt.getDouble("speedStat");
			ability1 = nbt.getString("ability1");
			ability2 = nbt.getString("ability2");
			ability3 = nbt.getString("ability3");
			ability4 = nbt.getString("ability4");
			ability5 = nbt.getString("ability5");
			ability6 = nbt.getString("ability6");
			currentMove = nbt.getString("currentMove");
			energyControl = nbt.getDouble("energyControl");
			special = nbt.getString("special");
			maxOutput = nbt.getDouble("maxOutput");
			level = nbt.getDouble("level");
			currentOutput = nbt.getDouble("currentOutput");
			abilitylist = nbt.getString("abilitylist");
			technique = nbt.getString("technique");
			characterCreated = nbt.getBoolean("characterCreated");
			specialCheck = nbt.getBoolean("specialCheck");
			CeNature = nbt.getString("CeNature");
			Cooldown1 = nbt.getBoolean("Cooldown1");
			Cooldown2 = nbt.getBoolean("Cooldown2");
			Cooldown3 = nbt.getBoolean("Cooldown3");
			Cooldown4 = nbt.getDouble("Cooldown4");
			Cooldown5 = nbt.getDouble("Cooldown5");
			Cooldown6 = nbt.getDouble("Cooldown6");
			Squad = nbt.getString("Squad");
			InParty = nbt.getBoolean("InParty");
			PartyRole = nbt.getString("PartyRole");
			PartyLabel = nbt.getString("PartyLabel");
			PlayerDisplayName = nbt.getString("PlayerDisplayName");
			InCombat = nbt.getBoolean("InCombat");
			ComboCount = nbt.getDouble("ComboCount");
			DoingMission = nbt.getBoolean("DoingMission");
			CurrentMission = nbt.getString("CurrentMission");
			Yen = nbt.getDouble("Yen");
			ReputationStatus = nbt.getString("ReputationStatus");
			Miracles = nbt.getDouble("Miracles");
			CtSpecial = nbt.getBoolean("CtSpecial");
			TenShadowDeaths = nbt.getString("TenShadowDeaths");
			SimpleDomainType = nbt.getString("SimpleDomainType");
			Page = nbt.getString("Page");
			EvadeLevel = nbt.getDouble("EvadeLevel");
			Durability = nbt.getDouble("Durability");
			Fame = nbt.getDouble("Fame");
			Grade = nbt.getString("Grade");
			DomainClashCombo = nbt.getDouble("DomainClashCombo");
			inventorycurse = nbt.getBoolean("inventorycurse");
			RenderSpecial = nbt.getString("RenderSpecial");
			SukunaLevel = nbt.getDouble("SukunaLevel");
			flowerexpand = nbt.getDouble("flowerexpand");
			CSM4 = nbt.getString("CSM4");
			CSM3 = nbt.getString("CSM3");
			CSM2 = nbt.getString("CSM2");
			CSM1 = nbt.getString("CSM1");
			RCT = nbt.getBoolean("RCT");
			RCTLevel = nbt.getDouble("RCTLevel");
			RCTExp = nbt.getDouble("RCTExp");
			BlackFlashRarity = nbt.getDouble("BlackFlashRarity");
			Traits = nbt.getString("Traits");
			YutaEventHappened = nbt.getBoolean("YutaEventHappened");
			Passives = nbt.getString("Passives");
			RCTdecoy = nbt.getDouble("RCTdecoy");
			CurrentBounties = nbt.getString("CurrentBounties");
			HasBounty = nbt.getBoolean("HasBounty");
			Bounty = nbt.getDouble("Bounty");
			RatioMastery = nbt.getDouble("RatioMastery");
			DomainAmplificationUnlocked = nbt.getBoolean("DomainAmplificationUnlocked");
			Ability9 = nbt.getString("Ability9");
			Ability12 = nbt.getString("Ability12");
			Ability8 = nbt.getString("Ability8");
			Ability11 = nbt.getString("Ability11");
			DomainExpansionUnlocked = nbt.getBoolean("DomainExpansionUnlocked");
			Ability7 = nbt.getString("Ability7");
			Ability10 = nbt.getString("Ability10");
			Intelligence = nbt.getDouble("Intelligence");
			MoveCombo = nbt.getString("MoveCombo");
			SimpleDomainUnlocked = nbt.getBoolean("SimpleDomainUnlocked");
			CreatedClan = nbt.getString("CreatedClan");
			TojiEventHappened = nbt.getBoolean("TojiEventHappened");
			Clan = nbt.getString("Clan");
			ClansInWorld = nbt.getString("ClansInWorld");
			PerkDescription = nbt.getString("PerkDescription");
			PerkPage = nbt.getString("PerkPage");
			Perk = nbt.getString("Perk");
			Lives = nbt.getDouble("Lives");
			SelfVow = nbt.getString("SelfVow");
			SfDesc = nbt.getString("SfDesc");
			CeMastery = nbt.getDouble("CeMastery");
			PageSelfVow = nbt.getString("PageSelfVow");
			FlowCooldownTimer = nbt.getDouble("FlowCooldownTimer");
			FlowCooldownActive = nbt.getBoolean("FlowCooldownActive");
			PrestigeLevel = nbt.getDouble("PrestigeLevel");
			Souls = nbt.getDouble("Souls");
			leftArmDamage = nbt.getDouble("leftArmDamage");
			rightArmDamage = nbt.getDouble("rightArmDamage");
			rightLegDamage = nbt.getDouble("rightLegDamage");
			RightLegGone = nbt.getBoolean("RightLegGone");
			RightArmGone = nbt.getBoolean("RightArmGone");
			LeftLegGone = nbt.getBoolean("LeftLegGone");
			Slot2 = ItemStack.of(nbt.getCompound("Slot2"));
			Slot3 = ItemStack.of(nbt.getCompound("Slot3"));
			Slot4 = ItemStack.of(nbt.getCompound("Slot4"));
			Slot5 = ItemStack.of(nbt.getCompound("Slot5"));
			Slot0 = ItemStack.of(nbt.getCompound("Slot0"));
			leftLegDamage = nbt.getDouble("leftLegDamage");
			Slot1 = ItemStack.of(nbt.getCompound("Slot1"));
			Slot6 = ItemStack.of(nbt.getCompound("Slot6"));
			Slot7 = ItemStack.of(nbt.getCompound("Slot7"));
			LeftArmGone = nbt.getBoolean("LeftArmGone");
		}
	}

	public static class PlayerVariablesSyncMessage {
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
		}

		public PlayerVariablesSyncMessage(PlayerVariables data) {
			this.data = data;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.race = message.data.race;
					variables.affiliation = message.data.affiliation;
					variables.reputation = message.data.reputation;
					variables.currentExp = message.data.currentExp;
					variables.maxExp = message.data.maxExp;
					variables.skillPoints = message.data.skillPoints;
					variables.currentCursedEnergy = message.data.currentCursedEnergy;
					variables.maxCursedEnergy = message.data.maxCursedEnergy;
					variables.cursedEnergyStat = message.data.cursedEnergyStat;
					variables.healthStat = message.data.healthStat;
					variables.strengthStat = message.data.strengthStat;
					variables.speedStat = message.data.speedStat;
					variables.ability1 = message.data.ability1;
					variables.ability2 = message.data.ability2;
					variables.ability3 = message.data.ability3;
					variables.ability4 = message.data.ability4;
					variables.ability5 = message.data.ability5;
					variables.ability6 = message.data.ability6;
					variables.currentMove = message.data.currentMove;
					variables.energyControl = message.data.energyControl;
					variables.special = message.data.special;
					variables.maxOutput = message.data.maxOutput;
					variables.level = message.data.level;
					variables.currentOutput = message.data.currentOutput;
					variables.abilitylist = message.data.abilitylist;
					variables.technique = message.data.technique;
					variables.characterCreated = message.data.characterCreated;
					variables.specialCheck = message.data.specialCheck;
					variables.CeNature = message.data.CeNature;
					variables.Cooldown1 = message.data.Cooldown1;
					variables.Cooldown2 = message.data.Cooldown2;
					variables.Cooldown3 = message.data.Cooldown3;
					variables.Cooldown4 = message.data.Cooldown4;
					variables.Cooldown5 = message.data.Cooldown5;
					variables.Cooldown6 = message.data.Cooldown6;
					variables.Squad = message.data.Squad;
					variables.InParty = message.data.InParty;
					variables.PartyRole = message.data.PartyRole;
					variables.PartyLabel = message.data.PartyLabel;
					variables.PlayerDisplayName = message.data.PlayerDisplayName;
					variables.InCombat = message.data.InCombat;
					variables.ComboCount = message.data.ComboCount;
					variables.DoingMission = message.data.DoingMission;
					variables.CurrentMission = message.data.CurrentMission;
					variables.Yen = message.data.Yen;
					variables.ReputationStatus = message.data.ReputationStatus;
					variables.Miracles = message.data.Miracles;
					variables.CtSpecial = message.data.CtSpecial;
					variables.TenShadowDeaths = message.data.TenShadowDeaths;
					variables.SimpleDomainType = message.data.SimpleDomainType;
					variables.Page = message.data.Page;
					variables.EvadeLevel = message.data.EvadeLevel;
					variables.Durability = message.data.Durability;
					variables.Fame = message.data.Fame;
					variables.Grade = message.data.Grade;
					variables.DomainClashCombo = message.data.DomainClashCombo;
					variables.inventorycurse = message.data.inventorycurse;
					variables.RenderSpecial = message.data.RenderSpecial;
					variables.SukunaLevel = message.data.SukunaLevel;
					variables.flowerexpand = message.data.flowerexpand;
					variables.CSM4 = message.data.CSM4;
					variables.CSM3 = message.data.CSM3;
					variables.CSM2 = message.data.CSM2;
					variables.CSM1 = message.data.CSM1;
					variables.RCT = message.data.RCT;
					variables.RCTLevel = message.data.RCTLevel;
					variables.RCTExp = message.data.RCTExp;
					variables.BlackFlashRarity = message.data.BlackFlashRarity;
					variables.Traits = message.data.Traits;
					variables.YutaEventHappened = message.data.YutaEventHappened;
					variables.Passives = message.data.Passives;
					variables.RCTdecoy = message.data.RCTdecoy;
					variables.CurrentBounties = message.data.CurrentBounties;
					variables.HasBounty = message.data.HasBounty;
					variables.Bounty = message.data.Bounty;
					variables.RatioMastery = message.data.RatioMastery;
					variables.DomainAmplificationUnlocked = message.data.DomainAmplificationUnlocked;
					variables.Ability9 = message.data.Ability9;
					variables.Ability12 = message.data.Ability12;
					variables.Ability8 = message.data.Ability8;
					variables.Ability11 = message.data.Ability11;
					variables.DomainExpansionUnlocked = message.data.DomainExpansionUnlocked;
					variables.Ability7 = message.data.Ability7;
					variables.Ability10 = message.data.Ability10;
					variables.Intelligence = message.data.Intelligence;
					variables.MoveCombo = message.data.MoveCombo;
					variables.SimpleDomainUnlocked = message.data.SimpleDomainUnlocked;
					variables.CreatedClan = message.data.CreatedClan;
					variables.TojiEventHappened = message.data.TojiEventHappened;
					variables.Clan = message.data.Clan;
					variables.ClansInWorld = message.data.ClansInWorld;
					variables.PerkDescription = message.data.PerkDescription;
					variables.PerkPage = message.data.PerkPage;
					variables.Perk = message.data.Perk;
					variables.Lives = message.data.Lives;
					variables.SelfVow = message.data.SelfVow;
					variables.SfDesc = message.data.SfDesc;
					variables.CeMastery = message.data.CeMastery;
					variables.PageSelfVow = message.data.PageSelfVow;
					variables.FlowCooldownTimer = message.data.FlowCooldownTimer;
					variables.FlowCooldownActive = message.data.FlowCooldownActive;
					variables.PrestigeLevel = message.data.PrestigeLevel;
					variables.Souls = message.data.Souls;
					variables.leftArmDamage = message.data.leftArmDamage;
					variables.rightArmDamage = message.data.rightArmDamage;
					variables.rightLegDamage = message.data.rightLegDamage;
					variables.RightLegGone = message.data.RightLegGone;
					variables.RightArmGone = message.data.RightArmGone;
					variables.LeftLegGone = message.data.LeftLegGone;
					variables.Slot2 = message.data.Slot2;
					variables.Slot3 = message.data.Slot3;
					variables.Slot4 = message.data.Slot4;
					variables.Slot5 = message.data.Slot5;
					variables.Slot0 = message.data.Slot0;
					variables.leftLegDamage = message.data.leftLegDamage;
					variables.Slot1 = message.data.Slot1;
					variables.Slot6 = message.data.Slot6;
					variables.Slot7 = message.data.Slot7;
					variables.LeftArmGone = message.data.LeftArmGone;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
