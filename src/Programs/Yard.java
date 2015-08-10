package Programs;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Yard implements Quantity {

 private double yard;
	
 	
 	public Yard(){}
 
	public Yard(double yard) {
	super();
	this.yard = yard;
}



	@Override
	public double ToCentimeter() {
		
		return this.yard* new ConversionFactor().getYardToCm();
	}



	@Override
	public Object convert(Quantity obj1) {
		double value=obj1.ToCentimeter();
		
		this.yard= value/(new ConversionFactor().getYardToCm());
	return this;
	}

	
	
}
