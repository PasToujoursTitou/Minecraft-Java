package xyz.yetimountain.Z4mbi3;


import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;
//Plugin done when able to create welcome message "Ingame".

public class Welcome extends JavaPlugin implements Listener{
	
	public Welcome plugin;
	
	@Override
	public void onEnable() {
		getConfig().options().copyDefaults(true);
		getServer().getPluginManager().registerEvents(this,this);
		        saveConfig();
		        
    }

	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		if(player.hasPlayedBefore())
		{
			event.setJoinMessage(ChatColor.GREEN + player.getName() + " has connected to the server!");
		}
		else
		{
			event.setJoinMessage(ChatColor.AQUA + "Welcome " + player.getName() + " for the first time on the server.");
			
		}
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event)
	{
		Player player = event.getPlayer();
		event.setQuitMessage(ChatColor.RED + player.getName() + " has left the server.");
	}
		
}
