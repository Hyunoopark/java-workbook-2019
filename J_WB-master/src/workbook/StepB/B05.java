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
		System.out.printf("�� ���� �ش�Ǵ� �Ⱓ�� ��� %d�� �Դϴ�. \n",getSec());
		countM();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� �Է��Ͻÿ� : ");
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
			System.out.printf("100���ʰ� ��� %d�� ���Ե˴ϴ�.",m_count);
	}
	
	

}
