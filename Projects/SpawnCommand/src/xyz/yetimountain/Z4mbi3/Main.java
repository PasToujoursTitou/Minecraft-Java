package xyz.yetimountain.Z4mbi3;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	public Main plugin;
	
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
		//For all commands
		Player player = (Player) sender;
		int x = (int) player.getLocation().getX();
		int y = (int) player.getLocation().getY();
		int z = (int) player.getLocation().getZ();
		float pitch = player.getLocation().getPitch();
		float yaw = player.getLocation().getYaw();
		World world = player.getWorld();
		
		if(cmd.getName().equalsIgnoreCase("setspawn"))
		{		
			
			if(player.isOp())
			{			
				//Get location of player:

				world.setSpawnLocation(x, y + 1, z);
				world.getSpawnLocation().setPitch(pitch);
				world.getSpawnLocation().setYaw(yaw);
				
				player.sendMessage("§dSpawn has been set to " + x + " " + y + " " + z +".");
			}
			else
			{
				player.sendMessage("§cYou do not have permission to use this command!");
			}
			return true;
		}
		if(cmd.getName().equalsIgnoreCase("spawn"))
		{
			if(world.getSpawnLocation() == null)
			{
				player.sendMessage("§cSpawn has not been set yet.");
			}
			else
			{
				player.teleport(world.getSpawnLocation());
			}
			return true;
		}
		return false;
	}
}
