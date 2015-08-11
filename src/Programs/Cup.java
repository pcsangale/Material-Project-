package Programs;

public class Cup implements Volume{

	public Cup(){}
	
	public Cup(double cup) {
		super();
		this.cup = cup;
	}

	private double cup;
	private double conversionToTsp=48;
	
	@Override
	public double ToLowerMeasure() {
		
		return this.cup*conversionToTsp;
	}

	@Override
	public Object convert(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.cup= value/conversionToTsp;
		
		return this;
	}

	@Override
	public Object addition(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		System.out.println("***"+this.cup+value/conversionToTsp);
		return new Cup(this.cup+value/conversionToTsp); 
	}

	
	
	

	
	
	
}
