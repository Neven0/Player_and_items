package characters;

import java.util.ArrayList;
import java.util.List;

import item.Item;
import item.armour.Armour;
import item.weapon.*;

public final class Player implements Character {

	private int HP;
	private final String name;
	private Weapon weapon;
	private Armour armour;
	private List<Item> Inventory=new ArrayList<Item>(); 
	private static final int MAX_CARRY_WEIGHT=100;
	private double currentCarryWeight;
	private int coins;
	
	public Player(String name)
	{
		this.name=name;
		this.HP=10;
		this.weapon=new Weapon(); 
		this.armour=new Armour();
		this.currentCarryWeight=0;
		this.coins=0;
	}
	
	public int getCoins() 
	{
		return this.coins;
	}
	
	@Override
	public int getHP() {
		return this.HP;
	}
	
	public void sellItem(int index)
	{
		this.coins+=Inventory.get(index).getValue();
		this.removeItem(index);
	}
	
	public void getInventory() 
	{
		Inventory.forEach(thing->System.out.println(thing));
	}
	
	public void addItem(Item item) throws OverMaxCarryException
	{
		if(this.currentCarryWeight+item.getWeight()>MAX_CARRY_WEIGHT) 
		{
			throw new OverMaxCarryException();
		}
		
		else
		{
		item.setPlayer(this);
		Inventory.add(item);
		this.currentCarryWeight+=item.getWeight();
		}
	}
	
	public double getWeight() 
	{
		return this.currentCarryWeight;
	}
	
	public void removeItem(int index)
	{
		this.currentCarryWeight-=Inventory.get(index).getWeight();
		Inventory.remove(index);
	}

	@Override
	public String getName() {
		return this.name;
	}
	
	public void setWeapon(Weapon weapon)
	{
		this.weapon=weapon;
	}
	
	public void setWeapon() 
	{
		this.weapon=new Weapon();
	}

	@Override
	public void useWeapon() {
		System.out.println("Using weapon with "+getWeaponDamage()+" damage");
	}
	
	public double getWeaponDamage() 
	{
		return this.weapon.getDamage();
	}
	
	public double getWeaponCost() 
	{
		return this.weapon.getValue();
	}
	
	public double getArmourRating() 
	{
		return this.armour.getRating();
	}
	
	public void setArmour(Armour armour) throws ClassCastException
	{
		this.armour=armour;
	}
	
	public void setArmour() 
	{
		this.armour=new Armour();
	}

	@Override
	public void useItem(int index) {
		Inventory.get(index).use();
		
	}

	@Override
	public void addHP(int number) {
		this.HP+=number;
		
	}

	@Override
	public void removeHP(int number) {
		this.HP-=number;
		
	}

}
