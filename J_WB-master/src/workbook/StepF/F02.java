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
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.1f �Դϴ�",avgExcept2());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d�� �ɻ��������� �Է��Ͻÿ�",i+1);
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
