package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class AwtExample extends Frame {
	TextField UserName;Label UserNameLabel;Label PasswordLabel;TextField Password;
	public void AwtExample() {
		Label lab = new Label("Welcome To Java Tutortial");
		UserNameLabel = new Label("UserName");
		UserName = new TextField(20);
		UserName.setText("UserName");
		PasswordLabel = new Label("Password");
		Password = new TextField(20);
		Password.setText("Password");
		Button login = new Button("Login");
		Button Reset = new Button("Reset");
		UserNameLabel.setBounds(10, 10, 100,20 );
		UserName.setBounds(150, 10, 150, 20);
		PasswordLabel.setBounds(10,50,100,20);
		Password.setBounds(150,50,150,20);
		login.setBounds(50, 100, 100, 20);
		Reset.setBounds(200, 100, 100, 20);
		setLayout(null);
		add(UserNameLabel);
		add(UserName);
		add(PasswordLabel);
		add(Password);
		add(login);
		add(Reset);
		setSize(400,400);
		
		
		
		
		
		
		
		
	}
	
	

}
