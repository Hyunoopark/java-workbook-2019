package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H05 {
	private int coins;
	private int number[] = new int[3];
	
	public H05() {
		input();
	}
	
	public void printEnd() {
		System.out.println("게임종료");
	}
	
	void input() {
		int dummy;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("사용하실 코인의 개수를 입력하세요 : ");
		this.coins = s.nextInt();
		
		while(coins != 0) {
			int count = 1;
			System.out.printf("게임 %d회 Start!! (아무 숫자나 입력하세요)",count);
			dummy = s.nextInt();
			
			count++;
			coins--;
			
			randNum();
			System.out.printf("남아있는 코인은 %d개입니다.\n",coins);
		}
	}
	
	void randNum() {
		Random generator = new Random();
		
		for(int i = 0; i < 3; i++)
			number[i] = generator.nextInt(9) + 1;
		
		System.out.print("게임 결과 : ");
		for(int i = 0; i < 3; i++)
			System.out.printf("%d ",number[i]);
		
		correct();
	}

	void correct() {
		if(number[0] == number[1] || number[1] == number[2] || number[0] == number[2]) {
			System.out.print("----> 숫자 2개 일치... 코인 2개 증정\n");
			coins = coins+2;
		}
		else if(number[0] == number[1] && number[1] == number[2]) {
			System.out.print("----> 숫자 3개 일치... 코인 4개 증정\n");
			coins = coins+4;
		}
		else 
			System.out.print("----> 꽝입니다... 아쉽군요..\n");
		
	}
}
