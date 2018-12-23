package workbook.StepC;

import java.util.Scanner;

public class StepCManager {
	public StepCManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산 및 연령대 판정\n");
			printf("2. 물의 온도 구간 판정\n");
			printf("3. 직사각형 형태 판정\n");
			printf("4. 아파트 평형 계산 및 종류 판정\n");
			printf("5. 연중날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 전송 시간 계산\n");
			printf("8. 3개의 수 중 최댓값과 최솟값 구하기\n");
			printf("9. 소득세 계산\n");
			printf("10. 간단한 사칙연산 계산기\n");
			printf("11. 윤년 판정하기\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				C01 c1 = new C01();
				c1.printAG();
				break;
			case 2:
				C02 c2 = new C02();
				c2.printWater();
				break;
			case 3:
				C03 c3 = new C03();
				c3.printRec();
				break;
			case 4:
				C04 c4 = new C04();
				c4.printArea();
				break;
			case 5:
				C05 c5 = new C05();
				c5.printDay();
				break;
			case 6:
				C06 c6 = new C06();
				c6.printScore();
				break;
			case 7:
				C07 c7 = new C07();
				c7.printFT();
				break;
			case 8:
				C08 c8 = new C08();
				c8.printNum();
				break;
			case 9:
				C09 c9 = new C09();
				c9.printTax();
				break;
			case 10:
				C10 c10 = new C10();
				c10.printResult();
				break;
			case 11:
				C11 c11 = new C11();
				c11.printYun();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
