import java.util.*;
public class Adivina_numero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=(int)(Math.random()*100);/* random crea numero entre 0 y 1. multiplico por
		100 para que sea entre 0 y 100. y lo convierto a integer para que no sea double*/
		
		Scanner entrada=new Scanner(System.in);
		
		int numero=101;
		
		int intentos=0;
		
		while(numero!=aleatorio){
			
			intentos++;
			
			System.out.println("Introduce un número, por favor.");
			
			numero= entrada.nextInt();
			
			if(aleatorio<numero){
				
				System.out.println("Más bajo");
			
			}
			
			if(aleatorio>numero){
				
				System.out.println("Más alto");
			
			}
				
		}
		
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos.");
		

	}

}

/* 
		/* 	do{
				
				intentos++;
				
				System.out.println("Introduce un número, por favor.");
				
				numero= entrada.nextInt();
				
				if(aleatorio<numero){
					
					System.out.println("Más bajo");
			    }
			
			    if(aleatorio>numero){
				
				     System.out.println("Más alto");
			
			}
				
		} while(numero!=aleatorio) */
