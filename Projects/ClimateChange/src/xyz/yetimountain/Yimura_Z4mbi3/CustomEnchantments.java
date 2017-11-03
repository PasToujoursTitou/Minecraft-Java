package xyz.yetimountain.Yimura_Z4mbi3;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomEnchantments extends JavaPlugin implements Listener
{
	/*Enchantments:
	 * Cold Protection
	 * Heat Protection*/
	//TODO More enchantments..
	public void OnEnable()
	{
		Bukkit.getPluginManager().registerEvents(this, this);
	}
	
	public void OnDisable()
	{
		saveConfig();
	}
	
	
	
	@EventHandler(priority=EventPriority.LOWEST)
	public void onEnchant(EnchantItemEvent enchant)
	{
		if(enchant.getItem().getType().name().endsWith("CHESTPLATE"))
		{
			//Define maximum level enchantment
			int randomint = (int) (Math.random() * 1000);
			
			if(randomint == 25 && randomint <=99)
			{
				enchantItem("Cold Protection", enchant.getExpLevelCost() <=10?1:enchant.getExpLevelCost() <=20?2:enchant.getExpLevelCost()<=30?4:3 , enchant.getItem());
				enchant.getEnchanter().sendMessage(ChatColor.AQUA + "Cold Protection Enchanted!");
			}
		}
		else if(enchant.getItem().getType().name().endsWith("LEGGINGS"))
		{
			
		}
	}

	private void enchantItem(String enchant, int level, ItemStack item) {
		if(level == 0)return;
		ItemMeta im = item.getItemMeta();
		List<String> lore = im.getLore();
		if(lore==null || isEmpty(lore))
		{
			List<String> newLore = new ArrayList<String>();
			newLore.add(ChatColor.RESET + enchant + "" + getRomanNumber(level));
		}
		else
		{
			if(!containsEnchant(enchant, item))
			lore.add(ChatColor.RESET + enchant + "" + getRomanNumber(level));
			im.setLore(lore);
		}
		
		item.setItemMeta(im);
		
	}
	private boolean containsEnchant(String enchant, ItemStack item) {
		for(String s : item.getItemMeta().getLore())
		{
			if(s.startsWith(ChatColor.RESET + enchant))
			{
				return true;
			}
		}
		return false;
	}

	private String getRomanNumber(int level)
	{
		if(level == 1) return "I";
		if(level == 2) return "II";
		if(level == 3) return "III";
		if(level == 4) return "IV";
		if(level == 5) return "V";
		if(level == 6) return "VI";
		if(level == 7) return "VII";
		if(level == 8) return "VIII";
		if(level == 9) return "IX";
		if(level == 10) return "X";
		return null;
	}

	private boolean isEmpty(List<String> lore) {
		for(String s : lore)
		{
			if(!(s!= "" && s!= null)) return false;
		}
		return true;
	}


}
