package workbook.StepC;

import java.util.Scanner;

public class C09 {
	private int income; //연봉
	private int tax; // 소득세
	
	public C09() {
		input();
	}
	
	public void printTax() {
		System.out.printf("연봉 금액에 대한 소득세는 %d원 입니다",getTax());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("연봉(원 단위)을 숫자로 입력하세요");
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
