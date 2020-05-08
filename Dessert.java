
	public class Dessert extends Food{
	private double priceofdessert=5.00;

		public Dessert() {
			super();
		}


		public Dessert(String name) {
			super(name);
		}

		@Override
		public String toString() {
			return  getName() + "\n";
		}

		public double getPriceofdessert() {
			return priceofdessert;
		}

		public void setPriceofdessert(double priceofdessert) {
			this.priceofdessert = priceofdessert;
		}


		public void defaultDessert() {
			price = 0; 
			name = ""; 
			
		}
		
		
	}
