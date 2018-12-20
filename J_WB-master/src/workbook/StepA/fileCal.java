package workbook.StepA;

import java.util.Scanner;

public class fileCal {
	private int gigabytes = 0;
	private int megabytes = 0;
	private int kilobytes = 0;
	private long bytes = 0;
	
	public fileCal() {input();}
	public void printFile() {
		System.out.printf("입력하신 파일 용량은  %d 메가바이트, %d 킬로바이트, %d 바이트입니다",getMega(),getKilo(),getByte());
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		System.out.printf("파일 용량을 기가바이트 단위로 입력하세요 : ");
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
