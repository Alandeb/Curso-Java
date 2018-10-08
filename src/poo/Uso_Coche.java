package poo;

import javax.swing.*;
public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche Renault=new Coche();//INSTANCIAR UNA CLASE, EJEMPLO DE CLASE
		
		Renault.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(Renault.dime_datos_generales());
		
		System.out.println(Renault.dime_color());
		
		Renault.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(Renault.dime_asientos());
		
		Renault.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(Renault.dime_climatizador());
		
		System.out.println(Renault.dime_peso_coche());
		
		System.out.println( "El precio final del coche es " + Renault.precio_coche());

	}

}
