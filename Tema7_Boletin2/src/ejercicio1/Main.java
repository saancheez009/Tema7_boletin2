package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

int sumaSeg;//Se guardará al cantidad de segundos a incrementar
		
		//Creamos el Scanner para leer el teclado
		Scanner read= new Scanner(System.in);
		
		//Creamos el objeto para llamar a la función
		Hora hora= new Hora ();
	
		//Solicitamos hora
		System.out.println("Introduzca una hora");
		//Leemos 
		hora.setHora(read.nextInt());
		
		//Solictamos minuto
		System.out.println("Introduzca unos minutos");
		//Leemos 
		hora.setMinuto(read.nextInt());
		
		//Solicitamos segundos
		System.out.println("Introduzca una cantidad de segundos");
		//Leemos 
		hora.setSegundo(read.nextInt());
		
		//Solicitamos la cantidad de segundos a incrementar
		System.out.println("¿Cuántos segundos desea incrementar?");
		//Leemos 
		sumaSeg=read.nextInt();
		
		//Creamos un for, inicialiazamos a 0, si i es menor a sumSegundo
		for (int i =0; i<sumaSeg;i++) {
			//Llamamos a la funcion para que incremente segundo a segundo
			hora.incrementaSeg();
		}
		
		//Mostramos la hora con la modificación
		System.out.println("La hora con los segundos incrementados es:");
		System.out.println(hora.getHora() + ":" + hora.getMinuto() + ":"+ hora.getSegundo());
		
		//Cerramos el Scanner
		read.close();
	

	}

}
