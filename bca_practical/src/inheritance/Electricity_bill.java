package inheritance;

public class Electricity_bill {
	Double bill;
	void billpay (Double units)
	{
		 if(units<100)  
				bill=units*1.20;
			  else if(units<=300)
				bill=100*1.20+(units-100)*2;
			  else if(units>300)
				bill=100*1.20+200 *2+(units-300)*3;
	}

}


