
public class ChickenTenders extends Food{
	private String sauce;
	private int numOfTenders;
	private double priceofTend = 0;
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
	
	public ChickenTenders(String sauce, int numOfTenders) {
		super();
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
		String tab = getNumOfTenders() + "Chicken Tenders\n"; 
		if(!(sauce.isEmpty())) {		
			tab += "\t" + sauce;
		}
		return tab;		
	}

	public double getPriceofTend() {
		return priceofTend;
	}

	public void setPriceofTend(double priceofTend) {
		this.priceofTend = priceofTend;
	}

	public void defaultTenders() {
		sauce = "";
		numOfTenders = 0;
		priceofTend = 0;
	}
	
	
}

