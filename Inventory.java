import java.util.HashMap;

public class Inventory {
	private Item[] inventory;

	public Inventory() {
		inventory = new Item[30];
	}

	public int addItem(Item item) {
		Item item_at = null;
		int remainder = item.getAmt();
		
		//Search for the item & add to stack
		for(int i = 0; i < this.inventory.length; i++) {
			item_at = inventory[i];
			if (item_at != null && item_at.name == item.name && item_at.getAmt() != item_at.getMaxAmt()) {
				remainder = item_at.addAmt(remainder);
				if (remainder == 0)
					return 0;
			}
		}

		//If remainder or no item found
		for(int i = 0; i < this.inventory.length; i++) {
			item_at = this.inventory[i];
			if (item_at == null) {
				this.inventory[i] = item;
				return 0;
			}
		}

		return remainder;
	}

	public String toString() {
		String result = "";
		for (int i = 0; i < this.inventory.length; i++) {
			Item item_at = this.inventory[i];
			if (item_at != null)
				result += item_at + "\n";
		}

		return result;
	}
}
