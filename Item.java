public class Item {
	public String name;
	private int amt, max_amt;	

	public Item(String name, int amt, int max_amt) {
		this.name = name;
		this.amt = amt;
		this.max_amt = max_amt;
	}

	public int getSpace() {
		return this.max_amt - this.amt;
	}

	public int addAmt(int amt) {
		if (amt < this.getSpace()) {
			this.amt += amt;
			return 0;
		}
		else {
			amt = amt - this.getSpace();
			this.amt = this.max_amt;
			return amt;
		}
	}

	public int getAmt() {
		return this.amt;
	}

	public int getMaxAmt() {
		return this.max_amt;
	}

	public String toString() {
		return this.amt + "/" + this.max_amt + " " + this.name;
	}
}
