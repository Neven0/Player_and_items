package modifiers;

public enum Material {
	NONE(0,0,0),
	IRON(1,1,1),
	STEEL(1.5, 1.5,1.5),
	SILVER(1.3, 2.5, 1.4),
	GOLD(1.2,5,1.2),
	PLATINUM(2,2.5,2);
	
	
	private final double weightModifier;
	private final double valueModifier;
	private final double effectiveModifier;
	
	Material(double weight, double value, double effectivness)
	{
		weightModifier=weight;
		valueModifier=value;
		effectiveModifier=effectivness;
	}
	
	public double getWeightMod() 
	{
		return this.weightModifier;
	}
	
	public double getValueMod() 
	{
		return this.valueModifier;
	}
	
	public double getEffectivenessMod() 
	{
		return this.effectiveModifier;
	}
	
	public String toString()
	{
		switch(this) {
		case NONE: return "";
		case IRON: return "Iron";
		case STEEL: return "Steel";
		case SILVER: return "Silver";
		case GOLD: return "Gold";
		case PLATINUM: return "Platinum";
		default: return "Invalid material";
		}
	}
}
