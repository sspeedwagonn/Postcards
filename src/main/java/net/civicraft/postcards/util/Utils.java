package net.civicraft.postcards.util;

import net.civicraft.postcards.Postcards;
import net.civicraft.postcards.object.PostCard;
import org.bukkit.inventory.Inventory;

import java.util.List;

public class Utils {
    Postcards instance = Postcards.getInstance();
    public boolean checkContent(PostCard postcard) {
        String content = postcard.getContent();
        List<String> blacklist = instance.getConfig().getStringList("blacklist");

        for (String s : blacklist) {
            if (content.contains(s)) {
                return false; //content has blacklisted word/phrase
            }
        }

        return true;
    }
}
