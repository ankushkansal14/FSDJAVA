import java.util.Scanner;
import java.lang.*;
class DecimalBinary{
	public static void main(String[] args)
	{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter The Value : ");
			String str=sc.nextLine();
			String subStr =str.substring ( str.indexOf ( ".") );
			String fnlStr=subStr.substring(1);
			int fnlnum=Integer.parseInt(fnlStr);
			System.out.println(fnlnum);
			String strng="";
			while(fnlnum !=0)
			{
				strng=strng+Integer.toString(fnlnum%2);
				fnlnum=fnlnum/2;

			}
			
			char[] ch = strng.toCharArray();
			String rev="";  
    		for(int i=ch.length-1;i>=0;i--){  
        			rev+=ch[i];  
    		}  
    		System.out.println(rev);
			
			// System.out.println(StringFormatter.reverseString(strng));



			// char[] chars = subStr.toCharArray();
			// System.out.println(chars);








			// String subStr =str[1] + str.substring ( str.indexOf ( ".") );
			// System.out.println(subStr);
			// int result = Integer.parseInt(subStr);		
			// System.out.println(result);

	}
}