package workbook.StepE;

import java.util.Scanner;

public class E01 {
	private int length;
	
	public E01() {
		input();
	}
	
	public void printSqu() {
		for(int i=0; i<length; i++) {
			for(int j=0; j<length; j++)
				System.out.print("# ");
			System.out.print("\n");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���簢���� ũ�⸦ �Է��ϼ���");
		this.length = s.nextInt();
	}
	
	

}
