import java.util.*;

public class entrada_ejemplo1 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu nombre, por favor");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Hola "+nombre_usuario+". El a�o que viene tendras "+(edad+1)+" a�os");

	}

}
