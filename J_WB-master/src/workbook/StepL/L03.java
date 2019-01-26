package workbook.StepL;

import java.util.*;
import java.text.*;

public class L03 {
	ArrayList<Restaurant> r = new ArrayList<Restaurant>();
	Scanner s = new Scanner(System.in);
	SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 hh:mm", Locale.KOREA);
	
	private int[] menu = {25000,15000,17000};
	
	public L03() {
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.print("1)주문 2)결제 3)리스트 4)종료 ==> ");
			int select = s.nextInt();
		
			switch(select) {
			case 1 :
				order();
				break;
			case 2 :
				showList();
				pay();
				break;
			case 3 :
				showList();
				System.out.println();
				break;
			case 4 :
				System.out.println("종료되었습니다." );
				System.exit(0);
			}
		}
	}
	
	void order() {
		int count[] = new int[3];
		
		System.out.print("손님 수를 입력하세요 : ");
		int guest = s.nextInt();
		System.out.print("스테이크, 스파게티, 파스타의 개수를 입력하세요 : ");
		for(int i = 0; i < count.length; i++)
			count[i] = s.nextInt();
		System.out.print("멤버쉽 카드가 있습니까?(Y:있음) : ");
		String yn = s.next();
		
		String time = f.format(new Date());
		System.out.println("들어오신 시간은 " + time + "입니다.");	
		System.out.println("총 금액은 " + calc(count,yn) + " 원 입니다. \n");
		
		Restaurant re = new Restaurant(guest,count[0],count[1],count[2],yn,time);
		r.add(re);
	}
	
	int calc(int[] count, String s) {
		int sum = 0;
		
		for(int i = 0; i < menu.length; i++) {
			sum += count[i] * menu[i];
		}
		
		if(s.equalsIgnoreCase("y"))
			sum = (int)(sum*0.9);
		
		if(sum > 100000)
			sum += (sum*0.1);
		else
			sum += (sum*0.07);
		
		sum += (sum*0.1);
		
		return sum;
	}
	
	void showList() {
		System.out.println("번호\t손님수\t스테이크\t스파게티\t파스타\t멤버쉽\t입장시간");
		for(int i = 0; i < r.size(); i++) {
			System.out.printf("[%d]",i+1);
			r.get(i).print();
		}
	}
	
	void pay() {
		System.out.print("==> 결제하실 번호를 입력하세요 : ");
		int n = s.nextInt();
		r.remove(n-1);
		System.out.println("==> 결제완료되었습니다.\n");
	}

}
