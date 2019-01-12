package workbook.StepI;

import java.util.Scanner;

public class I05 {
	private int num[] = new int[10];
	private int max = -10000000;
	
	public I05() {
		input();
	}
	
	public void printMax() {
		System.out.printf("최댓값은 %d 입니다.\n",MaxOfTen());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("10개의 숫자 중 최댓값을 구합니다.");
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번 수를 입력하시오 : ", i+1);
			this.num[i] = s.nextInt();
		}
	}
	
	int MaxOfTen() {
		for(int i = 0; i < 10; i++) {
			if(num[i] > max) 
				max = num[i];
		}
		
		return this.max;
	}

}
