package workbook.StepF;

import java.util.Scanner;

public class F07 {
	private int number[][] = new int[5][3];
	private int newnum;
	private int floor_total[] = new int[5];
	private int line_total[] = new int[3];
	private int total;
	private int ho;
	
	public F07() {
		input();
	}
	
	public void printTotal() {
		for(int i = 0; i < 5; i++)
			System.out.printf("%d���� ��� �����ڴ� ��� %d�� �Դϴ�. \n",i+1,floor_total[i]);
		System.out.println();
		
		for(int j = 0; j < 3; j++)
			System.out.printf("%dȣ ���ο� ��� �����ڴ� ��� %d�� �Դϴ�. \n",j+1,line_total[j]);
		System.out.println();
		
		System.out.printf("�� ����Ʈ�� ��� �����ڴ� ��� %d�� �Դϴ�. \n",total);
	}
	
	void getTotal() {
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				floor_total[i] += number[i][j];
				line_total[j] += number[i][j];
				total += number[i][j];
			}
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				ho = 100*(i+1) + (j+1);
				System.out.printf("%dȣ�� ��� �ִ� ����� ���ڸ� �Է��Ͻÿ� : ",ho);
				this.newnum = s.nextInt();
			
				number[i][j] =  newnum;
			}
		}
		
		getTotal();
	}
}
