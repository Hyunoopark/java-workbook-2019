package workbook.StepL;

public class Parking {
	private int car_num;
	private String car;
	String time;
	
	public Parking(int num, String c, String t) {
		car_num = num;
		car = c;
		time = t;
	}
	
	public void print() {
		System.out.println(car_num + " " + car + " " + time);
	}

}
