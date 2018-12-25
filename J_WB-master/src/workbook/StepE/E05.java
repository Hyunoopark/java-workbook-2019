package workbook.StepE;

import java.util.Scanner;

public class E05 {
	private int mode, column;

	public E05() {
		input();
	}
	
	public void printGugu() {
		int i, j;
		if(mode == 1) {
			for(i = 3; i < 10; i+=2) {
				for(j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %-6d",i,j,i*j);
					if(j%column == 0)
						System.out.printf("\n");
				}	
				System.out.printf("\n");
			}
		}
		
		if(mode == 2) {
			for(i = 2; i < 10; i+=2) {
				for(j = 1; j <= 9; j++) {
					System.out.printf("%d X %d = %-6d   ",i,j,i*j);
					if(j%column == 0)
						System.out.printf("\n");
				}	
				System.out.printf("\n");
			}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("구구단의 출력모드(1: 홀수단, 2: 짝수단)을 입력하시오: ");
		this.mode = s.nextInt();
		System.out.print("한 줄에 출력할 갯수를 입력하시오: ");
		this.column = s.nextInt();
	}
}
