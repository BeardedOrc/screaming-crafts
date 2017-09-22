package com.screamingorc.screamingorc.events;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.inventory.ItemStack;
import net.md_5.bungee.api.ChatColor;

public class EventsClass implements Listener {
/* ---

	@EventHandler(priority = EventPriority.HIGH)
	public void customCrafting(PrepareItemCraftEvent event) {
	
		String result = new String (RESULT ITEM DISPLAY NAME);
		
		// Position 1
		Boolean HasCustomItem1 = new Boolean(false);
		ItemStack iPos1 = new ItemStack(Material.AIR);
		String namePos1 = new String ("air");
		
		// Position 2
		Boolean HasCustomItem2 = new Boolean(false);
		ItemStack iPos2 = new ItemStack(Material.AIR);
		String namePos2 = new String ("air")
		
		// Position 3
		Boolean HasCustomItem3 = new Boolean(false);
		ItemStack iPos3 = new ItemStack(Material.AIR);
		String namePos3 = new String ("air");
		
		// Position 4
		Boolean HasCustomItem4 = new Boolean(false);
		ItemStack iPos4 = new ItemStack(Material.AIR);
		String namePos4 = new String ("air");
		
		// Position 5
		Boolean HasCustomItem5 = new Boolean(false);
		ItemStack iPos5 = new ItemStack(Material.AIR);
		String namePos5 = new String ("air");
		
		// Position 6
		Boolean HasCustomItem6 = new Boolean(false);
		ItemStack iPos6 = new ItemStack(Material.AIR);
		String namePos6 = new String ("air");
		
		// Position 7
		Boolean HasCustomItem7 = new Boolean(false);
		ItemStack iPos7 = new ItemStack(Material.AIR);
		String namePos7 = new String ("air");
		
		// Position 8
		Boolean HasCustomItem8 = new Boolean(false);
		ItemStack iPos8 = new ItemStack(Material.AIR);
		String namePos8 = new String ("air");
		
		// Position 9
		Boolean HasCustomItem9 = new Boolean(false);
		ItemStack iPos9 = new ItemStack(Material.AIR);
		String namePos9 = new String ("air");
		
		// ----------  Set Booleans  ----------
		Boolean bPos1 = new Boolean(true);
		Boolean bPos2 = new Boolean(true);
		Boolean bPos3 = new Boolean(true);
		Boolean bPos4 = new Boolean(true);
		Boolean bPos5 = new Boolean(true);
		Boolean bPos6 = new Boolean(true);
		Boolean bPos7 = new Boolean(true);
		Boolean bPos8 = new Boolean(true);
		Boolean bPos9 = new Boolean(true);
				
		// ----------  Check to see if result has a custom Display name.  If not, stop process ----------
		if (event.getInventory().getResult().getItemMeta().getDisplayName() == (null)) {
			return;}
			
		// ----------  If item has a display name, compare it to required name.  If it is not the same, stop process ----------
		if (!event.getInventory().getResult().getItemMeta().getDisplayName().toString().equals(result)) {
			return;}		
		
		// -----  Process SLOT 1 -----
		if (HasCustomItem1){
			final ItemStack pos1 = event.getInventory().getItem(1);
			if (event.getInventory().getItem(1) != null) {
				if (pos1.getType() == (iPos1.getType())) {
					if (pos1.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos1.getItemMeta().getDisplayName().toLowerCase().contains(namePos1)) {
						bPos1 = false;}}}}
		
		// -----  Process SLOT 2 -----
		if (HasCustomItem2){
			final ItemStack pos2 = event.getInventory().getItem(2);
			if (event.getInventory().getItem(2) != null) {
				if (pos2.getType() == (iPos2.getType())) {
					if (pos2.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos2.getItemMeta().getDisplayName().toLowerCase().contains(namePos2)) {
						bPos2 = false;}}}}
		
		// -----  Process SLOT 3 -----						
		if (HasCustomItem3){
			final ItemStack pos3 = event.getInventory().getItem(3);
			if (event.getInventory().getItem(3) != null) {
				if (pos3.getType() == (iPos3.getType())) {
					if (pos3.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos3.getItemMeta().getDisplayName().toLowerCase().contains(namePos3)) {
						bPos3 = false;}}}}
		
		// -----  Process SLOT 4 -----						
		if (HasCustomItem4){
			final ItemStack pos4 = event.getInventory().getItem(4);
			if (event.getInventory().getItem(4) != null) {
				if (pos4.getType() == (iPos4.getType())) {
					if (pos4.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos4.getItemMeta().getDisplayName().toLowerCase().contains(namePos4)) {
						bPos4 = false;}}}}
		
		// -----  Process SLOT 5 -----						
		if (HasCustomItem5){
			final ItemStack pos5 = event.getInventory().getItem(5);
			if (event.getInventory().getItem(5) != null) {
				if (pos5.getType() == (iPos5.getType())) {
					if (pos5.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos5.getItemMeta().getDisplayName().toLowerCase().contains(namePos5)) {
						bPos5 = false;}}}}
		
		// -----  Process SLOT 6 -----						
		if (HasCustomItem6){
			final ItemStack pos6 = event.getInventory().getItem(6);
			if (event.getInventory().getItem(6) != null) {
				if (pos6.getType() == (iPos6.getType())) {
					if (pos6.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos6.getItemMeta().getDisplayName().toLowerCase().contains(namePos6)) {
						bPos6 = false;}}}}
		
		// -----  Process SLOT 7 -----						
		if (HasCustomItem7){
			final ItemStack pos7 = event.getInventory().getItem(7);
			if (event.getInventory().getItem(7) != null) {
				if (pos7.getType() == (iPos7.getType())) {
					if (pos7.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos7.getItemMeta().getDisplayName().toLowerCase().contains(namePos7)) {
						bPos7 = false;}}}}
		
		// -----  Process SLOT 8 -----						
		if (HasCustomItem8){
			final ItemStack pos8 = event.getInventory().getItem(8);
			if (event.getInventory().getItem(8) != null) {
				if (pos8.getType() == (iPos8.getType())) {
					if (pos8.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos8.getItemMeta().getDisplayName().toLowerCase().contains(namePos8)) {
						bPos8 = false;}}}}
		
		// -----  Process SLOT 9 -----						
		if (HasCustomItem9){
			final ItemStack pos9 = event.getInventory().getItem(9);
			if (event.getInventory().getItem(9) != null) {
				if (pos9.getType() == (iPos9.getType())) {
					if (pos9.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos9.getItemMeta().getDisplayName().toLowerCase().contains(namePos9)) {
						bPos9 = false;}}}}
						
		// ----------  Process all slots to make sure they have correct materials  ----------	
		if(!(bPos1 && bPos2 && bPos3 && bPos4 && bPos5 && bPos6 && bPos7 && bPos8 && bPos9)) {
			return;}
			
		// ----------  If any failures in slots, return empty result slot ----------
		event.getInventory().setResult(null);
		return;}}	
				
*/
/*
// -----------  Steel Ingot  -------------------
	@EventHandler(priority = EventPriority.HIGH)
	public void customCrafting(PrepareItemCraftEvent event) {
		// Create variables to test item names against
		String steelingot = new String(ChatColor.DARK_AQUA + "Steel Ingot");
		// Check to see if the item being crafted has a custom name.  If not, cancel method
		if (event.getInventory().getResult().getItemMeta().getDisplayName() == (null)) {
			return;}
		// Check to see if crafted item has same name as variable
		if (event.getInventory().getResult().getItemMeta().getDisplayName().toString().equals(steelingot)) {
		// Check crafting table location of custom ingredients to ensure they are correct.  0 is result, 1 is first.
			final ItemStack item = event.getInventory().getItem(1);
			// Make sure the location is not empty
			if (event.getInventory().getItem(1) != null) {
				// Make sure the item in the location is the correct type
				if (item.getType() == Material.POTION) {
					// Check the item in the location to make sure it has a custom name.  If not, set result to blank
						if (item.getItemMeta().getDisplayName() == (null)) {
							event.getInventory().setResult(null);
							return;}
					// Check to make sure the name is correct in the ingredient, and create the item
						if (item.getItemMeta().getDisplayName().toLowerCase().contains("flux")) {
							return;}}
				event.getInventory().setResult(null);
				return;}}}}
//  ---------------------------------------------
*/
    @EventHandler(priority = EventPriority.HIGH)
	public void customCrafting(PrepareItemCraftEvent event) {
		String result = new String (ChatColor.DARK_AQUA + "Steel Ingot");
		
		Boolean HasCustomItem1 = new Boolean(true);
		ItemStack iPos1 = new ItemStack(Material.POTION);
		String namePos1 = new String ("flux");
		Boolean bPos1 = new Boolean(true);
		
		
		Boolean HasCustomItem2 = new Boolean(false);
		ItemStack iPos2 = new ItemStack(Material.AIR);
		String namePos2 = new String ("xxx");
		Boolean bPos2 = new Boolean(true);
		
		Boolean HasCustomItem3 = new Boolean(true);
		ItemStack iPos3 = new ItemStack(Material.POTION);
		String namePos3 = new String ("flux");
		Boolean bPos3 = new Boolean(true);
		
		Boolean HasCustomItem4 = new Boolean(false);
		ItemStack iPos4 = new ItemStack(Material.IRON_INGOT);
		String namePos4 = new String ("xxx");
		Boolean bPos4 = new Boolean(true);
		
		Boolean HasCustomItem5 = new Boolean(false);
		ItemStack iPos5 = new ItemStack(Material.IRON_INGOT);
		String namePos5 = new String ("xxx");
		Boolean bPos5 = new Boolean(true);
		
		Boolean HasCustomItem6 = new Boolean(false);
		ItemStack iPos6 = new ItemStack(Material.IRON_INGOT);
		String namePos6 = new String ("xxx");
		Boolean bPos6 = new Boolean(true);
		
		Boolean HasCustomItem7 = new Boolean(true);
		ItemStack iPos7 = new ItemStack(Material.POTION);
		String namePos7 = new String ("flux");
		Boolean bPos7 = new Boolean(true);
		
		Boolean HasCustomItem8 = new Boolean(false);
		ItemStack iPos8 = new ItemStack(Material.AIR);
		String namePos8 = new String ("xxx");
		Boolean bPos8 = new Boolean(true);
		
		Boolean HasCustomItem9 = new Boolean(true);
		ItemStack iPos9 = new ItemStack(Material.POTION);
		String namePos9 = new String ("flux");
		Boolean bPos9 = new Boolean(true);
		
		if (event.getInventory().getResult().getItemMeta().getDisplayName() == (null)) {
			return;}
		if (!event.getInventory().getResult().getItemMeta().getDisplayName().toString().equals(result)) {
			return;}		
		
		if (HasCustomItem1){
			final ItemStack pos1 = event.getInventory().getItem(1);
			if (event.getInventory().getItem(1) != null) {
				if (pos1.getType() == (iPos1.getType())) {
					if (pos1.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos1.getItemMeta().getDisplayName().toLowerCase().contains(namePos1)) {
						bPos1 = false;}}}}
						
		if (HasCustomItem2){
			final ItemStack pos2 = event.getInventory().getItem(2);
			if (event.getInventory().getItem(2) != null) {
				if (pos2.getType() == (iPos2.getType())) {
					if (pos2.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos2.getItemMeta().getDisplayName().toLowerCase().contains(namePos2)) {
						bPos2 = false;}}}}
						
		if (HasCustomItem3){
			final ItemStack pos3 = event.getInventory().getItem(3);
			if (event.getInventory().getItem(3) != null) {
				if (pos3.getType() == (iPos3.getType())) {
					if (pos3.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos3.getItemMeta().getDisplayName().toLowerCase().contains(namePos3)) {
						bPos3 = false;}}}}
						
		if (HasCustomItem4){
			final ItemStack pos4 = event.getInventory().getItem(4);
			if (event.getInventory().getItem(4) != null) {
				if (pos4.getType() == (iPos4.getType())) {
					if (pos4.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos4.getItemMeta().getDisplayName().toLowerCase().contains(namePos4)) {
						bPos4 = false;}}}}
						
		if (HasCustomItem5){
			final ItemStack pos5 = event.getInventory().getItem(5);
			if (event.getInventory().getItem(5) != null) {
				if (pos5.getType() == (iPos5.getType())) {
					if (pos5.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos5.getItemMeta().getDisplayName().toLowerCase().contains(namePos5)) {
						bPos5 = false;}}}}
						
		if (HasCustomItem6){
			final ItemStack pos6 = event.getInventory().getItem(6);
			if (event.getInventory().getItem(6) != null) {
				if (pos6.getType() == (iPos6.getType())) {
					if (pos6.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos6.getItemMeta().getDisplayName().toLowerCase().contains(namePos6)) {
						bPos6 = false;}}}}
						
		if (HasCustomItem7){
			final ItemStack pos7 = event.getInventory().getItem(7);
			if (event.getInventory().getItem(7) != null) {
				if (pos7.getType() == (iPos7.getType())) {
					if (pos7.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos7.getItemMeta().getDisplayName().toLowerCase().contains(namePos7)) {
						bPos7 = false;}}}}
						
		if (HasCustomItem8){
			final ItemStack pos8 = event.getInventory().getItem(8);
			if (event.getInventory().getItem(8) != null) {
				if (pos8.getType() == (iPos8.getType())) {
					if (pos8.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos8.getItemMeta().getDisplayName().toLowerCase().contains(namePos8)) {
						bPos8 = false;}}}}
						
		if (HasCustomItem9){
			final ItemStack pos9 = event.getInventory().getItem(9);
			if (event.getInventory().getItem(9) != null) {
				if (pos9.getType() == (iPos9.getType())) {
					if (pos9.getItemMeta().getDisplayName() == (null)) {
						event.getInventory().setResult(null);
						return;}
					if (pos9.getItemMeta().getDisplayName().toLowerCase().contains(namePos9)) {
						bPos9 = false;}}}}
						
			if(!(bPos1 && bPos2 && bPos3 && bPos4 && bPos5 && bPos6 && bPos7 && bPos8 && bPos9)) {
				return;}
				event.getInventory().setResult(null);
				return;}}