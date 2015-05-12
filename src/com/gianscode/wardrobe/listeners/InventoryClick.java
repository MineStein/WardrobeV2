package com.gianscode.wardrobe.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType.SlotType;
import org.bukkit.inventory.ItemStack;

import com.gianscode.wardrobe.Main;

public class InventoryClick implements Listener {

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		HumanEntity he = e.getWhoClicked();

		if (he instanceof Player) {
			Player p = (Player) he;

			if (e.getInventory().getName().equals(Main.selectorInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.AIR) {
					return;
				}

				if (clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Remove Armor")) {
					if (p.getInventory().getHelmet() == null && p.getInventory().getChestplate() == null && p.getInventory().getLeggings() == null && p.getInventory().getBoots() == null) {
						p.sendMessage(ChatColor.RED + "You are not wearing any armor!");
						p.closeInventory();
					} else {
						p.getInventory().setArmorContents(null);
						p.sendMessage(ChatColor.GREEN + "Successfully removed all your armor!");
						p.closeInventory();
						return;
					}
					return;
				}

				if (clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Select Armor")) {
					p.openInventory(Main.inventorySelector());
					return;
				}
			}

			if (e.getInventory().getName().equals(Main.inventorySelector().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_HELMET) {
					p.openInventory(Main.helmetSelectorInventory());
					return;
				}

				if (clicked.getType() == Material.LEATHER_CHESTPLATE) {
					p.openInventory(Main.chestplateInventory());
					return;
				}

				if (clicked.getType() == Material.LEATHER_LEGGINGS) {
					p.openInventory(Main.leggingsInventory());
					return;
				}

				if (clicked.getType() == Material.LEATHER_BOOTS) {
					p.openInventory(Main.bootsInventory());
					return;
				}

				else return;
			}

			if (e.getInventory().getName().equals(Main.helmetInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				p.getInventory().setHelmet(new ItemStack(clicked.getType()));
				p.closeInventory();
			}

			if (e.getInventory().getName().equals(Main.chestplateInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				p.getInventory().setChestplate(new ItemStack(clicked.getType()));
				p.closeInventory();
			}

			if (e.getInventory().getName().equals(Main.leggingsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				p.getInventory().setLeggings(new ItemStack(clicked.getType()));
				p.closeInventory();
			}

			if (e.getInventory().getName().equals(Main.bootsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) return;

				p.getInventory().setBoots(new ItemStack(clicked.getType()));
				p.closeInventory();
			}

			if (e.getInventory().getName().equals(Main.hatsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) return;

				if (clicked.getType().equals(Material.ARROW)) {
					p.openInventory(Main.hatsPageTwo());
					return;
				}

			}

			if (e.getInventory().getName().equals(Main.helmetSelectorInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.GRASS) {
					p.openInventory(Main.hatsInventory());
					return;
				}

				if (clicked.getType() == Material.LEATHER_HELMET) {
					p.openInventory(Main.helmetInventory());
					return;
				}
			}

			if (e.getInventory().getName().equals(Main.hatsPageTwo().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType().equals(Material.ARROW)) {
					p.openInventory(Main.hatsInventory());
					return;
				}

				p.getInventory().setHelmet(new ItemStack(clicked.getType()));
				p.updateInventory();
			}

			if (e.getSlotType() == SlotType.ARMOR) {
				e.setCancelled(true);
			}
		}
	}
}