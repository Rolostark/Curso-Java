/* sin modulacion tendriamos a si la clase desordenada
 * junto con la clase principal y el metodo main mezaclado
 * */
package poo;

public class Coche2 {
	//atributos propiedades
	int ruedas; //caracteristicas
	int largo;
	int ancho;
	int motor;
	int peso;
	
	//metodo constructor
	public Coche2(){
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
	}
	
	public static void main(String[] args) { // clase principal
		//OBJETO
		Coche Renault=new Coche(); //INSTANCIAR CLASE. EJEMPLARIZANDO UNA CLASE
		
		System.out.println("Este coche tiene "+Renault.ruedas+" ruedas");

	}

}
