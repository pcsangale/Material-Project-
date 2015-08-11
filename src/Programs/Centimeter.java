package Programs;

public class Centimeter implements Length{

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
	public double ToLowerMeasure() {
		
		return this.cm;
	}

	@Override
	public Object convert(Length obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.cm= value;
	return this;
	}

	@Override
	public Object addition(Length obj1) {
		double value=obj1.ToLowerMeasure();
		//System.out.println(this.cm+value);
		return new Centimeter(this.cm+value); 	
	}

	
	
	
}
