package it.bitcamp.esercizijavaadv;

public class EserciziJavaAdv3 {

	public static void main(String[] args) {
		
		boolean x = false;
		int [] numeri = {7,8,5,2,4,4,4,8,1,9};
			for (int i = 0; i < numeri.length-2;i++) {
				for (int j = i+1; j < numeri.length-1;j++) {
					for (int l = j+1; l < numeri.length; l++) {
						if((numeri[i] == numeri[j]) && (numeri[j] == numeri[l])) {
							x = true; 
							}
						
					}
					
				}
			}
		if (x == true) {
			System.out.println("Tre valori consecutivi uguali" );
		}else {
			System.out.println("NO");
		}	
	}

}
