import javax.swing.*;

public class Entrada_Numeros {

	public static void main(String[] args) {
		//double x=10000.0;
		
		//System.out.println(x/3);
		
		//System.out.printf("%1.2f",x/3); //dos decimales
		
		//System.out.printf("%1.4f",x/3); //cuatro decimales
		
		String num1=JOptionPane.showInputDialog("introduce un numero");
		
		double num2=Double.parseDouble(num1);
		
		System.out.print("La raiz de "+num2+" es ");
		
		//System.out.printf("%1.2f",Math.sqrt(num2));
		
		System.out.printf("%1.4f",Math.sqrt(num2));
		
		

	}

}
