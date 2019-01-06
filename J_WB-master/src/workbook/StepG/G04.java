package workbook.StepG;

import java.util.Scanner;

public class G04 {
	private int kind;
	private int money;
	private double charge;
	private double total_charge;
	
	public G04() {
		input();
	}
	
	public void printFee() {
		System.out.printf("���ݱ����� ������ �Ѿ��� %.0f �Դϴ�.", total_charge);
	}
	
	void input() {
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.print("�ε��� �ŷ�����(1:�Ÿ�, 2:�Ӵ�, 0:�������)�� �Է��ϼ��� : ");
			this.kind = s.nextInt();
			if(kind == 0)
				break;
			System.out.print("�ε��� �ŷ��ݾ�(��)�� �Է��ϼ��� : ");
			this.money = s.nextInt();
			System.out.printf("�̿� ���� �߰� ������� %.0f�� �Դϴ� \n",calFee());
			total_charge += charge;
		}
	}
	
	double calFee() {
		if(kind == 1) {
			if(money < 50000000) {
				charge = (double)money * 0.006;
				if(charge > 250000)
					charge = 250000;
			}
			else if(50000000 <= money && money < 200000000) {
				charge = (double)money * 0.005;
				if(charge > 800000)
					charge = 800000;
			}
			else if(200000000 <= money)
				charge = (double)money * 0.004;
		}
		
		if(kind == 2) {
			if(money < 20000000) {
				charge = (double)money * 0.005;
				if(charge > 70000)
					charge = 70000;
			}
			else if(20000000 <= money && money < 500000000) {
				charge = (double)money * 0.005;
				if(charge > 200000)
					charge = 200000;
			}
			else if(50000000 <= money && money < 100000000) {
				charge = (double)money * 0.004;
				if(charge > 300000)
					charge = 300000;
			}
			else if(100000000 <= money)
				charge = (double)money * 0.003;
		}
		
		return this.charge;
	}
			
}
		
	
