package com.gianscode.wardrobe.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RemoveBoots implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You need to be a player to do this!");
			return true;
		}

		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("removeboots")) {
			if (!(p.hasPermission("wardrobe.use"))) {
				p.sendMessage(ChatColor.RED + "You do not have the required permissions to perform that action!");
				return true;
			}

			if (p.getInventory().getBoots() == null) {
				p.sendMessage(ChatColor.RED + "You are not wearing any boots!");
			} else {
				p.getInventory().setBoots(null);
				p.sendMessage(ChatColor.GREEN + "Successfully removed your pair of boots!");
				return true;
			}
		}
		return true;
	}
}