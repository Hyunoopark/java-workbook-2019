package workbook.StepC;

import java.util.Scanner;

public class C09 {
	private int income; //����
	private int tax; // �ҵ漼
	
	public C09() {
		input();
	}
	
	public void printTax() {
		System.out.printf("���� �ݾ׿� ���� �ҵ漼�� %d�� �Դϴ�",getTax());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����(�� ����)�� ���ڷ� �Է��ϼ���");
		this.income = s.nextInt();
	}
	
	int getTax() {
		if(income < 10000000)
			tax = (int)(income * 0.095);
		else if(10000000 <= income && income < 40000000)
			tax = (int)(income * 0.19);
		else if(40000000 <= income && income < 80000000)
			tax = (int)(income * 0.28);
		else if(80000000 <= income)
			tax = (int)(income * 0.37);
		
		return this.tax;
	}
	
	

}
