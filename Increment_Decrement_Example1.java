class Increment_Decrement_Example1
{
	
	public static void main(String[] args) {
		
		int a = 5, b = 6, c = 4, d;

		a = a++ + b-- - ++c;
		d = ++c - ++a + a;
		c = ++c;

		System.out.println("A is : "+a);
		System.out.println("B is : "+b);
		System.out.println("C is : "+c);
		System.out.println("D is : "+d);

	}

}