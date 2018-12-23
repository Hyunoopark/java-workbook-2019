package workbook.StepC;

import java.util.Scanner;

public class C07 {
	private int megabytes;
	private long bytes;
	private byte kind;
	private double time;
	
	public C07() {
		input();
	}
	
	public void printFT() {
		System.out.printf("���� ���� �ð��� %.1f�� �Դϴ�",getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���");
		this.megabytes = s.nextInt();
		System.out.printf("���۹���� 1: Wi-Fi, 2: Bluetooth, 3: LTE, 4: USB");
		this.kind = s.nextByte();
	}
	
	double getSec() {
		bytes = (long)megabytes * 1024 * 1024;
		
		if(kind == 1)
			time = (double)bytes / 1500000.0;
		else if(kind == 2)
			time = (double)bytes / 300000.0;
		else if(kind == 3)
			time = (double)bytes / 1000000.0;
		else if(kind == 4)
			time = (double)bytes / 60000000.0;
		
		return this.time;
	}
}
