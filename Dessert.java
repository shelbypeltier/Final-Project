
	public class Dessert extends Food{

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

		public double getPrice() {
			switch (name) {
			case "chocolateShake" :
			case "StrawberryShake":
			case "VanillaShake": price = 2.50;
			break;
			case "ChocolateSundae":
			case "StrawberrySundae":
			case "VanillaSundae": price = 2;
			break;
			}
			return price;
		}

		public void defaultDessert() {
			price = 0; 
			name = ""; 
			
		}
		
		
	}
