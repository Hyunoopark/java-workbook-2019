package workbook.StepF;

import java.util.Scanner;

public class F05 {
	private int height, weight;
	private double bmi;
	private int bmilist[][] = new int[10][3];
	private int count = 0;
	
	public F05() {
		input();
	}
	
	public void getBmi() {
		for(int i = 0; i < 10; i++) {
			bmi = (double)bmilist[i][1] / (double)((bmilist[i][0] * 0.01) * (bmilist[i][0] * 0.01));
			
			if(bmi >= 25) {
				System.out.println( i+1 +"��° ����� ���Դϴ�.");
				count ++;
			}
			
			bmilist[i][2] = (int)bmi;
		}
		System.out.println("��" + count + "���� ����� ���Դϴ�.");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d�� ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ� : ",i+1);
			this.height = s.nextInt();
			this.weight = s.nextInt();	
			
			bmilist[i][0]= height;
			bmilist[i][1]= weight;
		}
	}
}
