
public class ChickenTenders extends Food{
	private String sauce;
	private int numOfTenders;
	private double priceofTend = 0;
	protected int getNumOfTenders; 
	public String getSauce() {

		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public int getNumOfTenders() {
		return numOfTenders;
	}
	
	public void setNumOfTenders(int tend) {
		this.numOfTenders = tend;
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
		if (sauce.equalsIgnoreCase("")) {
		return numOfTenders + " pc with no sauce" + "\n" ; 
		} else {
			return numOfTenders + " pc with " + sauce + "\n";
		}
	}
	//Testing to String NOT FINAL

	public double getPriceofTend() {
		return priceofTend;
	}

	public void setPriceofTend(double priceofTend) {
		this.priceofTend = priceofTend;
	}
	
	public void defaultTenders () {
		sauce = "";
		numOfTenders = 0;
		priceofTend = 0;
	}
	
}

