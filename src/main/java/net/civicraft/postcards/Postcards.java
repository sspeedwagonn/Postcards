package net.civicraft.postcards;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Postcards extends JavaPlugin {
    static Postcards instance;

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        PaperCommandManager cm = new PaperCommandManager(this);
        cm.registerCommand(new PostcardCommand());
    }

    public static Postcards getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
        instance = null;
    }
}
