package workbook.StepI;

import java.util.Scanner;

public class I07 {
	private int menu;
	private String yn;
	private int count;
	private int price;
	private int total_price;
	
	public I07() {
		input();
	}
	
	public void printAns() {
		System.out.printf("%d���� ���Ḧ �����Ͽ� �� %d���Դϴ�\n",count,total_price);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.�ݶ�(700��) 2.����Ŀ��(300��) 3.�����ֽ�(1000��) \n");
			System.out.print("4.ȫ��(500��) 5.���ھ�(600��)\n");
			System.out.print("�޴��� �������ּ��� : ");
			this.menu = s.nextInt();
			System.out.print("�� �ʿ��Ͻʴϱ�?(Y/N) : ");
			this.yn = s.next();
			
			count++;
			
			if(yn.equalsIgnoreCase("n")) {
				TotalPrice();
				break;
			}
			else if(yn.equalsIgnoreCase("y"))
				TotalPrice();
			else {
				System.out.println("�߸��Է��ϼ̽��ϴ�");
				count--;
			}
	
		}
	}
	
	int SelectCan() {
		if(menu == 1)
			price = 700;
		else if(menu == 2)
			price = 300;
		else if(menu == 3)
			price = 1000;
		else if(menu == 4)
			price = 500;
		else if(menu == 5)
			price = 600;
		
		return this.price;
	}
	
	void TotalPrice() {
		total_price += SelectCan();
	}
}
