package dia2;

public class TrocaDeVariaveis {
	//Aula 02 exercicio 01
	//Campinas Tech Talents jan2021 prof. Anderson Rocha

	//Escreva um algoritmo que armazene o valor 99 em uma vari�vel Y e o valor 11 em uma vari�vel Z. 
	//A seguir (utilizando apenas atribui��es entre vari�veis) troque os seus conte�dos fazendo com
	//que o valor que est� em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram 
	//armazenados nas vari�veis.
  
	  public static void main(String args[]) { 
	    int y = 99;
	    int z = 11;
	    
	    System.out.println("Aula 02 exercicio 01 - Valquiria Aidar");

	    System.out.println("O valor inicial da minha vari�vel Y �: " + y);
	    System.out.println("O valor inicial da minha vari�vel Z �: " + z);
	    int aux = 0;
	    aux = y;
	    y = z;
	    z = aux;
	    System.out.println("O valor depois da troca da minha vari�vel Y �: " + y);
	    System.out.println("O valor depois da troca da minha vari�vel Z �: " + z);

	//precisa de uma variavel auxiliar, uma terceira variavel para poder realizar
	//a troca de valores das outras duas variaveis
	}

}
