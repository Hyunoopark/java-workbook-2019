package workbook.StepG;

import java.util.Scanner;

public class StepGManager {
	public StepGManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 점수 계산\n");
			printf("4. 부동산 중개 수수료 계산기\n");
			printf("5. PC방 이용료 계산기\n");
			printf("6. 쇼핑몰 매출 계산기\n");
			printf("7. 놀이공원 매표소\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				G01 g1 = new G01();
				g1.printAll();
				break;
			case 2:
				G02 g2 = new G02();
				g2.printWD();
				break;
			case 3:
				G03 g3 = new G03();
				g3.printScore();
				break;
			case 4:
				G04 g4 = new G04();
				g4.printFee();
				break;
			case 5:
				G05 g5 = new G05();
				g5.printCharge();
				break;
			case 6:
				G06 g6 = new G06();
				g6.printTotal();
				break;
			case 7:
				G07 g7 = new G07();
				g7.printTotal();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}


