package workbook.StepH;

import java.util.Scanner;
import java.util.Random;

public class H01 {
	private int answer;
	private int number_try;
	private int count = 1;
	
	public H01() {
		input();
	}
	
	public void printAns() {
		System.out.println(count + "������ ���ڸ� ���߼̽��ϴ�.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		Random generator = new Random();
		
		answer = generator.nextInt(99) + 1;
		
		while(true) {
			System.out.print("1���� 100������ ���� �ϳ��� ���纸���� : ");
			this.number_try = s.nextInt();
			
			if(number_try == answer)
				break;
			
			getHint();
			count ++;
		}	
	}
	
	void getHint() {
		if(number_try < answer)
			System.out.println("�� �� ū ���Դϴ�.");
		else if(number_try > answer)
			System.out.println("�� �� ���� ���Դϴ�.");
	}

}
