package workbook.StepB;

import java.util.Scanner;

public class B02 {
	private double input_degree = 0;
	private String kind;
	private double output_degree = 0;
	
	public B02() {
		input();
	}
	
	public void printT() {
		getTemp();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("온도를 입력하세요 : ");
		this.input_degree = s.nextDouble();
		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요");
		this.kind = s.next();
	}
	
	void getTemp() {
		if(kind.equals("C")) {
			output_degree = input_degree * 1.8 + 32;
			System.out.printf("해당 섭씨 온도는 화씨 온도로 %.1f도입니다", output_degree);
		}
		else if(kind.equals("F")) {
			output_degree = (input_degree - 32) / 1.8;
			System.out.printf("해당 화씨 온도는 섭씨 온도로 %.1f도입니다", output_degree);
		}
		else
			System.out.printf("잘못입력하셨습니다. C 혹은 F 로 입력해주세요");
	}
}
