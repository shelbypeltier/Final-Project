


	public class Salad extends Food{
		private int tomato,carrot,cucumber,onion;
		private Sauce dressing;
		private double priceSalad = 7.99;
		
		public int getTomato() {
			return tomato;
		}
		public void setTomato(int tomato) {
			this.tomato = tomato;
		}
		public int getCarrot() {
			return carrot;
		}
		public void setCarrot(int carrot) {
			this.carrot = carrot;
		}
		public int getCucumber() {
			return cucumber;
		}
		public void setCucumber(int cucumber) {
			this.cucumber = cucumber;
		}
		public int getOnion() {
			return onion;
		}
		public void setOnion(int onion) {
			this.onion = onion;
		}
		public Sauce getDressing() {
			return dressing;
		}
		public void setDressing(Sauce dressing) {
			this.dressing = dressing;
		}
		@Override
		public String toString() {
			return "Salad tomato=" + tomato + "/n carrot=" + carrot + "/n cucumber=" + cucumber + "/n onion=" + onion
					+ "/n dressing=" + dressing + "/n getPrice()=" + getPrice() + "/n getName()=" + getName();
		}
