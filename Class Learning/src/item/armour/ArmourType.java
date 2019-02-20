package item.armour;

public enum ArmourType {
	NONE(0,0),
	CHAIN(1,0),
	REINFCHAIN(1.1,1),
	PLATE(1.2,2),
	REINFPLATE(1.3,3),
	ORNATE(1.4,4),
	REINFORNATE(1.5,5);
	
	private final double valueModifier;
	private final double effectIncrase;
	
	ArmourType(double valueMod, double effect)
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
		case NONE: return "";
		case CHAIN: return "Chainmail";
		case REINFCHAIN: return "Reinforced chainmail";
		case PLATE: return "Plate";
		case REINFPLATE: return "Reinforced plate";
		case ORNATE: return "Ornate plate";
		case REINFORNATE: return "Reinforced ornate plate";
		default: return "Invalid armour type";
		}
	}
}
