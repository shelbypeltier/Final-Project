
public class Dessert extends Food{

	public Dessert() {
		super();
	}

	public Dessert(double price, String name) {
		super(price, name);
	}
	
	
	@Override
	public double getPrice() {
		return super.getPrice();
	}

	@Override
	public void setPrice(double price) {
		// TODO Auto-generated method stub
		super.setPrice(price);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String toString() {
		return "Dessert Price =" + getPrice() + "/n Name=" + getName();
	}
	
	
}
