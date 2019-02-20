package modifiers;

public enum Rarity {
	NONE(1),
	COMMON(1),
	UNCOMMON(1.1),
	RARE(1.2),
	VERYRARE(1.3),
	SECRET(1.4),
	LEGENDARY(1.5);
	
	private final double modifier;
	
	Rarity(double modifier)
	{
		this.modifier=modifier;
	}
	
	public double getModifier() 
	{
		return this.modifier;
	}
	
	public String toString()
	{
		switch(this) {
		case NONE: return "";
		case COMMON: return "Common";
		case UNCOMMON: return "Uncommon";
		case RARE: return "Rare";
		case VERYRARE: return "Very rare";
		case SECRET: return "Secret";
		case LEGENDARY: return "Legendary";
		default: return "Invalid rarity";
		}
	}
}
