package transitionModel;

public abstract class Agent {
	private float longitude;
	private float latitude;
	
	public Agent(float longitude, float latitude) {
		if(isValidLocation(longitude, latitude)){
			this.longitude = longitude;
			this.latitude = latitude;
		}else{
			System.out.println("Invalid location"); // need improve
		}
	}
	
	public float[] getlocation() {
		float[] location = {this.longitude, this.latitude};
		return location;
	}
	
	public abstract int getdemand();
	
	// Whether the location is legitimate.
	public static boolean isValidLocation(float longitude, float latitude) {
		if((longitude > -180 && longitude <= 180) && (latitude >= -90 && latitude <= 90)){
			return true;
		} else {
			return false;
		}
	}
	
}
