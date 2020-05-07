
public class ChickenTenders extends Food{
	private Sauce sauce;
	private int numOfTenders;
	private double priceofTend = 10.99;

	
	public Sauce getSauce() {
		return sauce;
	}
	
	public void setSauce(Sauce sauce) {
		this.sauce = sauce;
	}
	
	public int getNumOfTenders() {
		return numOfTenders;
	}
	
	public void setNumOfTenders(int numOfTenders) {
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders(double price, String name, Sauce sauce, int numOfTenders) {
		super(price, name);
		this.sauce = sauce;
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders() {
		super();
		this.sauce = null;
		this.numOfTenders = 0;
		
	}

	@Override
	public String toString() {
		return "ChickenTenders sauce=" + sauce + "/n numOfTenders=" + numOfTenders + "/n Price=" + getPrice()
				+ "Name()=" + getName();
	}

	public double getPriceofTend() {
		return priceofTend;
	}

	public void setPriceofTend(double priceofTend) {
		this.priceofTend = priceofTend;
	}
	
	
}

