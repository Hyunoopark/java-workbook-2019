package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 나이계산\n");
			printf("2. 온도변환\n");
			printf("3. 직사각형 넓이계산\n");
			printf("4. 아파트 평형 계산\n");
			printf("5. 날짜계산\n");
			printf("6. 점수계산\n");
			printf("7. 파일 용량 계산\n");
			printf("=>원하는 메뉴는?(0:exit) :");
			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1: 				
				YearToAge yta = new YearToAge();
				yta.printAge();
				break;
			case 2:
				CelToFah ctf = new CelToFah();
				ctf.printCel();
				break;
			case 3:
				RecArea ra = new RecArea();
				ra.printArea();
				break;
			case 4:
				AreaToP atp = new AreaToP();
				atp.printPyung();
				break;
			case 5:
				DayToSec dts = new DayToSec();
				dts.printSec();
				break;
			case 6:
				ScoreSumAvg ssa = new ScoreSumAvg();
				ssa.printScore();
				break;
			case 7:
				fileCal fc = new fileCal();
				fc.printFile();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}
