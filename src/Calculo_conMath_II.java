
public class Calculo_conMath_II {

	public static void main(String[] args) {
		/*
		float num1=5.85f;
		
		int resultado=Math.round(num1);
		
		System.out.println(resultado);
		*/
		/*
		double num1=5.85f;
		
		int resultado=(int)Math.round(num1); //(refundicion)clase.metodo(valor_variable)
		
		System.out.println(resultado);
		*/
		
		double base=5;
		double exponente=3;
		int resultado=(int)Math.pow(base, exponente); //(refundicion)clase.metodo(valor_variable)
		
		System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+resultado);
		
	}

}
