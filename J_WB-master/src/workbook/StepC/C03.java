package workbook.StepC;

import java.util.Scanner;

public class C03 {
	private int width;
	private int height;
	
	public C03(){
		input();
	}
	
	public void printRec() {
		if(width == height)
			System.out.println("���簢���Դϴ�");
		else if(width >= height * 2)
			System.out.println("�¿�� ������ ���簢���Դϴ�");
		else if(height >= width * 2)
			System.out.println("���Ʒ��� ������ ���簢���Դϴ�");
		else if(width > height)
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");
		else if(height > width)
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("���簢���� ���� ũ�⸦ �Է��Ͻÿ� : ");
		this.width = s.nextInt();
		System.out.println("���簢���� ���� ũ�⸦ �Է��Ͻÿ� : ");
		this.height = s.nextInt();
	}

}
