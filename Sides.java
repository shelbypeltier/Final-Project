
public class Sides extends Food{
	
	public Sides() {
		super();
	}

	public Sides(String name) {
		super (name);
	}
	
	public double getPrice() {
		switch (name) {
		case "regFry":
		case "regOnionRings":
		case "regCheeseCurd":
		case "regColeSlaw":
		case "regMozzarellaSticks":
		case "regWaffleFry": price = 3;
		break;
		case "largeFry":
		case "largeOnionRing":
		case "largeCheeseCurd":
		case "largeColeSlaw":
		case "largeMozzarellaSticks":
		case "largeWaffleFry": price = 5;
		break;
		}
		return price;
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
		return getName() + "\n";
	}

	public void defaultSides() {
		price = 0;
		name = "";
		
	}
	
}
