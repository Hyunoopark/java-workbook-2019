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
			System.out.printf("��ǥ (%d, %d) \n",x,y);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1�� �Լ� y=ax^2+bx+c�� ��� a�� b, c�� �Է��Ͻÿ�");
		this.a = s.nextInt();
		this.b = s.nextInt();
		this.c = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}
}
