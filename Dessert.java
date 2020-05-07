	public class Dessert extends Food{
	private double priceofdessert=5.00;

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
			return priceofdessert;
		}

		public void setPriceofdessert(double priceofdessert) {
			this.priceofdessert = priceofdessert;
		}
		
		
	}
