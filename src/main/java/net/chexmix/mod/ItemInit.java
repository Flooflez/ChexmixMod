package net.chexmix.mod;

import net.chexmix.mod.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {

    public static final CirclePretzel CIRCLE_PRETZEL = new CirclePretzel();
    public static final CornChex CORN_CHEX = new CornChex();
    public static final Breadstick BREADSTICK = new Breadstick();
    public static final RyeCracker RYE_CRACKER = new RyeCracker();
    public static final SquarePretzel SQUARE_PRETZEL = new SquarePretzel();
    public static final WheatChex WHEAT_CHEX = new WheatChex();

    public static void init(){
        String MODID = ChexmixMod.MODID;

        Registry.register(Registry.ITEM, new Identifier(MODID, "circle_pretzel"), CIRCLE_PRETZEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "corn_chex"), CORN_CHEX);
        Registry.register(Registry.ITEM, new Identifier(MODID, "breadstick"), BREADSTICK);
        Registry.register(Registry.ITEM, new Identifier(MODID, "rye_cracker"), RYE_CRACKER);
        Registry.register(Registry.ITEM, new Identifier(MODID, "square_pretzel"), SQUARE_PRETZEL);
        Registry.register(Registry.ITEM, new Identifier(MODID, "wheat_chex"), WHEAT_CHEX);

    }

}
