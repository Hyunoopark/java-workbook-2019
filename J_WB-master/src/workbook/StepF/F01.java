package workbook.StepF;

import java.util.Scanner;

public class F01 {
	private int num[] = new int[10];
	private int second;
	private int second_max_index;
	private int newnum;
	
	public F01() {
		input();
	}
	
	public void printSMax() {
		System.out.printf("두 번째로 큰 수는 %d번째 수 %d 입니다",second_max_index,second);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 수를 입력하시오",i+1);
			this.newnum = s.nextInt();
			num[i] = newnum;
		}
		secondMax();
	}
	
	void secondMax() {
		int first = num[0];
		
		second = num[0];
		second_max_index = 0;
		
		for(int i=0; i<9; i++) {
			if(num[i+1] > first)
				first = num[i+1];
		}
		
		for(int i=0; i<9; i++) {
			if(num[i+1] != first && num[i+1] > second)
				second = num[i+1];
		}
		
		for(int i=0; i<9; i++) {
			if(num[i] == second)
				second_max_index = i+1;
		}
		
	}
}
