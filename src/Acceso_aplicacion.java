/*
 Sintaxis:
  while(condicion){
  	linea 1
  	linea 2
  	linea 3
  	linea 4
  }
 */
import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		
		String clave="Rolando";
		String pass="";
		
		while(clave.equals(pass)==false) {
			pass=JOptionPane.showInputDialog("Introduce la contraseņa, porfavor");
			
			if(clave.equals(pass)==false) { 
				System.out.println("contraseņa incorrecta");
			}
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
	}
}
