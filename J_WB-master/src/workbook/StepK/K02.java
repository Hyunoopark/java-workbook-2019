package workbook.StepK;

import java.util.Scanner;

public class K02 {
	private int count;
	
	public K02() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ͻ� �޴��� ������ �Է��ϼ��� : ");
		this.count = s.nextInt();
		
		menu();
	}
	
	void menu() {
		MenuPan menu = new MenuPan(count);
		menu.input();
		menu.print();
	}

}
