package workbook.StepI;

import java.util.Scanner;
import java.util.Random;

public class I06 {
	private int randNum;
	private String ch[] = {"�� (70�̻�)","�� (40�̻�)","�� (40�̸�"};
	private int num[] = new int[3];
	private byte random;
	
	public I06() {
		input();
	}
	
	public void printAns() {
		for(int i = 0; i < 3; i++) {
			System.out.printf("%d. %s : %dȸ ���� \n",i+1,ch[i],num[i]);
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ���ڸ� �����մϴ�.");
		
		for(int i = 0; i < 10; i++) {
			GetRandom();
			GetNum();
		}
		
		System.out.println();
	}
	
	byte GetRandom() {
		Random generator = new Random();
		
		randNum = generator.nextInt(100) + 1;
		System.out.printf("������ ������ ���ڴ� %d�Դϴ� \n",randNum);
		
			if(randNum >= 70) 
				random = 1;
			else if(randNum < 70 && randNum >= 40)
				random = 2;
			else 
				random = 3;
			
		return this.random;
	}
	
	void GetNum() {
		if(random == 1)
			num[0] += 1;
		else if(random == 2)
			num[1] += 1;
		else if(random == 3)
			num[2] += 1;
	}

}
