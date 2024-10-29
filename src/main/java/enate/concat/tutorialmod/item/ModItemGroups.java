package enate.concat.tutorialmod.item;

import enate.concat.tutorialmod.TutorialMod;
import enate.concat.tutorialmod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "sapphire_items"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE))
                    .displayName(Text.translatable("itemgroup.tutorialmod.sapphire_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.RAW_SAPPHIRE);
                    }).build());

    public static final ItemGroup SAPPHIRE_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TutorialMod.MOD_ID, "sapphire_blocks"), FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.SAPPHIRE_BLOCK))
                    .displayName(Text.translatable("itemgroup.tutorialmod.sapphire_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.RAW_SAPPHIRE_BLOCK);
                    }).build());

    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);
    }
}
