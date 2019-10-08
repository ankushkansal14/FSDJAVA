import java.util.Scanner;

class PrimeNumber
{
	public static void main(String[] args)
	{
		int p;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		for(int i=2;i<=n;i++)
		{
			p=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				p=1;
			}
			if(p==0)
				System.out.print(i + " ");
		}
	}
}
