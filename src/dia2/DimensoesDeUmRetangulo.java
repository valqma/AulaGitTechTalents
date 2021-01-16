package dia2;

import java.util.Scanner;
public class DimensoesDeUmRetangulo {



	//Aula 02 exercicio 03
	//Campinas Tech Talents jan2021 prof. Anderson Rocha

	//Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.
	// Como calcular a área de um retângulo:
	//A área do retângulo corresponde ao produto (multiplicação) da medida da base pela altura da figura, sendo expressa pela fórmula:
	//A = b x h
	//Onde, A: área, b: base, h: altura

	
	    public static void main(String args[])
	    {
	        // Escreva um algoritmo para ler as dimensões de um retângulo (base e altura), calcular e escrever a área do retângulo.

	        System.out.println("Aula 02 exercicio 03 - Valquiria Aidar");

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Esse algoritimo calcula a área de um retângulo ! ! !");
	        
	        System.out.println("Por favor digite a base do retângulo");
	        double base = scanner.nextDouble();
	        
	        System.out.println("Por favor digite a altura do retângulo");
	        double altura = scanner.nextDouble();

	        double area = base * altura;

	        System.out.println("A área do retângulo é: " + area);
	        
	        scanner.close();

	        // a variavel pode ser double ou float, o mais utilizado no Java é double
	        // a variavel pode ser int mas so daria para calcular metragens exatas

	    }
	}
