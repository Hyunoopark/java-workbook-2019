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
		System.out.println("�µ��� �Է��ϼ��� : ");
		this.input_degree = s.nextDouble();
		System.out.println("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���");
		this.kind = s.next();
	}
	
	void getTemp() {
		if(kind.equals("C")) {
			output_degree = input_degree * 1.8 + 32;
			System.out.printf("�ش� ���� �µ��� ȭ�� �µ��� %.1f���Դϴ�", output_degree);
		}
		else if(kind.equals("F")) {
			output_degree = (input_degree - 32) / 1.8;
			System.out.printf("�ش� ȭ�� �µ��� ���� �µ��� %.1f���Դϴ�", output_degree);
		}
		else
			System.out.printf("�߸��Է��ϼ̽��ϴ�. C Ȥ�� F �� �Է����ּ���");
	}
}
