package teoria2;

public class Dollar {
	
	private int amount;

	public Dollar(int amount) {
		this.setAmount(amount);
	}
	
	public Dollar times(int mult) {
		return new Dollar(this.getAmount() * mult);
	}
	
	public Dollar divideBy(int div) {
		return new Dollar(this.getAmount() / div);
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
}
