package it.bitcamp.esercizijavaadv;

public class EserciziJavaAdv4 {

	public static void main(String[] args) {
		
		boolean x = false;
		int [] arr1 = {2, 4, 6, 8, 10, 12, 16};
			for(int i = 0; i < arr1.length; i++) {
				if((arr1[i] %2 == 0) && (arr1[i] >=0)) {
					x = true;
				}else {
					x = false;
					break;
				}
			}
		if(x == true) {
			System.out.println("Tutti positivi e pari");
		} else {
			System.out.println("NO");
		}
	}

}
