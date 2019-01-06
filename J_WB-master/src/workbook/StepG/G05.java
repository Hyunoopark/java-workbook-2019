package workbook.StepG;

import java.util.Scanner;

public class G05 {
	private int hour, minute;
	private double charge;
	private double total_charge;

	public G05() {
		input();
	}
	
	public void printCharge() {
		System.out.printf("���ݱ����� �̿�� �ѱݾ��� %.0f���Դϴ�",total_charge);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("����� �ð��� �ð��� ������ �Է��ϼ��� : ");
			this.hour = s.nextInt();
			this.minute = s.nextInt();
			
			if(hour == 0 && minute == 0)
				break;
			
			System.out.printf("������ �̿��� %.0f���Դϴ� \n",calCharge());
			
			total_charge += charge;
		}
	}
	
	double calCharge() {
		charge = hour * 2 * 1000;
		
		if(minute > 0)
			charge += 1000;
		if(minute > 30)
			charge += 1000;
		
		if(2 <= hour && hour < 3)
			charge = charge * 0.95;
		else if(3 <= hour && hour < 5)
			charge = charge * 0.9;
		else if(5 <= hour)
			charge = charge * 0.8;
		
		return this.charge;		
	}
}
