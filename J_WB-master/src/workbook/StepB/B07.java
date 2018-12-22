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
		System.out.printf("파일 전송 시간은 %d초 입니다",getSec());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 메가바이트 단위로 입력하세요");
		this.megabytes = s.nextInt();
		System.out.printf("USB 포트가 2.0이면 Y, 아니면 N을 입력하세요");
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
