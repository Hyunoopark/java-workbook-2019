package workbook.StepK;

import java.util.Scanner;

public class K06 {
	private int count;
	
	public K06() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����� �л��� �����? ");
		this.count = s.nextInt();
		
		UserInfo ui = new UserInfo(count);
		
		ui.input();
		ui.print();
	}

}
