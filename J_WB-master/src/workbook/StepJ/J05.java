package workbook.StepJ;

import java.util.Scanner;

public class J05 {
	private int start_h, start_m, end_h, end_m;
	private String yn;
	private int totalFee;
	private int count = 0;
	
	public J05(){
		input();
	}
	
	public void printFee() {
		System.out.printf("�������� %d���� �� ���� ����� %d���Դϴ�.\n", count, totalFee);
	}
	
	void input() {
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			count++;
			System.out.printf("%d�� ���� ���� ���� �ð� (�� ��) : ",count);
			this.start_h = s.nextInt();
			this.start_m = s.nextInt();
			System.out.printf("%d�� ���� ���� ���� �ð� (�� ��) : ",count);
			this.end_h = s.nextInt();
			this.end_m = s.nextInt();
			System.out.printf("���� ��� : %d�� \n", CalcParking(start_h,start_m,end_h,end_m));
			
			System.out.print("�� �Է��Ͻðڽ��ϱ�?(Y/N)");
			this.yn = s.next();
			
			if(yn.equalsIgnoreCase("n"))
				break;
			else if((yn.equalsIgnoreCase("y")));
		} 
	}

	int CalcParking(int start_h, int start_m, int end_h, int end_m) {
		int fee = 0;
		int m;
		
		if(end_m < start_m) {
			end_h--;
			end_m += 60;
		}
		
		m = (end_h-start_h) * 60 + (end_m-start_m);
		
		fee = 500 * (m/10);
		
		if(m % 10 > 0)
			fee += 500;
		
		totalFee += fee;
		
		return fee;
	}
}
