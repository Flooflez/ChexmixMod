package net.chexmix.mod;

import net.fabricmc.fabric.api.loot.v2.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class LootTableInit {
    private static final Identifier VILLAGE_PLAINS_HOUSE
            = new Identifier("minecraft", "chests/village/village_desert_house");

    private static final Identifier VILLAGE_DESERT_HOUSE
            = new Identifier("minecraft", "chests/village/village_plains_house");

    private static final Identifier VILLAGE_SAVANNA_HOUSE
            = new Identifier("minecraft", "chests/village/village_savanna_house");

    private static final Identifier VILLAGE_SNOWY_HOUSE
            = new Identifier("minecraft", "chests/village/village_snowy_house");

    private static final Identifier VILLAGE_TAIGA_HOUSE
            = new Identifier("minecraft", "chests/village/village_taiga_house");

    private static final Identifier VILLAGE_TEMPLE
            = new Identifier("minecraft", "chests/village/village_temple");

    //not village
    private static final Identifier ABANDONED_MINESHAFT
            = new Identifier("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier PILLAGER_OUTPOST
            = new Identifier("minecraft", "chests/pillager_outpost");
    private static final Identifier DESERT_PYRAMID
            = new Identifier("minecraft", "chests/desert_pyramid");
    private static final Identifier SHIPWRECK_SUPPLY
            = new Identifier("minecraft", "chests/shipwreck_supply");

    //better chances
    private static final Identifier WOODLAND_MANSION
            = new Identifier("minecraft", "chests/woodland_mansion");
    private static final Identifier STRONGHOLD_CORRIDOR
            = new Identifier("minecraft", "chests/stronghold_corridor");

    //best chance
    private static final Identifier ANCIENT_CITY_ICE_BOX
            = new Identifier("minecraft", "chests/ancient_city_ice_box");

    //mobs
    private static final Identifier VILLAGER
            = new Identifier("minecraft", "entities/villager");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register(((id, tableBuilder, source) ->
        {

            if(VILLAGE_PLAINS_HOUSE.equals(id) ||
                    VILLAGE_DESERT_HOUSE.equals(id) ||
                    VILLAGE_SAVANNA_HOUSE.equals(id) ||
                    VILLAGE_SNOWY_HOUSE.equals(id) ||
                    VILLAGE_TEMPLE.equals(id) ||
                    VILLAGE_TAIGA_HOUSE.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(ABANDONED_MINESHAFT.equals(id) ||
                    PILLAGER_OUTPOST.equals(id) ||
                    DESERT_PYRAMID.equals(id) ||
                    SHIPWRECK_SUPPLY.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(WOODLAND_MANSION.equals(id) ||
                    STRONGHOLD_CORRIDOR.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(ANCIENT_CITY_ICE_BOX.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(VILLAGER.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        }));
    }
}
