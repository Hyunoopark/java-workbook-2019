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
		System.out.printf("���� ū ������ ���� ���� ������ ������ 8���� ������ ���� ����� %.2f �Դϴ�. \n", (sum - Max(score) - Min(score))/8.0);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d�� �ɻ������� �Է��Ͻÿ� : ",i+1);
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
