import java.util.Scanner;

class Area_Perimeter_Rectangle 
{
	public static void main(String[] args) 
	{
	Scanner wd = new Scanner(System.in);
	final float pi=22/7;
	
	System.out.print("Enter Width : ");
	float width = wd.nextFloat();

	System.out.print("Enter Height : ");
	float height = wd.nextFloat();

	float area = width * height;
	System.out.println("Area of Rectangle is  : "+area);

	float perimeter = 2 * (height+width);
	System.out.println("Perimeter of Rectangle is  : "+perimeter);
	}
}
