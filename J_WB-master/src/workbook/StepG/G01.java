package workbook.StepG;

import java.util.Scanner;

public class G01 {
	private int birth_year;
	private int age[] = new int[100];
	private int count = 0;
	private String person[] = {"유아","어린이","청소년","청년","중년","노년"};
	private int count_person[] = {0,0,0,0,0,0};
	
	public G01() {
		input();
	}
	
	public void printAll() {
		for(int i = 0; i < count; i++)
			System.out.printf("%d번째 사람의 나이는 %d 입니다. \n", i+1, age[i]);
		for(int i = 0; i < person.length; i++) 
			System.out.printf("%s는(은) %d명 입니다. \n",person[i],count_person[i]);
	}
	
	void ageGroup() {
		for(int i = 0; i < count; i++) {
			if(age[i] < 7)
				count_person[0] += 1;
			else if(7 <= age[i] && age[i] < 13)
				count_person[1] += 1;
			else if(13 <= age[i] && age[i] < 20)
				count_person[2] += 1;
			else if(20 <= age[i] && age[i] < 30)
				count_person[3] += 1;
			else if(30 <= age[i] && age[i] < 60)
				count_person[4] += 1;
			else if(60 <= age[i])
				count_person[5] += 1;
		}
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < 100; i++) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오 : ",i+1);
			this.birth_year = s.nextInt();
			
			if(birth_year>2018)
				break;
			
			age[i] = 2018 - birth_year + 1;
			
			count++;
		}
		ageGroup();
	}
	
	
}
