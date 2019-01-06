package workbook.StepG;

import java.util.Scanner;

public class G06 {
	private int order[] = {0,0,0};
	private int sale;
	private int total_sale;
	private int total_order[] = {0,0,0};
	private int price[] = {10000,6000,3000};
	
	public G06() {
		input();
	}
	
	void printTotal() {
		System.out.printf("���ݱ����� �� ����ݾ��� %d���Դϴ�.",getTotal());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("�� ������ ��ǰ�� �ֽ��ϴ�\n");
			System.out.print("(1. �����尩 1����, 2. ���尩 6õ��, 3. ����尩 3õ��)\n");
			
			for(int i = 0; i < 3; i++) {
				System.out.printf("%d�� ��ǰ�� ��� �����ϽǷ���?",i+1);
				this.order[i] = s.nextInt();
			}
			
			
			if(order[0] == 0 && order[1] == 0 && order[2] == 0)
				break;
			
			setTotal();
			
			System.out.printf("�Ǹűݾ��� %d���Դϴ�.",getSale());
		}
	}
	
	int getSale() {
		sale = 0;
		for(int i = 0; i < 3; i++)
			sale += order[i] * price[i];
		
		return this.sale;
	}
	
	void setTotal() {
		for(int i = 0; i < 3; i++)
			total_order[i] += order[i];
	}
	
	int getTotal() {
		for(int i = 0; i < 3; i++)
			total_sale += total_order[i] * price[i];
		
		return this.total_sale; 
	}

}
