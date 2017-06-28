package me.nch.firstplugin;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class FirstPlugin extends JavaPlugin implements Listener {

	public void onEnable() {
		Bukkit.getServer().getPluginManager().registerEvents(this, this);
	}

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		if (cmd.getName().equalsIgnoreCase("firstcommand")) {
			sender.sendMessage(ChatColor.GOLD + "You have typed a command.");
		}
		return true;
	}

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		e.getPlayer().sendMessage(ChatColor.RED + "You have broken a block.");
	}

}
