package exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/*Exercício 005: Faça um programa que leia um número
		 *  Inteiro e mostre na tela o seu sucessor e seu antecessor. */
		Scanner input = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = input.nextInt();
		int antecessor = numero - 1;
		int sucessor = numero + 1;
		System.out.print("Analisando o valor " + numero + ", seu antecessor é "  + antecessor + " e o seu sucessor é " + sucessor + ".");
		input.close();
	}
	

}
