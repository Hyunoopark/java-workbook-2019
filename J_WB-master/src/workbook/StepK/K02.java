package workbook.StepK;

import java.util.Scanner;

public class K02 {
	private int count;
	
	public K02() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("등록하실 메뉴의 개수를 입력하세요 : ");
		this.count = s.nextInt();
		
		menu();
	}
	
	void menu() {
		MenuPan menu = new MenuPan(count);
		menu.input();
		menu.print();
	}

}
