package workbook.StepK;

import java.util.Scanner;

public class Student {
	private int count;
	private int kor[] = new int[10];
	private int eng[] = new int[10];
	private int math[] = new int[10];
	
	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.print("등록할 학생의 명수는? " );
		this.count = s.nextInt();
		
		for(int i = 0; i < count; i++) {
			System.out.print((i+1) + "번 학생의 국어, 영어, 수학 점수를 입력하시오 --> ");
			this.kor[i] = s.nextInt();
			this.eng[i] = s.nextInt();
			this.math[i] = s.nextInt();
		}
	}
	
	public void print() {
		System.out.println("================================");
		System.out.println("등록된 " + count + "명의 학생 목록은 다음과 같습니다.");
		System.out.println("--------------------------------");
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(int i = 0; i < count; i++)
			System.out.println((i+1) + "\t" + kor[i] + "\t" + eng[i] + "\t" + math[i] + "\t" + getSum(i) + "\t" + getAvg(i) + "\t" + getGrade(i));
	}
	
	int getSum(int i) {
		int sum;
		
		sum = kor[i] + eng[i] + math[i];
		
		return sum;
	}
	
	double getAvg(int i) {
		double avg;
		
		avg = getSum(i) / 3.0;
		
		return avg;
	}
	
	String getGrade(int i) {
		String grade;
		
		if(getAvg(i) >= 95)
			grade = "A+";
		else if(getAvg(i) >= 90)
			grade = "A";
		else if(getAvg(i) >= 85)
			grade = "B+";
		else if(getAvg(i) >= 80)
			grade = "B";
		else if(getAvg(i) >= 75)
			grade = "C+";
		else if(getAvg(i) >= 70)
			grade = "C";
		else if(getAvg(i) >= 65)
			grade = "D+";
		else if(getAvg(i) >= 60)
			grade = "D";
		else
			grade = "F";
		
		return grade;
	}

}
