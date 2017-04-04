package transitionModel;

public class Consumer extends Agent {
	private int demand;
	
	public Consumer(float longitude, float latitude, int demand) {
		super(longitude, latitude);
		if(demand >= 0){
			this.demand = demand;
		}else{
			System.out.println("Invalid demand"); // need improve
		}
		
		// for further attributes
		
	}
	
	public int getdemand() {
		return demand;
	}
	

}

political prefernece