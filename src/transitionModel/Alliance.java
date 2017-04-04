package transitionModel;

import java.util.*;

import technic.*;

public class Alliance {
	private ArrayList prosumerList = new ArrayList();
	private Technic technic;
	private int resourceRequirement;
	private int capacity;
	
	private Alliance(ArrayList List, Technic technic, int resourceRequirement, int capacity) {
		this.prosumerList = prosumerList;
		this.technic = technic;
		this.resourceRequirement = resourceRequirement;
		this.capacity = capacity;
	}
	
	public void formAlliance() {
		
	}
	
	private Technic pickTechnic(String technicName) {
		switch(technicName.toLowerCase()){
		case "solarpanel":
			Technic technic = new Solarpanel();
			break;
		case "windfarm":
			Technic technic = new Windfarm();
			break;
		// add technique
		default:
			System.out.println("no such technic");
			break;
		}
		return technic;
	}
	
	public void addProsumer() {
		
	}
	
	
	public int getOutput() {
		int output = 0;
		//add codes
		return output;
	}
	
	public ArrayList getAlliance() {
		return prosumerList;
	}
	
	
	
}
