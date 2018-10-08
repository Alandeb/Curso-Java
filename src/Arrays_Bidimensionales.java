
public class Arrays_Bidimensionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] matrix={
				{10,15,2,76,-9},
				{85,-22,4,35,99},
				{64,68,31,7,-3},
				{1,53,94,33,8}
		};
		
		for(int[] fila:matrix){
			System.out.println();//le da salto de linea cuando termina cada fila
			for (int z:fila){
				System.out.print(z + " ");
			}
		}
		/*int [][] matrix= new int[4][5];//primera dimension, segunda dimension
		
		matrix [0][0]=5;
		matrix [0][1]=18;
		matrix [0][2]=29;
		matrix [0][3]=80;
		matrix [0][4]=3;
		
		matrix [1][0]=-9;
		matrix [1][1]=71;
		matrix [1][2]=32;
		matrix [1][3]=-24;
		matrix [1][4]=62;
		
		matrix [2][0]=54;
		matrix [2][1]=22;
		matrix [2][2]=-39;
		matrix [2][3]=1;
		matrix [2][4]=97;
		
		matrix [3][0]=74;
		matrix [3][1]=43;
		matrix [3][2]=39;
		matrix [3][3]=96;
		matrix [3][4]=-63;

		for (int i=0; i<4; i++){
			System.out.println();
			for (int j=0; j<5; j++){
				System.out.print(matrix[i][j] + " ");
			}
		}*/
	}

}
