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
		System.out.println("��������");
	}
	
	void input() {
		int dummy;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("����Ͻ� ������ ������ �Է��ϼ��� : ");
		this.coins = s.nextInt();
		
		while(coins != 0) {
			int count = 1;
			System.out.printf("���� %dȸ Start!! (�ƹ� ���ڳ� �Է��ϼ���)",count);
			dummy = s.nextInt();
			
			count++;
			coins--;
			
			randNum();
			System.out.printf("�����ִ� ������ %d���Դϴ�.\n",coins);
		}
	}
	
	void randNum() {
		Random generator = new Random();
		
		for(int i = 0; i < 3; i++)
			number[i] = generator.nextInt(9) + 1;
		
		System.out.print("���� ��� : ");
		for(int i = 0; i < 3; i++)
			System.out.printf("%d ",number[i]);
		
		correct();
	}

	void correct() {
		if(number[0] == number[1] || number[1] == number[2] || number[0] == number[2]) {
			System.out.print("----> ���� 2�� ��ġ... ���� 2�� ����\n");
			coins = coins+2;
		}
		else if(number[0] == number[1] && number[1] == number[2]) {
			System.out.print("----> ���� 3�� ��ġ... ���� 4�� ����\n");
			coins = coins+4;
		}
		else 
			System.out.print("----> ���Դϴ�... �ƽ�����..\n");
		
	}
}
