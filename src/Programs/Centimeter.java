package Programs;

public class Centimeter implements Quantity{

	private double cm;
	
	public Centimeter(){}
	
	public Centimeter(double cm){
		this.cm=cm;
	}

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}

	@Override
	public double ToCentimeter() {
		
		return this.cm;
	}

	@Override
	public Object convert(Quantity obj1) {
		double value=obj1.ToCentimeter();
		
		this.cm= value;
	return this;
	}
	
	
	
}
