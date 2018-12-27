package workbook.StepF;

import java.util.Scanner;

public class F02 {
	private double score[] = new double[10];
	private double maxscore, minscore;
	private double total, average;
	
	public F02() {
		input();
	}
	
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.1f 입니다",avgExcept2());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번 심사점수수를 입력하시오",i+1);
			this.score[i] = s.nextDouble();
		}
		
		getMax();
		getMin();
		sumExcept2();
	
	}
	
	void getMax() {
		maxscore = score[0];
		
		for(int i = 1; i < 10; i++) {
			 if(maxscore < score[i])
				 maxscore = score[i];
		}
	}
	
	void getMin() {
		minscore = score[0];
		
		for(int i = 1; i < 10; i++) {
			 if(minscore > score[i])
				 minscore = score[i];
		}
	}
	
	void sumExcept2() {
		total = 0;
		
		for(int i = 0; i < 10; i++) 
				total += score[i];
		
		total = total - maxscore - minscore;
		
	}
	
	double avgExcept2() {
		average = total / 8.0;
		
		return this.average;
	}

}
