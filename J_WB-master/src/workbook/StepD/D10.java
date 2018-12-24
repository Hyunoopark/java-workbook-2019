package workbook.StepD;

import java.util.Scanner;

public class D10 {
	private int num1, num2;
	
	public D10() {
		input();
	}
	
	public void printMulti() {
		int i;
		
		for(i = 0; i <=100; i++) {
			if( (i%num1 ==0 && i%num2 !=0) || (i%num1 !=0 && i%num2 ==0))
				System.out.printf("%d, ", i);
		}
			
	}
	
	void input() {
		Scanner s = new Scanner(System.in);

		System.out.print("2개의 숫자를 입력하시오 : ");
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
	}

}
