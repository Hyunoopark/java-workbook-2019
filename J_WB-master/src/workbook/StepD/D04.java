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
		System.out.printf("������ �߿� �̼����ڴ� ��� %d�� �Դϴ�",getYoung());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.count_young = 0;
		
		System.out.print("������ �� ������ �Է��ϼ���");
		this.count_all = s.nextInt();
		
		for(int i = 0; i<count_all; i++) {
			System.out.print("�¾ �⵵�� �Է��ϼ���");
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
