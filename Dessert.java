
public class Dessert extends Food{

	public Dessert() {
		super();
	}

	public Dessert(double price, String name) {
		super(price, name);
	}

	@Override
	public String toString() {
		return "Dessert Price =" + getPrice() + "/n Name=" + getName();
	}
	
	
}
