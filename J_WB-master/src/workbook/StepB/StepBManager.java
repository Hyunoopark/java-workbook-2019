package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰�� �� �̼����� ����\n");
			printf("2. �µ� ��ȣ ��ȯ\n");
			printf("3. ���簢�� ���̰�� �� ���簢�� ����\n");
			printf("4. ����Ʈ ���� ��� �� ���� ����\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� ���� �ð� ���\n");
			printf("8. �پ��� ���� ����\n");
			printf("9. �� ����\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				B01 b1 = new B01();
				b1.printAge();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
