package workbook.StepG;

import java.util.Scanner;

public class G03 {
	private int jumsu[][] = new int[5][3];
	private int c_average[] = new int[3];
	private String class_name[] = {"����","����","����"};
	private int sum;
	private double average;
	private String grade;
	
	public G03() {
		input();
	}
	
	public void printScore() {
		classScore();
		stuScore();
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			System.out.printf("%d�� �л��� ����, ����, ���� ������? : ",i+1);
			for(int j = 0; j < 3; j++)
				this.jumsu[i][j] = s.nextInt();
		}
	}
	
	void classScore() {
		System.out.println("1) �� ���� ������ ��� ���� ");
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) 
				c_average[j] += jumsu[i][j];
		}
		
		for(int i = 0; i < 3; i++)
			System.out.printf("%s ���� ������ %d, ����� %.1f �Դϴ� \n",class_name[i],c_average[i],(double)c_average[i]/5.0);
		System.out.println();
	}
	
	void stuScore() {
		System.out.println("2) �� �л��� ������ ������� ");
		for(int i = 0; i < 5; i++) {
			sum = 0;
			for(int j = 0; j < 3; j++) {
				sum += jumsu[i][j];
				average = (double)sum / 3.0;
			}
			System.out.printf("%d�� �л� ���� : ���� : %d, ��� : %.1f, ��� %s \n",i+1,sum,average,getGrade());
		}
	}
	
	String getGrade() {
		if(average >= 90)
			grade = "A";
		else if(90 > average && average >= 80)
			grade = "B";
		else if(80 > average && average >= 70)
			grade = "C";
		else if(70 > average && average >= 60)
			grade = "D";
		else if(60 > average)
			grade = "F";
		
		return this.grade;
	}
}