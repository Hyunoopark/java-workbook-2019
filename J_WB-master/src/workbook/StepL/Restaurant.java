package workbook.StepL;

public class Restaurant {
	private int num;
	private int steak;
	private int spage;
	private int pasta;
	private String member;
	private String enter_time;
	
	public Restaurant(int n, int s, int sp, int p, String m, String e_t) {
		m = m.toUpperCase();
		num = n;
		steak = s;
		spage = sp;
		pasta = p;
		member = m;
		enter_time = e_t;
	}
	
	public void print() {
		System.out.println("\t" + num + "\t" + steak + "\t" + spage + "\t" + pasta + "\t" + member + "\t" + enter_time);
	}

}
