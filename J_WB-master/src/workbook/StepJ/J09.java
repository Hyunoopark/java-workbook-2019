package workbook.StepJ;

import java.util.Scanner;

public class J09 {
	private int num1, num2;
	
	public void printPow() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� 2���� �Է��Ͻÿ� : ");
		this.num1 = s.nextInt();
		this.num2 = s.nextInt();
		
		System.out.printf("%d�� %d���� %d �Դϴ�",num1,num2,power(num1,num2));
	}
	
	int power(int num1, int num2) {
		if(num2 == 0)
			return 1;
		else if(num2 == 1)
			return num1;
		else if(num2%2 == 0 && num2 > 1)
			return power(num1,num2/2) * power(num1,num2/2);
		else
			return power(num1,num2/2) * power(num1,num2/2) * num1;
	}
}
