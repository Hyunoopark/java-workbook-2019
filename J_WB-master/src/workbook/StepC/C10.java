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
		System.out.printf("계산식의 결과 값은 %d 입니다", cal());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("숫자1을 입력하세요");
		this.num1 = s.nextInt();
		System.out.printf("숫자2를 입력하세요");
		this.num2 = s.nextInt();
		System.out.printf("연산기호문자('+', '-', '*', '/' 중 1개)를 입력하세요");
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
