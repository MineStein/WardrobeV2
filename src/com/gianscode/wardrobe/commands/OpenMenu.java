package com.gianscode.wardrobe.commands;

import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gianscode.wardrobe.Main;

public class OpenMenu implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (!(sender instanceof Player)) {
			sender.sendMessage(ChatColor.RED + "You need to be a player to do this!");
			return true;
		}

		Player p = (Player) sender;

		if (cmd.getName().equalsIgnoreCase("openmenu")) {
			if (!(p.hasPermission("wardrobe.use"))) {
				p.sendMessage(ChatColor.RED + "You do not have the required permissions to perform that action!");
				return true;
			}

			p.openInventory(Main.selectorInventory());
			p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 1);
			p.sendMessage(ChatColor.GOLD + "Opening the armor selector...");
		}
		return true;
	}
}