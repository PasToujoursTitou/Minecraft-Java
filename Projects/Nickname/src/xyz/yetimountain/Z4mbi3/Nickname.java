package xyz.yetimountain.Z4mbi3;

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
		if(cmd.getName().equalsIgnoreCase("nickname"))
		{
			player.getPlayerListName();
			player.setPlayerListName("<name>");
			player.setDisplayName("<name>");
			return true;
		}
		return false;
	}
}
