package workbook.StepA;

import java.util.Scanner;

public class AreaToP {
	private double m2_area = 0;
	private double pyung_area = 0;
	
	public AreaToP(){input();}
	public void printPyung() {
		System.out.printf("아파트의 평형은 %f 입니다.", getPyung());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("아파트의 분양 면적을 입력하시오 : ");
		this.m2_area = s.nextDouble();
	}	
	
	double getPyung() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}
	
}
