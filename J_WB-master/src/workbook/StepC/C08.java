package workbook.StepC;

import java.util.Scanner;

public class C08 {
	private int num1, num2, num3;
	private int max_num, min_num;
	
	public C08() {
		input();
	}
	
	public void printNum() {
		System.out.printf("���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ�.",getMax(),getMin());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("ù��° ���ڸ� �Է��ϼ���");
		this.num1 = s.nextInt();
		System.out.printf("�ι�° ���ڸ� �Է��ϼ���");
		this.num2 = s.nextInt();
		System.out.printf("����° ���ڸ� �Է��ϼ���");
		this.num3 = s.nextInt();
	}
	
	int getMax() {
		if(num1>num2)
			max_num = num1;
		else
			max_num = num2;
		
		if(num3>max_num)
			max_num = num3;
		
		return this.max_num;
	}
	
	int getMin() {
		if(num1>num2)
			min_num = num2;
		else
			min_num = num1;
		
		if(min_num>num3)
			min_num = num3;
		
		return this.min_num;
	}

}
