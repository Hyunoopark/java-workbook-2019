package workbook.StepL;

import java.text.ParseException;
import java.util.Scanner;

public class StepLManager {
	public StepLManager() throws ParseException {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. �޴��� �����ϱ�\n");
			printf("2. ������ ����� ����\n");
			printf("3. �Ĵ� �ֹ� ����\n");
			printf("4. �л� ���� ����\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				L01 l1 = new L01();
				break;
			case 2:
				L02 l2 = new L02();
				break;
			case 3:
				L03 l3 = new L03();
				break;
			case 4:
				L04 l4 = new L04();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}