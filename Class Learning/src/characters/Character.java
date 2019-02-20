package characters;

public interface Character {
	
	public int getHP();
	public void addHP(int number);
	public void removeHP(int number);
	public String getName();
	public void useWeapon();
	public void useItem(int index);
}
