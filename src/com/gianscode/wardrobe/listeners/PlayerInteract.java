package com.gianscode.wardrobe.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.gianscode.wardrobe.Main;

public class PlayerInteract implements Listener {

	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player p = e.getPlayer();

		if (p.hasPermission("wardrobe.use")) {
			if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
				if (e.getItem() != null && e.getItem().getType() == Material.BOOK) {
					p.openInventory(Main.selectorInventory());
					p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
					p.sendMessage(ChatColor.GOLD + "Opening the armor selector...");
				}
			}
		}
	}
}