
public class Sauce {

	private String typeOfSauce;
	private int numOfSauce;
	
	public Sauce() {
		this.typeOfSauce = null;
		this.numOfSauce = 0;
	}
	
	public Sauce(String typeOfSauce, int numOfSauce) {
		super();
		this.typeOfSauce = typeOfSauce;
		this.numOfSauce = numOfSauce;
	}

	public String getTypeOfSauce() {
		return typeOfSauce;
	}

	public void setTypeOfSauce(String typeOfSauce) {
		this.typeOfSauce = typeOfSauce;
	}

	public int getNumOfSauce() {
		return numOfSauce;
	}

	public void setNumOfSauce(int numOfSauce) {
		this.numOfSauce = numOfSauce;
	}

	@Override
	public String toString() {
		return "Sauce /n typeOfSauce=" + typeOfSauce + "/n numOfSauce=" + numOfSauce;
	}
	
	
	
}
