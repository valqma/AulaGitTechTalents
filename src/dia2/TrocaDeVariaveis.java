package dia2;

public class TrocaDeVariaveis {
	//Aula 02 exercicio 01
	//Campinas Tech Talents jan2021 prof. Anderson Rocha

	//Escreva um algoritmo que armazene o valor 99 em uma variável Y e o valor 11 em uma variável Z. 
	//A seguir (utilizando apenas atribuições entre variáveis) troque os seus conteúdos fazendo com
	//que o valor que está em Y passe para Z e vice-versa. Ao final, escrever os valores que ficaram 
	//armazenados nas variáveis.
  
	  public static void main(String args[]) { 
	    int y = 99;
	    int z = 11;
	    
	    System.out.println("Aula 02 exercicio 01 - Valquiria Aidar");

	    System.out.println("O valor inicial da minha variável Y é: " + y);
	    System.out.println("O valor inicial da minha variável Z é: " + z);
	    int aux = 0;
	    aux = y;
	    y = z;
	    z = aux;
	    System.out.println("O valor depois da troca da minha variável Y é: " + y);
	    System.out.println("O valor depois da troca da minha variável Z é: " + z);

	//precisa de uma variavel auxiliar, uma terceira variavel para poder realizar
	//a troca de valores das outras duas variaveis
	}

}
