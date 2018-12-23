package workbook.StepC;

import java.util.Scanner;

public class C06 {
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int total = 0;
	private double average = 0.0;
	
	public C06() {
		input();
	}
	
	public void printScore() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�, ����� %.1f �Դϴ� \n",getSum(),getAvg());
		
		if(getAvg() >= 90)
			System.out.println("�� �Դϴ�");
		else if(90 > getAvg() && getAvg() >= 80)
			System.out.println("�� �Դϴ�");
		else if(80 > getAvg() && getAvg() >= 70)
			System.out.println("�� �Դϴ�");
		else if(70 > getAvg() && getAvg() >= 60)
			System.out.println("�� �Դϴ�");
		else if(60 > getAvg())
			System.out.println("�� �Դϴ�");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� ������ �Է��ϼ��� : ");
		this.kor = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ��� : ");
		this.eng = s.nextInt();
		System.out.printf("���� ������ �Է��ϼ��� : ");
		this.math = s.nextInt();
	}
	
	int getSum() {
		total = kor + eng + math;
		return this.total;
	}
	
	double getAvg() {
		average = (double)total / 3;
		return this.average;
	}

}
