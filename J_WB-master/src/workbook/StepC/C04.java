package workbook.StepC;

import java.util.Scanner;

public class C04 {
	private double m2_area = 0;
	private double pyung_area = 0;
	
	public C04(){
		input();
	}
	
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f �Դϴ� \n ", getArea());
		
		if(getArea() < 15)
			System.out.println("���� ����Ʈ�Դϴ�");
		else if(15 <= getArea() && getArea() < 30)
			System.out.println("�߼��� ����Ʈ�Դϴ�");
		else if(30 <= getArea() && getArea() < 50)
			System.out.println("���� ����Ʈ�Դϴ�");
		else
			System.out.println("���� ����Ʈ�Դϴ�");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�.");
		this.m2_area = s.nextDouble();
	}
	
	double getArea() {
		pyung_area = m2_area / 3.305;
		return this.pyung_area;
	}

}
