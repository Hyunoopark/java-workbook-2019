package workbook.StepI;

import java.util.Scanner;

public class I01 {
	private int choice;
	private int sum;
	private int menu_price[] = {15000,10000,7000,2000};
	
	public I01(){
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
			
			if(choice == 5)
				break;
			
			System.out.printf("��������� �ֹ� �ݾ��� %d���Դϴ�. \n",price());
		}
		
	}
	
	void ShowMenu() {
		System.out.println("1. ����(15,000��) 2. ���İ�Ƽ(10,000��) 3. ������(7,000��) 4. �����(2,000��)");
	}
	
	int price() {
		sum += menu_price[choice-1];
		
		return this.sum;
	}

}
