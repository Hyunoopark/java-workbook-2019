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
