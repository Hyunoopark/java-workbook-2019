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
			System.out.print("�߸� �Է��ϼ̽��ϴ�");
		else
			System.out.printf("�� ��¥�� 1���� %d��° ���� �ش�˴ϴ�.",getDay());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �Է��Ͻÿ� : ");
		this.month = s.nextInt();	
		System.out.print("���� �Է��Ͻÿ� : ");
		this.day = s.nextInt();	
	}
	
	int getDay() {
		for(int i = 0; i < month-1; i++) 
			day_count += monthdays[i];
		
		day_count += day;
		
		return this.day_count;
	}
}
