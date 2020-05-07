
	public class Drinks extends Food{
		private String nameOfDrink, size;
		private double priceSmall = 1.99;
		private double priceMed = 2.99;
		private double priceLarge = 3.99;

		public String getNameOfDrink() {
			return nameOfDrink;
		}

		public void setNameOfDrink(String nameOfDrink) {
			this.nameOfDrink = nameOfDrink;
		}

		public String getSize() {
			return size;
		}

		public void setSize(String size) {
			this.size = size;
		}

		@Override
		public String toString() {
			return "Drinks nameOfDrink=" + nameOfDrink + "/n size=" + size + "/n getPrice()=" + getPrice() + "/n getName()="
					+ getName();
		}

		public double getPriceSmall() {
			return priceSmall;
		}

		public void setPriceSmall(double priceSmall) {
			this.priceSmall = priceSmall;
		}

		public double getPriceMed() {
			return priceMed;
		}

		public void setPriceMed(double priceMed) {
			this.priceMed = priceMed;
		}

		public double getPriceLarge() {
			return priceLarge;
		}

		public void setPriceLarge(double priceLarge) {
			this.priceLarge = priceLarge;
		}}


