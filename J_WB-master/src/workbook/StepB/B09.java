package workbook.StepB;

import java.util.Scanner;

public class B09 {
	private int height, weight;
	private int bmi;
	
	public B09() {
		input();
	}
	
	public void printBmi() {
		if(getBmi() >= 25)
			System.out.println("����� ���̽ʴϴ�");
		else
			System.out.println("����� ���� �ƴϱ���");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����(cm����)�� �Է��ϼ���");
		this.height = s.nextInt();
		System.out.printf("ü��(kg����)�� �Է��ϼ���");
		this.weight = s.nextInt();
	}
	
	int getBmi() {
		bmi = weight /(int)((height * 0.01) * (height * 0.01));
		return this.bmi;
	}
	
	

}
