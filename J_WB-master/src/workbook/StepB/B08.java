package workbook.StepB;

import java.util.Scanner;

public class B08 {
	private int num1;
	private int num2;
	private int num3;
	
	public B08() {
		input();
	}
	
	public void printCon() {
		if(con1()==true)
			System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다");
		if(con2()==true)
			System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 모두 50보다 크다");
		if(con3()==true)
			System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다");
		if(con4()==true)
			System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어 떨어지는 경우가 있다");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("첫번째 숫자를 입력하세요");
		this.num1 = s.nextInt();
		System.out.printf("두번째 숫자를 입력하세요");
		this.num2 = s.nextInt();
		System.out.printf("세번째 숫자를 입력하세요");
		this.num3 = s.nextInt();
	}
	
	boolean con1() {
		if(num1 == num2 || num1 == num3 || num2 == num3)
			return true;
		else
			return false;
	}
	
	boolean con2() {
		if((num1 > 50 && num2 > 50) || (num1 > 50 && num3 > 50) || (num2 > 50 && num3 > 50))
			return true;
		else
			return false;
	}
	
	boolean con3() {
		if((num1 + num2 == num3) || (num1 + num3 == num2) || (num2 + num3 == num2))
			return true;
		else
			return false;
	}
	
	boolean con4() {
		if((num2 % num1 == 0 && num3 % num1 == 0) || (num1 % num2 == 0 && num3 % num2 == 0) || num1 % num3 == 0 && num2 % num3 == 0)
			return true;
		else
			return false;
	}

}
