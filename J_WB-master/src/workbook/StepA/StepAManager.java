package workbook.StepA;

import java.util.Scanner;

public class StepAManager {
	public StepAManager() {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. ���̰��\n");
			printf("2. �µ���ȯ\n");
			printf("3. ���簢�� ���̰��\n");
			printf("4. ����Ʈ ���� ���\n");
			printf("5. ��¥���\n");
			printf("6. �������\n");
			printf("7. ���� �뷮 ���\n");
			printf("=>���ϴ� �޴���?(0:exit) :");
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
