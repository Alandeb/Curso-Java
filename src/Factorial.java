import javax.swing.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long resultado=1L;// si usamos int ya a partir de 20 no sale el factorial sale negativo porque no entra
		//Igual con 50 ya no se puede. Hay clase BigInteger, pero se usan objetos
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
		
		for(int i=numero;i>0;i--){
			
			resultado= resultado*i;
		}
		System.out.println("El factorial de " + numero + " es " + resultado + ".");

	}

}
