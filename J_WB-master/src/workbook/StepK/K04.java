package workbook.StepK;

import java.util.Scanner;

public class K04 {
	private int count;
	
	public K04() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ���� ��ǥ�� �Է��ϰڽ��ϱ�? ");
		this.count = s.nextInt();
		
		Point p = new Point(count);
		p.input();
		p.printArea();
	}

}
