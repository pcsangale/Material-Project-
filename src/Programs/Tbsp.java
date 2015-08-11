package Programs;

public class Tbsp implements Volume {

	private double tbsp;
	private double conversionToTsp=3;
	
	public Tbsp(){}
	
	public Tbsp(double tbsp) {
		super();
		this.tbsp = tbsp;
	}

	@Override
	public double ToLowerMeasure() {
		
		
		return this.tbsp*conversionToTsp;
	}

	

	

	@Override
	public Object convert(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.tbsp= value/conversionToTsp;
	return this;
	}

	@Override
	public Object addition(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		System.out.println(this.tbsp+value/conversionToTsp);
		return new Tbsp(this.tbsp+value/conversionToTsp); 
	}
	
}
