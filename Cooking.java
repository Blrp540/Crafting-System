import java.util.HashMap;

public class Cooking {
	public static void main(String[] args) {
		Reagent meat = new Reagent("Stingwing Meat", 1, 1);
		Reagent spices = new Reagent("Spices", 1, 1);
		HashMap<Reagent, Integer> requirements = new HashMap<Reagent, Integer>();
		requirements.put(meat, 1);
		requirements.put(spices, 2); 
		Recipie cooked_meat = new Recipie("Cooked Stingwing Meat", requirements);

		System.out.println(cooked_meat);

		HashMap<Reagent, Integer> inventory = new HashMap<Reagent, Integer>();
		inventory.put(meat, 1);
		inventory.put(spices, 2);

		System.out.println(cooked_meat.canCreate(inventory));
	}
}
