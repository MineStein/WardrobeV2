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

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.LEATHER_HELMET));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.GOLD_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.GOLD_HELMET));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.IRON_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.IRON_HELMET));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.DIAMOND_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.CHAINMAIL_HELMET) {
					p.getInventory().setHelmet(new ItemStack(Material.CHAINMAIL_HELMET));
					p.closeInventory();
					return;
				}

				else return;
			}

			if (e.getInventory().getName().equals(Main.chestplateInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_CHESTPLATE) {
					p.getInventory().setChestplate(new ItemStack(Material.LEATHER_CHESTPLATE));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.GOLD_CHESTPLATE) {
					p.getInventory().setChestplate(new ItemStack(Material.GOLD_CHESTPLATE));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.IRON_CHESTPLATE) {
					p.getInventory().setChestplate(new ItemStack(Material.IRON_CHESTPLATE));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.DIAMOND_CHESTPLATE) {
					p.getInventory().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.CHAINMAIL_HELMET) {
					p.getInventory().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
					p.closeInventory();
					return;
				}

				else return;
			}

			if (e.getInventory().getName().equals(Main.leggingsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_LEGGINGS) {
					p.getInventory().setLeggings(new ItemStack(Material.LEATHER_LEGGINGS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.GOLD_LEGGINGS) {
					p.getInventory().setLeggings(new ItemStack(Material.GOLD_LEGGINGS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.IRON_LEGGINGS) {
					p.getInventory().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.DIAMOND_LEGGINGS) {
					p.getInventory().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.CHAINMAIL_LEGGINGS) {
					p.getInventory().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
					p.closeInventory();
					return;
				}

				else return;
			}

			if (e.getInventory().getName().equals(Main.bootsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) {
					return;
				}

				if (clicked.getType() == Material.LEATHER_BOOTS) {
					p.getInventory().setBoots(new ItemStack(Material.LEATHER_BOOTS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.GOLD_BOOTS) {
					p.getInventory().setBoots(new ItemStack(Material.GOLD_BOOTS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.IRON_BOOTS) {
					p.getInventory().setBoots(new ItemStack(Material.IRON_BOOTS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.DIAMOND_BOOTS) {
					p.getInventory().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
					p.closeInventory();
					return;
				}

				if (clicked.getType() == Material.CHAINMAIL_BOOTS) {
					p.getInventory().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
					p.closeInventory();
					return;
				}

				else return;
			}

			if (e.getInventory().getName().equals(Main.hatsInventory().getName())) {
				e.setCancelled(true);

				ItemStack clicked = e.getCurrentItem();

				if (clicked == null) return;

				if (clicked.getType().equals(Material.ARROW)) {
					p.openInventory(Main.hatsPageTwo());
					return;
				}

				p.getInventory().setHelmet(new ItemStack(clicked.getType()));
				p.updateInventory();
				p.closeInventory();

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

				if (clicked.getItemMeta().getDisplayName().equals(ChatColor.DARK_PURPLE + "Page One")) {
					p.openInventory(Main.hatsInventory());
					return;
				}
			}

			if (e.getSlotType() == SlotType.ARMOR) {
				e.setCancelled(true);
			}
		}
	}
}