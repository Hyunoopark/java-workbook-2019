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
			System.out.print("잘못된 범위를 입력하셨습니다");
		else
			System.out.printf("입력된 숫자들 중 가장 큰 수는 %d 이고, 가장 작은 수는 %d 입니다",  getMax(), getMin());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		this.max_num = -100;
		this.min_num = 300;
		
		while(true) {
			System.out.println("0부터 100 사이의 숫자를 입력하세요");
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

