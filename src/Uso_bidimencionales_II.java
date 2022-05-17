
public class Uso_bidimencionales_II {

	public static void main(String[] args) {
		
		int [][] matrix= {
				{10,15,18,19,21},
				{5,25,37,41,15},
				{7,19,32,14,90},
				{85,2,7,40,27},
		}; 
		/*
		for(int i=0;i<4;i++) {
			System.out.println();  //poner encima de otro
			for(int j=0;j<5;j++) {
				
				System.out.print(matrix[i][j]+" ");
				
			}
		}
		*/
		
		for(int[]fila:matrix) { //for each
			System.out.println();
			for(int z:fila) {
				System.out.print(z+" ");
			}
		}
		
	}
}
