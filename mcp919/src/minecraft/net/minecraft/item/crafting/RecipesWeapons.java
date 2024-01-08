package net.minecraft.item.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class RecipesWeapons
{
    private String[][] recipePatterns = new String[][] {{"X", "X", "#"}};
    private Object[][] recipeItems = new Object[][] {{Blocks.cobblestone, Blocks.iron_block, Blocks.diamond_block, Items.flint, Blocks.ruby_block, Blocks.emerald_block}, {Items.stone_sword, Items.iron_sword, Items.diamond_sword, Items.flint_sword, Items.ruby_sword, Items.emerald_sword}};

    /**
     * Adds the weapon recipes to the CraftingManager.
     */
    public void addRecipes(CraftingManager p_77583_1_)
    {
        for (int i = 0; i < this.recipeItems[0].length; ++i)
        {
            Object object = this.recipeItems[0][i];

            for (int j = 0; j < this.recipeItems.length - 1; ++j)
            {
                Item item = (Item)this.recipeItems[j + 1][i];
                p_77583_1_.addRecipe(new ItemStack(item), new Object[] {this.recipePatterns[j], '#', Items.stick, 'X', object});
            }
        }

        p_77583_1_.addRecipe(new ItemStack(Items.bow, 1), new Object[] {" #X", "# X", " #X", 'X', Items.string, '#', Items.stick});
        p_77583_1_.addRecipe(new ItemStack(Items.arrow, 4), new Object[] {"X", "#", "Y", 'Y', Items.feather, 'X', Items.flint, '#', Items.stick});
    }
}
