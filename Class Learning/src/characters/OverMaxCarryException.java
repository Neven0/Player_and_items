package characters;

@SuppressWarnings("serial")
public final class OverMaxCarryException extends Exception {
	
	OverMaxCarryException(){}
	
	public String toString() 
	{
		return ("You cannot add that item, your carry weight is too high!");
	}
}
