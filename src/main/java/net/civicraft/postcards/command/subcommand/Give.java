package net.civicraft.postcards.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.postcards.object.PostCard;
import net.civicraft.postcards.util.Messages;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

@CommandAlias("postcard")
public class Give extends BaseCommand {

    @Subcommand("give")
    @CommandPermission("postcards.give")
    @Description("Give a blank postcard to a player")
    public void onGive(Player sender, Player target) {
        if (target.getInventory().firstEmpty() != -1) {
            ItemStack postcard = new PostCard().getItem();
            target.give(postcard);
            sender.sendMessage(Messages.GIVE_SUCCESS(target));
        } else {
            sender.sendMessage(Messages.GIVE_FAIL(target));
        }

    }
}
