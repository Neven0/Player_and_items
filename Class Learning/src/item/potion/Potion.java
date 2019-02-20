package item.potion;

import characters.Player;
import modifiers.Rarity;
import item.Item;

public final class Potion extends Item {

	private final Quantity QT;
	private final Rarity rar;
	private final double value;
	private final double weight;
	private final int health;
	
	public Potion(Quantity qt, Rarity rar)
	{
		QT=qt;
		this.rar=rar;
		value=5*rar.getModifier();
		weight=(0.5+QT.getHealth())*rar.getModifier();
		health=5+QT.getHealth();
	}
	
	@Override
	public double getValue() {
		return this.value;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}
	
	private double getHealth() 
	{
		return this.health;
	}

	@Override
	public void use() {
		player.addHP(health);
		System.out.println("Using potion to add "+this.getHealth()+" HP to player.");
	}

	@Override
	public void setPlayer(Player player) {
		this.player=player;
	}
	
	public String toString() 
	{
		return (rar.toString()+" "+QT.toString()+" potion\t VAL:"+this.value+" WGT:"+this.weight+" HP:"+this.health);
	}

}
