package transitionModel;

public abstract class Agent {
	//private Information information;
	private float[] attribute;
	private double entrepreneurial;//how an agent is willing to form an alliance, range from 0 to 1

	
	public Agent(float[] attribute, double entrepreneurial) {
		this.attribute = attribute;
		this.entrepreneurial = entrepreneurial;
	}
	
	public float[] getAttribute() {
		return attribute;
	}
	
	public double getEntrepreneurial() {
		return entrepreneurial;
	}
	
	
}
