public class Drinks extends Food{
	private String nameOfDrink, size;
	
	public Drinks(String nameOfDrink, String size) {
		super();
		this.nameOfDrink = nameOfDrink;
		this.size = size;
	}
	
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
		switch (size) {
		case "small": price = 1;
		break;
		case "regular": price = 1.5;
		break;
		case "large": price = 2;
		break;
		}
	}
	
	public Drinks() {
		super();
//		nameOfDrink = "pepsi";
//		size = "small";
	}

	@Override
	public String toString() {
		return  size + " " + nameOfDrink + "\n";
	}

	public void defaultDrink() {
		nameOfDrink = "";
		size = "";
		
	}
	
}
