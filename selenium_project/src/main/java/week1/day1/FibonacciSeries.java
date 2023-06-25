package week1.day1;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int i = 0, j = 1, l, till = 100;
		System.out.println(i);
		System.out.println(j);
		
		for (int k = 2; k < till; k++) {
			l=i+j;
			System.out.println(l);
			i=j;
			j=l;
			
			
		}
	}

}
