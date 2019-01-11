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
		
		System.out.print("�̹����� �ζ� ��÷ ��ȣ�� ");
		for(int i = 0; i < lotto_com.length; i++)
			System.out.printf("%d ",lotto_com[i]);
		System.out.print("�Դϴ�. \n");
		
		System.out.printf("��ġ�ϴ� �ζ� ��ȣ�� %d�� �Դϴ�\n",correctNum());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < lotto_user.length; i++) {
			System.out.printf("���ϴ� %d��° �ζ� ���ڸ� �Է��ϼ��� : ",i+1);
			this.lotto_user[i] = s.nextInt();
			
			for(count = 0; count < i; count++) {
				if(lotto_user[count] == lotto_user[i]) {
					System.out.println("�߸� �Է��ϼ̽��ϴ�");
					i--;
				}
			}
			
			if(lotto_user[i] > 45 || lotto_user[i] < 1 ) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
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


