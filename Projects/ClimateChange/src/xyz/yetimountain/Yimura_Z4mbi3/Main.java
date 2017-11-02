package xyz.yetimountain.Yimura_Z4mbi3;

import java.util.*;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.block.Biome;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
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
    this.saveDefaultConfig();
    //Save events
    getServer().getPluginManager().registerEvents(this,this);
    System.out.println(ANSI_GREEN + "Plugin enabled..");
  }
  
  @Override
  public void onDisable()
  {
    System.out.println(ANSI_RED + "Plugin shutting down...");
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String Label, String[] args)
  {
    if(cmd.getName().equalsIgnoreCase("climate help"))
    {
        sender.sendMessage(ChatColor.BLUE + "This plugin will track in which biome you're situated in.");
        sender.sendMessage(ChatColor.BLUE + "Based on that, conditions will be added onto you.");
        return true;
    }
    return false;
  }
  
  @EventHandler
  public void onPlayerJoin(PlayerJoinEvent event)
  {
      Player player = event.getPlayer();
      Location loc = player.getLocation();
      Biome biome = loc.getWorld().getBiome(loc.getBlockX(), loc.getBlockZ());
      
      //Cold biome
      if(biome.equals(Biome.ICE_MOUNTAINS) || biome.equals(Biome.FROZEN_OCEAN) || biome.equals(Biome.FROZEN_RIVER) || biome.equals(Biome.ICE_FLATS))
      {
          Timer timer = new Timer();

          timer.schedule(new TimerTask() 
          {
              int slow = this.getConfig().getInt("timers.slow");
              @Override
              public void run() 
              {
                  //Slowing of player after a set amount of time
              }
          }, slowtimer*60); //config time...
          
          timer.schedule(new TimerTask() 
          {
              int damage = this.getConfig().getInt("timers.damage");
              @Override
              public void run() 
              {
                  //Damaging of player after a set amount of time
              }
          }, damagetimer*60); //config time...
      }
      
      //Warm biome
      else if(biome.equals(Biome.DESERT))
      {
          //TODO later
      }
   }
}