import java.util.*;
import java.io.*;

class Exercise3
{
	public static void main(String[] args) throws IOException {
		String fileType = "Undetermined";

		String extension = "";



		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the File Name You want : ");
		String str=sc.nextLine();
		File myFile = new File(str);
        System.out.println(myFile.exists());
        System.out.println(myFile.canRead());
        System.out.println(myFile.canWrite());
        System.out.println("File Size : "+ myFile.length() + " Bytes");
        int i = str.lastIndexOf('.');
		if (i > 0) {
    		extension = str.substring(i+1);
			}
			System.out.println(extension);
		}

		
}