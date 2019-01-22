package workbook.StepK;

import java.util.Scanner;

public class Point {
	private int count;
	private int n;
	private int num[] = new int[4];
	private double[] x = new double[100];
	private double[] y = new double[100];
	
	public Point(int n) {
		count = n;
	}
	
	public void input() {
		Scanner s = new Scanner(System.in);
		for(int i = 0; i < count; i++) {
			if(count == 1)
				System.out.print("좌표의 X, Y 값을 입력하시오 --> ");
			else
				System.out.print((i+1)+"번째 좌표의 X, Y 값을 입력하시오 --> ");
			this.x[i] = s.nextDouble();
			this.y[i] = s.nextDouble();
		}
	}
	
	int getArea(double x, double y) {
		if(x>0 && y>0) {
			n = 1;
			num[0]++;
		}
		else if(x<0 && y>0){
			n = 2;
			num[1]++;
		}
		else if(x<0 && y<0){
			n = 3;
			num[2]++;
		}
		else if(x>0 && y<0){
			n = 4;
			num[3]++;
		}
		else
			n = 0;
		
		return this.n;
	}
	
	public void printArea() {
		System.out.println("======================");
		for(int i = 0; i < count; i++) {
			getArea(x[i],y[i]);
			if(n==0)
				System.out.println("어느곳에도 위치하지 않습니다");
			else
				System.out.println((i+1) + "번째 좌표는 " + n +"사분면에 위치합니다.");
		}
		
		for(int i = 0; i < num.length; i++)
			System.out.println((i+1) + "사분면의 좌표는 모두 " + num[i] + "개입니다.");
	}
	
	

}
