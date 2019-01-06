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
		System.out.printf("지금까지의 총 매출금액은 %d원입니다.",getTotal());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("세 종류의 제품이 있습니다\n");
			System.out.print("(1. 가죽장갑 1만원, 2. 털장갑 6천원, 3. 비닐장갑 3천원)\n");
			
			for(int i = 0; i < 3; i++) {
				System.out.printf("%d번 제품은 몇개를 구입하실래요?",i+1);
				this.order[i] = s.nextInt();
			}
			
			
			if(order[0] == 0 && order[1] == 0 && order[2] == 0)
				break;
			
			setTotal();
			
			System.out.printf("판매금액은 %d원입니다.",getSale());
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
