package workbook.StepJ;

import java.util.Scanner;

public class J01 {
	private int birthyear;
	private int age;
	private int c;
	private int age_group[] = new int[6];
	private String people[] = {"����","���","û�ҳ�","û��","�߳�","���"};
	
	public J01() {
		input();
	}
	
	public  void printAll() {
		for(int i = 0; i < 6; i++) 
			System.out.printf("%s��(��) %d�� �Դϴ�\n",people[i],age_group[i]);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			System.out.printf("%d��° ����� �¾ �⵵�� �Է��Ͻÿ� : ",  i+1);
			this.birthyear = s.nextInt();
			
			if(birthyear > 2019)
				break;
			age = 2019 - birthyear + 1;
			System.out.printf("���̴� %d�Դϴ�\n",age);	
			
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
