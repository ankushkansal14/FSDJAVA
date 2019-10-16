import java.io.*;
class Exercise1
{
    public static void main(String[] args) throws java.io.IOException {
      
        char[] in = new char[100];
		int size = 0;
		File file = new File("anotherFile.txt"); 
		int j=0;

 		try {
  
 
				FileWriter fw = new FileWriter(file); // create an actual file
				// & a FileWriter obj
				fw.write("\nHello\nguys\nhow\nare\nyou\ndoing\nwe\nare\nalmost\ndone\nwith\ncore"); // write characters to
				// the file
				fw.flush(); // flush before closing
				fw.close(); // close file when done
				} 
				catch(IOException e) {
				    System.out.println("Can't write to the file currently...");
 				}
			

				FileReader fr =
new FileReader(file); // create a FileReader
// object
size = fr.read(in); // read the whole file!
System.out.print(size + " "); // how many bytes read
for(char c : in) // print the array
{

System.out.print(c);
if(c=='\n')
{
System.out.print(++j + ". ");
}
}
fr.close(); // again, always close
}
}
  
			
 
 				
 
 
   
