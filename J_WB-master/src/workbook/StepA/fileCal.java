package workbook.StepA;

import java.util.Scanner;

public class fileCal {
	private int gigabytes = 0;
	private int megabytes = 0;
	private int kilobytes = 0;
	private long bytes = 0;
	
	public fileCal() {input();}
	public void printFile() {
		System.out.printf("�Է��Ͻ� ���� �뷮��  %d �ް�����Ʈ, %d ų�ι���Ʈ, %d ����Ʈ�Դϴ�",getMega(),getKilo(),getByte());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ��� : ");
		this.gigabytes = s.nextInt();
	}
	
	int getMega() {
		megabytes = gigabytes * 1024;
		return this.megabytes;
	}
	
	int getKilo() {
		kilobytes = megabytes * 1024;
		return this.kilobytes;
	}
	
	long getByte() {
		bytes = (long)kilobytes * 1024;
		return this.bytes;
	}
	
	

}
