package workbook.StepM;

import java.util.Scanner;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class M01 {
	ArrayList<Menu> m = new ArrayList<Menu>();
	Scanner s = new Scanner(System.in);
	
	public M01() throws IOException {
		select();
	}
	
	void select() throws IOException {
		while(true) {
			System.out.println("1)�߰� 2)���� 3)���� 4)����Ʈ 5)�Ѱ��� 6)���� ==> ");
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
				save();
				System.out.println("����Ǿ����ϴ�.\n");
				break;
			}	
			else
				System.out.println("�߸��Է��ϼ̽��ϴ�.\n");
		}
	}
	
	void add() {
		System.out.print("�޴��� �޴���, ������, ������ �Է��Ͻÿ� : ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();
		Menu menu = new Menu(name,origin,price);
		m.add(menu);
		System.out.println("�ԷµǾ����ϴ�. \n");
	}
	
	void revise() {
		showList();
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int num = s.nextInt();
		System.out.print("�޴��� �޴���, ������, ������ �Է��Ͻÿ� : ");
		String name = s.next();
		String origin = s.next();
		int price = s.nextInt();	
		m.set(num-1, new Menu(name,origin,price));
		System.out.println("�����Ǿ����ϴ�.\n");
	}
	
	void showList() {
		System.out.println("�޴���ȣ\t�޴��̸�\t������\t1�κа���");
		for(int i = 0; i < m.size(); i++){
			System.out.print((i+1) + "\t");
			m.get(i).print();
		}
		System.out.println();
	}
	
	void delete() {
		showList();
		System.out.print("==> ������ ��ȣ�� �Է��ϼ��� : ");
		int num = s.nextInt();
		m.remove(m.get(num-1));
		System.out.print("�����Ǿ����ϴ�.\n");
	}
	
	void getCount() {
		System.out.println(m.size() + "���� �޴��� ��ϵǾ� �ֽ��ϴ�. \n");
	}
	
	void save() throws IOException {
		FileWriter f = new FileWriter("list.txt");
		f.write("�޴���ȣ\t�޴��̸�\t������\t1�κа���\n");
		f.write("------------------------------------------");
		for(int i = 0; i < m.size(); i++)
			f.write((i+1) + "\t" + m.get(i).getName() + "\t" + m.get(i).getOrigin() + "\t" + m.get(i).getPrice() );
	}
}
