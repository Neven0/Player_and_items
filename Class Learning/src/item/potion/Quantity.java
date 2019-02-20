package item.potion;

public enum Quantity {
	VERYSMALL(0),
	SMALL(2),
	NORMAL(4),
	LARGE(6),
	VERYLARGE(8),
	GREAT(10);
	
	private final int health;
	
	Quantity(int health)
	{
		this.health=health;
	}
	
	public int getHealth() 
	{
		return health;
	}
	
	public String toString()
	{
		switch(this) {
		case VERYSMALL: return "Very small";
		case SMALL: return "Small";
		case NORMAL: return "Normal";
		case LARGE: return "Large";
		case VERYLARGE: return "Very large";
		case GREAT: return "Great";
		default: return "Invalid material";
		}
	}
}
