package poo;

public class Uso_Coche { //clase principal por tener el metodo main

	public static void main(String[] args) {
		//OBJETO
		Coche Renault=new Coche(); //INSTANCIAR CLASE. EJEMPLARIZANDO UNA CLASE
		
		//Renault.ruedas=3; // no deberia acceder a las propiedades
		
		//no se puede acceder a la propiedad ruedad xq esta en acceso privado
		System.out.println("Este coche tiene "+Renault.ruedas+" ruedas");
		

	}

}
