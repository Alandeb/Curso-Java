import javax.swing.JOptionPane;


public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ESTO PERMITE USAR MAIL CON VARIOS ARROBA
		  boolean arroba=false;
		
		String mail=JOptionPane.showInputDialog("Introduce un mail");
		
		for(int i=0;i<mail.length();i++){
			
			if(mail.charAt(i)=='@'){
				arroba=true;
			}
		}
		if(arroba==true){
			System.out.println("Es correcto");
		}
		else{
			System.out.println("Ingrese un mail válido");
		}*/
		int arroba=0;
		boolean punto=false;
		
		String mail=JOptionPane.showInputDialog("Introduce un mail");
		
		for(int i=0;i<mail.length();i++){
			
			if(mail.charAt(i)=='@'){
				arroba++;
			}
			if(mail.charAt(i)=='.'){
				punto=true;
			}
		}
		if(arroba==1 && punto==true){
			System.out.println("Es correcto");
		}
		
		else{
			System.out.println("Ingrese un mail válido");
		}
		

	}

}
