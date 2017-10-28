package xyz.yetimountain.Z4mbi3;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Nickname extends JavaPlugin implements Listener
{
	public Nickname plugin;
	
	@Override
	public void onEnable()
	{
		System.out.println("Plugin successfully loaded!");
	}
	@Override
	public void onDisable()
	{
		System.out.println("Plugin shutting down...");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args)
	{
		Player player = (Player) sender;
		String name = player.getName();
		String nick = player.getCustomName();
		if(cmd.getName().equalsIgnoreCase("nickname"))
		{
			if(args.length == 0)
			{
				//Give message that you need to try to use /nickname (name) (nickname)
				player.sendMessage(ChatColor.RED + "Try to use /nickname (name) (nickname).");
			}
			else
			{
				if(args[0].equals(name))
				{
					//Give message that you need to try to use /nickname (name) (nickname)
					player.sendMessage(ChatColor.RED + "Try to use /nickname (name) (nickname).");
				}
				if(args[0].equals(name) && args[1].equals(nick))
				{
					//Main command: /nickname (name) (nickname)
				}
			}
		}
		
		return false;
	}
}
