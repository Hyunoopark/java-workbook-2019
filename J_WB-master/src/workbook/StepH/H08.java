package workbook.StepH;

import java.util.Scanner;

public class H08 {
	private String input;
	private String findStr;
	private String replaceStr;
	private int count;
	
	public H08() {
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
			this.input = s.nextLine();
			
			if(input.equalsIgnoreCase("x"))
				break;
			
			change();
			
			input = input.replace(findStr,replaceStr);
			
			System.out.println("=> 총  "+ count +"번 바뀌었습니다.");
			System.out.println("=> " + input);
			
			}			
		
	}
	
	void change() {
		count = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("=> 찾을 문자열을 입력하세요 : ");
		this.findStr = s.nextLine();
		System.out.print("=> 바꿀 문자열을 입력하세요 : ");
		this.replaceStr = s.nextLine();
		
		String list[]=input.split(" ");

		for(int i = 0; i < list.length; i++) {
			if(list[i].indexOf(findStr) != -1) 
				count++;
		}
		
	}

}
