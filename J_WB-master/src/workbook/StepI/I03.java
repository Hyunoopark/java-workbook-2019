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
			System.out.printf("%d��° ����� ����(cm)�� ü��(kg)�� �Է��Ͻÿ� : ", i+1);
			this.height = s.nextInt();
			this.weight = s.nextInt();
			
			AskBiman(height,weight);
		}
	}
	
	void AskBiman(int height,int weight) {
		bmi = (int)(weight / ((height * 0.01) * (height * 0.01)));
		
		if(bmi < 18.5)
			System.out.println("��ü���Դϴ�");
		else if(18.5 <= bmi && bmi < 23)
			System.out.println("���� ü���Դϴ�.");
		else if(23 <= bmi && bmi < 25)
			System.out.println("��ü���Դϴ�");
		else if(25 <= bmi && bmi < 30)
			System.out.println("�浵 ���Դϴ�");
		else if(30 <= bmi)
			System.out.println("�� ���Դϴ�");
		
	}
}
