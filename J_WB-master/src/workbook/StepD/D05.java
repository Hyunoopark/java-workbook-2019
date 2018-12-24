package workbook.StepD;

import java.util.Scanner;

public class D05 {
	private int width, height;
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	private int count5 = 0;
	
	public D05() {
		input();
	}
	
	public void printRec() {
		System.out.printf("���簢���� ������ %d �Դϴ� \n",count1);
		System.out.printf("�¿�� ������ ���簢���� ������ %d �Դϴ� \n",count2);
		System.out.printf("���Ʒ��� ������ ���簢���� ������ %d �Դϴ� \n",count3);
		System.out.printf("�Ϲ����� ������ ���簢���� ������ %d �Դϴ� \n",count4);
		System.out.printf("�Ϲ����� ������ ���簢���� ������ %d �Դϴ� \n",count5);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("���簢���� ���� ũ��� ���� ũ�⸦ �Է��Ͻÿ�.");
			this.width = s.nextInt();
			this.height = s.nextInt();
			
			if(width <= 0 || height <= 0)
				break;
			
			countRec();
		}
	}
	
	void countRec() {
		if(width == height)
			count1++;
		else if(width >= height * 2)
			count2++;
		else if(height >= width * 2)
			count3++;
		else if(width > height)
			count4++;
		else if(height > width)
			count5++;
	}

}
