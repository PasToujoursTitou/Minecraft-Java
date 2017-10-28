package xyz.yetimountain.Yimura;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		this.getLogger().info("Plugin fully loaded!");
	}
	@Override
	public void onDisable() 
	{
		this.getLogger().info("Plugin unloaded!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		if(sender == isOP())
		{
			if(cmd.getName().equalsIgnoreCase("gm 0"))
			{
				sender.SetGameMode("GameMode.SURVIVAL")
				return true;
			}
			if(cmd.getName().equalsIgnoreCase("gm 1"))
			{
			
				return true;
			}
		}
	}
}
