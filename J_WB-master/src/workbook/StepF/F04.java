package workbook.StepF;

import java.util.Scanner;

public class F04 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[5];
	private double average[] = new double[5];
	
	public F04() {
		input();
	}
	
	public void printScore() {
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d�� �л��� ������ %d �̰�, ����� %.1f �Դϴ�. \n",i+1,sum[i],average[i]);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d�� �л� ����, ����, ���� ������ �Է��Ͻÿ�",i+1);
			for(int j = 0; j < 3; j++)
				this.jumsu[i][j] = s.nextInt();
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