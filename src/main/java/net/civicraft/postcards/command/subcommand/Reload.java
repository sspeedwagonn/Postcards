package net.civicraft.postcards.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.postcards.Postcards;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class Reload extends BaseCommand {
    Postcards instance = Postcards.getInstance();

    @Subcommand("reload")
    @CommandPermission("postcards.reload")
    @Description("Reload config.yml")
    public void onReload(Player player) {
        instance.reloadConfig();
    }
}
