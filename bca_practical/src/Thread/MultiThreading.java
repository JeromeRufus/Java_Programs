package Thread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MultiThreading  extends Thread {
	
	public  void run() {
		this.fileReader();
	}
	
	public synchronized void fileReader() {
		File file1 = new File("C:\\Users\\jerome rufus\\Documents\\JavaFile\\File1.txt");
		File file2 = new File("C:\\Users\\jerome rufus\\Documents\\JavaFile\\File2.txt");
		File file3 = new File("C:\\Users\\jerome rufus\\Documents\\JavaFile\\File3.txt");
		File file4 = new File("C:\\Users\\jerome rufus\\Documents\\JavaFile\\File4.txt");
		File file5 = new File("C:\\Users\\jerome rufus\\Documents\\JavaFile\\File5.txt");
		try {
			
			FileReader fr1 = new FileReader(file1);
			BufferedReader br1 = new BufferedReader(fr1);
		
			
			FileReader fr2 = new FileReader(file2);
			BufferedReader br2 = new BufferedReader(fr2);
		
			
			FileReader fr3 = new FileReader(file3);
			BufferedReader br3 = new BufferedReader(fr3);
			
			
			FileReader fr4 = new FileReader(file4);
			BufferedReader br4 = new BufferedReader(fr4);
		
			
			FileReader fr5 = new FileReader(file5);
			BufferedReader br5 = new BufferedReader(fr5);
			
			
			String str1, str2 = "",str3 = "",str4 = "",str5 = " ";
			while((str1 = br1.readLine()) != null &&  (str2 = br2.readLine()) != null && (str3 = br3.readLine()) != null && (str4 = br4.readLine()) != null && (str5 = br5.readLine()) != null   )  {
				System.out.println(str1);
				Thread.sleep(1000);
				System.out.println(str2);
				
				System.out.println(str3);
				System.out.println(str4);
				System.out.println(str5);
			}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		System.out.println(Thread.currentThread().getName());
	}
}
	
	
