package workbook.StepH;

import java.util.Scanner;

public class H07 {
	private String input;
	
	public H07() {
		input();
	}
	
	public void printOut() {
		System.out.println("* 종료되었습니다.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true){
		System.out.println("==============================");
		System.out.print("=> 문자열을 입력하세요 (x: 종료) : ");
		this.input = s.next();
		
		if(input.equalsIgnoreCase("x"))
			break;
		
		result();
		
		}			
	}
	
	void result() {
		String list[] = input.split("");
		
		System.out.println("=> 총 문자의 개수는 "+ list.length +"개입니다.");
		for(int i = 0; i < list.length; i++) 
			System.out.println("=> " + list[i]);
		
	}

}
