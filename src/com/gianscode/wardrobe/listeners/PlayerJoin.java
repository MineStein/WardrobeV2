package com.gianscode.wardrobe.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Collections;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		Player p = e.getPlayer();
		
		ItemStack is = new ItemStack(Material.BOOK);
		ItemMeta meta = is.getItemMeta();
		meta.setDisplayName(ChatColor.DARK_PURPLE + "Wardrobe");
		meta.setLore(Collections.singletonList(ChatColor.WHITE + "Change how you look in-game!"));
		is.setItemMeta(meta);
		
		if (!p.getInventory().contains(is)) {
			p.getInventory().addItem(is);
		}
	}
}