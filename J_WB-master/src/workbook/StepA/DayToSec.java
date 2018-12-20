package workbook.StepA;

import java.util.Scanner;

public class DayToSec {
	private int days = 0;
	private int seconds = 0;
	
	public DayToSec(){input();}
	public void printSec() {
		System.out.printf("날 수에 해당되는 시간은 모두 %d 초입니다", getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하세요 : ");
		this.days = s.nextInt();
	}
	
	int getSec() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
	
}
