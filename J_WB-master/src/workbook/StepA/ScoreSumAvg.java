package workbook.StepA;

import java.util.Scanner;

public class ScoreSumAvg {
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	private int total = 0;
	private double average = 0;
	
	public ScoreSumAvg() {input();}
	public void printScore() {
		System.out.printf("�Է��Ͻ� ������ ������ %d �̰�, ����� %f �Դϴ�",getSum(),getAvg());
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

}
