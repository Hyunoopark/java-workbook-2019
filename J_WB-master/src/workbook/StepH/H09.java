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
		System.out.println("* 종료되었습니다.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("==============================");
			System.out.println("=> 문자열을 입력하세요 (x: 종료) : ");
			this.input = s.next();
			
			if(input.equalsIgnoreCase("x"))
				break;
			
			check();
			
			}		
	}
	
	void check() {
		userList = input.split("###");
		System.out.println("총 " + userList.length + "명이 등록되었습니다.");
		
		for(int i = 0; i < userList.length; i++) {
			userInfo = userList[i].split("\\|");
			System.out.printf("%d ", i+1);
			
			for(int j = 0; j < userInfo.length; j++)
				System.out.printf("%s ", userInfo[j]);
			System.out.println();
		}
		
	}

}
