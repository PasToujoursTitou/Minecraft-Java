package xyz.yetimountain.Z4mbi3;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin implements Listener{
	
	public Main plugin;
	
	public void onEnable() {
        getConfig().options().copyDefaults(true);
getServer().getPluginManager().registerEvents(this,this);
        saveConfig();
    }
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		if(player.isOp())
		{
		Bukkit.broadcastMessage(ChatColor.GREEN + "Administrator " + player.getName() + " has connected.");
		}
		else 
		{
		Bukkit.broadcastMessage(ChatColor.AQUA + "Welcome " + player.getName() + " for the first time on the server.");
		}
	}
		
}
