package workbook.StepJ;

import java.util.Scanner;

public class J04 {
	private int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	private int month, day;
	private int month_to_day[] = new int[2];
	private String name[] = {"ù��°","�ι�°"};
	
	public J04() {
		input();
	}
	
	public void printDay() {
		System.out.printf("�� ��¥�� ������ %d���Դϴ�.\n", Math.abs(month_to_day[1] - month_to_day[0]));
	}
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++) {
			System.out.printf("%s ��¥�� �Է��Ͻÿ�. (�� ��) : ",name[i]);
			this.month = s.nextInt();
			this.day = s.nextInt();
		
			if(month < 1 || month > 12) {
				System.out.print("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� \n");
				i--;
			}
			else if(day < 1 || day > monthdays[month-1]) {
				System.out.print("�߸��Է��ϼ̽��ϴ�. �ٽ��Է����ּ��� \n");
				i--;
			}
			else
				month_to_day[i] = CalcDate(month,day);
		}	
	}
	
	int CalcDate(int m, int d) {
		int day_count = 0;
		
		for(int i = 0; i < m-1; i++)
			day_count += monthdays[i];
		
		day_count += d;
		
		return day_count;
	}

}
