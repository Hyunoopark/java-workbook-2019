package workbook.StepJ;

import java.util.Scanner;

public class J01 {
	private int birthyear;
	private int age;
	private int c;
	private int age_group[] = new int[6];
	private String people[] = {"유아","어린이","청소년","청년","중년","노년"};
	
	public J01() {
		input();
	}
	
	public  void printAll() {
		for(int i = 0; i < 6; i++) 
			System.out.printf("%s은(는) %d명 입니다\n",people[i],age_group[i]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			System.out.printf("%d번째 사람의 태어난 년도를 입력하시오 : ",  i+1);
			this.birthyear = s.nextInt();
			
			if(birthyear > 2019)
				break;
			age = 2019 - birthyear + 1;
			System.out.printf("나이는 %d입니다\n",age);	
			
			c = AskAge(birthyear);
			
			if(c == 0)
				age_group[0]++;
			else if(c == 1)
				age_group[1]++;
			else if(c == 2)
				age_group[2]++;
			else if(c == 3)
				age_group[3]++;
			else if(c == 4)
				age_group[4]++;
			else if(c == 5)
				age_group[5]++;
			
		}
	}
	
	int AskAge(int birth) {
		if(age < 7)
			return 0;
		else if(7 <= age && age < 13)
			return 1;
		else if(13 <= age && age < 20)
			return 2;
		else if(20 <= age && age < 30)
			return 3;
		else if(30 <= age && age < 60)
			return 4;
		else
			return 5;		
	}
}
