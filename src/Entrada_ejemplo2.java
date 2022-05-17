import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre, profavor ");
		
		String edad=JOptionPane.showInputDialog("introduce tu edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		//System.out.println("Hola "+nombre_usuario+". El año que viene tendras "+(edad_usuario+1)+" años");
		
		System.out.println("Hola "+nombre_usuario+". El año que viene tendras "+edad_usuario+" años");
		
	}

}
