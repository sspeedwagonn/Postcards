package net.civicraft.postcards;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.*;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class PostcardCommand extends BaseCommand {
    Postcards instance = Postcards.getInstance();

    @Default
    public void onPostcard(Player player) {

    }

    @Subcommand("reload")
    @CommandPermission("postcards.reload")
    @Description("Reload config.yml")
    public void onReload(Player player) {
        instance.reloadConfig();
    }

    @Subcommand("give")
    @CommandPermission("postcards.give")
    @Description("Give a blank postcard to a player")
    public void onGive(Player sender, Player target) {

    }

    @Subcommand("view")
    @CommandPermission("postcards.view")
    @Description("View the content of a postcard")
    public void onPostcardView(Player player) {

    }

    @Subcommand("write")
    public void onPostcardWrite(Player player) {

    }
}
