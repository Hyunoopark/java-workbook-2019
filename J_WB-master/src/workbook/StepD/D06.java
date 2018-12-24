package workbook.StepD;

import java.util.Scanner;

public class D06 {
	private double m2_area;
	private double pyung_area;
	private int count1;
	private int count2;
	private int count3;
	private int count4;
	
	public D06() {
		input();
	}
	
	public void printApt() {
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ� \n",count1);
		System.out.printf("\"�߼��� ����Ʈ\"�� ������ %d �Դϴ� \n",count2);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ� \n",count3);
		System.out.printf("\"���� ����Ʈ\"�� ������ %d �Դϴ� \n",count4);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�.");
			this.m2_area = s.nextDouble();
			printPyung();
			countApt();
		}
			
	}
	
	void printPyung() {
		System.out.printf("--> �� ����Ʈ�� ������ %.1f �Դϴ� \n", getPyung());
	}
	
	double getPyung() {
		pyung_area = m2_area / 3.305;
		
		return this.pyung_area;
	}
	
	void countApt() {
		if(pyung_area<15)
			count1++;
		else if(pyung_area<30)
			count2++;
		else if(pyung_area<50)
			count3++;
		else if(pyung_area>=50)
			count4++;
	}
}
