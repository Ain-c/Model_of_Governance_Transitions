package technic;

public enum Techtype {
    Windfarm, Solarpanel;
	
	public static Techtype pickTech() {
		
	}
	
	public static Technic createTechnic(Techtype technicName) {
		Technic technic;
		// choose a technique based on the inputed name
		switch(technicName.toString().toLowerCase()) {
		case "solarpanel":
			technic = new Solarpanel();
			break;
		case "windfarm":
			technic = new Windfarm();
			break;
		// add technique
		default:
			System.out.println("no such technic");
			return null; // if it's a wrong name
		}
		return technic;
	}
}
