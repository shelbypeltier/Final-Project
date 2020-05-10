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
	public Burgers(String numOfPatties,String typeOfCheese, String bunType,
			String tomato, String lettuce, String onion, String pickle, String mayo, String ketchup,
			String grilledOnion, String mustard) {
		super();
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
		switch (numOfPatties) {
		case "quarterPound" : price = 9.99;
		break;
		case "halfPound" : price = 11.99;
		break;
		}
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
		if (tomato.equalsIgnoreCase ("ExtraTomato"))
		{
			price += .20;
		}
		if (lettuce.equalsIgnoreCase ("ExtraLettuce"))
		{
			price += .20;
		}
		if (onion.equalsIgnoreCase ("ExtraOnion"))
		{
			price += .20;
		}
		if (pickle.equalsIgnoreCase ("ExtraPickles"))
		{
			price += .20;
		}
		if (mayo.equalsIgnoreCase ("ExtraMayo"))
		{
			price += .20;
		}
		if (ketchup.equalsIgnoreCase ("ExtraKetchup"))
		{
			price += .20;
		}
		if (grilledOnion.equalsIgnoreCase ("ExtraGrilledOnion"))
		{
			price += .20;
		}
		if (mustard.equalsIgnoreCase ("ExtraMustard"))
		{
			price += .20;
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
		if(!(tomato.isEmpty())) {
			tab += "\t" + tomato + "\n";
		}
		if(!(onion.isEmpty())) {
			tab += "\t" + onion + "\n";
		}
		if(!(grilledOnion.isEmpty())) {
			tab += "\t" + grilledOnion + "\n";
		}
		if(!(lettuce.isEmpty())) {
			tab += "\t" + lettuce + "\n";
		}
		if(!(mayo.isEmpty())) {
			tab += "\t" + mayo + "\n";
		}
		if(!(pickle.isEmpty())) {
			tab += "\t" + pickle + "\n";
		}
		if(!(ketchup.isEmpty())) {
			tab += "\t" + ketchup + "\n";
		}
		if(!(mustard.isEmpty())) {
			tab += "\t" + mustard + "\n";
		}
		if(tomato.isEmpty() & onion.isEmpty() & lettuce.isEmpty() & mayo.isEmpty() & pickle.isEmpty() & ketchup.isEmpty() & mustard.isEmpty())
			tab += "\tPlain \n";
		return tab;
	}
		public void defaultBurger () {
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
			this.price = 0.00;
		}
		
	}
	
	


