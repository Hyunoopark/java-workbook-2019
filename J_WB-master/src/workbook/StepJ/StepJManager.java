package workbook.StepJ;
import java.util.Scanner;

public class StepJManager {
	public StepJManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이 계산 및 연령대 판정\n");
			printf("2. 심사점수 계산\n");
			printf("3. 물의 온도 구간 개수 판정\n");
			printf("4. 연중 날짜 계산 메소드를 이용한 날짜 간격 계산기\n");
			printf("5. 주차 관리 시스템\n");
			printf("6. 피보나치 수 구하기\n");
			printf("7. 2의 제곱수 구하기\n");
			printf("8. Ackermann 수 구하기\n");
			printf("9. pow() 메소드 만들기\n");
			printf("10. 피보나치 수열로 황금비율 구하기\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				J01 j1 = new J01();
				j1.printAll();
				break;
			case 2:
				J02 j2 = new J02();
				j2.printScore();
				break;
			case 3:
				J03 j3 = new J03();
				j3.printDegree();
				break;
			case 4:
				J04 j4 = new J04();
				j4.printDay();
				break;
			case 5:
				J05 j5 = new J05();
				j5.printFee();
				break;
			case 6:
				J06 j6 = new J06();
				break;
			case 7:
				J07 j7 = new J07();
				break;
			case 8:
				J08 j8 = new J08();
				j8.printAck();
			case 9:
				J09 j9 = new J09();
				j9.printPow();
			case 10:
				J10 j10 = new J10();
				j10.printFib();
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}



