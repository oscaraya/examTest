package question6;

public class ToolBoxApp {

	public static void main(String[] args) {
		ToolBox<Item> items = new ToolBox<Item>();
		System.out.println (items.isEmpty());

		try{
			Item item = new Item(1);
			items.add(item);
			item = new Item(2);
			items.add(item);
			System.out.println (items.isEmpty());

			System.out.println (items.toString());
			System.out.println (items.getItem(1));
			System.out.println (items.getItem(2));

			items.remove(1);
			//System.out.println (items.getItem(1));
			//items.remove(1);
		} catch (Exception ex) {
			System.out.println ("Exception");
		  }
	}
}
