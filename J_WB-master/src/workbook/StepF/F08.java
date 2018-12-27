package workbook.StepF;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];
	private int newnum;
	private int count = 0;
	private boolean dup;
	
	public F08() {
		input();
	}
	
	public void printNum() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d번째 숫자는 %d입니다 \n",i+1,number[i]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1부터 100사이의 숫자를 입력하시오 \n");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 숫자를 입력하시오 : ",i+1);
			this.newnum = s.nextInt();
			number[i] = newnum;
			dupli();
			
			if(dup==true) {
				System.out.print("잘못 입력하였습니다. 다시 입력하세요 \n");
				i--;
			}
			else
				count++;
		}
	}
	
	void dupli() {
		for(int i = 0; i < count; i++) {
			if(number[count] == number[i]) {
				dup = true;
				break;
			}
			else 
				dup = false;
		}
	}

}
