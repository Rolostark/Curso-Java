/*
	Do{
		linea 1
		linea 2
		linea 3
		linea 4
	}while(condicion);
)
*/

import java.util.Scanner;

public class Adivina_Numero_II {

	public static void main(String[] args) {
		int aleatorio =(int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		do{
			intentos++;
			System.out.println("introduce un numero, porfavor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("Mas Bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Mas alto");
			}
			
		}while(numero!=aleatorio);
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
	}

}
