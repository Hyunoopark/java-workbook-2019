package workbook.StepG;

import java.util.Scanner;

public class G02 {
	private double degrees[] = new double[10];
	private String degree_name[] = {"�ü�", "�̿¼�", "�¼�", "���¹�"};
	private int count[] = {0,0,0,0};
	private int sel[] = new int[10];
	
	public G02() {
		input();
	}
	
	public void printWD() {
		for(int i = 0; i < 10; i++)
			System.out.printf("%d�� ���� �µ��� %.1f �Դϴ�. %s \n",i+1,degrees[i], degree_name[sel[i]]);
		for(int i = 0; i < 4; i++) 
			System.out.printf("%s �Է� Ƚ�� : %d \n",degree_name[i],count[i]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d�� ���� �µ��� �Է��Ͻÿ� : ",i+1);
			this.degrees[i] = s.nextDouble();
		}
		waterDegree();
	}
	
	void waterDegree() {
		for(int i = 0; i < 10; i++) {
			if(0 <= degrees[i] && degrees[i] < 25) {
				count[0] += 1;
				sel[i] = 0;
			}
			else if(25 <= degrees[i] && degrees[i] < 40) {
				count[1] += 1;
				sel[i] = 1;
			}	
			else if(40 <= degrees[i] && degrees[i] < 80) {
				count[2] += 1;
				sel[i] = 2;
			}
			else if(80 <= degrees[i]) {
				count[3] += 1;
				sel[i] = 3;
			}	
		}		
	}
}
