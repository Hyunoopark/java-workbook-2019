package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	private int num[] = new int[100];
	private int count;
	private String name[] = new String[100];
	private String country[] = new String[100];
	private int price[] = new int[100];
	
	public MenuPan(int c) {
		count = c;
	}

	public void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < count; i++) {
			if(count == 1)
				System.out.print("�޴��� ��ȣ, �޴���, ������, ������ �Է��Ͻÿ� : ");
			else
				System.out.print((i+1) + "�� �޴��� ��ȣ, �޴���, ������, ������ �Է��Ͻÿ� : ");
			this.num[i] = s.nextInt();
			this.name[i] = s.next();
			this.country[i] = s.next();
			this.price[i] = s.nextInt();
		}
	}
	
	public void print() { 
		System.out.println("=====================================");
		System.out.println("�޴���ȣ\t�޴��̸�\t������\t1�κа���");
		for(int i = 0; i < count; i++)
			System.out.println(num[i]+"\t"+name[i]+"\t"+country[i]+"\t"+price[i]);
	}
}
