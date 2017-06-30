package ted.util;

public class SimpleMath {
	
	public int add(Integer a, Integer b) {
		return a+b;
	}
	
	public int sub(Integer a, Integer b) {
		return a-b;
	}
	
	public double pwr(Integer a, Integer b) {
		return a^b;
	}
	
	public double sqrt(Integer a) {
		return a^(1/2);
	}
	
	public double root(Integer a, Integer b) {
		return a^(1/b);
	}
	
	public static int factorial(Integer a) {
		int i = a;
		int j = a;
		do {
			j*=(i-1);
			i-=1; // I know I could use --i or i--, but I think I'll screw it up
		} while (i > 1); // if it's (i>0) it gives 0 every time, since it checks after it runs
		return j;
	}
	
	public static int choose(Integer a, Integer b) {
			try {
				return (factorial(a))/(factorial(b)*factorial(a-b));
			} catch (Exception ArithmeticException) {
				System.out.println("OOPS! Divided by ");
				return 0;
			}
	}
}
