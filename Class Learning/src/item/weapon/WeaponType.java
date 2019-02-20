package item.weapon;

public enum WeaponType {
	FISTS(0,0),
	SWORD(1,0),
	AXE(0.95,1),
	MACE(0.9,2),
	GREATSWORD(0.85,3),
	BATTLEAXE(0.8,4),
	WARHAMMER(0.75,5);
	
	private final double valueModifier;
	private final double effectIncrase;
	
	WeaponType(double valueMod, double effect)
	{
		valueModifier=valueMod;
		effectIncrase=effect;
	}
	
	public double getValueMod() 
	{
		return this.valueModifier;
	}
	
	public double getEffectInc() 
	{
		return this.effectIncrase;
	}
	
	public String toString()
	{
		switch(this) {
		case FISTS: return "Fists";
		case SWORD: return "Sword";
		case AXE: return "Axe";
		case MACE: return "Mace";
		case GREATSWORD: return "Greatsword";
		case BATTLEAXE: return "Battleaxe";
		case WARHAMMER: return "Warhammer";
		default: return "Invalid weapon type";
		}
	}
	
}
