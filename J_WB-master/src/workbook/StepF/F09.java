package workbook.StepF;

import java.util.Scanner;

public class F09 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month, day;
	private int day_count;
	
	public F09() {
		input();
	}
	
	public void printDay() {
		if(month > 12 || month < 1 || day > monthdays[month-1])
			System.out.print("잘못 입력하셨습니다");
		else
			System.out.printf("이 날짜는 1년중 %d번째 날에 해당됩니다.",getDay());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("월을 입력하시오 : ");
		this.month = s.nextInt();	
		System.out.print("일을 입력하시오 : ");
		this.day = s.nextInt();	
	}
	
	int getDay() {
		for(int i = 0; i < month-1; i++) 
			day_count += monthdays[i];
		
		day_count += day;
		
		return this.day_count;
	}
}
