package question6;

public class Item implements Identified{
	private int id;

	public	Item (int id) {this.id = id;}
	public int getId() {return id;}
	public String toString() {
		Integer intVal = new Integer(id);
		return intVal.toString();
	}
}
