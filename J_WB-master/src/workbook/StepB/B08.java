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
			System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����");
		if(con2()==true)
			System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ ��� 50���� ũ��");
		if(con3()==true)
			System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����");
		if(con4()==true)
			System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ������ �������� ��찡 �ִ�");
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
