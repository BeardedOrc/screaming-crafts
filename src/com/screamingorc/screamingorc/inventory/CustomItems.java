package com.screamingorc.screamingorc.inventory;

import java.util.ArrayList;

import org.bukkit.Material;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

import com.screamingorc.screamingorc.Main;

import net.md_5.bungee.api.ChatColor;

public class CustomItems implements Listener {
	
	private Plugin plugin = Main.getPlugin(Main.class);
	
	public void FluxRecipie(){
		
		ItemStack item = new ItemStack(Material.POTION);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.AQUA + "Flux");
		ArrayList<String>lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Used to harden Iron Ingots into Steel");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		ShapelessRecipe slFluxRecipie = new ShapelessRecipe(item);
		slFluxRecipie.addIngredient(1, Material.GLASS_BOTTLE);
		slFluxRecipie.addIngredient(1, Material.FLINT);
		slFluxRecipie.addIngredient(1, Material.SULPHUR);
		plugin.getServer().addRecipe(slFluxRecipie);}
		
	public void SteelRecipie(){
		
		ItemStack item = new ItemStack(Material.IRON_INGOT);
		ItemMeta meta = item.getItemMeta();
		
		meta.setDisplayName(ChatColor.DARK_AQUA + "Steel Ingot");
		ArrayList<String>lore = new ArrayList<String>();
		lore.add(ChatColor.WHITE + "Steel is used to make high quality items");
		meta.setLore(lore);
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		item.setItemMeta(meta);
		
		ShapedRecipe sSteelRecipie = new ShapedRecipe(item);
		
		sSteelRecipie.shape("% %", "$$$", "% %");
		sSteelRecipie.setIngredient('$', Material.IRON_INGOT);
		sSteelRecipie.setIngredient('%', Material.POTION);
		
		plugin.getServer().addRecipe(sSteelRecipie);}
	

		

}
