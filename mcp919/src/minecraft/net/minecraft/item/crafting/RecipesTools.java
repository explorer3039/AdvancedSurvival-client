package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesTools
{
    private String[][] recipePatterns = new String[][] {{"XXX", " # ", " # "}, {"X", "#", "#"}, {"XX", "X#", " #"}, {"XX", " #", " #"}};
    private Object[][] recipeItems = new Object[][] {{Blocks.cobblestone, Items.iron_ingot, Items.diamond, Items.gold_ingot, Items.flint}, {Items.stone_pickaxe, Items.iron_pickaxe, Items.diamond_pickaxe, Items.golden_pickaxe, Items.flint_pickaxe}, {Items.stone_shovel, Items.iron_shovel, Items.diamond_shovel, Items.golden_shovel, Items.flint_shovel}, {Items.stone_axe, Items.iron_axe, Items.diamond_axe, Items.golden_axe, Items.flint_axe}, {Items.stone_hoe, Items.iron_hoe, Items.diamond_hoe, Items.golden_hoe, Items.flint_hoe}};

    /**
     * Adds the tool recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager p_77586_1_)
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                p_77586_1_.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], '#', Items.stick, 'X', object});
            }
        }

        p_77586_1_.addRecipe(new ItemStack(Items.shears), new Object[] {" #", "# ", '#', Items.iron_ingot});
    }
}
