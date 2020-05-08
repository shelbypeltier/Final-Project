
	public class Dessert extends Food{
	private double priceOfDessert=5.00;

		public Dessert() {
			super();
		}


		public Dessert(double price, String name) {
			super(price, name);
		}

		@Override
		public String toString() {
			return "Dessert Price =" + getPrice() + "/n Name=" + getName();
		}

		public double getPriceofdessert() {
			return priceOfDessert;
		}

		public void setPriceofdessert(double priceofdessert) {
			this.priceOfDessert = priceofdessert;
		}
		
		public void defaultDessert () {
			priceOfDessert = 5.00; 
		}
		
	}
