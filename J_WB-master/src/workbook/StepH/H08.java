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
		System.out.println("* ����Ǿ����ϴ�.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true){
			System.out.println("==============================");
			System.out.println("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
			this.input = s.nextLine();
			
			if(input.equalsIgnoreCase("x"))
				break;
			
			change();
			
			input = input.replace(findStr,replaceStr);
			
			System.out.println("=> ��  "+ count +"�� �ٲ�����ϴ�.");
			System.out.println("=> " + input);
			
			}			
		
	}
	
	void change() {
		count = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("=> ã�� ���ڿ��� �Է��ϼ��� : ");
		this.findStr = s.nextLine();
		System.out.print("=> �ٲ� ���ڿ��� �Է��ϼ��� : ");
		this.replaceStr = s.nextLine();
		
		String list[]=input.split(" ");

		for(int i = 0; i < list.length; i++) {
			if(list[i].indexOf(findStr) != -1) 
				count++;
		}
		
	}

}
