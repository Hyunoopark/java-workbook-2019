package workbook.StepM;

public class Menu {
	private String name;
	private String origin;
	private int price;
	
	public Menu(String s, String o, int p) {
		this.name = s;
		this.origin = o;
		this.price = p;
	}
	
	public void print() {
		System.out.println(this.name + "\t" + this.origin + "\t" + this.price);
	}
	
	public String getName() {
		return name;
	}
	
	public String getOrigin() {
		return origin;
	}
	
	public int getPrice() {
		return price;
	}
}
