package workbook.StepF;

import java.util.Scanner;

public class StepFManager {
	public StepFManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 두번째로 큰 수의 순서 찾기\n");
			printf("2. 심사 점수 계산\n");
			printf("3. 5명의 국,영,수 3과목 점수의 과목별 총점, 평균값 구하기\n");
			printf("4. 5명의 국,영,수 3과목 점수의 학생별 총점, 평균값 구하기\n");
			printf("5. 비만 판정\n");
			printf("6. 5층 아파트의 거주자 숫자 구하기\n");
			printf("7. 5층 아파트의 층별, 호수별 거주자 숫자 구하기\n");
			printf("8. 겹치지 않는 숫자 10개 입력 받기\n");
			printf("9. 배열을 이용한 연중 날짜 계산\n");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				F01 f1 = new F01();
				f1.printSMax();
				break;
			case 2:
				F02 f2 = new F02();
				f2.printScore();
				break;
			case 3:
				F03 f3 = new F03();
				f3.printScore();
				break;
			case 4:
				F04 f4 = new F04();
				f4.printScore();
				break;
			case 5:
				F05 f5 = new F05();
				f5.getBmi();
				break;
			case 6:
				F06 f6 = new F06();
				f6.getTotal();
				break;
			case 7:
				F07 f7 = new F07();
				f7.printTotal();
				break;
			case 8:
				F08 f8 = new F08();
				f8.printNum();
				break;
			case 9:
				F09 f9 = new F09();
				f9.printDay();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}

