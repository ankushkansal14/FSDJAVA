import java.util.Scanner;
class PassingAndFalling
{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter The Numbers");
			int num1=sc.nextInt();
			
			
			
			if(num1>40)
			{
				int num2=sc.nextInt();
				if(num2>40)
				{
					int num3=sc.nextInt();
					if(num3>40)
					{
						int sum=num1 + num2 + num3;
						if(sum>125)
						{

							System.out.println("Passing  Sum Is : "+sum);
						}
						if(sum<125)
			{
				System.out.println("Falling");
			}
						
					}
					if(num3<40)
			{
				System.out.println("Falling");
			}
					
				}
				if(num2<40)
			{
				System.out.println("Falling");
			}
					
				
			}
			if(num1<40)
			{
				System.out.println("Falling");
			}
			
	}
}