package item;
import characters.Player;

public abstract class Item {
	
	protected Player player;
	protected double value;
	protected double weight;
	
	public abstract double getValue();
	public abstract double getWeight();
	public abstract void use();
	public abstract void setPlayer(Player player);
}
