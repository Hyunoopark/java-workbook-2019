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
				B02 b2 = new B02();
				b2.printT();
				break;
			case 3:
				B03 b3 = new B03();
				b3.printArea();
				break;
			case 4:
				B04 b4 = new B04();
				b4.printArea();
				break;
			case 5:
				B05 b5 = new B05();
				b5.printSec();
				break;
			case 6:
				B06 b6 = new B06();
				b6.printScore();
				break;
			case 7:
				B07 b7 = new B07();
				b7.printFT();
				break;
			case 8:
				B08 b8 = new B08();
				b8.printCon();
				break;
			case 9:
				B09 b9 = new B09();
				b9.printBmi();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
