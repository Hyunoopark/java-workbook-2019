package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���� �˾� ���߱�\n");
			printf("2. �ζ� ��ȣ �����\n");
			printf("3. �ζ� ��ȣ ��÷ Ȯ���ϱ�\n");
			printf("4. ���������� �����ϱ�\n");
			printf("5. ���Ըӽ� �����\n");
			printf("6. 5�� ������ ������ ���� ���ϱ�\n");
			printf("7. ������ ������ ������ ����ϱ�\n");
			printf("8. ���ڿ� �ٲٱ�\n");
			printf("9. ����� ���� ����ϱ�\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				H01 h1 = new H01();
				h1.printAns();
				break;
			case 2:
				H02 h2 = new H02();
				h2.printNum();
				break;
			case 3:
				H03 h3 = new H03();
				h3.printLotto();
				break;
			case 4:
				H04 h4 = new H04();
				h4.printResult();
				break;
			case 5:
				H05 h5 = new H05();
				h5.printEnd();
				break;
			case 6:
				H06 h6 = new H06();
				h6.printAns();
				break;
			case 7:
				H07 h7 = new H07();
				h7.printOut();
				break;
			case 8:
				H08 h8 = new H08();
				h8.printOut();
				break;
			case 9:
				H09 h9 = new H09();
				h9.printOut();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}