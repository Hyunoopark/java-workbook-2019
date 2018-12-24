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
		System.out.printf("입력한 %d개의 숫자들의 총 합계는 %d이고, 평균값은  %.1f 입니다",count,getSum(),getAvg());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("0부터 100 사이의 숫자를 입력하세요");
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
