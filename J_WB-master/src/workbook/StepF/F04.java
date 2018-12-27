package workbook.StepF;

import java.util.Scanner;

public class F04 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	private int kor, eng, mat;
	
	public F04() {
		input();
	}
	
	public void printScore() {
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생의 총점은 %d 이고, 평균은 %.1f 입니다. \n",i+1,sum[i],average[i]);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d번 학생 국어, 영어, 수학 점수를 입력하시오",i+1);
			this.kor = s.nextInt();
			this.eng = s.nextInt();
			this.mat = s.nextInt();
		
			jumsu[i][0] = kor;
			jumsu[i][1] = eng;
			jumsu[i][2] = mat;
			
		}
		
		getSum();
		getAvg();
	}
	
	void getSum() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++)
				sum[i] += jumsu[i][j];
		}
	}
	
	void getAvg() {
		for(int i = 0; i < 5; i++)
			average[i] = (double)sum[i] / 3.0;
	}

}
