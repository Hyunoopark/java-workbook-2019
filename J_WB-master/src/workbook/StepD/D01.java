package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;
	
	public D01() {
		input();
	}
	
	public void printNum() {
		if(number <= 1)
			System.out.println("잘못 입력하였습니다");
		else
			System.out.printf("1부터 입력한 숫자까지의 모든 정수를 더한 값은 %d 입니다",addNum());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		this.number = s.nextInt();
	}
	
	int addNum() {
		int i;
		
		for(i=1; i<=number; i++)
			totalsum += i;
		
		return this.totalsum;
	}

}
