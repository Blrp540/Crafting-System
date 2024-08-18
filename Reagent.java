public class Reagent extends Item {
	String name;

	public Reagent (String name, int amt, int max_amt) {
		super(name, amt, max_amt);
	}

	public String toString() {
		return this.name;
	}
}
