package workbook.StepJ;

import java.util.Scanner;

public class J03 {
	private double temp;
	private int count[] = new int[4];
	private double deg[] = new double[10];
	private String name[] = {"냉수", "미온수", "온수", "끓는물"};
	
	public J03() {
		input();
	}
	
	public void printDegree() {
		for(int i = 0; i < 10; i++) 
			System.out.printf("%d번 물의 온도는 %.1f도 입니다. \n",i+1,deg[i]);
		for(int i = 0; i < count.length; i++)
			System.out.printf("%s 입력 횟수 %d 입니다. \n",name[i],count[i]);
			
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d번째 물의 온도를 입력하시오 : ", i+1);
			this.temp = s.nextDouble();
			
			if(temp < 0) {
				System.out.print("다시 입력하세요 \n");
				i--;
			}
			else {
				deg[i] = temp;
				count[AskWater(temp)]++;
			}
		}
	}
	
	byte AskWater(double degree) {
		if(0 <= temp && temp < 25)
			return 0;
		else if(25 <= temp && temp <40)
			return 1;
		else if(40 <= temp && temp <80)
			return 2;
		else 
			return 3;
	}

}
