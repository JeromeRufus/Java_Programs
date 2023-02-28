package AWT;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Login implements ActionListener {
	TextField UserName;Label UserNameLabel;Label PasswordLabel;TextField Password;
	Button login,Reset;
	Label p;
	
	Login(){
	Frame obj = new Frame();
	p = new Label();
	
	
	//Label lab = new Label("Welcome To Java Tutortial");
	UserNameLabel = new Label("User Name");
	UserNameLabel.setBounds(10,50,100,20);
	//UserNameLabel.setBounds(0, 0, 0, 0);
	
	UserName = new TextField(20);
	UserName.setText("UserName");
	UserName.setBounds(150,50,150,20);
	UserName.addActionListener(this);
	
	PasswordLabel = new Label("Password");
	PasswordLabel.setBounds(10,100,100,20);
	
	Password = new TextField(20);
	Password.setText("Password");
	Password.setBounds(150,100,150,20);
	
	
	login = new Button("Login");
	login.setBounds(50, 150, 100, 20);
	login.addActionListener(this);
	
	Reset = new Button("Reset");
	Reset.setBounds(200, 150, 100, 20);
	Reset.addActionListener(this);
	
	
	

	
	obj.setLayout(null);
	obj.add(p);
	obj.add(UserNameLabel);
	obj.add(UserName);
	obj.add(PasswordLabel);
	obj.add(Password);
	obj.add(login);
	obj.add(Reset);
	obj.setSize(400,300);
	obj.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// TODO Auto-generated method stub
		System.out.println("Enter");
		if(e.getSource() == login) {
			String user = UserName.getText();
			String password = Password.getText();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection obj = DriverManager.getConnection("jdbc:mysql://localhost/loginpage","root","");
				System.out.println("Connected");
				Statement st = obj.createStatement();
				st.execute("insert into customer(UserName,Password) values('Jerome','Rufus@11')  ");
				System.out.println("Inserted");
				
			}
			catch(Exception i) {
				i.printStackTrace();
				
			}
		}
		if(e.getSource().equals(Reset)) {
			p.addInputMethodListener(UserNameLabel);
			
			
			
		}
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login obj = new Login();
		
	}
	
}
	

