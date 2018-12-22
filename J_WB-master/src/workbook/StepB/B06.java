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
		System.out.printf("입력하신 점수의 총점은 %d 이고, 평균은 %.1f 입니다 \n",getSum(),getAvg());
		greatS();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("국어 점수를 입력하세요 : ");
		this.kor = s.nextInt();
		System.out.printf("영어 점수를 입력하세요 : ");
		this.eng = s.nextInt();
		System.out.printf("수학 점수를 입력하세요 : ");
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
			System.out.println("국어 점수가 우수합니다");
		if(eng >= 90)
			System.out.println("영어 점수가 우수합니다");
		if(math >= 90)	
			System.out.println("수학 점수가 우수합니다");
	}
}
