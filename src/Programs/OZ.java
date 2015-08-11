package Programs;

public class OZ implements Volume{

	private double oz;
	private double conversionToTsp=6;
	
	public OZ(double oz){
		this.oz=oz;
	}
	
	public OZ(){}

	@Override
	public double ToLowerMeasure() {
		
		return this.oz*conversionToTsp;
	}

	

	
	@Override
	public Object convert(Volume obj1) {
		double value=obj1.ToLowerMeasure();
		
		this.oz= value/conversionToTsp;
	return this;
	}

	@Override
	public Object addition(Volume obj1) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

