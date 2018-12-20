package workbook.StepA;

import java.util.Scanner;

public class RecArea {
	private int width = 0;
	private int height = 0;
	private int area = 0;
	
	public RecArea(){input();}
	public void printArea() {
		System.out.printf("직사각형의 넓이는 %d 입니다", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("직사각형의 가로의 크기를 입력하시오 : ");
		this.width = s.nextInt();
		System.out.printf("직사각형의 세로의 크기를 입력하시오 : ");
		this.height = s.nextInt();
	}	
	
	int getArea() {
		area = width * height;
		return this.area;
	}

}
