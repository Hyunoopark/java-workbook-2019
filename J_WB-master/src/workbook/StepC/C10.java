package workbook.StepC;

import java.util.Scanner;

public class C10 {
	private int num1, num2;
	private String operator;
	private int result;
	
	public C10() {
		input();
	}
	
	public void printResult() {
		System.out.printf("������ ��� ���� %d �Դϴ�", cal());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����1�� �Է��ϼ���");
		this.num1 = s.nextInt();
		System.out.printf("����2�� �Է��ϼ���");
		this.num2 = s.nextInt();
		System.out.printf("�����ȣ����('+', '-', '*', '/' �� 1��)�� �Է��ϼ���");
		this.operator = s.next();
	}
	
	int cal() {
		if(operator.equals("+"))
			result = num1 + num2;
		if(operator.equals("-"))
			result = num1 - num2;
		if(operator.equals("*"))
			result = num1 * num2;
		if(operator.equals("/"))
			result = num1 / num2;
		
		return this.result;
	}

}
