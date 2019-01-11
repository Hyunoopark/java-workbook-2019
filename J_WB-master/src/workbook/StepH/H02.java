package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H02 {
	private int lotto[] = new int[6];
	private int count;
	private String onemore;
	
	public void printNum() {
		Random generator = new Random();
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = generator.nextInt(45) + 1;
			for(count = 0; count < i; count++)
				if(lotto[count] == lotto[i])
					i--;
		}
		
		System.out.print("������ �ζ� ��ȣ�� ");
		for(int i = 0; i < lotto.length; i++)
			System.out.printf("%d ",lotto[i]);
		System.out.print("�Դϴ�. \n");
		
		choice();
	}
	
	void choice() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("�� ����ðڽ��ϱ�? (Y/N) : ");
		
		this.onemore = s.next();
		
		if(onemore.equalsIgnoreCase("Y"))
			printNum();
		else if(onemore.equalsIgnoreCase("N"))
			return;
	}

}

