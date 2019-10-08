import java.util.*;

class Age extends RuntimeException{
    String age(){
        return "Sorry, mobiles numbers should be of 10 in length";
    }
}

class AgeException
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Age : ");
		int age=sc.nextInt();

		try{
		
			if(age<15)
			{
					throw new Age();
			}
		}
		catch(Age ng)
		{
			System.out.print("Age Must Be Greater Then 15  " + ng);
			
		}
		
		
		
	}
}