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
					System.out.println("입력하신 년도는 윤년입니다");
				else
					System.out.println("입력하신 년도는 윤년이 아닙니다");
			}
			else
				System.out.println("입력하신 년도는 윤년입니다");
		}
		else
			System.out.println("입력하신 년도는 윤년이 아닙니다");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("년도를 입력하세요");
		this.year = s.nextInt();
	}

}
