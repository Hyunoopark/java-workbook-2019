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
		System.out.print("���� �ﰢ���� �׸��µ� ����� ���ڸ� �Է��Ͻÿ� : ");
		this.input = s.next();
		System.out.print("���� �ﰢ���� ���̿� ���� ������ ũ�⸦ �Է��Ͻÿ� : ");
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
