package net.civicraft.postcards.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class Write extends BaseCommand {
    @Subcommand("write")
    @CommandPermission("postcard.write")
    @Description("Write a message on a postcard")
    public void onPostcardWrite(Player player) {

    }
}
