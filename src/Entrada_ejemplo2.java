import javax.swing.JOptionPane;

public class Entrada_ejemplo2 {

	public static void main(String[] args) {
		String nombre_usuario=JOptionPane.showInputDialog("introduce tu nombre, profavor ");
		
		String edad=JOptionPane.showInputDialog("introduce tu edad, por favor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		edad_usuario++;
		
		//System.out.println("Hola "+nombre_usuario+". El a�o que viene tendras "+(edad_usuario+1)+" a�os");
		
		System.out.println("Hola "+nombre_usuario+". El a�o que viene tendras "+edad_usuario+" a�os");
		
	}

}
