import java.io.*;
import java.util.*;

class CopyDataThread extends Thread
{
	private FileReader fr;
	private FileWriter fw;
	CopyDataThread(FileReader fr,FileWriter fw)
	{
		this.fr=fr;
		this.fw=fw;
	}
		public void run()
		{
			try{
					char[] in = new char[100]; 
					int size = 0;
					char[] copyChar = new char[100]; 
					// File file = new File("anotherFile.txt");
					// File copyFile=new File("second.txt");
					// FileReader fr =new FileReader(file); 
					size = fr.read(in); 
					System.out.print(size + " "); 
					// FileWriter fw = new FileWriter(copyFile);

					for(int i=1;i<=size;i++)
					{
						fw.write(in[i]);
							if(i % 10 ==0)
							{		
									System.out.println(copyChar);
									System.out.println("10 Characters Copied");
									Thread.sleep(5000);
									

							}		
						
					}
					// FileWriter fw = new FileWriter(copyFile); 
					// fw.write(); 
					// fw.flush(); // flush before closing
					// fw.close(); // close file when done
					fr.close();
					fw.close();
					} 
					catch(Exception e) {
					    System.out.println("Can't write to the file currently...");
					}
		
					
					 
			
		}
	}