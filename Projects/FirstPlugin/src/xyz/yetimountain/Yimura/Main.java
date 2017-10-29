package xyz.yetimountain.Yimura;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
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
		this.getLogger().info("Plugin has shut down!");
	}

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
	{
		Player player = (Player) sender;
		if(sender instanceof Player)
		{
			if(cmd.getName().equalsIgnoreCase("gm"))
			{
				if(args.length == 1)
				{
					if(args[0].equalsIgnoreCase("0"))
					{
						player.performCommand("gamemode 0");
						return true;
					}
					else if(args[0].equalsIgnoreCase("1"))
					{
						player.performCommand("gamemode 1");
						return true;
					}
					else if(args[0].equalsIgnoreCase("2"))
					{
						player.performCommand("gamemode 2");
						return true;
					}
					else if(args[0].equalsIgnoreCase("3"))
					{
						player.performCommand("gamemode 3");
						return true;
					}
				}
				else
				{
					sender.sendMessage(ChatColor.RED"Usage: \"gm <0/1/2/3>\".");
					return true;
				}
			}
		}
		else
		{
			sender.sendMessage("Console cannot run this command!");
			return false;
		}
	}
}