import java.util.*;
class Palindrome
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Please Enter The String : ");
		String str=sc.nextLine();
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
				reverse+=str.charAt(i);
		}
		System.out.println("Reverse Of String is : "+reverse);
		if(str.equals(reverse))
		{
			System.out.println("Yes It Is Palindrome");
		}
		else
		{
			System.out.println("Not A Palindrome");
		}
		
	}
}