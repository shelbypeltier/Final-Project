public class Burgers extends Food{

	private String numOfPatties;
	private String typeOfCheese,bunType;
	private String tomato,lettuce,onion,pickle,mayo,ketchup,grilledOnion,mustard;
	private double price = 11.99;

	//i made the condiments into String so 0=none 1=easy 2=normal 3=extra let me know if this is good
	
	public Burgers() {
		super();
		this.numOfPatties = "";
		this.typeOfCheese = "";
		this.bunType = "";
		this.tomato = "";
		this.lettuce = "";
		this.onion = "";
		this.pickle = "";
		this.mayo = "";
		this.ketchup = "";
		this.grilledOnion = "";
		this.mustard = "";
		this.price = 9.99;


		
	}
	public Burgers(double price, String name, String numOfPatties,String typeOfCheese, String bunType,
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
	public String getNumOfPatties() {
		return numOfPatties;
	}
	public void setNumOfPatties(String numOfPatties) {
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
	public double getPrice() {
		if (tomato.equals ("Extra Tomato"))
		{
			price = price + .20;
		}
		return price;
	}
	
	@Override
	public String toString() {
		String tab = "";
		if(numOfPatties.equals("quarterPound")) {
			tab += "1/4 Burger \n";
		}
		else {
			tab += "1/2 Burger \n";
		}
		switch(typeOfCheese.toLowerCase()){
			case("amercan"):
				tab += "\tAmerican Cheese \n";
				break;
			case("cheddar"):
				tab += "\tCheddar Cheese \n";
			    break;
			case("swiss"):
				tab += "\tSwiss Cheese \n";
				break;
			case("colbyjack"):
				tab += "\tColbyJack Cheese \n";
				break;
		}
		switch(bunType.toLowerCase()){
		case("hambBun"):
			break;
		case("rye"):
			tab += "\trye sub \n";
		    break;
		case("sourdough"):
			tab += "\tsourdough sub \n";
			break;
	}
		if(!(tomato.isBlank())) {
			tab += "\t" + tomato + "\n";
		}
		if(!(onion.isBlank())) {
			tab += "\t" + onion + "\n";
		}
		if(!(lettuce.isBlank())) {
			tab += "\t" + lettuce + "\n";
		}
		if(!(mayo.isBlank())) {
			tab += "\t" + mayo + "\n";
		}
		if(!(pickle.isBlank())) {
			tab += "\t" + pickle + "\n";
		}
		if(!(ketchup.isBlank())) {
			tab += "\t" + ketchup + "\n";
		}
		if(!(mustard.isBlank())) {
			tab += "\t" + mustard + "\n";
		}
		if(tomato.isBlank() & onion.isBlank() & lettuce.isBlank() & mayo.isBlank() & pickle.isBlank() & ketchup.isBlank() & mustard.isBlank())
			tab += "\tPlain \n";
		return tab;
	}
	
	
}


