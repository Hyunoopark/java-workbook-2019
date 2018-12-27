package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private int kor, eng, mat;
	
	public F03() {
		input();
	}
	
	public void printScore() {
		System.out.printf("국어의 총점은 %d 이고, 평균은 %.1f 입니다. \n",sum[0],average[0]);
		System.out.printf("영어의 총점은 %d 이고, 평균은 %.1f 입니다. \n",sum[1],average[1]);
		System.out.printf("수학의 총점은 %d 이고, 평균은 %.1f 입니다. \n",sum[2],average[2]);
		
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
				sum[j] += jumsu[i][j];
		}
	}
	
	void getAvg() {
		for(int i = 0; i < 3; i++)
			average[i] = (double)sum[i] / 5.0;
	}

}
