import java.util.*;
class AreaCircle
{
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		final double pi=22/7;
		float radius;
		System.out.print("Enter radius(cm) : ");
		radius=sc.nextFloat();
		 
		double area=pi*radius*radius;
		System.out.println("Area of a Cricle is : "+area);
	}
}
