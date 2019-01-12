package workbook.StepI;

import java.util.Scanner;

public class I01 {
	private int choice;
	private int sum;
	private int menu_price[] = {15000,10000,7000,2000};
	
	public I01(){
		input();
	}
	
	public void printOut() {
		System.out.printf("총 주문 금액은 %d원입니다.",sum);
	}
	
	void input() {
		while(true) {
			ShowMenu();
			System.out.print("메뉴를 선택해주세요. (종료 : 5) ");
		
			Scanner s = new Scanner(System.in);
			this.choice = s.nextInt();
			
			if(choice == 5)
				break;
			
			System.out.printf("현재까지의 주문 금액은 %d원입니다. \n",price());
		}
		
	}
	
	void ShowMenu() {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	
	int price() {
		sum += menu_price[choice-1];
		
		return this.sum;
	}

}
