package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class File_Writer {
	
	public void fileWriter() {
		File obj = new File("C:\\Users\\jerome rufus\\JavaFile.txt");
		try {
			if(! obj.exists()  ) {
				obj.createNewFile();
				System.out.println("File Created");
				
			}
			FileWriter fw = new FileWriter(obj);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello Training Content");
			System.out.println("Writer Content In The File");
			bw.close();
			
			FileReader fr = new FileReader(obj);
			BufferedReader br = new BufferedReader(fr); 
			String str = " ";
			while((str = br.readLine()) != null){
				System.out.println(str);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
