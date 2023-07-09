package week3.day1;

public class OvrLoading {

	public void add(int a, int b) {
		// TODO Auto-generated method stub

		System.out.println(a+b);	
	}
	public void add(int a, int b, int c) {
	
		System.out.println(a+b+c);	

	}
	
	public void mul(double a, double b) {
	System.out.println(a*b);	
	}
	
	
	
	public void mul(float a, float b) {
		System.out.println(a*b);	
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OvrLoading ol = new OvrLoading();
		ol.add(20, 30);
		ol.add(10, 20, 30);
		
		ol.mul(101.101, 10.10);
		ol.mul(10.1f, 2.0f);
	}

}
