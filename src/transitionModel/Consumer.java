package transitionModel;

public class Consumer extends Agent {
	private float demand;
	
	public Consumer(float[] attribute, double entrepreneurial) {
		super(attribute, entrepreneurial);
		if(attribute.length != World.consumerAttributeAmount){
			System.out.print("wrong length of consumer's attribute");
		}
	}	
	
	public float getDemand() {
		demand = this.getAttribute()[World.whereDemand];
		//can add something
		return demand;
	}
	

}
