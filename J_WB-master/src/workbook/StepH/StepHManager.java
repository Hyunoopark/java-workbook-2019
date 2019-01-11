package workbook.StepH;

import java.util.Scanner;

public class StepHManager {
	public StepHManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 숫자 알아 맞추기\n");
			printf("2. 로또 번호 만들기\n");
			printf("3. 로또 번호 당첨 확인하기\n");
			printf("4. 가위바위보 게임하기\n");
			printf("5. 슬롯머신 만들기\n");
			printf("6. 5개 숫자의 제곱수 조합 구하기\n");
			printf("7. 문자의 개수와 나누어 출력하기\n");
			printf("8. 문자열 바꾸기\n");
			printf("9. 사용자 정보 출력하기\n");
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