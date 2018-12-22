package workbook.StepB;

import java.util.Scanner;

public class B01 {
	private int birth_year = 0;
	private int age = 0;
	
	public B01() {
		input();
	}
	public void printAge() {
		System.out.printf("당신의 나이는 %d살 입니다 \n",getAge());
		isAdult();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("태어난 년도를 입력하세요 : ");
		this.birth_year=s.nextInt();
	}
	
	int getAge(){
		age = 2018 - birth_year + 1;
		return this.age;
	}
	
	void isAdult() {
		if(age < 20)
			System.out.println("미성년자입니다.");
		else
			System.out.println("미성년자가 아닙니다.");
	}
	
	

}
