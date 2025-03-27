package net.civicraft.postcards;

import co.aikar.commands.PaperCommandManager;
import net.civicraft.postcards.command.PostcardCommand;
import net.civicraft.postcards.object.PostCard;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public final class Postcards extends JavaPlugin {
    static Postcards instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        PaperCommandManager cm = new PaperCommandManager(this);
        cm.registerCommand(new PostcardCommand());
        registerRecipe();
    }

    private void registerRecipe() {
        ItemStack postcard = new PostCard().getItem();
        NamespacedKey key = new NamespacedKey(this, "postcard");

        ShapelessRecipe recipe = new ShapelessRecipe(key, postcard);
        recipe.addIngredient(1, Material.PAPER);
        recipe.addIngredient(1, Material.BLACK_DYE);

        getServer().addRecipe(recipe);
    }

    public static Postcards getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
