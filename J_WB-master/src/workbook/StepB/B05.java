package workbook.StepB;

import java.util.Scanner;

public class B05 {
	private int days;
	private int seconds;
	private int m_count;
	
	public B05() {
		input();
	}
	
	public void printSec() {
		System.out.printf("날 수에 해당되는 기간은 모두 %d초 입니다. \n",getSec());
		countM();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("날 수를 입력하시오 : ");
		this.days = s.nextInt();
	}
	
	int getSec() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
	
	void countM() {
		m_count = seconds/1000000;
		
		if (m_count == 0)
			return;
		else
			System.out.printf("100만초가 모두 %d번 포함됩니다.",m_count);
	}
	
	

}
