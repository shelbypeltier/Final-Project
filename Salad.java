
public class Salad extends Food{
	private String tomato,carrot,cucumber,onion,dressing;
	
	public Salad(double price, String name, String tomato, String carrot, String cucumber, String onion,
			String dressing) {
		super(price, name);
		this.tomato = tomato;
		this.carrot = carrot;
		this.cucumber = cucumber;
		this.onion = onion;
		this.dressing = dressing;
	}
	public Salad() {
		super();
		this.tomato = null;
		this.carrot = null;
		this.cucumber = null;
		this.onion = null;
		this.dressing = null;
	}
	public String getTomato() {
		return tomato;
	}
	public void setTomato(String tomato) {
		this.tomato = tomato;
	}
	public String getCarrot() {
		return carrot;
	}
	public void setCarrot(String carrot) {
		this.carrot = carrot;
	}
	public String getCucumber() {
		return cucumber;
	}
	public void setCucumber(String cucumber) {
		this.cucumber = cucumber;
	}
	public String getOnion() {
		return onion;
	}
	public void setOnion(String onion) {
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
	
}
