package workbook.StepD;

import java.util.Scanner;

public class D08 {
	private int a, b, c;
	private int x_begin, x_end;
	private int x, y;
	
	public D08() {
		input();
	}
	
	public void print2() {
		for(x = x_begin; x <= x_end; x++) {
			y = a * x * x + b * x + c;
			System.out.printf("좌표 (%d, %d) \n",x,y);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1차 함수 y=ax^2+bx+c의 계수 a와 b, c를 입력하시오");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x좌표의 시작 값과 끝 값을 입력하시오");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
}
