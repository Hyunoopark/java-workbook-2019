package workbook.StepD;

import java.util.Scanner;

public class D03 {
	private int number;
	private int count = 0;
	private int totalsum;
	private double average;
	
	public D03() {
		input();
	}
	
	public void printNum() {
		System.out.printf("�Է��� %d���� ���ڵ��� �� �հ�� %d�̰�, ��հ���  %.1f �Դϴ�",count,getSum(),getAvg());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("0���� 100 ������ ���ڸ� �Է��ϼ���");
			this.number = s.nextInt();
			
			if(number<0 || number>100)
				break;
			
			count ++;
			
			numSum();
			numAvg();
		} 
	}
	
	void numSum() {
		totalsum +=number;
	}
	
	void numAvg() {
		average = (double)totalsum / count;
	}
	
	int getSum() {
		return this.totalsum;
	}
	
	double getAvg() {
		return this.average;
	}
	
	

}
