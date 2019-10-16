import java.io.*;

class Exercise2
{
	public static void main(String [] args) throws IOException {
	char[] in = new char[100]; // to store input
	int size = 0;
	int lines=0;
	int words=0;
	File file = new File("anotherFile.txt"); //Again this is just an object
	
		FileReader fr =new FileReader(file); 
		size = fr.read(in); 
		System.out.print(size + " "); 
		for(char c : in) // print the array
		{
		if(c=='\n')
			++lines;

		
	}
	System.out.println("\nLines Are :"+lines);
	StringBuilder sb = new StringBuilder("");
 
BufferedReader br = new BufferedReader(new FileReader(file));
String str = "";
while((str = br.readLine()) != null)
{
   if(!(str.equals("")))
   {
   	String[] wordList = str.split("\\s+");
   	words += wordList.length; 
   } 
}
br.close();
// fr.close();
System.out.println("Contents from file are : " + words);

  
}
 
 }


