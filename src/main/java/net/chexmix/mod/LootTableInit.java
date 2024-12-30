package net.chexmix.mod;


import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.minecraft.loot.LootTables;

public class LootTableInit {

    private static final Identifier VILLAGE_PLAINS_HOUSE
            = Identifier.of("minecraft", "chests/village/village_desert_house");

    private static final Identifier VILLAGE_DESERT_HOUSE
            = Identifier.of("minecraft", "chests/village/village_plains_house");

    private static final Identifier VILLAGE_SAVANNA_HOUSE
            = Identifier.of("minecraft", "chests/village/village_savanna_house");

    private static final Identifier VILLAGE_SNOWY_HOUSE
            = Identifier.of("minecraft", "chests/village/village_snowy_house");

    private static final Identifier VILLAGE_TAIGA_HOUSE
            = Identifier.of("minecraft", "chests/village/village_taiga_house");

    private static final Identifier VILLAGE_TEMPLE
            = Identifier.of("minecraft", "chests/village/village_temple");

    //not village
    private static final Identifier ABANDONED_MINESHAFT
            = Identifier.of("minecraft", "chests/abandoned_mineshaft");
    private static final Identifier PILLAGER_OUTPOST
            = Identifier.of("minecraft", "chests/pillager_outpost");
    private static final Identifier DESERT_PYRAMID
            = Identifier.of("minecraft", "chests/desert_pyramid");
    private static final Identifier SHIPWRECK_SUPPLY
            = Identifier.of("minecraft", "chests/shipwreck_supply");

    //better chances
    private static final Identifier WOODLAND_MANSION
            = Identifier.of("minecraft", "chests/woodland_mansion");
    private static final Identifier STRONGHOLD_CORRIDOR
            = Identifier.of("minecraft", "chests/stronghold_corridor");

    //best chance
    private static final Identifier ANCIENT_CITY_ICE_BOX
            = Identifier.of("minecraft", "chests/ancient_city_ice_box");

    //mobs
    private static final Identifier VILLAGER
            = Identifier.of("minecraft", "entities/villager");

    public static void modifyLootTables() {

        LootTableEvents.MODIFY.register(((id, tableBuilder, source, wrapperLookup) ->
        {

            if(LootTables.VILLAGE_PLAINS_CHEST.equals(id) ||
                    LootTables.VILLAGE_DESERT_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_SAVANNA_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_SNOWY_HOUSE_CHEST.equals(id) ||
                    LootTables.VILLAGE_TEMPLE_CHEST.equals(id) ||
                    LootTables.VILLAGE_TAIGA_HOUSE_CHEST.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.01f)) // Drops 1% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(LootTables.ABANDONED_MINESHAFT_CHEST.equals(id) ||
                    LootTables.PILLAGER_OUTPOST_CHEST.equals(id) ||
                    LootTables.DESERT_PYRAMID_CHEST.equals(id) ||
                    LootTables.SHIPWRECK_SUPPLY_CHEST.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f)) // Drops 5% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(LootTables.WOODLAND_MANSION_CHEST.equals(id) ||
                    LootTables.STRONGHOLD_CORRIDOR_CHEST.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.2f)) // Drops 20% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(LootTables.ANCIENT_CITY_ICE_BOX_CHEST.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.3f)) // Drops 30% of the time
                        .with(ItemEntry.builder(ItemInit.CHEXMIX))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
            else if(EntityType.VILLAGER.getLootTableKey().isPresent() && EntityType.VILLAGER.getLootTableKey().get().equals(id)){
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
