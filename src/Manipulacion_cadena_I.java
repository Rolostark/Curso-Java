
public class Manipulacion_cadena_I {
 
	public static void main(String[] args) {
		
		String nombre="Felipe"; // String objeto="valor";
		
		System.out.println("Tu nombres es "+nombre); //System.out.println("..."+objeto);
		
		System.out.println("Mi nombre tiene "+nombre.length()+" letras."); // System.out.println("..."+objeto.metodo()+"...");
		
		System.out.println("la primera letra de "+nombre+" es la "+nombre.charAt(0)); //System.out.println("..."+objeto+"..."objeto.metod(indice));
		
		int ultima_letra;
		
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es la "+nombre.charAt(ultima_letra-1)); //System.out.println("..."+objeto+"..."objeto.metod(indice-cuenta_desde_cero));
	}
}
