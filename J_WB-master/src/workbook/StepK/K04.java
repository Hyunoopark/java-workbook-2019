package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int count;
	
	public K04() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("몇 개의 좌표를 입력하겠습니까? ");
		this.count = s.nextInt();
		
		Point p = new Point(count);
		p.input();
		p.printArea();
	}

}
