package workbook.StepI;

import java.util.Scanner;

public class I02 {
	private String input;
	private int height, blank;
	
	public I02() {
		input();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("직각 삼각형을 그리는데 사용할 문자를 입력하시오 : ");
		this.input = s.next();
		System.out.print("직각 삼각형의 높이와 왼쪽 여백의 크기를 입력하시오 : ");
		this.height = s.nextInt();
		this.blank = s.nextInt();
		
		PrintCharWithBlank(blank, height, input);
		
	}
	
	public void PrintCharWithBlank(int blank, int height, String ch) {
		for(int i = 1; i <= height; i++) {
			for(int j = 0; j < blank; j++)
				System.out.print(" ");
			for(int j = 1; j <= height; j++) {
				if(j <= height-i)
					System.out.print(" ");
				else
					System.out.print(ch);
			}
			System.out.println();
		}
	}

}
