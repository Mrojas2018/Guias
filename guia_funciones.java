package guia;
import java.util.Scanner;
public class guia_funciones {
		//ejercicio 4
		public static int factorial(int valor){
			int f=1;
			int i=0;
			while(i<valor){
				f=f*(valor-i);
				i=i+1;
			}
			return f;
		}
		
		//ejercicio 2
		public static int fibonacci(int N){
			int suma=0;
			int A=0;
			int B=1;
			
			for (int i=0;i<N;i++){
				if (i==0){
				suma=1;	
				}else{
				suma=A+B;
				A=B;
				B=suma;
				}
			}
			return suma;
		}
		//ejercicio 9
		public static int cantidad(int valor){
			int contador=0;//cantidad digitos
			while(valor>=1){
				valor=valor/10;
				contador=contador+1;
			}
			return contador;
		}
		//ejercicio 10
		public static void piramide(int N){
			int Aux= (2*N)-1;
			int j=Aux;	
			int i=N;
			
			String asterisco="";
					
			if (N<=0){
				System.out.println("-1");
			}else{
				
				while(i!=0){				
					while (j!=0){
							asterisco=asterisco.concat("*");	
						j=j-1;
					}
					Aux=Aux-2;
					System.out.println(asterisco);
					asterisco="";
					i=i-1;
					j=Aux;
				}
				System.out.println("0");
			}
		}
		//ejercicio 1
		public static int Potenciaf(int x,int y){
			int potencia=x;
			for (int i=0;i<(y-1);i++){
				potencia=potencia*x;
			}
			return potencia;
		}
		
			
		public static void main(String[] args) {
			
			int N;
			int Respuesta;
			
			Scanner entrada= new Scanner(System.in);
			System.out.println("Ingrese numero, para escalera invertida");
			N=entrada.nextInt();
		
			piramide(N);
		
			System.out.println("Ingrese numero, para contar cifras");
			N=entrada.nextInt();
			Respuesta=cantidad(N);
			System.out.println("Las cifras de "+N+" es :"+Respuesta);
			
			System.out.println("Ingrese un numero N, para serie fibonacci");
			N=entrada.nextInt();
			Respuesta=fibonacci(N);
			System.out.println("El numero n de serie fibonacci es: "+Respuesta);
			
			System.out.println("Ingrese base a elevar");
			int b=entrada.nextInt();
			System.out.println("Ingrese exponente");
			int e=entrada.nextInt();
			Respuesta=Potenciaf(b,e);
			System.out.println("El valor es: "+Respuesta);
			
			//ejercicio 4
			System.out.println("Ingrese número para calcular factorial:");
			N=entrada.nextInt();
			int respuesta;
			respuesta=factorial(N);
			System.out.println("El factorial es: "+respuesta);
			
			int ter=0;
			System.out.println("Ingrese nro 1:");
			int a=entrada.nextInt();
			System.out.println("Ingrese nro 2");
			b=entrada.nextInt();
			
			int zero=1;
			if (a>b){
				for (int i=b;i<(a-1);i++){
					ter=b+zero;			
					respuesta=factorial(ter);
					System.out.println("El factorial de "+ter+" es: "+respuesta);
					zero++;
				}
			}
			if (b>a){
				for (int i=a;i<(b-1);i++){				
					ter=a+zero;
					respuesta=factorial(ter);
					System.out.println("El factorial de "+ter+" es: "+respuesta);
					zero++;
				}
			}else{
				respuesta=factorial(a);
				System.out.println("El factorial de "+ter+" es: "+respuesta);
			}
			
			entrada.close();

	}
}
