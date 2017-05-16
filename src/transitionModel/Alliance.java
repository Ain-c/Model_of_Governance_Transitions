package transitionModel;

import java.util.*;

import technic.*;

public class Alliance{
	private ArrayList<Prosumer> prosumerList = new ArrayList();
	private Technic technic;
	private float[] attribute;

	
	private Alliance(ArrayList List, Technic technic, float[] attributes) {
		this.prosumerList = prosumerList;
		this.technic = technic;
		this.attribute = attribute;
	}
	
	public Alliance formAlliance(ArrayList<Prosumer> founder){
		
	}
	
	private Technic pickTechnic(){
		
	}
	
	public void addProsumer(Prosumer prosumer) {
		this.prosumerList.add(prosumer);
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
