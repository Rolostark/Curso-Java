import java.util.*;
import javax.swing.*;

public class Areas {

	public static void main(String[] args) {
		Scanner entrada =new Scanner(System.in);
		
		System.out.println("Elige una  opcion: \n1: Cuadrado \n2: Rectangulo \n3: Trinagulo \n4: Circulo");
		
		int figura =entrada.nextInt();
		
		switch(figura) {
		
		case 1:
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadra es "+Math.pow(lado, 2));
			break;
		
		case 2:
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es: "+(base*altura));
			break;
		case 3:
			base=Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del Triangulo es: "+(base*altura)/2);
			break;
		case 4:
			int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce el radio"));
			System.out.println("El area del circulo es ");
			System.out.printf("%1.2f",Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("la opcion no es correcta");
		}
	}
}
