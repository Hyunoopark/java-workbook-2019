package workbook.StepI;

import java.util.Scanner;

public class I04 {
	private int choice;
	private int price;
	private int sum;
	
	public I04(){
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
			
			if(SelectMenu() == -1)
				break;
			
			System.out.printf("현재까지의 주문 금액은 %d원입니다. \n",sum());
		}
		
	}
	
	void ShowMenu() {
		System.out.println("1. 피자(15,000원) 2. 스파게티(10,000원) 3. 샐러드(7,000원) 4. 음료수(2,000원)");
	}
	
	int SelectMenu() {
		if(choice == 1)
			price = 15000;
		else if(choice == 2)
			price = 10000;
		else if(choice == 3)
			price = 7000;
		else if(choice == 4)
			price = 2000;
		else if(choice == 5)
			price = -1;
		
		return this.price;
	}
	
	int sum() {
		sum += SelectMenu();
		
		return this.sum;
	}
}
