
public class Salad extends Food{

	private boolean tomato,carrot,cucumber,onion,cheese,crouton;
	private String dressing;
	
	
	public Salad( boolean tomato, boolean carrot, boolean cucumber, boolean onion,
			boolean cheese, boolean crouton, String dressing) {
		super();
		this.tomato = tomato;
		this.carrot = carrot;
		this.cucumber = cucumber;
		this.onion = onion;
		this.cheese = cheese;
		this.crouton = crouton;
		this.dressing = dressing;
	}
	public Salad() {
		super();
		this.tomato = false;
		this.carrot = false;
		this.cucumber = false;
		this.onion = false;
		this.cheese = false;
		this.crouton = false;
		this.dressing = "";
	}
	public String getDressing() {
		return dressing;
	}
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	
	public boolean getCheese() {
		return cheese;
	}
	public void setCheese(boolean cheese) {
		this.cheese = cheese;
	}
	public boolean getCrouton() {
		return crouton;
	}
	public void setCrouton(boolean crouton) {
		this.crouton = crouton;
	}
	public boolean getCarrot() {
		return carrot; 
	}
	public void setCarrot(boolean carrot) {
		this.carrot = carrot; 
		
	}
	public boolean getTomato() {
		return tomato;
	}
	public void setTomato(boolean tomato) {
		this.tomato = tomato; 
		
	}
	public boolean getCucumber() {
		return cucumber;
	}
	public boolean getOnion() {
		return onion;
	}
	public void setOnion(boolean b) {
		onion = b;
	}
	public void setCucumber(boolean b) {
		cucumber = b;
	}
	@Override
	public String toString() {
		String tab = "Salad \n";
		if(tomato) 
			tab += "\tTomato \n";
		if(cucumber) 
			tab += "\tCucumber \n";
		if(carrot) 
			tab += "\tCarrot \n";
		if(onion) 
			tab += "\tOnion \n";
		if(crouton) 
			tab += "\tCrouton \n";
		if(cheese) 
			tab += "\tCheese \n";
		if(dressing.isEmpty()) {
			tab += "\tNo Dressing \n";
		}
		else {
			tab += "\t" + dressing + "\n";
		}
		return tab;
	}
	public void defaultSalad() {
		this.tomato = false;
		this.carrot = false;
		this.cucumber = false;
		this.onion = false;
		this.cheese = false;
		this.crouton = false;
		this.dressing = "";
	}
}
