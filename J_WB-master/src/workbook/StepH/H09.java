package workbook.StepH;

import java.util.Scanner;

public class H09 {
	private String input;
	private String userInfo[];
	private String userList[];
	
	public H09() {
		input();
	}
	
	public void printOut() {
		System.out.println("* ����Ǿ����ϴ�.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("==============================");
			System.out.println("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			this.input = s.next();
			
			if(input.equalsIgnoreCase("x"))
				break;
			
			check();
			
			}		
	}
	
	void check() {
		userList = input.split("###");
		System.out.println("�� " + userList.length + "���� ��ϵǾ����ϴ�.");
		
		for(int i = 0; i < userList.length; i++) {
			userInfo = userList[i].split("\\|");
			System.out.printf("%d ", i+1);
			
			for(int j = 0; j < userInfo.length; j++)
				System.out.printf("%s ", userInfo[j]);
			System.out.println();
		}
		
	}

}
