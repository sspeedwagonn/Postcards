package net.civicraft.postcards;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import co.aikar.commands.annotation.Subcommand;
import org.bukkit.entity.Player;

@CommandAlias("postcard")
public class PostcardCommand extends BaseCommand {

    @Default
    public void onPostcard(Player player) {

    }

    @Subcommand("view")
    public void onPostcardView(Player player) {

    }

    @Subcommand("write")
    public void onPostcardWrite(Player player) {

    }
}
