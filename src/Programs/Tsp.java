package Programs;

public class Tsp implements Volume{

	private double tsp;
	private double conversionToTsp;
	public Tsp(int tsp) {
		super();
		this.tsp = tsp;
	}
	
	public Tsp(){}

	public Tsp(double tsp){this.tsp=tsp;}
	
	@Override
	public double ToLowerMeasure() {
		
		return this.tsp*1;
	}

	

	

	@Override
	public Object convert(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.tsp= value/conversionToTsp;
		System.out.println(this.tsp);
	return this;
	}

	@Override
	public Object addition(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		System.out.println(this.tsp+value/conversionToTsp);
		return new Tsp(this.tsp+value/conversionToTsp); 
	}
}
