package workbook.StepL;

public class Menupan {
	String name;
	String origin;
	int price;
	
	public Menupan(String s, String o, int p) {
		this.name = s;
		this.origin = o;
		this.price = p;
	}
	
	public void print() {
		System.out.println(this.name + "\t" + this.origin + "\t" + this.price);
	}
}
