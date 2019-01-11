package workbook.StepH;

import java.util.Scanner;

public class H06 {
	private double number[] = new double[5];
	private double pow_value[][] = new double[5][5];
	private int max = -10000000;
	private int min = 10000000;
	private int max_a, max_b;
	private int min_a, min_b;
	
	public H06() {
		input();
	}
	
	public void printAns() {
		System.out.println("�Է��Ͻ� 5���� ���� �������� �����...");
		
		System.out.printf("���� ū ���� %d�� %d���� %d �Դϴ�. \n",max_a,max_b,max);
		System.out.printf("���� ���� ���� %d�� %d���� %d �Դϴ�. \n",min_a,min_b,min);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("2���� 9������ ���� 5���� �Է��ϼ��� : ");
		
		for(int i = 0; i < 5; i++)
			this.number[i] = s.nextInt();
		
		for(int i = 0; i < 5; i++) {
			if(number[i] > 9 || number[i] < 2) {
				System.out.print("�߸� �Է��ϼ̽��ϴ�. \n");
				input();
			}
		}
		
		power();
	}
	
	void power() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i != j)
					pow_value[i][j] = Math.pow(number[i], number[j]);
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(pow_value[i][j] > max) {
					max = (int)pow_value[i][j];
					max_a = (int)number[i]; 
					max_b = (int)number[j];
				}
				
				if(pow_value[i][j] < min  && pow_value[i][j] != 0) {
					min = (int)pow_value[i][j];
					min_a = (int)number[i];
					min_b = (int)number[j];
				}
			}
		}
	}

}
