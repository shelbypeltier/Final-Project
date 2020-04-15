
public class Burgers extends Food{
	private int numOfPatties,slicesOfCheese;
	private String typeOfMeat,typeOfCheese,bunType;
	private int tomato,lettuce,onion,pickle,mayo,ketchup,grilledOnion,mustard;
	//i made the condiments into int so 0=none 1=easy 2=normal 3=extra let me know if this is good
	
	public Burgers() {
		super();
		this.numOfPatties = 0;
		this.slicesOfCheese = 0;
		this.typeOfMeat = null;
		this.typeOfCheese = null;
		this.bunType = null;
		this.tomato = 0;
		this.lettuce = 0;
		this.onion = 0;
		this.pickle = 0;
		this.mayo = 0;
		this.ketchup = 0;
		this.grilledOnion = 0;
		this.mustard = 0;
	}
	public Burgers(double price, String name, int numOfPatties, int slicesOfCheese, String typeOfMeat,
			String typeOfCheese, String bunType, int tomato, int lettuce, int onion, int pickle, int mayo, int ketchup,
			int grilledOnion, int mustard) {
		super(price, name);
		this.numOfPatties = numOfPatties;
		this.slicesOfCheese = slicesOfCheese;
		this.typeOfMeat = typeOfMeat;
		this.typeOfCheese = typeOfCheese;
		this.bunType = bunType;
		this.tomato = tomato;
		this.lettuce = lettuce;
		this.onion = onion;
		this.pickle = pickle;
		this.mayo = mayo;
		this.ketchup = ketchup;
		this.grilledOnion = grilledOnion;
		this.mustard = mustard;
	}
	public int getNumOfPatties() {
		return numOfPatties;
	}
	public void setNumOfPatties(int numOfPatties) {
		this.numOfPatties = numOfPatties;
	}
	public int getSlicesOfCheese() {
		return slicesOfCheese;
	}
	public void setSlicesOfCheese(int slicesOfCheese) {
		this.slicesOfCheese = slicesOfCheese;
	}
	public String getTypeOfMeat() {
		return typeOfMeat;
	}
	public void setTypeOfMeat(String typeOfMeat) {
		this.typeOfMeat = typeOfMeat;
	}
	public String getTypeOfCheese() {
		return typeOfCheese;
	}
	public void setTypeOfCheese(String typeOfCheese) {
		this.typeOfCheese = typeOfCheese;
	}
	public String getBunType() {
		return bunType;
	}
	public void setBunType(String bunType) {
		this.bunType = bunType;
	}
	public int getTomato() {
		return tomato;
	}
	public void setTomato(int tomato) {
		this.tomato = tomato;
	}
	public int getLettuce() {
		return lettuce;
	}
	public void setLettuce(int lettuce) {
		this.lettuce = lettuce;
	}
	public int getOnion() {
		return onion;
	}
	public void setOnion(int onion) {
		this.onion = onion;
	}
	public int getPickle() {
		return pickle;
	}
	public void setPickle(int pickle) {
		this.pickle = pickle;
	}
	public int getMayo() {
		return mayo;
	}
	public void setMayo(int mayo) {
		this.mayo = mayo;
	}
	public int getKetchup() {
		return ketchup;
	}
	public void setKetchup(int ketchup) {
		this.ketchup = ketchup;
	}
	public int getGrilledOnion() {
		return grilledOnion;
	}
	public void setGrilledOnion(int grilledOnion) {
		this.grilledOnion = grilledOnion;
	}
	public int getMustard() {
		return mustard;
	}
	public void setMustard(int mustard) {
		this.mustard = mustard;
	}
	@Override
	public String toString() {
		return "Burgers numOfPatties=" + numOfPatties + "/n slicesOfCheese=" + slicesOfCheese + "/n typeOfMeat="
				+ typeOfMeat + "/n typeOfCheese=" + typeOfCheese + "/n bunType=" + bunType + "/n tomato=" + tomato
				+ "/n lettuce=" + lettuce + "/n onion=" + onion + "/n pickle=" + pickle + "/n mayo=" + mayo
				+ "/n ketchup=" + ketchup + "/n grilledOnion=" + grilledOnion + "/n mustard=" + mustard
				+ "/n getPrice()=" + getPrice() + "/n getName()=" + getName() + "/n toString()=" + super.toString();
	}
	
	
}

