package workbook.StepD;

import java.util.Scanner;

public class D07 {
	private int a, b;
	private int x_begin, x_end;
	private int x, y;
	
	public D07() {
		input();
	}
	
	public void print1() {
		for(x = x_begin; x <= x_end; x++) {
			y = a * x + b;
			System.out.printf("��ǥ (%d, %d) \n",x,y);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1�� �Լ� y=ax+b�� ��� a�� b�� �Է��Ͻÿ�");
		this.a = s.nextInt();
		this.b = s.nextInt();
		System.out.print("x��ǥ�� ���� ���� �� ���� �Է��Ͻÿ�");
		this.x_begin = s.nextInt();
		this.x_end = s.nextInt();
	}

}
