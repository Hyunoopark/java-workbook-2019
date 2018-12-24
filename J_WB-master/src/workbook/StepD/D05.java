package workbook.StepD;

import java.util.Scanner;

public class D05 {
	private int width, height;
	private int count1 = 0;
	private int count2 = 0;
	private int count3 = 0;
	private int count4 = 0;
	private int count5 = 0;
	
	public D05() {
		input();
	}
	
	public void printRec() {
		System.out.printf("정사각형의 개수는 %d 입니다 \n",count1);
		System.out.printf("좌우로 길쭉한 직사각형의 개수는 %d 입니다 \n",count2);
		System.out.printf("위아래로 길쭉한 직사각형의 개수는 %d 입니다 \n",count3);
		System.out.printf("일반적인 가로형 직사각형의 개수는 %d 입니다 \n",count4);
		System.out.printf("일반적인 세로형 직사각형의 개수는 %d 입니다 \n",count5);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("직사각형의 가로 크기와 세로 크기를 입력하시오.");
			this.width = s.nextInt();
			this.height = s.nextInt();
			
			if(width <= 0 || height <= 0)
				break;
			
			countRec();
		}
	}
	
	void countRec() {
		if(width == height)
			count1++;
		else if(width >= height * 2)
			count2++;
		else if(height >= width * 2)
			count3++;
		else if(width > height)
			count4++;
		else if(height > width)
			count5++;
	}

}
