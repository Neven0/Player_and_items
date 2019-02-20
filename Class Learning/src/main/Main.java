package main;

import characters.OverMaxCarryException;
import characters.Player;
import item.Item;
import item.armour.Armour;
import item.armour.ArmourType;
import item.weapon.Weapon;
import item.weapon.WeaponType;
import item.potion.Potion;
import item.potion.Quantity;
import modifiers.Material;
import modifiers.Rarity;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Making a new player...");
		Player player=new Player("Neven");
		System.out.println("New player is "+player.getName());
		System.out.println(player.getName()+" currently has weapon that does "+player.getWeaponDamage()+" damage and costs "+player.getWeaponCost()+"\n");
		
		System.out.println("Creating a new weapon");
		Item sword=new Weapon(Material.IRON, Rarity.UNCOMMON, WeaponType.GREATSWORD);
		System.out.println("Adding new weapon to inventory");
		try {
			player.addItem(sword);
		} catch (OverMaxCarryException e) {
			System.out.println(e);
		}
		System.out.println("Current inventory is:");
		player.getInventory();
		System.out.println("");
		
		System.out.println("Equiping the weapon");
		player.useItem(0);;
		System.out.println("Player can now do "+player.getWeaponDamage()+" damage\n");
		
		System.out.println("Creating new armour, putting it in inventory and equpping it");
		Item plate=new Armour(Material.STEEL, Rarity.COMMON, ArmourType.PLATE);
		try {
			player.addItem(plate);
		} catch (OverMaxCarryException e) {
			System.out.println(e);
		}
		player.useItem(1);
		System.out.println("Current inventory is:");
		player.getInventory();
		System.out.println("Player now has armour with "+player.getArmourRating()+" rating\n");
		
		System.out.println("Player now weighs "+player.getWeight());
		System.out.println("Current carry weight is "+player.getWeight()+"\n");
		
		System.out.println("Currently, player has "+player.getCoins()+" coins.\n Selling the sword");
		try {
		player.sellItem(5);
		}
		catch(IndexOutOfBoundsException e) 
		{
			System.out.println("Cannot sell item that doesn't exist!");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		System.out.println("Player now has "+player.getCoins()+" coins and carry weight of "+player.getWeight());
		
		System.out.println("\nMaking a new weapon and using it");
		Item weapon=new Weapon(Material.PLATINUM, Rarity.LEGENDARY, WeaponType.AXE);
		try {
		player.addItem(weapon);}
		catch(ClassCastException e) 
		{
			System.out.println("Cannot equip that as Armour!!!\n");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("Equipping new weapon");
		player.useItem(2);
		player.getInventory();
		
		System.out.println("\nMaking a potion");
		Item potion=new Potion(Quantity.SMALL, Rarity.COMMON);
		try {
			player.addItem(potion);
		} catch (OverMaxCarryException e) {
			System.out.println(e);
		}
		
		System.out.println("Player currently has "+player.getHP()+" hit points.");
		player.useItem(3);
		System.out.println("Player now has "+player.getHP()+" hit points.");
		player.getInventory();
	}


}
