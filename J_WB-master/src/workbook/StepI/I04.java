package workbook.StepI;

import java.util.Scanner;

public class I04 {
	private int choice;
	private int price;
	private int sum;
	
	public I04(){
		input();
	}
	
	public void printOut() {
		System.out.printf("�� �ֹ� �ݾ��� %d���Դϴ�.",sum);
	}
	
	void input() {
		while(true) {
			ShowMenu();
			System.out.print("�޴��� �������ּ���. (���� : 5) ");
		
			Scanner s = new Scanner(System.in);
			this.choice = s.nextInt();
			
			if(SelectMenu() == -1)
				break;
			
			System.out.printf("��������� �ֹ� �ݾ��� %d���Դϴ�. \n",sum());
		}
		
	}
	
	void ShowMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	
	int SelectMenu() {
		if(choice == 1)
			price = 15000;
		else if(choice == 2)
			price = 10000;
		else if(choice == 3)
			price = 7000;
		else if(choice == 4)
			price = 2000;
		else if(choice == 5)
			price = -1;
		
		return this.price;
	}
	
	int sum() {
		sum += SelectMenu();
		
		return this.sum;
	}
}
