package xyz.yetimountain.Z4mbi3;

import java.util.logging.Level;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

		@Override
		public void onEnable() 
		{
			Bukkit.getLogger().log(Level.INFO, "Plugin test works");
		}
		
		@Override
		public void onDisable() 
		{
			Bukkit.getLogger().log(Level.INFO, "Plugin does not work");
		}
		
		@EventHandler
		public void onPlayerJoin(PlayerJoinEvent event)
		{
			Player p = event.getPlayer();
			p.sendMessage(ChatColor.AQUA + "Welcome to the server!\\nType /info for the overview of all commands.");
			
		}
		
}
