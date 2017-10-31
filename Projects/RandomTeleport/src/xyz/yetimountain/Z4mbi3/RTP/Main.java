package xyz.yetimountain.Z4mbi3.RTP;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener{
	@Override
	public void onEnable()
	{
		System.out.println("Plugin started..");
	}
	@Override
	public void onDisable()
	{
		System.out.println("Plugin shutdown..");
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args)
	{
		if(cmd.getName().equalsIgnoreCase("rtp"))
		{
			
			
			return true;
		}
		return false;
	}
}
