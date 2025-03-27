package net.civicraft.postcards;

import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class PostcardRightClickEvent implements Listener {
    public void onRightClick(PlayerInteractEvent e) {
        if ((e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK)) { //TODO: Add check for postcard item
            //open postcard
        }
    }
}
