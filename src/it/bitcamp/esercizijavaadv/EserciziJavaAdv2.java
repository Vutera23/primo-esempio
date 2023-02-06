package it.bitcamp.esercizijavaadv;

public class EserciziJavaAdv2 {

	public static void main(String[] args) {
		

		int[]a = {1,2,3,4,55,6,7,8,9,};
		
		
		ValoreCrescenti(a);
		System.out.println(ValoreCrescenti(a));
			
		}
	
	public static boolean ValoreCrescenti(int[]a) {
			
				for (int i = 0; i < a.length - 1; i++) {
					 if (a[i] < a[i+1]) {
						return  true;
						
						
							}
					 
					 	 	
					
			}
						return  false;
				
	}
}

			
				
				

