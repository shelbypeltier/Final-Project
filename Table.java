
public class Table {
	private int tableNum;
	private Customer custormer;
	private double totalbill;
	
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	public Customer getCustormer() {
		return custormer;
	}
	public void setCustormer(Customer custormer) {
		this.custormer = custormer;
	}
	public double getTotalbill() {
		return totalbill;
	}
	public void setTotalbill(double totalbill) {
		this.totalbill = totalbill;
	}
	
	public Table(int tableNum, Customer custormer, double totalbill) {
		super();
		this.tableNum = tableNum;
		this.custormer = custormer;
		this.totalbill = totalbill;
	}
	@Override
	public String toString() {
		return "Table tableNum=" + tableNum + "/n totalbill=" + totalbill;
	}
	
	
}
