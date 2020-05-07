
public class Burgers extends Food{
	private int numOfPatties;
	private String typeOfCheese,bunType;
	private String tomato,lettuce,onion,pickle,mayo,ketchup,grilledOnion,mustard;
	//i made the condiments into String so 0=none 1=easy 2=normal 3=extra let me know if this is good
	
	public Burgers() {
		super();
		this.numOfPatties = 1;
		this.typeOfCheese = null;
		this.bunType = null;
		this.tomato = null;
		this.lettuce = null;
		this.onion = null;
		this.pickle = null;
		this.mayo = null;
		this.ketchup = null;
		this.grilledOnion = null;
		this.mustard = null;
	}
	public Burgers(double price, String name, int numOfPatties,String typeOfCheese, String bunType,
			String tomato, String lettuce, String onion, String pickle, String mayo, String ketchup,
			String grilledOnion, String mustard) {
		super(price, name);
		this.numOfPatties = numOfPatties;
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
	public String getTomato() {
		return tomato;
	}
	public void setTomato(String tomato) {
		this.tomato = tomato;
	}
	public String getLettuce() {
		return lettuce;
	}
	public void setLettuce(String lettuce) {
		this.lettuce = lettuce;
	}
	public String getOnion() {
		return onion;
	}
	public void setOnion(String onion) {
		this.onion = onion;
	}
	public String getPickle() {
		return pickle;
	}
	public void setPickle(String pickle) {
		this.pickle = pickle;
	}
	public String getMayo() {
		return mayo;
	}
	public void setMayo(String mayo) {
		this.mayo = mayo;
	}
	public String getKetchup() {
		return ketchup;
	}
	public void setKetchup(String ketchup) {
		this.ketchup = ketchup;
	}
	public String getGrilledOnion() {
		return grilledOnion;
	}
	public void setGrilledOnion(String grilledOnion) {
		this.grilledOnion = grilledOnion;
	}
	public String getMustard() {
		return mustard;
	}
	public void setMustard(String mustard) {
		this.mustard = mustard;
	}
	@Override
	public String toString() {
		return "";
	}
	
	
}
