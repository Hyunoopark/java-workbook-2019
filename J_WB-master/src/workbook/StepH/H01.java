package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H01 {
	private int answer;
	private int number_try;
	private int count = 1;
	
	public H01() {
		input();
	}
	
	public void printAns() {
		System.out.println(count + "번만에 숫자를 맞추셨습니다.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		Random generator = new Random();
		
		answer = generator.nextInt(99) + 1;
		
		while(true) {
			System.out.print("1부터 100까지의 숫자 하나를 맞춰보세요 : ");
			this.number_try = s.nextInt();
			
			if(number_try == answer)
				break;
			
			getHint();
			count ++;
		}	
	}
	
	void getHint() {
		if(number_try < answer)
			System.out.println("좀 더 큰 수입니다.");
		else if(number_try > answer)
			System.out.println("좀 더 작은 수입니다.");
	}

}
