package workbook.StepB;

import java.util.Scanner;

public class B03 {
	private int width;
	private int height;
	private int area;
	
	public B03() {
		input();
	}
	
	public void printArea() {
		System.out.printf("직사각형의 넓이는 %d 입니다 \n",calArea());
		isSquare();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로 크기를 입력하시오.");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로 크기를 입력하시오.");
		this.height = s.nextInt(); 
	}
	
	int calArea() {
		area = width * height;
		return this.area;
	}
	
	void isSquare() {
		if(width==height)
			System.out.printf("정사각형입니다");
		else
			System.out.printf("정사각형이 아닙니다");
	}

}
