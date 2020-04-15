
public class Food {
	private double price;
	private String name;
	
	public Food(double price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public Food() {
		this.price = 0.0;
		this.name = null;	
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
		return "Food price=" + price + "/n name=" + name";
	}

	
	
	
	
}
