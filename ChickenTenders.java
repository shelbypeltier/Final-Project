
public class ChickenTenders extends Food{
	private String numOfTenders,sauce;
	
	public String getSauce() {
		return sauce;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public String getNumOfTenders() {
		return numOfTenders;
	}
	
	public void setNumOfTenders(String numOfTenders) {
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders(double price, String name,String sauce, String numOfTenders) {
		super(price, name);
		this.sauce = sauce;
		this.numOfTenders = numOfTenders;
	}
	
	public ChickenTenders() {
		super();
		this.sauce = null;
		this.numOfTenders = null;
	}

	@Override
	public String toString() {
		return "ChickenTenders sauce=" + sauce + "/n numOfTenders=" + numOfTenders + "/n Price=" + getPrice()
				+ "Name()=" + getName();
	}
	
	
}
