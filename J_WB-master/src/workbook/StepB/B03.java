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
		System.out.printf("���簢���� ���̴� %d �Դϴ� \n",calArea());
		isSquare();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		this.width = s.nextInt();
		System.out.printf("���簢���� ���� ũ�⸦ �Է��Ͻÿ�.");
		this.height = s.nextInt(); 
	}
	
	int calArea() {
		area = width * height;
		return this.area;
	}
	
	void isSquare() {
		if(width==height)
			System.out.printf("���簢���Դϴ�");
		else
			System.out.printf("���簢���� �ƴմϴ�");
	}

}
