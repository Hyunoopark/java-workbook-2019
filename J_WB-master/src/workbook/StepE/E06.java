package workbook.StepE;

import java.util.Scanner;

public class E06 {
	private int rows, columns;
	private int number;
	
	public E06() {
		input();
	}
	
	public void printNum() {
		int i, j;
		
		for(i = 1; i <= rows; i++) {
			for(j = 1; j <= columns; j++) {
				System.out.printf("%5d",i*j);
			}
			System.out.println();
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력하려는 행의 크기와 열의 크기를 입력하시오 : ");
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}

}
