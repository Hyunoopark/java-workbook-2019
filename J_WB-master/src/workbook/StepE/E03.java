package workbook.StepE;

import java.util.Scanner;

public class E03 {
	private int height;
	
	public E03() {
		input();
	}
	
	public void printTri() {
		int i, j;
		for(i = 1; i <= height; i++) {
			for(j = 0; j < height-i; j++) 
				System.out.print(" ");
			for(j = 0; j < 2*i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("이등변 삼각형의 높이를 입력하시오: ");
		this.height = s.nextInt();
	}

}
