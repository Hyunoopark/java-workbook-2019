package workbook.StepA;

import java.util.Scanner;

public class CelToFah {
	private double c_degree = 0;
	private double f_degree = 0;
	
	public CelToFah(){input();}
	public void printCel() {
		System.out.printf("화씨온도는 %f 도 입니다.\n", getFah());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("섭씨온도를 입력하시오 : ");
		this.c_degree = s.nextDouble();
	}	
	
	double getFah() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}
}
