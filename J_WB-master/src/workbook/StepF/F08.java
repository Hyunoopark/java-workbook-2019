package workbook.StepF;

import java.util.Scanner;

public class F08 {
	private int number[] = new int[10];
	private int newnum;
	private int count = 0;
	private boolean dup;
	
	public F08() {
		input();
	}
	
	public void printNum() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d��° ���ڴ� %d�Դϴ� \n",i+1,number[i]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("1���� 100������ ���ڸ� �Է��Ͻÿ� \n");
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d��° ���ڸ� �Է��Ͻÿ� : ",i+1);
			this.newnum = s.nextInt();
			number[i] = newnum;
			dupli();
			
			if(dup==true) {
				System.out.print("�߸� �Է��Ͽ����ϴ�. �ٽ� �Է��ϼ��� \n");
				i--;
			}
			else
				count++;
		}
	}
	
	void dupli() {
		for(int i = 0; i < count; i++) {
			if(number[count] == number[i]) {
				dup = true;
				break;
			}
			else 
				dup = false;
		}
	}

}
