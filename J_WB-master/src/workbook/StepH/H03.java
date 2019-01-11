package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H03 {
	private int lotto_com[] = new int[6];
	private int lotto_user[] = new int[6];
	private int count;
	private int match_count = 0;
	
	public H03() {
		input();
	}
	
	public void printLotto() {
		Random generator = new Random();
		
		for(int i = 0; i < lotto_com.length; i++) {
			lotto_com[i] = generator.nextInt(45) + 1;
			for(count = 0; count < i; count++)
				if(lotto_com[count] == lotto_com[i])
					i--;
		}
		
		System.out.print("이번주의 로또 당첨 번호는 ");
		for(int i = 0; i < lotto_com.length; i++)
			System.out.printf("%d ",lotto_com[i]);
		System.out.print("입니다. \n");
		
		System.out.printf("일치하는 로또 번호는 %d개 입니다\n",correctNum());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < lotto_user.length; i++) {
			System.out.printf("원하는 %d번째 로또 숫자를 입력하세요 : ",i+1);
			this.lotto_user[i] = s.nextInt();
			
			for(count = 0; count < i; count++) {
				if(lotto_user[count] == lotto_user[i]) {
					System.out.println("잘못 입력하셨습니다");
					i--;
				}
			}
			
			if(lotto_user[i] > 45 || lotto_user[i] < 1 ) {
				System.out.println("잘못 입력하셨습니다");
				i--;
			}
		}		
	}
	
	int correctNum() {
		for(int i = 0; i < lotto_com.length; i++) {
			for(count = 0; count < lotto_com.length; count++)
				if(lotto_user[count] == lotto_com[i])
				match_count ++;
		}
			
			return this.match_count;
	}
}


