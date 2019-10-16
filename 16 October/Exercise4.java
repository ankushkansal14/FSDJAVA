import java.util.Scanner;
import java.io.*;
class Exercise4
{
	public static void main(String[] args) {

StringBuilder sb = new StringBuilder("");
System.out.print("Enter the word that you want to replace:");
Scanner scan=new Scanner(System.in);
String newStr=scan.nextLine();
System.out.print("Enter The word you want to replace with :");
String replaceString=scan.nextLine();


String str="";
try{
BufferedReader br = new BufferedReader(new FileReader("anotherFile.txt"));
int a=0;
while((a=br.read()) != -1)
{
	sb.append((char)a);
}
System.out.println("Before Replace "+ sb);
br.close();
// fr.close();
str=new String(sb);
str=str.replaceAll(newStr,replaceString);
//System.out.println("Contents from file are : " + str);
	}
catch(IOException e){
	System.out.println(e);
}
System.out.println();System.out.println();System.out.println();





try {
 

FileWriter fw = new FileWriter(new File("anotherFile.txt")); // create an actual file

fw.write(str); 
System.out.println("After Replace "+ str);

fw.flush(); 
fw.close(); 
} catch(IOException e) {
	System.out.println("Can't write to the file currently...");
 }
}
}