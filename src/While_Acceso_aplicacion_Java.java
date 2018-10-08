import javax.swing.*;
public class While_Acceso_aplicacion_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Rocio";
		
		String password ="";// hace que esté vacía
		
		while(clave.equals(password)==false){
			
			password=JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(password)==false){
				
				System.out.println("Contraseña incorrecta.");
				
			}
			
		}
		System.out.println("Contraseña correcta. Acceso permitido.");
		
	}

}
