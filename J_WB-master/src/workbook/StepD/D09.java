package workbook.StepD;

import java.util.Scanner;

public class D09 {
	private int dan;
	
	public D09() {
		input();
	}
	
	public void guguDan() {
		for(int i = 1; i < 10; i++)
			System.out.printf("%d X %d = %d \n",dan,i,dan*i);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("����ϰ� ���� �������� �� ���� �Է��Ͻÿ�(2-9): ");
			this.dan = s.nextInt();
			
			if(2<=dan && dan<=9)
				break;
			else
				System.out.print("�߸� �Է��Ͽ����ϴ�. \n");
		}
	}

}
