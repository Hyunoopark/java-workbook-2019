package workbook.StepA;

import java.util.Scanner;

public class CelToFah {
	private double c_degree = 0;
	private double f_degree = 0;
	
	public CelToFah(){input();}
	public void printCel() {
		System.out.printf("ȭ���µ��� %f �� �Դϴ�.\n", getFah());
	}	
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�����µ��� �Է��Ͻÿ� : ");
		this.c_degree = s.nextDouble();
	}	
	
	double getFah() {
		f_degree = c_degree * 1.8 + 32;
		return this.f_degree;
	}
}
