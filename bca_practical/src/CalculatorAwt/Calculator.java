package CalculatorAwt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener  {
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
	TextField tf;
	int c,n;
	double d;
	Label p;
	Label l2;
	String s1,s3,s4,s5;
	int s2;

	
	
	
	 Calculator() {
		Frame obj = new Frame("Calculator");
		p  = new Label();
		p.setBackground(Color.LIGHT_GRAY);
		p.setBounds(50, 50, 260, 60);
		
		
		b1 = new Button("1");
		b1.setBounds(50,340,50,50);
		b1.addActionListener(this);
		
		b2 = new Button("2");
		b2.setBounds(120,340,50,50);
		b2.addActionListener(this);
		
		b3 = new Button("3");
		b3.setBounds(190,340,50,50);
		b3.addActionListener(this);
		
		b4 = new Button("4");
		b4.setBounds(50,270,50,50);
		b4.addActionListener(this);
		
		b5 = new Button("5");
		b5.setBounds(120,270,50,50);
		b5.addActionListener(this);
		
		b6 = new Button("6");
		b6.setBounds(190,270,50,50);
		b6.addActionListener(this);
		
		b7 = new Button("7");
		b7.setBounds(50,200,50,50);
		b7.addActionListener(this);
		
		b8 = new Button("8");
		b8.setBounds(120,200,50,50);
		b8.addActionListener(this);
		
		b9 = new Button("9");
		b9.setBounds(190,200,50,50);
		b9.addActionListener(this);
		
		b10 = new Button("0");
		b10.setBounds(120,410,50,50);
		b10.addActionListener(this);
		
		b11 = new Button("+");
		b11.setBounds(260,340,50,50);
		b11.addActionListener(this);
		
		b12 = new Button("-");
		b12.setBounds(260,270,50,50);
		b12.addActionListener(this);
		
		b13 = new Button("*");
		b13.setBounds(260,200,50,50);
		b13.addActionListener(this);
		
		b14 = new Button("/");
		b14.setBounds(260,130,50,50);
		b14.addActionListener(this);
		
		b15 = new Button("%");
		b15.setBounds(190,130,50,50);
		b15.addActionListener(this);
		
		b16 = new Button("C");
		b16.setBounds(50,130,65,50);
		b16.addActionListener(this);
		
		b17 = new Button("=");
		b17.setBounds(260,410,50,50);
		b17.addActionListener(this);
		
		
		
		obj.setLayout(null);
		obj.add(p);
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		obj.add(b5);
		obj.add(b6);
		obj.add(b7);
		obj.add(b8);
		obj.add(b9);
		obj.add(b10);
		obj.add(b11);
		obj.add(b12);
		obj.add(b13);
		obj.add(b14);
		obj.add(b15);
		obj.add(b16);
		obj.add(b17);
		
		obj.setSize(360, 500);
		obj.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b1) {
			s3 = p.getText();
			s4 = "1";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b2) {
			s3 = p.getText();
			s4 = "2";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b3) {
			s3 = p.getText();
			s4 = "3";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b4) {
			s3 = p.getText();
			s4 = "4";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b5) {
			s3 = p.getText();
			s4 = "5";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b6) {
			s3 = p.getText();
			s4 = "6";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b7) {
			s3 = p.getText();
			s4 = "7";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b8) {
			s3 = p.getText();
			s4 = "8";
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b9) {
			s3 = p.getText();
			s4 = "9";
			s5 = s3 + s4;         
			p.setText(s5);
		}
		if(e.getSource() == b10) {
			s3 = p.getText();
			s4 = "0";                       
			s5 = s3 + s4;
			p.setText(s5);
		}
		if(e.getSource() == b11) {
			s1 = p.getText();
			p.setText(s1);
			p.setText("+");
			c = 1;
		}
		if(e.getSource() == b12) {
			s1 = p.getText();
			p.setText("-");
			c = 2;
		}
		if(e.getSource() == b13) {
			s1 = p.getText();
			p.setText("*");
			c = 3;
		}
		if(e.getSource() == b14) {
			s1 = p.getText();
			p.setText("/");
			c = 4;
		}
		if(e.getSource() == b15) {
			s1 = p.getText();
			p.setText("%");
			c = 5;
			
		}
		if(e.getSource() == b17) {
			 s2 = Integer.parseInt(s2);
			 int n = s2;
			 
			 p.setText(s1);
			if (c == 1) {
				n = Integer.parseInt(s1) + Integer.parseInt(s2);
				p.setText(String.valueOf(n));
			}
			else if (c == 2) {
				//s2 = p.getText();
				n = Integer.parseInt(s1) - Integer.parseInt(s2);
				p.setText(String.valueOf(n));
			} 
			else if (c == 3) {
				//s2 = p.getText();
				n = Integer.parseInt(s1) * Integer.parseInt(s2);
				p.setText(String.valueOf(n));

			}
			else if(c == 4) {
				
				if(num != 0) {
				n = Integer.parseInt(s1) / Integer.parseInt(s2);
				p.setText(String.valueOf(n));
				}
				else {
					p.setText(" Must Be Greater Than Zero While Using Division");
				}
			}
			else if(c == 5) {
				
				n = Integer.parseInt(s1) % Integer.parseInt(s2);
				p.setText(String.valueOf(n));
			}
		}
		if(e.getSource() == b16) {
			p.setText("");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator obj = new Calculator();
		

	}


}
