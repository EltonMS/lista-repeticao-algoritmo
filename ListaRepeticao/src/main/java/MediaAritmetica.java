
/**
 *
 * @author Elton
 */

//Criar um algoritmo que entre com 100 números e imprima a média aritmética desses números.
//A média aritmética simples é a soma de todos os elementos dividida pela quantidade deles;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_digitado = 0;
        int j = 0;
        int soma_todos_numeros = 0;
        
        //double media_aritmetica = soma de todos os numeros digitados / 100 pois é oq o código pede
        
        for(int i = 0; i <= 3 ; i++){
            System.out.println("Digite um numero: ");
            numero_digitado = scanner.nextInt();
        }
        for(j = 0; j <= 3 ; j++){
             soma_todos_numeros = numero_digitado + scanner.nextInt();
        
        }
        double media_aritmetica = soma_todos_numeros/ j;
        System.out.println("A média aritmética é: " + media_aritmetica);  
    }
    
}
