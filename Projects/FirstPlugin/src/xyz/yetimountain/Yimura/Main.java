package xyz.yetimountain.Yimura.shortGameMode;

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
		Player player = (Player) sender
		if(sender instanceof Player)
		{
			if(cmd.getName().equalsIgnoreCases("gm"))
			{
				if(args.length == 1)
				{
					if(args[0].equalsIgnoreCases("0"))
					{
						player.performCommand("gamemode 0");
					}
					else if(args[0].equalsIgnoreCases("1"))
					{
						player.performCommand("gamemode 1");
					}
					else if(args[0].equalsIgnoreCases("2"))
					{
						player.performCommand("gamemode 2");
					}
					else if(args[0].equalsIgnoreCases("3"))
					{
						player.performCommand("gamemode 3");
					}
				}
				else
				{
					sender.sendMessage('Usage: "gm <0/1/2/3>".');
				}
			}
		}
		else
		{
			sender.sendMessage("Console can not run this command!");
		}
	}
}