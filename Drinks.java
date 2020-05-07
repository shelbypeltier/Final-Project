
public class Drinks extends Food{
	private String nameOfDrink, size;
	
	public String getNameOfDrink() {
		return nameOfDrink;
	}

	public void setNameOfDrink(String nameOfDrink) {
		this.nameOfDrink = nameOfDrink;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public Drinks() {
		super();
		nameOfDrink = "pepsi";
		size = "small";
	}

	@Override
	public String toString() {
		return "Drinks nameOfDrink=" + nameOfDrink + "/n size=" + size + "/n getPrice()=" + getPrice() + "/n getName()="
				+ getName();
	}
	
}
