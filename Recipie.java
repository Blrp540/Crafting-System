import java.util.HashMap;

public class Recipie {
	String name;
	HashMap<Reagent, Integer> requirements;

	public Recipie (String name, HashMap<Reagent, Integer> requirements) {
		this.name = name;
		this.requirements = requirements;
	}

	public boolean canCreate(HashMap<Reagent, Integer> inventory) {
		Reagent reagent;
		Integer amount_required;
		for (int i = 0; i < this.requirements.size(); i++) {
			reagent = (Reagent)this.requirements.keySet().toArray()[i];
			amount_required = this.requirements.get(reagent);
			if (!inventory.containsKey(reagent) || inventory.get(reagent) < amount_required)
				return false;
		}
		return true;
	}

	public String toString() {
		String result = this.name;
		for(int i = 0; i < this.requirements.size(); i++) {
			result += "\n\t" + this.requirements.entrySet().toArray()[i];
		}
		return result;
	}
}
