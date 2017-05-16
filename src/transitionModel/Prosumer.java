package transitionModel;

import java.util.*;

public class Prosumer extends Consumer{
	private float willingFactor = 1;//this may change due to some reason
	private float resource = this.getAttribute()[World.whereResource];
	private ArrayList<Prosumer> fellow;
	private ArrayList<Alliance> joinedAlliance;
	//the weight of each attribute, all default to be 1
	private float[] eventWeight = new float[World.prosumerAttributeAmount];
	
	public Prosumer(float[] attribute, double entrepreneurial) {
		super(attribute, entrepreneurial);
		Arrays.fill(eventWeight,1);
		if(attribute.length != World.prosumerAttributeAmount){
			System.out.print("wrong length of prosumer's attribute");
		}
	}
	
	public Prosumer(float[] attribute, double entrepreneurial, float[] eventWeight) {
		super(attribute, entrepreneurial);
		if(eventWeight.length == World.prosumerAttributeAmount){
			this.eventWeight = eventWeight;
		} else{
			System.out.print("wrong length of eventWeight");
		}
		if(attribute.length != World.prosumerAttributeAmount){
			System.out.print("wrong length of prosumer's attribute");
		}
	}
	
	public static Prosumer becomeProsumer(Consumer consumer, float[] extraAttribute){
		if(extraAttribute.length == World.prosumerAttributeAmount - World.consumerAttributeAmount){
			System.out.print("wrong length of extra attribute");
		}
		float[] attribute = consumer.getAttribute();
		int Len1 = attribute.length;
		int Len2 = extraAttribute.length;
		attribute = Arrays.copyOf(attribute, Len1 + Len2);// extend the array
		System.arraycopy(extraAttribute, 0, attribute, Len1, Len2);
		Prosumer prosumer = new Prosumer(attribute, consumer.getEntrepreneurial());
		return prosumer;
	}
	
	public static Prosumer becomeProsumer(Consumer consumer, float[] extraAttribute, float[] eventWeight){
		if(extraAttribute.length == World.prosumerAttributeAmount - World.consumerAttributeAmount){
			System.out.print("wrong length of extra attribute");
		}
		float[] attribute = consumer.getAttribute();
		int Len1 = attribute.length;
		int Len2 = extraAttribute.length;
		attribute = Arrays.copyOf(attribute, Len1 + Len2);// extend the array
		System.arraycopy(extraAttribute, 0, attribute, Len1, Len2);
		Prosumer prosumer = new Prosumer(attribute, consumer.getEntrepreneurial(), eventWeight);
		return prosumer;
	}
	
	/*
	 * positive result means a prosumer is willing to join the alliance,
	 * bigger result refers to stronger willing.
	 */
	public double joinWilling(float[] attribute){
		float[] attribute1 = pretreatAttribute(this.getAttribute());
		float[] attribute2 = pretreatAttribute(attribute);
		double cosineSimilarity = CosineSimilarity.cosineSimilarity(attribute1, attribute2);
		double Willing = cosineSimilarity - (1 - this.getEntrepreneurial()) * this.willingFactor;
		return Willing;
	}
	
	private float[] pretreatAttribute(float[] attribute){
		int len = attribute.length;
		if(attribute.length != eventWeight.length){
			System.out.print("wrong attribute length");
			attribute = Arrays.copyOf(attribute, len);
			return attribute;
		}
		float[] attr = new float[len];
		for(int i=0; i<len; i++){
			attr[i] = attribute[i] * this.eventWeight[i];
		}
		return attr;
	}
	
	public void joinAlliance(Alliance alliance) {
		
	}
	
	/*
	 * find all the possible fellows of a prosumer, and store the name list
	 */
	public void seekFellow(ArrayList<Prosumer> prosumer){
		ArrayList<Prosumer> fellow = new ArrayList<Prosumer>();
		for(int i=0; i<prosumer.size(); i++){
			if(joinWilling(prosumer.get(i).getAttribute()) >= 0){
				fellow.add(prosumer.get(i));
			}
		}
		this.fellow = fellow;
	}
	

}
