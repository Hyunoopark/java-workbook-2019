package workbook.StepE;

import java.util.Scanner;

public class StepEManager {
	public StepEManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 입력한 숫자  크기의 정사각형 출력하기\n");
			printf("2. 입력한 숫자 크기의 높이를 갖는 우직각 삼각형 출력하기\n");
			printf("3. 입력한 숫자 크기의 높이를 갖는 이등변 삼각형 출력하기\n");
			printf("4. 홀수단 또는 짝수단의 구구단 출력하기\n");
			printf("5. 홀수단 또는 짝수단의 구구단을 열의 개수를 맞추어 출력하기\n");
			printf("6. 2차원 숫자 출력하기\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				E01 e1 = new E01();
				e1.printSqu();
				break;
			case 2:
				E02 e2 = new E02();
				e2.printTri();
				break;
			case 3:
				E03 e3 = new E03();
				e3.printTri();
				break;
			case 4:
				E04 e4 = new E04();
				e4.printGugu();
				break;
			case 5:
				E05 e5 = new E05();
				e5.printGugu();
				break;
			case 6:
				E06 e6 = new E06();
				e6.printNum();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}

