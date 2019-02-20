package item.weapon;

import item.Item;
import characters.Player;
import modifiers.Rarity;
import modifiers.Material;

public final class Weapon extends Item {

	private final Material mat;
	private final Rarity rar;
	private final WeaponType WT;
	private final double damage;
	
	public Weapon()
	{
		this.mat=Material.NONE;
		this.rar=Rarity.NONE;
		this.WT=WeaponType.FISTS;
		this.value=10 * mat.getValueMod() * rar.getModifier() * WT.getValueMod();
		this.weight=5 * mat.getWeightMod() * rar.getModifier();
		this.damage=10 * mat.getEffectivenessMod() * rar.getModifier() + WT.getEffectInc();
		
	}
	
	public Weapon(Material mat, Rarity rar, WeaponType WT)
	{
		this.mat=mat;
		this.rar=rar;
		this.WT=WT;
		this.value=10 * mat.getValueMod() * rar.getModifier() * WT.getValueMod();
		this.weight=5 * mat.getWeightMod() * rar.getModifier();
		this.damage=10 * mat.getEffectivenessMod() * rar.getModifier() + WT.getEffectInc();
	}
	
	@Override
	public double getValue()
	{
		return this.value;
	}

	@Override
	public double getWeight()
	{
		return this.weight;
	}
	
	public double getDamage() 
	{
		return this.damage;
	}
	

	@Override
	public void use() {
		player.setWeapon(this);
		System.out.println(rar.toString()+" "+mat.toString()+" "+WT.toString()+" is equipped");
	}
	
	public String toString() 
	{
		return (rar.toString()+" "+mat.toString()+" "+WT.toString()+"\t VAL:"+this.value+" WGT:"+this.weight+" DMG:"+this.damage);
	}

	@Override
	public void setPlayer(Player player) {
		this.player=player;
	}

}
