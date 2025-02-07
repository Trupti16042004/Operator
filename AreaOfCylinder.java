import java.util.Scanner;
class AreaOfCylinder 
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		final float pi = 22/7;

		System.out.println("enter radius");
		float radius = sc.nextFloat();

		System.out.println("enter height");
		float height = sc.nextFloat();
		

		float area = pi*radius*radius;
		float volume = area* height;

		System.out.println("Area of cylinder:" +area +"and volume of cylinder" +volume);
	}
}
