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
		System.out.printf("입력하신 점수의 총점은 %d 이고, 평균은 %.1f 입니다 \n",getSum(),getAvg());
		
		if(getAvg() >= 90)
			System.out.println("수 입니다");
		else if(90 > getAvg() && getAvg() >= 80)
			System.out.println("우 입니다");
		else if(80 > getAvg() && getAvg() >= 70)
			System.out.println("미 입니다");
		else if(70 > getAvg() && getAvg() >= 60)
			System.out.println("양 입니다");
		else if(60 > getAvg())
			System.out.println("가 입니다");
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
		average = (double)total / 3;
		return this.average;
	}

}
