package transitionModel;

public class Prosumer extends Consumer{
	private int resource;
	
	public Prosumer(float longitude, float latitude, int demand, int resource) {
		super(longitude, latitude, demand);
		if(resource >= 0){
			this.resource = resource;
		}else{
			System.out.println("Invalid resource"); // need improve
		}
		
		// for further attributes
		
	}
	
	public int getresource() {
		return resource;
	}
	
	
	public void joinAlliance(Alliance alliance) {
		
	}

}
