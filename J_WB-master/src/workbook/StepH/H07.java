package workbook.StepH;

import java.util.Scanner;

public class H07 {
	private String input;
	
	public H07() {
		input();
	}
	
	public void printOut() {
		System.out.println("* ����Ǿ����ϴ�.");
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true){
		System.out.println("==============================");
		System.out.print("=> ���ڿ��� �Է��ϼ��� (x: ����) : ");
		this.input = s.next();
		
		if(input.equalsIgnoreCase("x"))
			break;
		
		result();
		
		}			
	}
	
	void result() {
		String list[] = input.split("");
		
		System.out.println("=> �� ������ ������ "+ list.length +"���Դϴ�.");
		for(int i = 0; i < list.length; i++) 
			System.out.println("=> " + list[i]);
		
	}

}
