import java.util.Scanner;

class TableLimit
{
	public static void main(String[] args)
	{
		int res=1;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter The Number You want table Of:");
		int num=sc.nextInt();
		
		System.out.print("Enter The Limit :");
		
		int limit=sc.nextInt();
		System.out.println();
		for(int i=1;i<=limit;i++)
		{
				res=num*i;
				System.out.println(num + "*" + i + "=" + res);
		}

	}
}