package workbook.StepB;

import java.util.Scanner;

public class B06 {
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int total = 0;
	private double average = 0;
	
	public B06() {
		input();
		}
	public void printScore() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�, ����� %.1f �Դϴ� \n",getSum(),getAvg());
		greatS();
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
		average = total / 3;
		return this.average;
	}
	
	void greatS() {
		if(kor >= 90)
			System.out.println("���� ������ ����մϴ�");
		if(eng >= 90)
			System.out.println("���� ������ ����մϴ�");
		if(math >= 90)	
			System.out.println("���� ������ ����մϴ�");
	}
}
