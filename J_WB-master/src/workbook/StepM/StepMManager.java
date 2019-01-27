package workbook.StepM;

import java.io.IOException;
import java.util.Scanner;

public class StepMManager {
	public StepMManager() throws IOException {
		int menu;
		Scanner s = new Scanner(System.in);
		while(true) {
			printf("---------------------\n");
			printf("1. 메뉴판 저장하기\n");

			menu = s.nextInt();
			if(menu == 0) break;
			switch(menu) {
			case 1:
				M01 m1 = new M01();
				break;
			}
		}
		
	}
	void printf(String s){System.out.print(s);} 
}