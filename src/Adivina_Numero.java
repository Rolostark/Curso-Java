import java.util.*;
public class Adivina_Numero {

	public static void main(String[] args) {
		
		int aleatorio =(int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio){
			intentos++;
			System.out.println("introduce un numero, porfavor");
			numero=entrada.nextInt();
			if(aleatorio<numero) {
				System.out.println("Mas Bajo");
			}
			else if(aleatorio>numero) {
				System.out.println("Mas alto");
			}
		}
		System.out.println("Correcto. Lo has conseguido en "+intentos+" intentos");
	}
}
