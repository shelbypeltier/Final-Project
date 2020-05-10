import java.util.ArrayList;
import java.util.List;

public class Table {
	private int tableNum;private double totalbill = 0.0;

	private ArrayList<Food> food = new ArrayList<Food>();
	 
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	public ArrayList<Food> getFood() {
		return food;
	}
	public void addFood(Food food) {
		this.food.add(food);
	}
	public void removeFood(int foodNum) {
		food.remove(foodNum);
	}

	public Table(int tableNum) {
		super();
		this.tableNum = tableNum;
	}
	
	public double getTotalBill () {
		double subtotal = 0;
		for (int i = 0; i<food.size(); i++) {
			subtotal += food.get(i).getPrice();
		}
		return subtotal;
	}
	@Override
	public String toString() {
		String tab = "";
		for(int i = 0;i < food.size();i++) {
		tab += (i+1) + ". " +food.get(i).toString() + "\n";
		}
		return tab;
	}
	
	
}
