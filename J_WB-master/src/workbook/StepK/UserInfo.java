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
				System.out.print("학생의 아이디, 비밀번호를 입력하시오 --> ");
			else
				System.out.print((i+1) + "번 학생의 아이디, 비밀번호를 입력하시오 --> ");
			this.id[i] = s.next();
			this.pw[i] = s.next();
		}
	}
	
	public void print() {
		System.out.println("===============================");
		System.out.println("등록된 " + count + "명의 학생 목록은 다음과 같습니다.");
		System.out.println("-------------------------------");
		System.out.println("번호\t아이디\t비밀번호");
		for(int i = 0; i < count; i++)
			System.out.println((i+1) +"\t"+ id[i] +"\t" + pw[i]);
	}

}
