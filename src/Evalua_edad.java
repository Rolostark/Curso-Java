import java.util.*;

public class Evalua_edad {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("introduce tu edad porfavor ");
		
		int edad=entrada.nextInt();
		
		/*
		if(edad >=18) { // condcion evaluar
			System.out.println("Eres Mayor de edad"); //verdadero
		}
		else {  //y si no es verdad
			System.out.println("Eres menor de edad"); //falso
		}
		*/
		if(edad<18) {
			System.out.println("Eres un adolecente");
		}else if(edad<40){
			System.out.println("Eres joven");
		}else if(edad<65) {
			System.out.println("Eres maduro");
		}else{
			System.out.println("Cuidate");
		}
		
	}
}
