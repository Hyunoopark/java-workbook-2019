package workbook.StepA;

import java.util.Scanner;

public class RecArea {
	private int width = 0;
	private int height = 0;
	private int area = 0;
	
	public RecArea(){input();}
	public void printArea() {
		System.out.printf("���簢���� ���̴� %d �Դϴ�", getArea());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���簢���� ������ ũ�⸦ �Է��Ͻÿ� : ");
		this.width = s.nextInt();
		System.out.printf("���簢���� ������ ũ�⸦ �Է��Ͻÿ� : ");
		this.height = s.nextInt();
	}	
	
	int getArea() {
		area = width * height;
		return this.area;
	}

}
