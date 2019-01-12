package workbook.StepI;

import java.util.Scanner;

public class I07 {
	private int menu;
	private String yn;
	private int count;
	private int price;
	private int total_price;
	
	public I07() {
		input();
	}
	
	public void printAns() {
		System.out.printf("%d개의 음료를 선택하여 총 %d원입니다\n",count,total_price);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.콜라(700원) 2.원두커피(300원) 3.레몬주스(1000원) \n");
			System.out.print("4.홍차(500원) 5.코코아(600원)\n");
			System.out.print("메뉴를 선택해주세요 : ");
			this.menu = s.nextInt();
			System.out.print("더 필요하십니까?(Y/N) : ");
			this.yn = s.next();
			
			count++;
			
			if(yn.equalsIgnoreCase("n")) {
				TotalPrice();
				break;
			}
			else if(yn.equalsIgnoreCase("y"))
				TotalPrice();
			else {
				System.out.println("잘못입력하셨습니다");
				count--;
			}
	
		}
	}
	
	int SelectCan() {
		if(menu == 1)
			price = 700;
		else if(menu == 2)
			price = 300;
		else if(menu == 3)
			price = 1000;
		else if(menu == 4)
			price = 500;
		else if(menu == 5)
			price = 600;
		
		return this.price;
	}
	
	void TotalPrice() {
		total_price += SelectCan();
	}
}
