package workbook.StepB;

import java.util.Scanner;

public class B01 {
	private int birth_year = 0;
	private int age = 0;
	
	public B01() {
		input();
	}
	public void printAge() {
		System.out.printf("����� ���̴� %d�� �Դϴ� \n",getAge());
		isAdult();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("�¾ �⵵�� �Է��ϼ��� : ");
		this.birth_year=s.nextInt();
	}
	
	int getAge(){
		age = 2018 - birth_year + 1;
		return this.age;
	}
	
	void isAdult() {
		if(age < 20)
			System.out.println("�̼������Դϴ�.");
		else
			System.out.println("�̼����ڰ� �ƴմϴ�.");
	}
	
	

}
