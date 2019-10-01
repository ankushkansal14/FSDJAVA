import java.util.*;
class BubbleSort
{
	public static void main(String[] args)
	{
		int []var=new int[5];
		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numbers :");
		for(int index = 0; index < var.length; index++){
            var[index] = sc.nextInt();
        }

        for(int i=0;i<var.length;i++)
        {
        	for(int j=0;j<var.length-i-1;j++)
        	{
        		if(var[j]>var[j+1])
        		{
        			temp=var[j];
        			var[j]=var[j+1];
        			var[j+1]=temp;
        		}
        	}
        }
        System.out.println("After sorting: ");
 
        for (int value : var) {
            System.out.println(value);
        }
	}
}