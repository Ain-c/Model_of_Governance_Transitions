package transitionModel;

import java.util.*;

public class World {
	private ArrayList<Consumer> consumer;
	private ArrayList<Prosumer> prosumer;
	private ArrayList<Alliance> alliance;
	
	//the length of consumer's attribute, default to be 5
	public static int consumerAttributeAmount = 5;
	//the length of prosumer's attribute, default to be 7
	public static int prosumerAttributeAmount = 7;
	//the place of longitude in attribute array,default to be 0
	public static int whereLongitude = 0;
	//the place of latitude in attribute array,default to be 1
	public static int whereLatitude = 1;
	//the place of demand in attribute array,default to be 2
	public static int whereDemand = 2;
	//the place of resource in attribute array,default to be 3
	public static int whereResource = 3;
	
	//use this if you want a generic weight for every prosumer
	public float[] genericWeight = {};
	
	public static void main(){
		System.out.println(" ");
		Prosumer prosumer1 = new Prosumer(new float[]{1,2,3},1.2);
		Prosumer prosumer2 = new Prosumer(new float[]{1,2,3},3.3);
		System.out.println(prosumer1);
	}
	
	public static ArrayList<Prosumer> groupFounder(ArrayList<Prosumer> prosumer){
		Prosumer leader;
		Collections.sort(prosumer, new Comparator(){
					@Override
					public int compare(Object o1, Object o2) {
						Prosumer p1=(Prosumer)o1;
						Prosumer p2=(Prosumer)o2;
						if(p1.getEntrepreneurial()>p2.getEntrepreneurial()){
							return -1;
						}else if(p1.getEntrepreneurial()==p2.getEntrepreneurial()){
							return 0;
						}else{
							return 1;
						}
					}
		});
		while(!prosumer.isEmpty()){
			leader = prosumer.get(0);
		
		return founder;
	}
	
	
	
	public static int getGovernanceDemand() {
		int governanceDemand = 0;
		// add codes
		return governanceDemand;
	}
	

}
