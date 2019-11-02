package PaqueteNuevo;

import java.util.Scanner;

public class Juego {
	
	private int valor1;
	private int valor2;
	
	public Juego () { //esto es un constructor y el main está llamando al constructor que es un método. 
		//el constructor siempre tiene el mismo nombre de la clase. 
		Scanner ingreso = new Scanner(System.in);
		System.out.println("Ingrese valor 1:");
		valor1 = ingreso.nextInt(); // antes habiamos puesto int valor1, pero ahora como tengo el objeto creado ya no le pongo el int porque está definido arriba como atributo
		System.out.println("Ingrese valor 2:");
		valor2 = ingreso.nextInt();
		System.out.println("suma total:");
		System.out.println(valor2 + valor1);
		ingreso.close();
	}

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public static void main(String[] args) {
		// esta forma es para hacer un constructor
		Juego num1 = new Juego(); // el constructor tiene el mismo nombre de la clase
		
		
		
		
		
		
		
		
	}

}
