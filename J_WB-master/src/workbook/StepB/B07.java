package workbook.StepB;

import java.util.Scanner;

public class B07 {
	private int megabytes;
	private long bytes;
	String usb2;
	int time;
	
	public B07() {
		input();
	}
	
	public void printFT() {
		System.out.printf("���� ���� �ð��� %d�� �Դϴ�",getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���");
		this.megabytes = s.nextInt();
		System.out.printf("USB ��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���");
		this.usb2 = s.next();
	}
	
	int getSec() {
		bytes = (long)megabytes * 1024 * 1024;
		
		if(usb2.equalsIgnoreCase("Y"))
			time = (int)bytes / 60000000;
		else if(usb2.equalsIgnoreCase("N"))
			time = (int)bytes / 1500000;
		
		return this.time;
			
	}

}
