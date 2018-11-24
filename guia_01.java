package guia;
import java.util.Scanner;
public class guia_01 {

	public static void main(String[] args) {
	//ejercicio 21
		System.out.println("Ingrese numero, para cuadrado");
		Scanner entrada=new Scanner(System.in);
		int N=entrada.nextInt();
		
		for (int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				if (i==0){System.out.print("*");
				}else{
					if (i==N-1){System.out.print("*");
					}else{
						if (j==0){System.out.print("*");}
						else{
							if(j==N-1){System.out.print("*");
							}else{
								System.out.print(" ");
							}
						}
					}
				}
			}
		System.out.println();
		}
		//ejercicio 9
		System.out.println("Ingrese un numero, para ver si es par o impar");
		N=entrada.nextInt();
		int Aux=1;
		for (int i=0;i<N;i=i+1){
			Aux=1-Aux;}
		
		if (Aux==0){System.out.println("El nro es impar");}
		if(Aux==1){System.out.println("El nro es par"
				+ " es par");}
		
		//ejercicio 15
		
		int contar=0;
		int suma=0;
		int salir=0;
		while(salir==0){
			System.out.println("Ingrese dato para sumar promedio");
			int dato=entrada.nextInt();
			if (dato<0){
				if (dato==-1){
					salir=1;
				}else{
					System.out.println("Ingrese dato válido");
					dato=entrada.nextInt();
				}
			}else{
				suma=suma+dato;
				contar=contar+1;
			}
		}
		System.out.println("El promedio es: "+(suma/contar));
		//ejercicio 16
		
		String clave="eureka";
		
		String ingresar="";
		int i=0;
			while (i<3){
				System.out.println("Ingrese la clave:");
				ingresar=entrada.next();
				if (ingresar.equals(clave)){
					System.out.println("Clave correcta");
					i=3;
				}
				i=i+1;
				if (i==3){
					if (ingresar!=clave){
						System.out.println("Se agotaron las 3 oportunidades");
				
					}
				}
			}
		entrada.close();
		//ejercicio 18
		System.out.println("Numero multiplos de 2: ");
		for( i=1;i<101;i++){
			if(i%2==0){				
				System.out.print(i+" - ");
			}
		}
		
		System.out.println("");
		System.out.println("Numero multiplos de 3: ");
		for(i=1;i<101;i++){
			if(i%3==0){			
				System.out.print(i+" - ");
			}
		}
		
		
	}

}
