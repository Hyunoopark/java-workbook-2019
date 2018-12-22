package workbook.StepB;

import java.util.Scanner;

public class StepBManager {
	public StepBManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산 및 미성년자 판정\n");
			printf("2. 온도 상호 변환\n");
			printf("3. 직사각형 넓이계산 및 정사각형 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 다양한 조건 판정\n");
			printf("9. 비만 판정\n");
			printf("=>원하는 메뉴는?(0:exit) :");
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
