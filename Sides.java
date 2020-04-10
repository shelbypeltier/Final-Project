
public class Sides extends Food{
	
	public Sides() {
		super();
	}

	public Sides(double price, String name) {
		super(price, name);
	}

	@Override
	public String toString() {
		return "Sides " + "/n getPrice()=" + getPrice() + "/n Side=" + getName();
	}
	
}
