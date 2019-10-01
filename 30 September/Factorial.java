import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		int factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int num=sc.nextInt();
		for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.println("Factorial is :"+factorial);
	}
}