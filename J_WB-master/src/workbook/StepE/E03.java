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
			for(j = 0; j < i; j++)
				System.out.print("*");
			for(j = 0; j < i-1; j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̵ �ﰢ���� ���̸� �Է��Ͻÿ�: ");
		this.height = s.nextInt();
	}

}