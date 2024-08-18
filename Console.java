import java.util.Stack;

public class Console {
	public Console() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		Console c = new Console();
		Item sand1 = new Item("Sand", 19, 20);
		Item sand2 = new Item("Sand", 1, 20);
		Item sand3 = new Item("Sand", 1, 20);
		Item sand4 = new Item("Sand", 19, 20);
		Item sand5 = new Item("Sand", 2, 20);
		Inventory i = new Inventory();
		i.addItem(sand1);
		i.addItem(sand2);
		i.addItem(sand3);
		i.addItem(sand4);
		i.addItem(sand5);
		System.out.println(i);
		Player p = new Player(i);
	}
}