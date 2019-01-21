package workbook.StepJ;

public class J10 {
	private double first , second;
	
	public void printFib() {
		double count = 2.0;
		
		while(true) {
			first = second;
			second = fibonacci(count+1) / fibonacci(count);
			
			System.out.printf("%.0f번째 비율 (%.0f / %.0f) : %.6f \n", count, fibonacci(count+1),fibonacci(count),second);
			count++;
			
			if(Math.abs(first-second) < 0.000001)
				break;
		}
	}
	
	double fibonacci(double n) {
		if(n == 1 || n == 2)
			return 1;
		else 
			return fibonacci(n-1) + fibonacci(n-2);
	}
}
