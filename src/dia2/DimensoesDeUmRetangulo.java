package dia2;

import java.util.Scanner;
public class DimensoesDeUmRetangulo {



	//Aula 02 exercicio 03
	//Campinas Tech Talents jan2021 prof. Anderson Rocha

	//Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.
	// Como calcular a �rea de um ret�ngulo:
	//A �rea do ret�ngulo corresponde ao produto (multiplica��o) da medida da base pela altura da figura, sendo expressa pela f�rmula:
	//A = b x h
	//Onde, A: �rea, b: base, h: altura

	
	    public static void main(String args[])
	    {
	        // Escreva um algoritmo para ler as dimens�es de um ret�ngulo (base e altura), calcular e escrever a �rea do ret�ngulo.

	        System.out.println("Aula 02 exercicio 03 - Valquiria Aidar");

	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Esse algoritimo calcula a �rea de um ret�ngulo ! ! !");
	        
	        System.out.println("Por favor digite a base do ret�ngulo");
	        double base = scanner.nextDouble();
	        
	        System.out.println("Por favor digite a altura do ret�ngulo");
	        double altura = scanner.nextDouble();

	        double area = base * altura;

	        System.out.println("A �rea do ret�ngulo �: " + area);
	        
	        scanner.close();

	        // a variavel pode ser double ou float, o mais utilizado no Java � double
	        // a variavel pode ser int mas so daria para calcular metragens exatas

	    }
	}
