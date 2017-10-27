package xyz.yetimountain.Yimura;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		Bukkit.getLogger().log(Level.INFO, "Plugin Gamemode abbravation has been loaded!");
	}
	@Override
	public void onDisable() 
	{
		Bukkit.getLogger().log(Level.INFO, "Plugin Gamemode abbravation has been unloaded!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		
	}
}
