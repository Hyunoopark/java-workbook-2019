package workbook.StepA;

import java.util.Scanner;

public class DayToSec {
	private int days = 0;
	private int seconds = 0;
	
	public DayToSec(){input();}
	public void printSec() {
		System.out.printf("�� ���� �ش�Ǵ� �ð��� ��� %d ���Դϴ�", getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�� ���� �Է��ϼ��� : ");
		this.days = s.nextInt();
	}
	
	int getSec() {
		seconds = days * 24 * 60 * 60;
		return this.seconds;
	}
	
}
