
public class Manipulacion_cadena_II {

	public static void main(String[] args) {
		String frase = "Hoy es un estupendo dia para aprender a programar en java";
		
		//String frase_resumen=frase.substring(1, 3); 
		
		//String frase_resumen=frase.substring(29, 57);
		
		//String frase_resumen=frase.substring(29, 30);
		
		String frase_resumen=frase.substring(0, 29)+" irnos a la playa y olvidarnos de todo ..."+" y "+
		frase.substring(29, 57);
		
		System.out.println(frase_resumen);
				
		

	}

}
