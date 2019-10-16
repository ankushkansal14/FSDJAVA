import java.io.*;
import java.util.*;
class FileProgram
{
	public static void main(String[] args) throws IOException {

		FileReader fr =new FileReader(new File("anotherFile.txt")); 	
		FileWriter fw = new FileWriter(new File("second.txt"));
		CopyDataThread obj=new CopyDataThread(fr,fw);
		obj.start();
		
		}
}