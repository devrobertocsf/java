package exercicios;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
/*Exercício  006: Crie um algoritmo que leia um número e 
 * mostre o seu dobro, triplo e raiz quadrada.
 */
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = input.nextInt();
		int dobro = numero * 2;
		int triplo = numero * 3;
		int raizquadrada = (int)Math.sqrt(numero);
		System.out.println(dobro);
		System.out.println(triplo);
		System.out.println(raizquadrada);
		input.close();
	}

}
