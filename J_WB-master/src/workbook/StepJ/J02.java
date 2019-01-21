package workbook.StepJ;

import java.util.Scanner;

public class J02 {
	private double score[] = new double[10];
	private double max = -1000000;
	private double min = 1000000;
	private double sum;
	
	public J02() {
		input();
	}
	
	public void printScore() {
		System.out.printf("가장 큰 점수와 가장 작은 점수를 제외한 8개의 점수에 대한 평균은 %.2f 입니다. \n", (sum - Max(score) - Min(score))/8.0);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번 심사점수를 입력하시오 : ",i+1);
			this.score[i] = s.nextDouble();
			
			sum += score[i];
		}
	}
	
	double Max(double num[]) {
		for(int i = 0; i < 10; i++) {
			if(score[i] > max)
				max = score[i];
		}	
		return max;
	}
	
	double Min(double num[]) {
		for(int i = 0; i < 10; i++) {
			if(score[i] < min)
				min = score[i];
		}	
		return min;
	}

}
