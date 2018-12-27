package workbook.StepF;

import java.util.Scanner;

public class F03 {
	private int jumsu[][] = new int[5][3];
	private int sum[] = new int[3];
	private double average[] = new double[3];
	private String subject[] = {"����","����","����"};
	
	public F03() {
		input();
	}
	
	public void printScore() {
		for(int i = 0; i < 3; i++)
			System.out.printf("%s�� ������ %d �̰�, ����� %.1f �Դϴ�. \n",subject[i],sum[i],average[i]);
		
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
				sum[j] += jumsu[i][j];
		}
	}
	
	void getAvg() {
		for(int i = 0; i < 3; i++)
			average[i] = (double)sum[i] / 5.0;
	}

}
