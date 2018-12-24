package workbook.StepD;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	
	public D06() {
		input();
	}
	
	public void printApt() {
		System.out.printf("\"소형 아파트\"의 개수는 %d 입니다 \n",count1);
		System.out.printf("\"중소형 아파트\"의 개수는 %d 입니다 \n",count2);
		System.out.printf("\"중형 아파트\"의 개수는 %d 입니다 \n",count3);
		System.out.printf("\"대형 아파트\"의 개수는 %d 입니다 \n",count4);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("아파트의 분양 면적(제곱미터)을 입력하시오.");
			this.m2_area = s.nextDouble();
			printPyung();
			countApt();
		}
			
	}
	
	void printPyung() {
		System.out.printf("--> 이 아파트의 평형은 %.1f 입니다 \n", getPyung());
	}
	
	double getPyung() {
		pyung_area = m2_area / 3.305;
		
		return this.pyung_area;
	}
	
	void countApt() {
		if(pyung_area<15)
			count1++;
		else if(pyung_area<30)
			count2++;
		else if(pyung_area<50)
			count3++;
		else if(pyung_area>=50)
			count4++;
	}
}
