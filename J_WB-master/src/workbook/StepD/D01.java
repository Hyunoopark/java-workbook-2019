package workbook.StepD;

import java.util.Scanner;

public class D01 {
	private int number;
	private int totalsum;
	
	public D01() {
		input();
	}
	
	public void printNum() {
		if(number <= 1)
			System.out.println("�߸� �Է��Ͽ����ϴ�");
		else
			System.out.printf("1���� �Է��� ���ڱ����� ��� ������ ���� ���� %d �Դϴ�",addNum());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		this.number = s.nextInt();
	}
	
	int addNum() {
		int i;
		
		for(i=1; i<=number; i++)
			totalsum += i;
		
		return this.totalsum;
	}

}
