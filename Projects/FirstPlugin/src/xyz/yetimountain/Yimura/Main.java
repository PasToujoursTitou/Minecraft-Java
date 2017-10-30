package xyz.yetimountain.Yimura;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin
{
	public static final String ANSI_RESET = "\u001B[0m"; 
	public static final String ANSI_BLACK = "\u001B[30m"; 
	public static final String ANSI_RED = "\u001B[31m"; 
	public static final String ANSI_GREEN = "\u001B[32m"; 
	public static final String ANSI_YELLOW = "\u001B[33m"; 
	public static final String ANSI_BLUE = "\u001B[34m"; 
	public static final String ANSI_PURPLE = "\u001B[35m"; 
	public static final String ANSI_CYAN = "\u001B[36m"; 
	public static final String ANSI_WHITE = "\u001B[37m";
	
	@Override
	public void onEnable()
	{
		System.out.printIn(ANSI_GREEN + "Plugin fully loaded!")
	}

	@Override
	public void onDisable() 
	{
		System.out.printIn(ANSI_RED + "Plugin has been disabled...")
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
					sender.sendMessage("Usage: \"gm <0/1/2/3>\".");
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
