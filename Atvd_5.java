package Default;

import java.util.Scanner;

public class Atvd_5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		
	    System.out.println("Digite o nome do produto ");
		String nome = sc.next();
	    
		System.out.println("Digite o preço do produto ");
		float preco = sc.nextFloat();
		
		System.out.println("Digite a porcentagem do desconto ");
		int desc = sc.nextInt();
		
		System.out.println("Produto: "+ nome);
		System.out.println("preço s/desconto: "+ preco);
		float npreco = preco - (preco * desc / 100);
		System.out.println("preço c/desconto: "+ npreco);
		
   sc.close();
	}

}
