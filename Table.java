import java.util.ArrayList;

public class Table {
	private int tableNum;

	private double totalbill = 0.0;

	private ArrayList<Food> food = new ArrayList<Food>();
	 
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public double getTotalbill() {
		return totalbill;
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
	public void removeFood(Food food) {
		this.food.remove(food);
	}

	public Table(int tableNum) {
		super();
		this.tableNum = tableNum;
<<<<<<< HEAD

=======
>>>>>>> branch 'master' of https://github.com/shelbypeltier/Final-Project
	}
	@Override
	public String toString() {
		return "Table tableNum=" + tableNum + "/n totalbill=" + totalbill;
	}
	
	
}
