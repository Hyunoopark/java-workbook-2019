package workbook.StepJ;

import java.util.Scanner;

public class J07 {
	private int num;
	
	public J07() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하시오  (0.종료) : ");
			this.num = s.nextInt();
			
			if(num == 0)
				break;
			
			System.out.println("2의 " + num + "승은 : " + PowerOfTwo(num));
		}
		
	}
	
	int PowerOfTwo(int n) {
		if(n == 0)
			return 1;
		else 
			return 2 * PowerOfTwo(n-1);
	}

}
