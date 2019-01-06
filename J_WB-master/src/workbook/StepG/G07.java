package workbook.StepG;

import java.util.Scanner;

public class G07 {
	private int team_count;
	private int charge[] = {5000, 10000, 15000, 3000};
	private int count[] = new int[4];
	private int v_count[] = new int[4];
	private int membership = 0;
	private int sum = 0;
	private int total_count = 0;
	private int total_sum = 0;
	private String age_group[] = {"초등학생", "청소년", "일반인", "경로대상"};
	
	public G07(){
		input();
	}
	
	public void printTotal() {
		System.out.printf("오늘 총 방문자 수는 %d명입니다 \n",total_count);
		
		for(int i = 0; i < 4; i++)
			System.out.printf("%s 수는 %d명입니다 \n",age_group[i],v_count[i]);
		
		System.out.printf("총 입장료는 %d원입니다  \n",total_sum);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("오늘 방문한 팀수를 입력하세요 : ");
		this.team_count = s.nextInt();
		
		for(int i = 0; i < team_count; i++) {
			System.out.printf("%d번팀 인원수(초등학생, 청소년, 일반, 경로대상)를 입력하세요 : ", i+1);
			for(int j = 0; j < 4; j++)
				this.count[j] = s.nextInt();
			System.out.printf("%d번팀 할인카드 종류(카드없음  : 0, 일반등급 : 1, VIP등급 : 2)를 입력하세요 : ", i+1);
			this.membership = s.nextInt();
			
			System.out.printf("%d번팀 입장료는 %d원입니다 \n ", i+1, getFee());
			
			getNum();
			getTotal();
		}
	}
	
	int getFee() {
		sum = 0;
		
		for(int i = 0; i < 4; i ++)
			sum += count[i] * charge[i];
		
		if(membership == 1)
			sum = (int)(sum * 0.9);
		else if(membership == 2)
			sum = (int)(sum * 0.8);
		
		return this.sum;
	}
	
	void getNum() {
		for(int i = 0; i < 4; i++) {
			v_count[i] += count[i];
		}
		
		for(int i = 0; i < 4; i++)
			total_count += count[i];
	}
	
	void getTotal() {
		total_sum += sum;
	}

}
