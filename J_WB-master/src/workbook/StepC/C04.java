package workbook.StepC;

import java.util.Scanner;

public class C04 {
	private double m2_area = 0;
	private double pyung_area = 0;
	
	public C04(){
		input();
	}
	
	public void printArea() {
		System.out.printf("아파트의 평형은 %.1f 입니다 \n ", getArea());
		
		if(getArea() < 15)
			System.out.println("소형 아파트입니다");
		else if(15 <= getArea() && getArea() < 30)
			System.out.println("중소형 아파트입니다");
		else if(30 <= getArea() && getArea() < 50)
			System.out.println("중형 아파트입니다");
		else
			System.out.println("대형 아파트입니다");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적(제곱미터)을 입력하시오.");
		this.m2_area = s.nextDouble();
	}
	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}

}
