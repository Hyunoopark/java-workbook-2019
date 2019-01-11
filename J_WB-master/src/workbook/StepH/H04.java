package workbook.StepH;

import java.util.Random;
import java.util.Scanner;

public class H04 {
	private int com_finger;
	private int my_finger;
	private int score[][] = new int[2][3];
	private String user[] = {"��ǻ��", "�����"};
	private String win[] = {"�̱�", "��", "���"};
	
	public H04() {
		input();
	}
	
	public void printResult() {
		for(int i = 0; i < 2; i++) {
			System.out.printf("%s : ",user[i]);
			for(int j = 0; j < 3; j++) {
				System.out.printf("%s Ƚ���� %d, ",win[j],score[i][j]);
			}
			System.out.println("�Դϴ�");
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("����(1), ����(2), ��(3)�� �Է��ϼ��� : ");
			this.my_finger = s.nextInt();
			
			if(my_finger > 3 || my_finger < 0)
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
			else if(my_finger == 0)
				break;
			else 
				comFinger();
		}
	}
	
	void comFinger() {
		Random generator = new Random();
		
		com_finger = generator.nextInt(3) + 1;
		
		if(com_finger == 1)
			System.out.print("��ǻ�Ͱ� �� ���� �����Դϴ�. -----> ");
		else if(com_finger == 2)
			System.out.print("��ǻ�Ͱ� �� ���� �����Դϴ�. -----> ");
		else if(com_finger == 3)
			System.out.print("��ǻ�Ͱ� �� ���� ���Դϴ�. -----> ");
		
		whoWin();
	}
	
	void whoWin() {
		if(com_finger%3 > my_finger%3) {
			System.out.print("��ǻ�� �� \n");
			score[0][0]++;
			score[1][1]++;
		}
		else if(my_finger%3 > com_finger%3) {
			System.out.print("����� �� \n");
			score[1][0]++;
			score[0][1]++;
		}
		else if(my_finger%3 == com_finger%3) {
			System.out.print("���~\n");
			score[0][2]++;
			score[1][2]++;
		}
		
	}

}
