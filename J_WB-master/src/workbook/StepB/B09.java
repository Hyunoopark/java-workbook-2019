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
			System.out.println("당신은 비만이십니다");
		else
			System.out.println("당신은 비만이 아니군요");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("신장(cm단위)을 입력하세요");
		this.height = s.nextInt();
		System.out.printf("체중(kg단위)을 입력하세요");
		this.weight = s.nextInt();
	}
	
	int getBmi() {
		bmi = weight /(int)((height * 0.01) * (height * 0.01));
		return this.bmi;
	}
	
	

}
