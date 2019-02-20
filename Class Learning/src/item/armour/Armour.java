package item.armour;

import characters.Player;
import item.Item;
import modifiers.*;

public final class Armour extends Item {

	private final Material mat;
	private final Rarity rar;
	private final ArmourType AT;
	private final double rating;
	
	public Armour()
	{
		this.mat=Material.NONE;
		this.rar=Rarity.NONE;
		this.AT=ArmourType.NONE;
		this.value=10 * mat.getValueMod() * rar.getModifier() * AT.getValueMod();
		this.weight=5 * mat.getWeightMod() * rar.getModifier();
		this.rating=10 * mat.getEffectivenessMod() * rar.getModifier() + AT.getEffectInc();
	}
	
	public Armour(Material mat, Rarity rar, ArmourType AT)
	{
		this.mat=mat;
		this.rar=rar;
		this.AT=AT;
		this.value=10 * mat.getValueMod() * rar.getModifier() * AT.getValueMod();
		this.weight=5 * mat.getWeightMod() * rar.getModifier();
		this.rating=10 * mat.getEffectivenessMod() * rar.getModifier() + AT.getEffectInc();
	}
	
	@Override
	public double getValue() {
		return this.value;
	}

	@Override
	public double getWeight() {
		return this.weight;
	}
	
	public double getRating() 
	{
		return this.rating;
	}
	
	@Override
	public void use() {
		player.setArmour(this);
		System.out.println(rar.toString()+" "+mat.toString()+" "+AT.toString()+" is equipped");
	}

	public String toString() 
	{
		return (rar.toString()+" "+mat.toString()+" "+AT.toString()+"\t VAL:"+this.value+" WGT:"+this.weight+" RTN:"+this.rating);
	}

	@Override
	public void setPlayer(Player player) {
		this.player=player;
		
	}
}
