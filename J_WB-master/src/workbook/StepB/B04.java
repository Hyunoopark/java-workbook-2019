package workbook.StepB;

import java.util.Scanner;

public class B04 {
	private double m2_area = 0;
	private double pyung_area = 0;
	
	public B04(){
		input();
	}
	
	public void printArea() {
		System.out.printf("����Ʈ�� ������ %.1f�̰� ",getArea());
		printSize();
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
	
	void printSize() {
		if(pyung_area < 30)
			System.out.println("30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�");
		else
			System.out.println("30�� �̻��̹Ƿ� ū ����Ʈ�Դϴ�");
	}

}
