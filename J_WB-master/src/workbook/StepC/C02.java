package workbook.StepC;

import java.util.Scanner;

public class C02 {
	private double input_degree;
	
	public C02() {
		input();
	}
	
	public void printWater() {
		double t = input_degree;
		
		if(t<0)
			System.out.println("잘못입력하셨습니다.");
		else if(t>=0 && t<25)
			System.out.println("냉수입니다.");
		else if(t>=25 && t<40)
			System.out.println("미온수입니다.");
		else if(t>=40 && t<80)
			System.out.println("온수입니다.");
		else if(t>=80)
			System.out.println("끓는물입니다.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("물의 온도를 입력하세요 : ");
		this.input_degree = s.nextDouble();
	}

}
