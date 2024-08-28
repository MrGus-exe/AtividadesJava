package Default;

import java.util.Scanner;

public class Atvd_1 {

	public static void main(String[] args) {
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		float media = 0;
		float c = 0;
		for (int i = 0; i < 5; i++) {
			
			System.out.println("digite um valor");
		   media = sc.nextFloat();		
           c =  c + media;		
			
		}
		
		System.out.println("A soma dos valores é: " + c);
		System.out.println("A a Media dos valores é: " + c / 5);
		
		
		
		sc.close();
        
		
	}

}
