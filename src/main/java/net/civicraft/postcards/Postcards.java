package net.civicraft.postcards;

import co.aikar.commands.PaperCommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class Postcards extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager cm = new PaperCommandManager(this);
        cm.registerCommand(new PostcardCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
