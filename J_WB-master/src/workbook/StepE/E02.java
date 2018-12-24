package workbook.StepE;

import java.util.Scanner;

public class E02 {
	private int height, blank;
	
	public E02() {
		input();
	}
	
	public void printTri() {
		int i, j;
		for(i = 1; i <= height; i++) {
			for(j = 0; j < blank; j++)
				System.out.print(" ");
			
			for(j = 1; j <= height; j++) {
				if(j <= height-i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
			
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오: ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
	}

}
