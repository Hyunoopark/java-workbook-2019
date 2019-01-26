package workbook.StepL;

import java.util.*;
import java.text.*;

public class L03 {
	ArrayList<Restaurant> r = new ArrayList<Restaurant>();
	Scanner s = new Scanner(System.in);
	SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� dd�� hh:mm", Locale.KOREA);
	
	private int[] menu = {25000,15000,17000};
	
	public L03() {
		while(true) {
			System.out.println("----------------------------------------------");
			System.out.print("1)�ֹ� 2)���� 3)����Ʈ 4)���� ==> ");
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
				System.out.println("����Ǿ����ϴ�." );
				System.exit(0);
			}
		}
	}
	
	void order() {
		int count[] = new int[3];
		
		System.out.print("�մ� ���� �Է��ϼ��� : ");
		int guest = s.nextInt();
		System.out.print("������ũ, ���İ�Ƽ, �Ľ�Ÿ�� ������ �Է��ϼ��� : ");
		for(int i = 0; i < count.length; i++)
			count[i] = s.nextInt();
		System.out.print("����� ī�尡 �ֽ��ϱ�?(Y:����) : ");
		String yn = s.next();
		
		String time = f.format(new Date());
		System.out.println("������ �ð��� " + time + "�Դϴ�.");	
		System.out.println("�� �ݾ��� " + calc(count,yn) + " �� �Դϴ�. \n");
		
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
		System.out.println("��ȣ\t�մԼ�\t������ũ\t���İ�Ƽ\t�Ľ�Ÿ\t�����\t����ð�");
		for(int i = 0; i < r.size(); i++) {
			System.out.printf("[%d]",i+1);
			r.get(i).print();
		}
	}
	
	void pay() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int n = s.nextInt();
		r.remove(n-1);
		System.out.println("==> �����Ϸ�Ǿ����ϴ�.\n");
	}

}
