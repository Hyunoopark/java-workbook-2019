package workbook.StepJ;

public class J06 {
	
	public J06() {
		input();
	}
	
	void input() {
		System.out.print("1���� 20���� �Ǻ���ġ ���� ������ �����ϴ�\n");
		
		for(int i = 0; i < 20; i++)
			System.out.printf("%d��° : %d \n",i+1, fibonacci(i+1));
	}
	
	int fibonacci(int n) {
		if(n == 1 || n == 2)
			return 1;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
