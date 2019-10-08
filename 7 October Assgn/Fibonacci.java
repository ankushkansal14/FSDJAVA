import java.util.*;
class Fibonacci
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int sum=0;
		System.out.print("Enter The Number You want Upto Fibonacci Series : ");
		int num=sc.nextInt();
		System.out.println();
		System.out.print(b + " ");
		for(int i=0;i<num;i++)
		{
			sum=a+b;
			System.out.print(sum + " ");
			a=b;
			b=sum;
			
		}
		
	}
}