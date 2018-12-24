package workbook.StepD;

import java.util.Scanner;

public class D02 {
	private int number;
	private int max_num, min_num;
	
	public D02() {
		input();
	}
	
	public void printMM() {
		if(max_num == -100 || min_num == 300)
			System.out.print("�߸��� ������ �Է��ϼ̽��ϴ�");
		else
			System.out.printf("�Էµ� ���ڵ� �� ���� ū ���� %d �̰�, ���� ���� ���� %d �Դϴ�",  getMax(), getMin());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.max_num = -100;
		this.min_num = 300;
		
		while(true) {
			System.out.println("0���� 100 ������ ���ڸ� �Է��ϼ���");
			this.number = s.nextInt();
			
			if(number<0 || number>100)
				break;
		
			setMax();
			setMin();
			
		} 
	}
	
	void setMax() {
		if(number > max_num)
			max_num = number;
	}
	
	void setMin() {
		if(number < min_num)
			min_num = number;
	}
	
	int getMax() {
		return this.max_num;
	}
	
	int getMin() {
		return this.min_num;
	}
}

