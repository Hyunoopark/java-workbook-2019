package workbook.StepC;

import java.util.Scanner;

public class C02 {
	private double input_degree;
	
	public C02() {
		input();
	}
	
	public void printWater() {
		double t = input_degree;
		
		if(t<0)
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
		else if(t>=0 && t<25)
			System.out.println("�ü��Դϴ�.");
		else if(t>=25 && t<40)
			System.out.println("�̿¼��Դϴ�.");
		else if(t>=40 && t<80)
			System.out.println("�¼��Դϴ�.");
		else if(t>=80)
			System.out.println("���¹��Դϴ�.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("���� �µ��� �Է��ϼ��� : ");
		this.input_degree = s.nextDouble();
	}

}
