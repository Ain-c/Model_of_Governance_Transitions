package transitionModel;

/*
 * cosine similarity calculator
 */
public class CosineSimilarity {
	
	 public static double cosineSimilarity(float[] attribute1, float[] attribute2) {   
		 if(attribute1.length != attribute2.length){
			 System.out.print("different length of array when count cosine similarity");
			 return 0.0;
		 }
		 double dotProduct = 0.0;   
		 double square1 = 0.0;   
		 double square2 = 0.0;   
		 double cosineSimilarity = 0.0;   
	  
		 for (int i = 0; i < attribute1.length; i++) { //attribute1 and attribute2 must be of same length   
			 dotProduct += attribute1[i] * attribute2[i];  //dot product between a and b   
			 square1 += Math.pow(attribute1[i], 2); 
			 square2 += Math.pow(attribute2[i], 2); 
		 }   

		 square1 = Math.sqrt(square1);
		 square2 = Math.sqrt(square2);
			  
		 if (square1 != 0.0 | square2 != 0.0) {   
			 cosineSimilarity = dotProduct / (square1 * square2);   
		 } else {   
			 return 0.0;   
		 }   
		 return cosineSimilarity;   
	 }   
}
