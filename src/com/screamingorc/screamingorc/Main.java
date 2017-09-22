package com.screamingorc.screamingorc;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

import com.screamingorc.screamingorc.events.EventsClass;
import com.screamingorc.screamingorc.inventory.CustomItems;

public class Main extends JavaPlugin {
	
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "\n\nTutorial has been Enabled!");
		getServer().getPluginManager().registerEvents(new EventsClass(), this);
		loadConfig();
		
		CustomItems items = new CustomItems();
		items.FluxRecipie();
		items.SteelRecipie();
		
	}
	
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "\n\nTutorial has been Disabled!");
		
	}
	
	public void loadConfig(){
		getConfig().options().copyDefaults(true);
		saveConfig();
		
	}

}
