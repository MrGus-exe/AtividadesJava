package Default;

import java.util.Scanner;
import java.math.*;
import javax.swing.JOptionPane;

public class Atvd_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String entrada = JOptionPane.showInputDialog("Digite o valor do Raio do Círculo");
		
		float raio = Integer.parseInt(entrada);
		 
		double area = (Math.PI * Math.pow(raio, 2) );
		String formato = String.format("A área do círculo é: %.4f\n" , area);
		
		JOptionPane.showMessageDialog(null, formato);
		
		
		
		
		sc.close();
	}

}
