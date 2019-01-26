package workbook.StepL;

import java.util.*;
import java.text.*;

public class L04 {
	Scanner s = new Scanner(System.in);
	ArrayList<StudentInfo> st = new ArrayList<StudentInfo>();
	
	private int count = 0;
	private String stu_name;
	private int stu_id;
	private String stu_gen;
	private String stu_add;
	private String stu_phone;
	private String yn;
	
	public L04() {
		while(true) {
			System.out.println("--------------------------------------------------------------");
			System.out.print("1)�л���� 2)�������� 3)���� 4)����Ʈ 5)�̸��˻� 6)���л�����Ʈ 7)�ּҰ˻� 8)���� ==> ");
			int select = s.nextInt();
			
			switch(select) {
			case 1 :
				register();
				StudentInfo student = new StudentInfo(stu_name,stu_id,stu_gen,stu_add,stu_phone,yn);
				st.add(student);
				count++;
				System.out.println("�� " + count +"���� ��ϵǾ����ϴ�.");
				break;
			case 2 :
				st.set(edit()-1,new StudentInfo(stu_name,stu_id,stu_gen,stu_add,stu_phone,yn));
				System.out.println("�����Ǿ����ϴ�.");
				break;
			case 3 :
				showList();
				delete();
				count--;
				break;
			case 4 :
				showList();
				System.out.println("�� " + count +"���� ��ϵǾ����ϴ�.");
				break;
			case 5 :
				searchName();
				break;
			case 6 :
				returnStudent();
				break;
			case 7 :
				searchAddress();
				break;
			case 8 :
				System.out.println("����Ǿ����ϴ�." );
				System.exit(0);
			}
		}
	}
	
	void register() {
		System.out.print("�л��̸�, �й�, ������ �Է��ϼ��� : ");
		this.stu_name = s.next();
		this.stu_id = s.nextInt();
		this.stu_gen = s.next();
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		s.nextLine();
		this.stu_add = s.nextLine();
		System.out.print("��ȭ��ȣ�� �Է��ϼ��� : ");
		this.stu_phone = s.next();
		System.out.print("���л��Դϱ�?(Y/N) : ");
		this.yn = s.next();
	}
	
	void showList() {
		System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�");
		for(int i = 0; i < st.size(); i++) {
			System.out.print((i+1)+"\t");
			st.get(i).print();
		}
	}
	
	void delete() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ��� : ");
		int num = s.nextInt();
		System.out.print("������ �����Ͻðڽ��ϱ�?(Y/N) : ");
		String str = s.next();
		
		if(str.equalsIgnoreCase("y")) {
			st.remove(num-1);
			System.out.println("�����Ǿ����ϴ�.");
		}
		else if(str.equalsIgnoreCase("n"))
			System.out.println("��ҵǾ����ϴ�.");
		else
			System.out.println("�߸��Է��ϼ̽��ϴ�.");
	
	}
	
	int edit() {
		System.out.print("==> �����Ͻ� ��ȣ�� �Է��ϼ���: ");
		int choice = s.nextInt();
		register();
		
		return choice;
	}
	
	void searchName() {
		System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		String str = s.next();
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getName().indexOf(str) != -1) {
				System.out.println("�˻��Ǿ����ϴ�.\n");
				System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
			else 
				System.out.println("ã�� ���߽��ϴ�.");
		}
	}
	
	void searchAddress() {
		System.out.print("�˻��Ͻ� �̸��� �Է��ϼ��� : ");
		String str = s.next();
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getAddress().indexOf(str) != -1) {
				System.out.println("�˻��Ǿ����ϴ�.\n");
				System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
		}
		
		System.out.println("ã�� ���߽��ϴ�.");
	}
	
	void returnStudent() {
		int c = 0;
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getCheckReturn().equals("Y")) {
				c++;
				System.out.println("�˻��Ǿ����ϴ�.\n");
				System.out.println("��ȣ\t�̸�\t�й�\t\t����\t�ּ�\t\t��ȭ��ȣ\t\t���л�");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
		}
		System.out.println("���л��� " + c + "���Դϴ�.");
	}

}
