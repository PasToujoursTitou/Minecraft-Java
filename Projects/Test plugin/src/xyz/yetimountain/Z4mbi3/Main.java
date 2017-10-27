package xyz.yetimountain.Z4mbi3;




import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{

		@Override
		public void onEnable() 
		{
			System.out.println("Plugin startup successful");
		}
		
		@Override
		public void onDisable() 
		{
			System.out.println("Plugin shutting down..");
		}
		
		@EventHandler
		public void onPlayerJoinEvent(PlayerJoinEvent event)
		{
			if(!event.getPlayer().hasPlayedBefore()) 
			{
				event.getPlayer().sendMessage(ChatColor.AQUA + "Welcome to the server!");
			}
		}
		
}
