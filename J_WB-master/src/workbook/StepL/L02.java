package workbook.StepL;

import java.text.*;
import java.util.*;

public class L02 {
	ArrayList<Parking> p = new ArrayList<Parking>();
	Scanner s = new Scanner(System.in);
	SimpleDateFormat f = new SimpleDateFormat("YYYY�� MM�� dd�� hh�� mm�� ss��", Locale.KOREA);
	
	private int count = 0;
	private int car_space;
	String enter_t;
	
	public L02() throws ParseException {
		System.out.print("������ �� �ִ� ���� ������ �Է��ϼ��� : ");
		car_space = s.nextInt();
		System.out.println("�� " + car_space + "�븦 ������ �� �ֽ��ϴ�\n");
		while(true) {
			System.out.println("------------------------------------");
			System.out.print("1)���� 2)���� 3)����Ʈ 4)���� �Ѱ��� 5)�����ܿ����� 6)���� ==> ");
			int select = s.nextInt();
		
			switch(select) {
			case 1 :
				if(count == 10)
					System.out.println("�ڸ��� �� á���ϴ�");
				else {
					enter();
					System.out.printf("[%d��] %s ���� �Ǿ����ϴ�. \n",count+1,enter_t);
					count++;
					car_space--;
				}
				break;
			case 2 :
				if(count == 0)
					System.out.println("������ ���� �����ϴ�");
				else {
					out();
					count--;
					car_space++;
				}
				break;
			case 3 :
				showList();
				System.out.println(car_space + "�� ��������");
				break;
			case 4 :
				System.out.println("��" + count + "�밡 �����Ǿ� �ֽ��ϴ�.");
				showList();
				break;
			case 5 :
				System.out.println("���� ������ �ڸ��� " + car_space + "�� �Դϴ�.");
				break;
			case 6 :
				System.out.println("����Ǿ����ϴ�");
				System.exit(0);
			}
		}
	}
	
	void enter() {
		System.out.println("������ ���� ��ȣ�� ������ �Է��ϼ��� : ");
		int num = s.nextInt();
		String car = s.next();
		enter_t = f.format(new Date());
		Parking c = new Parking(num,car,enter_t);
		p.add(c);
	}
	
	void out() throws ParseException {
		showList();
		System.out.println("������ ���� ��ȣ�� �Է��ϼ��� : ");
		int num = s.nextInt();
		
		Date a = f.parse(p.get(num-1).time);
		Date b = f.parse(f.format(new Date()));
		long diff = a.getTime() - b.getTime();
		
		p.remove(p.get(num-1));
		diff = diff / 60000;
		
		System.out.println("==> ���� �ð��� " + f.format(new Date()) + "�̹Ƿ� �����ݾ��� " + (diff/10)*500 + "�� �Դϴ�." );
		System.out.println("==> ����Ǿ����ϴ�.");
	}
	
	void showList() {
		for(int i = 0; i < p.size(); i++) {
			System.out.printf("[%d��] ",i+1);
			p.get(i).print();
		}
	}
}
