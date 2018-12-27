package workbook.StepF;

import java.util.Scanner;

public class F06 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int total;
	private int ho;
	
	public F06() {
		input();
	}
	
	public void getTotal() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) 
				total += number[i][j];
		}
		System.out.printf("이 아파트에 사는 거주자는 모두 %d명 입니다.",total);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				ho = 100*(i+1) + (j+1);
				System.out.printf("%d호에 살고 있는 사람의 숫자를 입력하시오 : ",ho);
				this.newnum = s.nextInt();
			
				number[i][j] =  newnum;
			}
		}
	}
}
