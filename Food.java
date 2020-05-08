
public class Food {
	protected double price;
	protected String name;
	
	public Food(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Food() {
		this.price = 0.0;
		this.name = "";	
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return //"Food price=" + price + "/n name=" + name; 
				"Test String";
	}

	
	
	
	
}
