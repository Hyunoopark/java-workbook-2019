package workbook.StepI;

import java.util.Scanner;

public class I05 {
	private int num[] = new int[10];
	private int max = -10000000;
	
	public I05() {
		input();
	}
	
	public void printMax() {
		System.out.printf("�ִ��� %d �Դϴ�.\n",MaxOfTen());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10���� ���� �� �ִ��� ���մϴ�.");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d�� ���� �Է��Ͻÿ� : ", i+1);
			this.num[i] = s.nextInt();
		}
	}
	
	int MaxOfTen() {
		for(int i = 0; i < 10; i++) {
			if(num[i] > max) 
				max = num[i];
		}
		
		return this.max;
	}

}
