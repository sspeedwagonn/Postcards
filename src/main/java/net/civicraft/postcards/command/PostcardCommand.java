package net.civicraft.postcards.command;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.CommandHelp;
import co.aikar.commands.annotation.*;
import net.civicraft.postcards.util.Messages;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class PostcardCommand extends BaseCommand {


    @Default
    public void onPostcard(Player player) {

    }

    @Subcommand("info")
    public void onInfo(Player player) {
        player.sendMessage(Messages.INFO);
    }

    @HelpCommand
    public void onHelp(CommandHelp help) {
        help.showHelp();
    }
}
