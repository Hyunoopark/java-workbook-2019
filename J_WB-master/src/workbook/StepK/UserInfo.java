package workbook.StepK;

import java.util.Scanner;

public class UserInfo {
	private String id[] = new String[10];
	private String pw[] = new String[10];
	private int count;
	
	public UserInfo(int c) {
		count = c;
	}
	public void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < count; i++) {
			if(count == 1)
				System.out.print("�л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ");
			else
				System.out.print((i+1) + "�� �л��� ���̵�, ��й�ȣ�� �Է��Ͻÿ� --> ");
			this.id[i] = s.next();
			this.pw[i] = s.next();
		}
	}
	
	public void print() {
		System.out.println("===============================");
		System.out.println("��ϵ� " + count + "���� �л� ����� ������ �����ϴ�.");
		System.out.println("-------------------------------");
		System.out.println("��ȣ\t���̵�\t��й�ȣ");
		for(int i = 0; i < count; i++)
			System.out.println((i+1) +"\t"+ id[i] +"\t" + pw[i]);
	}

}
