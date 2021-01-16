package dia2;

import java.util.Scanner;

public class NumeroAntecessor {
	
	//Aula 02 exercicio 02
	//Campinas Tech Talents jan2021 prof. Anderson Rocha

	//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor.
	//Vamos aprender a recuperar valores nos nossos programas Java?

	
	    public static void main(String args[])
	    {
	        System.out.println("Aula 02 exercicio 02 - Valquiria Aidar");
	        System.out.println("Por favor digite um valor inteiro para que digamos qual é o seu antecessor: ");
	        Scanner in = new Scanner(System.in);
	        int a = in.nextInt();
	        int antecessor = a - 1;
	        System.out.println("O antecessor de " + a + " é: " + antecessor);

	        //como realizar soma, subtracao, multiplicacao, divisao
	        System.out.println("Soma usar o simbolo +");
	        System.out.println("1 + 1");

	        System.out.println("Subtração usar o simbolo -");
	        System.out.println("5 - 1");

	        System.out.println("Multiplicação usar o simbolo *");
	        System.out.println("5 * 2");

	        System.out.println("Divisão usar o simbolo /");
	        System.out.println("10 / 2");
	    }
	

}
