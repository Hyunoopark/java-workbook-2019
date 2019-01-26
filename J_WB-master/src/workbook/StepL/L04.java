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
			System.out.print("1)학생등록 2)정보수정 3)삭제 4)리스트 5)이름검색 6)복학생리스트 7)주소검색 8)종료 ==> ");
			int select = s.nextInt();
			
			switch(select) {
			case 1 :
				register();
				StudentInfo student = new StudentInfo(stu_name,stu_id,stu_gen,stu_add,stu_phone,yn);
				st.add(student);
				count++;
				System.out.println("총 " + count +"명이 등록되었습니다.");
				break;
			case 2 :
				st.set(edit()-1,new StudentInfo(stu_name,stu_id,stu_gen,stu_add,stu_phone,yn));
				System.out.println("수정되었습니다.");
				break;
			case 3 :
				showList();
				delete();
				count--;
				break;
			case 4 :
				showList();
				System.out.println("총 " + count +"명이 등록되었습니다.");
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
				System.out.println("종료되었습니다." );
				System.exit(0);
			}
		}
	}
	
	void register() {
		System.out.print("학생이름, 학번, 성별을 입력하세요 : ");
		this.stu_name = s.next();
		this.stu_id = s.nextInt();
		this.stu_gen = s.next();
		System.out.print("주소를 입력하세요 : ");
		s.nextLine();
		this.stu_add = s.nextLine();
		System.out.print("전화번호를 입력하세요 : ");
		this.stu_phone = s.next();
		System.out.print("복학생입니까?(Y/N) : ");
		this.yn = s.next();
	}
	
	void showList() {
		System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
		for(int i = 0; i < st.size(); i++) {
			System.out.print((i+1)+"\t");
			st.get(i).print();
		}
	}
	
	void delete() {
		System.out.print("==> 삭제하실 번호를 입력하세요 : ");
		int num = s.nextInt();
		System.out.print("정말로 삭제하시겠습니까?(Y/N) : ");
		String str = s.next();
		
		if(str.equalsIgnoreCase("y")) {
			st.remove(num-1);
			System.out.println("삭제되었습니다.");
		}
		else if(str.equalsIgnoreCase("n"))
			System.out.println("취소되었습니다.");
		else
			System.out.println("잘못입력하셨습니다.");
	
	}
	
	int edit() {
		System.out.print("==> 수정하실 번호를 입력하세요: ");
		int choice = s.nextInt();
		register();
		
		return choice;
	}
	
	void searchName() {
		System.out.print("검색하실 이름을 입력하세요 : ");
		String str = s.next();
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getName().indexOf(str) != -1) {
				System.out.println("검색되었습니다.\n");
				System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
			else 
				System.out.println("찾지 못했습니다.");
		}
	}
	
	void searchAddress() {
		System.out.print("검색하실 이름을 입력하세요 : ");
		String str = s.next();
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getAddress().indexOf(str) != -1) {
				System.out.println("검색되었습니다.\n");
				System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
		}
		
		System.out.println("찾지 못했습니다.");
	}
	
	void returnStudent() {
		int c = 0;
		
		for(int i = 0 ; i < st.size(); i++) {
			if(st.get(i).getCheckReturn().equals("Y")) {
				c++;
				System.out.println("검색되었습니다.\n");
				System.out.println("번호\t이름\t학번\t\t성별\t주소\t\t전화번호\t\t복학생");
				System.out.print((i+1)+"\t");
				st.get(i).print();
			}
		}
		System.out.println("복학생은 " + c + "명입니다.");
	}

}
