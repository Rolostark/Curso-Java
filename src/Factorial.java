/*
	Factorial
	---------
	6! = 6x5x4x3x2x1=720
	
 */

import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		//int resultado=1;
		
		Long resultado=1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
		
		for(int i=numero;i>0;i--) {
			resultado=resultado*i;
		}
		System.out.println("El factorial de " +numero+" es "+resultado);
	}

}
