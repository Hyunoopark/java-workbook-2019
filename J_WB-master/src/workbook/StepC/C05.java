package workbook.StepC;

import java.util.Scanner;

public class C05 {
	private int month, day;
	private int day_count = 0;
	
	public C05() {
		input();
	}
	
	public void printDay() {
		if(getDay()==0)
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		else if(getDay() > 365)
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		else
			System.out.printf("�� ��¥�� 1���� %d��° ���� �ش�˴ϴ�",getDay());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �Է��Ͻÿ�");
		this.month = s.nextInt();
		System.out.printf("���� �Է��Ͻÿ�");
		this.day = s.nextInt();
	}
	
	int getDay() {
		if(month == 1)
			day_count = day;
		else if(month == 2)
			day_count = 31 + day;
		else if(month == 3)
			day_count = 31 + 28 + day;
		else if(month == 4)
			day_count = 31 + 28 + 31 + day;
		else if(month == 5)
			day_count = 31 + 28 + 31 + 30 + day;
		else if(month == 6)
			day_count = 31 + 28 + 31 + 30 + 31 + day;
		else if(month == 7)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + day;
		else if(month == 8)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		else if(month == 9)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
		else if(month == 10)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		else if(month == 11)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		else if(month == 12)
			day_count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		
		return this.day_count;
	}

}
