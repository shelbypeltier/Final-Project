
public class Salad extends Food{

	private boolean tomato,carrot,cucumber,onion,cheese,crouton;
	private String dressing;
	
	
	public Salad(double price, String name, boolean tomato, boolean carrot, boolean cucumber, boolean onion,
			boolean cheese, boolean crouton, String dressing) {

		super(price, name);
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
    
		this.onion = onion;
	}
	public String getDressing() {
		return dressing;
	}
	public void setDressing(String dressing) {
		this.dressing = dressing;
	}
	@Override
	public String toString() {
		return "Salad tomato=" + tomato + "/n carrot=" + carrot + "/n cucumber=" + cucumber + "/n onion=" + onion
				+ "/n dressing=" + dressing + "/n getPrice()=" + getPrice() + "/n getName()=" + getName();
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
		return Carrot; 
	}
	public void setCarrot(boolean carrot) {
		this.Carrot = carrot; 
		
	}
	public boolean getTomato() {
		return Tomato;
	}
	public void setTomato(boolean tomato) {
		this.Tomato = tomato; 
		
	}
	
}
