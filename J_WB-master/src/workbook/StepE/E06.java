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
		
		System.out.print("����Ϸ��� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ� : ");
		this.rows = s.nextInt();
		this.columns = s.nextInt();
	}

}
