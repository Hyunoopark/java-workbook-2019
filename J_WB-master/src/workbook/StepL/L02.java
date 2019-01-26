package workbook.StepL;

import java.text.*;
import java.util.*;

public class L02 {
	ArrayList<Parking> p = new ArrayList<Parking>();
	Scanner s = new Scanner(System.in);
	SimpleDateFormat f = new SimpleDateFormat("YYYY년 MM월 dd일 hh시 mm분 ss초", Locale.KOREA);
	
	private int count = 0;
	private int car_space;
	String enter_t;
	
	public L02() throws ParseException {
		System.out.print("주차할 수 있는 차의 개수를 입력하세요 : ");
		car_space = s.nextInt();
		System.out.println("총 " + car_space + "대를 주차할 수 있습니다\n");
		while(true) {
			System.out.println("------------------------------------");
			System.out.print("1)입차 2)출차 3)리스트 4)입차 총개수 5)주차잔여개수 6)종료 ==> ");
			int select = s.nextInt();
		
			switch(select) {
			case 1 :
				if(count == 10)
					System.out.println("자리가 꽉 찼습니다");
				else {
					enter();
					System.out.printf("[%d번] %s 입차 되었습니다. \n",count+1,enter_t);
					count++;
					car_space--;
				}
				break;
			case 2 :
				if(count == 0)
					System.out.println("주차된 차가 없습니다");
				else {
					out();
					count--;
					car_space++;
				}
				break;
			case 3 :
				showList();
				System.out.println(car_space + "대 주차가능");
				break;
			case 4 :
				System.out.println("총" + count + "대가 주차되어 있습니다.");
				showList();
				break;
			case 5 :
				System.out.println("주차 가능한 자리는 " + car_space + "대 입니다.");
				break;
			case 6 :
				System.out.println("종료되었습니다");
				System.exit(0);
			}
		}
	}
	
	void enter() {
		System.out.println("입차할 차의 번호와 차종을 입력하세요 : ");
		int num = s.nextInt();
		String car = s.next();
		enter_t = f.format(new Date());
		Parking c = new Parking(num,car,enter_t);
		p.add(c);
	}
	
	void out() throws ParseException {
		showList();
		System.out.println("출차할 차의 번호를 입력하세요 : ");
		int num = s.nextInt();
		
		Date a = f.parse(p.get(num-1).time);
		Date b = f.parse(f.format(new Date()));
		long diff = a.getTime() - b.getTime();
		
		p.remove(p.get(num-1));
		diff = diff / 60000;
		
		System.out.println("==> 현재 시간은 " + f.format(new Date()) + "이므로 주차금액은 " + (diff/10)*500 + "원 입니다." );
		System.out.println("==> 정산되었습니다.");
	}
	
	void showList() {
		for(int i = 0; i < p.size(); i++) {
			System.out.printf("[%d번] ",i+1);
			p.get(i).print();
		}
	}
}
