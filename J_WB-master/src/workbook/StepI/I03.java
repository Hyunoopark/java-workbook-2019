package workbook.StepI;

import java.util.Scanner;

public class I03 {
	private int height, weight;
	private int bmi;

	public I03() {
		input();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 사람의 신장(cm)과 체중(kg)을 입력하시오 : ", i+1);
			this.height = s.nextInt();
			this.weight = s.nextInt();
			
			AskBiman(height,weight);
		}
	}
	
	void AskBiman(int height,int weight) {
		bmi = (int)(weight / ((height * 0.01) * (height * 0.01)));
		
		if(bmi < 18.5)
			System.out.println("저체중입니다");
		else if(18.5 <= bmi && bmi < 23)
			System.out.println("정상 체중입니다.");
		else if(23 <= bmi && bmi < 25)
			System.out.println("과체중입니다");
		else if(25 <= bmi && bmi < 30)
			System.out.println("경도 비만입니다");
		else if(30 <= bmi)
			System.out.println("고도 비만입니다");
		
	}
}
