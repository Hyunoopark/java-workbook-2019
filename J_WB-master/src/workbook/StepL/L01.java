package workbook.StepL;

import java.util.Scanner;
import java.util.*;

public class L01 {
	ArrayList<Menupan> m = new ArrayList<Menupan>();
	Scanner s = new Scanner(System.in);
	
	public L01() {
		select();
	}
	
	void select() {
		while(true) {
			System.out.println("1)추가 2)수정 3)삭제 4)리스트 5)총개수 6)종료 ==> ");
			int choice = s.nextInt();
			System.out.println("-------------------------------------------------");
			
			if(choice == 1)
				add();
			else if(choice == 2)
				revise();
			else if(choice == 3)
				delete();
			else if(choice == 4)
				showList();
			else if(choice == 5)
				getCount();
			else if(choice == 6) {
				System.out.println("종료되었습니다.\n");
				break;
			}	
			else
				System.out.println("잘못입력하셨습니다.\n");
		}
	}
	
	void add() {
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오 : ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();
		Menupan menu = new Menupan(name,origin,price);
		m.add(menu);
		System.out.println("입력되었습니다. \n");
	}
	
	void revise() {
		showList();
		System.out.print("==> 수정할 번호를 입력하세요 : ");
		int num = s.nextInt();
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오 : ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();	
		m.set(num-1, new Menupan(name,origin,price));
		System.out.println("수정되었습니다.\n");
	}
	
	void showList() {
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		for(int i = 0; i < m.size(); i++){
			System.out.print((i+1) + "\t");
			m.get(i).print();
		}
		System.out.println();
	}
	
	void delete() {
		showList();
		System.out.print("==> 삭제할 번호를 입력하세요 : ");
		int num = s.nextInt();
		m.remove(m.get(num-1));
		System.out.print("삭제되었습니다.\n");
	}
	
	void getCount() {
		System.out.println(m.size() + "개의 메뉴가 등록되어 있습니다. \n");
	}
}

