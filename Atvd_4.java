package Default;

import javax.swing.JOptionPane;

public class Atvd_4 {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		String ano = JOptionPane.showInputDialog("Digite seu ano de nascimento");
		
		
		int ano2 = Integer.parseInt(ano);
		
		int idade = 2024 - ano2;
		
		JOptionPane.showMessageDialog(null, "seu nome é: " + nome + " \n sua idade é: "+ idade);
		
		

	}

}
