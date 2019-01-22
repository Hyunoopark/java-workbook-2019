package workbook.StepK;

import java.util.Scanner;

public class MenuPan {
	private int num[] = new int[100];
	private int count;
	private String name[] = new String[100];
	private String country[] = new String[100];
	private int price[] = new int[100];
	
	public MenuPan(int c) {
		count = c;
	}

	public void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < count; i++) {
			if(count == 1)
				System.out.print("메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오 : ");
			else
				System.out.print((i+1) + "번 메뉴의 번호, 메뉴명, 원산지, 가격을 입력하시오 : ");
			this.num[i] = s.nextInt();
			this.name[i] = s.next();
			this.country[i] = s.next();
			this.price[i] = s.nextInt();
		}
	}
	
	public void print() { 
		System.out.println("=====================================");
		System.out.println("메뉴번호\t메뉴이름\t원산지\t1인분가격");
		for(int i = 0; i < count; i++)
			System.out.println(num[i]+"\t"+name[i]+"\t"+country[i]+"\t"+price[i]);
	}
}
