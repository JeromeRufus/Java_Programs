package Serialistion_Deserialistion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee det = new Employee("Jerome",1,56789);
		//serilazible
		try {
//			File file = new File("C:\\Users\\jerome rufus\\JavaFile.txt");
//			if(! file.exists()) {
//				file.createNewFile();
//				System.out.println("File Created");
//			}
			FileOutputStream fos = new FileOutputStream("C:\\Users\\jerome rufus\\JavaFile.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(det);
			oos.close();
			fos.close();
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\jerome rufus\\JavaFile.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee obj = (Employee) ois.readObject();
			fis.close();
	
			System.out.println("File Deserialized");
			System.out.println(det.Name +"        "+det.Studentid+"   "+det.MoblieNumber);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
