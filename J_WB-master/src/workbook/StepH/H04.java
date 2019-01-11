package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H04 {
	private int com_finger;
	private int my_finger;
	private int score[][] = new int[2][3];
	private String user[] = {"컴퓨터", "사용자"};
	private String win[] = {"이긴", "진", "비긴"};
	
	public H04() {
		input();
	}
	
	public void printResult() {
		for(int i = 0; i < 2; i++) {
			System.out.printf("%s : ",user[i]);
			for(int j = 0; j < 3; j++) {
				System.out.printf("%s 횟수는 %d, ",win[j],score[i][j]);
			}
			System.out.println("입니다");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위(1), 바위(2), 보(3)를 입력하세요 : ");
			this.my_finger = s.nextInt();
			
			if(my_finger > 3 || my_finger < 0)
				System.out.println("잘못 입력하셨습니다");
			else if(my_finger == 0)
				break;
			else 
				comFinger();
		}
	}
	
	void comFinger() {
		Random generator = new Random();
		
		com_finger = generator.nextInt(3) + 1;
		
		if(com_finger == 1)
			System.out.print("컴퓨터가 낸 것은 가위입니다. -----> ");
		else if(com_finger == 2)
			System.out.print("컴퓨터가 낸 것은 바위입니다. -----> ");
		else if(com_finger == 3)
			System.out.print("컴퓨터가 낸 것은 보입니다. -----> ");
		
		whoWin();
	}
	
	void whoWin() {
		if(com_finger%3 > my_finger%3) {
			System.out.print("컴퓨터 승 \n");
			score[0][0]++;
			score[1][1]++;
		}
		else if(my_finger%3 > com_finger%3) {
			System.out.print("사용자 승 \n");
			score[1][0]++;
			score[0][1]++;
		}
		else if(my_finger%3 == com_finger%3) {
			System.out.print("비김~\n");
			score[0][2]++;
			score[1][2]++;
		}
		
	}

}
