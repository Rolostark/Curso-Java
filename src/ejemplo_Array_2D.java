/*
     10%			  11%			  12%			  13%			  14%			  15%
-------------------------------------------------------------------------------------------- 
S/ 10,000.00	S/ 10,000.00	S/ 10,000.00	S/ 10,000.00	S/ 10,000.00	S/ 10,000.00
S/ 11,000.00	S/ 11,100.00	S/ 11,200.00	S/ 11,300.00	S/ 11,400.00	S/ 11,500.00
S/ 12,100.00	S/ 12,321.00	S/ 12,544.00	S/ 12,769.00	S/ 12,996.00	S/ 13,225.00
S/ 13,310.00	S/ 13,676.31	S/ 14,049.28	S/ 14,428.97	S/ 14,815.44	S/ 15,208.75
S/ 14,641.00	S/ 15,180.70	S/ 15,735.19	S/ 16,304.74	S/ 16,889.60	S/ 17,490.06

*/

public class ejemplo_Array_2D {

	public static void main(String[] args) {
		double acumulado;
		double interes =0.10;
		
		double [][]saldo=new double[6][5];
		
		for(int i=0;i<6;i++) {
			saldo[i][0]=1000;
			acumulado=10000;
			for(int j=1;j<5;j++) {
				acumulado =acumulado+(acumulado*interes);
				saldo[i][j]=acumulado;
			}
		
			interes=interes+0.01;
		}
		
		for(int z=0;z<6;z++) {
			System.out.println();
			for(int h=0;h<5;h++) {
				System.out.printf("%1.2f",saldo[z][h]);
				System.out.print(" ");
			}
		}
			
	}
}
