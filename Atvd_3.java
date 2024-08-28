package Default;

import java.util.Scanner;

public class Atvd_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de horas trabalhadas");
		int ht = sc.nextInt();
		
		System.out.println("Digite o número de dias trabalhados");
		int dt = sc.nextInt();
		
		System.out.println("Digite o valor de horas trabalhadas");
		int vh = sc.nextInt();
		
		System.out.println(" o seu salário é: "+ (vh * ht * dt ));
		
		
		
		
		
    sc.close();
	}

}
