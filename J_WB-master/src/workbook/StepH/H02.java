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
		
		System.out.print("생성된 로또 번호는 ");
		for(int i = 0; i < lotto.length; i++)
			System.out.printf("%d ",lotto[i]);
		System.out.print("입니다. \n");
		
		choice();
	}
	
	void choice() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("더 만드시겠습니까? (Y/N) : ");
		
		this.onemore = s.next();
		
		if(onemore.equalsIgnoreCase("Y"))
			printNum();
		else if(onemore.equalsIgnoreCase("N"))
			return;
	}

}

