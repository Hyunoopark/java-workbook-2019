package workbook.StepC;

import java.util.Scanner;

public class C01 {
	private int birth_year;
	private int age;
	
	public C01() {
		input();
	}
	
	public void printAG() {
		if(getAge()<7)
			System.out.println("�����Դϴ�.");
		else if(getAge()>=7 && getAge()<13)
			System.out.println("����Դϴ�.");
		else if(getAge()>=13 && getAge()<20)
			System.out.println("û�ҳ��Դϴ�.");
		else if(getAge()>=20 && getAge()<30)
			System.out.println("û���Դϴ�.");
		else if(getAge()>=30 && getAge()<60)
			System.out.println("�߳��Դϴ�.");
		else
			System.out.println("����Դϴ�.");
		
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("�¾ �⵵�� �Է��ϼ��� : ");
		this.birth_year = s.nextInt();
	}
	
	int getAge() {
		age = 2018 - birth_year + 1;
		return this.age;
	}

}
