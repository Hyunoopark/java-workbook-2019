package workbook.StepC;

import java.util.Scanner;

public class C11 {
	private int year;
	
	public C11() {
		input();
	}
	
	public void printYun() {
		if(year%4 == 0) {
			if(year%100 == 0) {
				if(year%400 == 0)
					System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�");
				else
					System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�");
			}
			else
				System.out.println("�Է��Ͻ� �⵵�� �����Դϴ�");
		}
		else
			System.out.println("�Է��Ͻ� �⵵�� ������ �ƴմϴ�");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�⵵�� �Է��ϼ���");
		this.year = s.nextInt();
	}

}
