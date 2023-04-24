package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int incremento;
		
		int decremento;
		
		Contador contador = new Contador(5);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca la cantidad a incrementar");
		incremento=sc.nextInt();
		
		System.out.println("Por favor introduzca la cantidad a decrementar");
		decremento=sc.nextInt();
		
		for(int i=0 ; i<incremento;i++) {
			contador.incrementar();
		}
		for(int i=0 ; i<decremento;i++) {
			contador.decrementar();
		}
		
		
		System.out.println(contador);
		

	}

}
