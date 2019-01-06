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
	private String age_group[] = {"�ʵ��л�", "û�ҳ�", "�Ϲ���", "��δ��"};
	
	public G07(){
		input();
	}
	
	public void printTotal() {
		System.out.printf("���� �� �湮�� ���� %d���Դϴ� \n",total_count);
		
		for(int i = 0; i < 4; i++)
			System.out.printf("%s ���� %d���Դϴ� \n",age_group[i],v_count[i]);
		
		System.out.printf("�� ������ %d���Դϴ�  \n",total_sum);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���� �湮�� ������ �Է��ϼ��� : ");
		this.team_count = s.nextInt();
		
		for(int i = 0; i < team_count; i++) {
			System.out.printf("%d���� �ο���(�ʵ��л�, û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ��� : ", i+1);
			for(int j = 0; j < 4; j++)
				this.count[j] = s.nextInt();
			System.out.printf("%d���� ����ī�� ����(ī�����  : 0, �Ϲݵ�� : 1, VIP��� : 2)�� �Է��ϼ��� : ", i+1);
			this.membership = s.nextInt();
			
			System.out.printf("%d���� ������ %d���Դϴ� \n ", i+1, getFee());
			
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
