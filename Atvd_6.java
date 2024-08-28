package Default;

import javax.swing.JOptionPane;

public class Atvd_6 {

	public static void main(String[] args) {
		
		String entSal = JOptionPane.showInputDialog("Digite seu salário: ");
		double sal = Integer.parseInt(entSal);
		
		double nsal = sal + (sal * 15 / 100);
		
		String Form = String.format("\n o salario atualizado é: %.2f\n",nsal );
		
		JOptionPane.showMessageDialog(null," o salario antigo era :" + sal + Form);
		

	}

}
