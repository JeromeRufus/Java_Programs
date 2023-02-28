package intf_practical;

public class Rectangle implements Shape {
public Double length;
public Double breath;

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return (length * breath);
	}

}
