package net.civicraft.postcards.command.subcommand;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Description;
import co.aikar.commands.annotation.Subcommand;
import net.civicraft.postcards.object.PostCard;
import net.civicraft.postcards.util.Messages;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class View extends BaseCommand {
    @Subcommand("view")
    @CommandPermission("postcards.view.command")
    @Description("View the content of a postcard")
    public void onPostcardView(Player player, PostCard postcard) {
        //postcard has not been written
        if (postcard.getContent() == null || postcard.getSender() == null) {
            player.sendMessage(Messages.EMPTY_POSTCARD);
            return;
        }


    }
}
