package workbook.StepJ;

import java.util.Scanner;

public class J03 {
	private double temp;
	private int count[] = new int[4];
	private double deg[] = new double[10];
	private String name[] = {"�ü�", "�̿¼�", "�¼�", "���¹�"};
	
	public J03() {
		input();
	}
	
	public void printDegree() {
		for(int i = 0; i < 10; i++) 
			System.out.printf("%d�� ���� �µ��� %.1f�� �Դϴ�. \n",i+1,deg[i]);
		for(int i = 0; i < count.length; i++)
			System.out.printf("%s �Է� Ƚ�� %d �Դϴ�. \n",name[i],count[i]);
			
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d��° ���� �µ��� �Է��Ͻÿ� : ", i+1);
			this.temp = s.nextDouble();
			
			if(temp < 0) {
				System.out.print("�ٽ� �Է��ϼ��� \n");
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
