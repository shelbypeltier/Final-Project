
public class ChickenTenders extends Food{
	private String sauce;
	private int numOfTenders;
	public String getSauce() {

		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public int getNumOfTenders() {
		return numOfTenders;
	}
	
	public void setNumOfTenders(int numOfTenders) {
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders(double price, String name,String sauce, int numOfTenders) {
		super(price, name);
		this.sauce = sauce;
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders() {
		super();
		this.sauce = "";
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

