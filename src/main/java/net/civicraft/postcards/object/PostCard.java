package net.civicraft.postcards.object;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class PostCard {
    private Player sender;
    private String content;
    private ItemStack item;

    private List<Component> lore = new ArrayList<>();
//add date signed
    // Creating a postcard
    public PostCard() {
        this.sender = null;
        this.content = null;
        item = new ItemStack(Material.PAPER);
        applyMeta(item);
    }

    private void applyMeta(ItemStack item) {
        ItemMeta meta = item.getItemMeta();
        meta.displayName(Component.text("Postcard"));
        lore.add(Component.text("Unwritten"));
        lore.add(Component.text("Use \"/postcard\" write to add a message!"));
        meta.lore(lore);
        item.setItemMeta(meta);
    }

    //aka "signing" or "sending" -- named this because it will occur when written (no taksies-backsies)
    public void writePostcard(Player sender, String content, PostCard postcard) {
        this.sender = sender;
        this.content = content;
        signedMeta(postcard);
    }

    private void signedMeta(PostCard postCard) {
        ItemStack item = postCard.getItem();
        ItemMeta meta = item.getItemMeta();
        lore.clear();
        lore.add(Component.text("Sent by " + sender.getName(), NamedTextColor.GRAY));
        lore.add(Component.text("Written on ", NamedTextColor.DARK_GRAY));
        meta.lore(lore);
        meta.addEnchant(Enchantment.LUCK_OF_THE_SEA, 1, true);
        meta.removeItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
    }

    //getters -- remove ones not in use by v3
    public ItemStack getItem() {
        return item;
    }
    public Player getSender() {
        return sender;
    }
    public String getContent() {
        return content;
    }

    //setters -- remove ones not in use by v3
    public void setSender(Player sender) {
        this.sender = sender;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public void setItem(ItemStack item) {
        this.item = item;
    }
}
