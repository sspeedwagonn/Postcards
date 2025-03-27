package net.civicraft.postcards.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.entity.Player;

public class Messages {
    public static final TextColor PRIMARY = TextColor.color(55, 55, 55);
    public static final TextColor SECONDARY = TextColor.color(55, 55, 55);

    public static final Component PREFIX = Component.text("[Postcard] ", PRIMARY);

    public static final Component INFO = Component.text("Postcards v1", NamedTextColor.GREEN);

    public static final Component EMPTY_POSTCARD = PREFIX.append(Component.text(" Nothing to view. The postcard is empty!", SECONDARY));

    public static Component GIVE_SUCCESS(Player target) {
        return PREFIX.append(Component.text("You gave " + target.getName() + " a postcard!", SECONDARY));
    }
    public static Component GIVE_FAIL(Player target) {
        return PREFIX.append(Component.text("You cannot give " + target.getName() + " a postcard! They have no room in their inventory.", SECONDARY));
    }
}
