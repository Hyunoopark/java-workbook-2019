package workbook.StepD;

import java.util.Scanner;

public class D04 {
	private int count_all;
	private int count_young;
	private int birth_year;
	private int age;
	
	public D04() {
		input();
	}
	
	public void printYoung() {
		System.out.printf("가족들 중에 미성년자는 모두 %d명 입니다",getYoung());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.count_young = 0;
		
		System.out.print("가족이 몇 명인지 입력하세요");
		this.count_all = s.nextInt();
		
		for(int i = 0; i<count_all; i++) {
			System.out.print("태어난 년도를 입력하세요");
			this.birth_year = s.nextInt();
			setYoung();
		}
	}
	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}
	
	void setYoung() {
		if(age < 20)
			count_young++;
	}
	
	int getYoung() {
		return this.count_young;
	}

}
