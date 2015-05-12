package com.gianscode.wardrobe;

import com.gianscode.wardrobe.commands.*;
import com.gianscode.wardrobe.listeners.InventoryClick;
import com.gianscode.wardrobe.listeners.PlayerInteract;
import com.gianscode.wardrobe.listeners.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryClick(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
		Bukkit.getServer().getPluginManager().registerEvents(new PlayerJoin(), this);

		this.getCommand("openmenu").setExecutor(new OpenMenu());
		this.getCommand("removearmor").setExecutor(new RemoveArmor());
		this.getCommand("removehelmet").setExecutor(new RemoveHelmet());
		this.getCommand("removechestplate").setExecutor(new RemoveChestplate());
		this.getCommand("removeleggings").setExecutor(new RemoveLeggings());
		this.getCommand("removeboots").setExecutor(new RemoveBoots());

		Bukkit.getServer().getLogger().info("[Wardrobe] Enabled!");
	}

	@Override
	public void onDisable() {
		Bukkit.getServer().getLogger().info("[Wardrobe] Disabled!");
	}
	
	public static Inventory selectorInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "What would you like to do?");
		
		{
			ItemStack is = new ItemStack(Material.WOOL, 1, (byte) 14);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Remove Armor");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Remove all the armor you have on!"));
			is.setItemMeta(meta);
			inv.setItem(3, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.WOOL, 1, (byte) 5);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Select Armor");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Choose from a wide range of armor utilties"));
			is.setItemMeta(meta);
			inv.setItem(5, is);
		}
		
		return inv;
	}

	public static Inventory inventorySelector() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Armor Selector");

		{
			ItemStack is = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Helmets");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Choose a helmet from our fine selection!"));
			is.setItemMeta(meta);
			inv.setItem(1, is);
		}

		{
			ItemStack is = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chestplates");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Choose a chestplate from our fine selection!"));
			is.setItemMeta(meta);
			inv.setItem(3, is);
		}

		{
			ItemStack is = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Choose a pair of leggings from our fine selection!"));
			is.setItemMeta(meta);
			inv.setItem(5, is);
		}

		{
			ItemStack is = new ItemStack(Material.LEATHER_BOOTS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Choose a set of boots from our fine selection!"));
			is.setItemMeta(meta);
			inv.setItem(7, is);
		}

		return inv;
	}

	public static Inventory helmetInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Helmet Selector");

		{
			ItemStack is = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leather Helmet");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a leather helmet"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.GOLD_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Helmet");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a gold helmet"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.IRON_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Helmet");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a iron helmet"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Helmet");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a diamond helmet"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}

		{
			ItemStack is = new ItemStack(Material.CHAINMAIL_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chainmail Helmet");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a chainmail helmet"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}

		return inv;
	}

	public static Inventory chestplateInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Chestplate Selector");

		{
			ItemStack is = new ItemStack(Material.LEATHER_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leather Chestplate");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a leather chestplate"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.GOLD_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Chestplate");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a gold chestplate"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.IRON_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Chestplate");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a iron chestplate"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Chestplate");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a diamond chestplate"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}

		{
			ItemStack is = new ItemStack(Material.CHAINMAIL_CHESTPLATE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chainmail Chestplate");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a chainmail chestplate"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}

		return inv;
	}

	public static Inventory leggingsInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Legging Selector");

		{
			ItemStack is = new ItemStack(Material.LEATHER_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leather Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of leather leggings"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.GOLD_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of gold leggings"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.IRON_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of iron leggings"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of diamond leggings"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}

		{
			ItemStack is = new ItemStack(Material.CHAINMAIL_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chainmail Leggings");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of chainmail leggings"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}

		return inv;
	}

	public static Inventory bootsInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Boot Selector");

		{
			ItemStack is = new ItemStack(Material.LEATHER_BOOTS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leather Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of leather boots"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.GOLD_LEGGINGS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of gold boots"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.IRON_BOOTS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of iron boots"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_BOOTS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of diamond boots"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}

		{
			ItemStack is = new ItemStack(Material.CHAINMAIL_BOOTS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chainmail Boots");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pair of chainmail boots"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}

		return inv;
	}

	public static Inventory helmetSelectorInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9, "Choose your type of helmet");

		{
			ItemStack is = new ItemStack(Material.GRASS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Hats");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear solid blocks on your head!"));
			is.setItemMeta(meta);
			inv.setItem(3, is);
		}

		{
			ItemStack is = new ItemStack(Material.LEATHER_HELMET);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Helmets");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear different types of helmets on your head!"));
			is.setItemMeta(meta);
			inv.setItem(5, is);
		}

		return inv;
	}

	public static Inventory hatsInventory() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9 * 6, "Hat Selector");

		{
			ItemStack is = new ItemStack(Material.GRASS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Grass Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a grass block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}

		{
			ItemStack is = new ItemStack(Material.LOG);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Wood");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a piece of wood on your head!"));
			is.setItemMeta(meta);
			inv.setItem(1, is);
		}

		{
			ItemStack is = new ItemStack(Material.DIAMOND_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a diamond block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}

		{
			ItemStack is = new ItemStack(Material.REDSTONE_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Redstone Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a redstone block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(3, is);
		}

		{
			ItemStack is = new ItemStack(Material.TNT);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "TNT");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some TNT on your head!"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.SLIME_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Slime Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a slime block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(5, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.BOOKSHELF);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Bookshelf");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a bookshelf on your head!"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.BRICK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Bricks");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a brick on your head!"));
			is.setItemMeta(meta);
			inv.setItem(7, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.EMERALD_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Emerald Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear an emerald block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.JUKEBOX);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Jukebox");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a jukebox on your head!"));
			is.setItemMeta(meta);
			inv.setItem(9, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.JACK_O_LANTERN);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Jack 'o Lantern");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a Jack 'o Lantern on your head!"));
			is.setItemMeta(meta);
			inv.setItem(10, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.PUMPKIN);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Pumpkin");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a pumpkin on your head!"));
			is.setItemMeta(meta);
			inv.setItem(11, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.BEACON);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Beacon");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a beacon on your head!"));
			is.setItemMeta(meta);
			inv.setItem(12, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.STONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Stone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a block of stone on your head!"));
			is.setItemMeta(meta);
			inv.setItem(13, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.BEDROCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Bedrock");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some beadrock on your head!"));
			is.setItemMeta(meta);
			inv.setItem(14, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.GLASS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Glass");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some glass on your head!"));
			is.setItemMeta(meta);
			inv.setItem(15, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.SAND);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Sand");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some sand on your head!"));
			is.setItemMeta(meta);
			inv.setItem(16, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.SANDSTONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Sandstone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some sandstone on your head!"));
			is.setItemMeta(meta);
			inv.setItem(17, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.WOOD);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Wooden Planks");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a wooden plank on your head!"));
			is.setItemMeta(meta);
			inv.setItem(18, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.IRON_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Iron Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some iron ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(19, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.GOLD_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some gold ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(20, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.DIAMOND_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Diamond Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some diamond ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(21, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.EMERALD_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Emerald Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some emerald ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(22, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.REDSTONE_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Redstone Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some redstone ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(23, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.COAL_ORE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Coal Ore");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some coal ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(24, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.WOOL);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Wool");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some white wool on your head!"));
			is.setItemMeta(meta);
			inv.setItem(25, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.GOLD_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gold Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a gold block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(26, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.GRAVEL);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Gravel");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some gravel on your head!"));
			is.setItemMeta(meta);
			inv.setItem(27, is);
		}

		{
			ItemStack is = new ItemStack(Material.WORKBENCH);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Workbench");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a workbench on your head!"));
			is.setItemMeta(meta);
			inv.setItem(28, is);
		}

		{
			ItemStack is = new ItemStack(Material.SPONGE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Sponge");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a sponge on your head!"));
			is.setItemMeta(meta);
			inv.setItem(29, is);
		}

		{
			ItemStack is = new ItemStack(Material.PISTON_STICKY_BASE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Sticky Piston");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a sticky piston on your head!"));
			is.setItemMeta(meta);
			inv.setItem(30, is);
		}

		{
			ItemStack is = new ItemStack(Material.LAPIS_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Lapis Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a block of lapis on your head!"));
			is.setItemMeta(meta);
			inv.setItem(31, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.DISPENSER);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Dispenser");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a dispenser on your head!"));
			is.setItemMeta(meta);
			inv.setItem(32, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.DIRT);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Dirt");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some dirt on your head!"));
			is.setItemMeta(meta);
			inv.setItem(33, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.LEAVES);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Leaves");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some leaves on your head!"));
			is.setItemMeta(meta);
			inv.setItem(34, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.MOSSY_COBBLESTONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Mossy Cobblestone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some mossy cobblestone on your head!"));
			is.setItemMeta(meta);
			inv.setItem(35, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.ARROW);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Page Two");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "View more hats!"));
			is.setItemMeta(meta);
			inv.setItem(49, is);
		}

		return inv;
	}
	
	public static Inventory hatsPageTwo() {
		Inventory inv = Bukkit.getServer().createInventory(null, 9 * 6, "Hat Selector");
		
		
		{
			ItemStack is = new ItemStack(Material.OBSIDIAN);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Obsidian");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some obsidian on your head!"));
			is.setItemMeta(meta);
			inv.setItem(0, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.WORKBENCH);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Crafting Table");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a crafting table on your head!"));
			is.setItemMeta(meta);
			inv.setItem(1, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.ICE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Ice");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some ice on your head!"));
			is.setItemMeta(meta);
			inv.setItem(2, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.CACTUS);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Cactus");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a cactus on your head!"));
			is.setItemMeta(meta);
			inv.setItem(3, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.NETHERRACK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Netherrack");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some netherrack on your head!"));
			is.setItemMeta(meta);
			inv.setItem(4, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.SOUL_SAND);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Soul Sand");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some soul sand on your head!"));
			is.setItemMeta(meta);
			inv.setItem(5, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.GLOWSTONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Glowstone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a piece of glowstone on your head!"));
			is.setItemMeta(meta);
			inv.setItem(6, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.MELON_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Melon");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a few melons on your head!"));
			is.setItemMeta(meta);
			inv.setItem(7, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.REDSTONE_LAMP_OFF);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Redstone Lamp");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a redstone lamp on your head!"));
			is.setItemMeta(meta);
			inv.setItem(8, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.ENDER_STONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "End Stone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some end stone on your head!"));
			is.setItemMeta(meta);
			inv.setItem(9, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.HAY_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Hay");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some hay on your head!"));
			is.setItemMeta(meta);
			inv.setItem(10, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.PRISMARINE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Prismarine");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some prismarine on your head!"));
			is.setItemMeta(meta);
			inv.setItem(11, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.COAL_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Coal Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a coal block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(12, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.HARD_CLAY);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Hardened Clay");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a piece of hardened clay on your head!"));
			is.setItemMeta(meta);
			inv.setItem(13, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.RED_SANDSTONE);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Red Sandstone");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear some red sandstone ore on your head!"));
			is.setItemMeta(meta);
			inv.setItem(14, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.DROPPER);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Dropper");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a dropper on your head!"));
			is.setItemMeta(meta);
			inv.setItem(15, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.CHEST);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Chest");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a chest on your head!"));
			is.setItemMeta(meta);
			inv.setItem(16, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.NOTE_BLOCK);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Note Block");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Wear a note block on your head!"));
			is.setItemMeta(meta);
			inv.setItem(17, is);
		}
		
		{
			ItemStack is = new ItemStack(Material.ARROW);
			ItemMeta meta = is.getItemMeta();
			meta.setDisplayName(ChatColor.DARK_PURPLE + "Page One");
			meta.setLore(Collections.singletonList(ChatColor.WHITE + "Go back to the previous page!"));
			is.setItemMeta(meta);
			inv.setItem(49, is);
		}
		
		return inv;
	}
}