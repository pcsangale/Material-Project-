package Programs;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;

public class Yard implements Length {

 private double yard;
	
 	
 	public Yard(){}
 
	public Yard(double yard) {
	super();
	this.yard = yard;
}



	@Override
	public double ToLowerMeasure() {
		
		return this.yard* new ConversionFactor().getYardToCm();
	}



	@Override
	public Object convert(Length obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.yard= value/(new ConversionFactor().getYardToCm());
	return this;
	}

	@Override
	public Object addition(Length obj1) {
		double value=obj1.ToLowerMeasure();
		//System.out.println(this.yard+value/new ConversionFactor().getYardToCm());
		return new Yard(this.yard+value/new ConversionFactor().getYardToCm()); 
	}

	
	
	
	
}
