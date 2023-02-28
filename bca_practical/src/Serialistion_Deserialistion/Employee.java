package Serialistion_Deserialistion;

import java.io.Serializable;

public class Employee implements Serializable {
	
	transient String Name;
	int Studentid;
	int MoblieNumber;
	public Employee(String name,int id,int number) {
		this.Name = name;
		this.Studentid = id;
		this.MoblieNumber = number;
	}

}
