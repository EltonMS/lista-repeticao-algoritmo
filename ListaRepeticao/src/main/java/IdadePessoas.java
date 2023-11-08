/**
 *
 * @author Elton
 */

//Criar um algoritmo que entre com a idade de várias pessoas e imprima:
//a) Total de pessoas com menos de 21 anos;
//b) Total de pessoas com mais de 50 anos.
//Quando a idade lida for zero encerra a execução.

import java.util.Scanner;
public class IdadePessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = 1;
        int total_pessoas_menos_vinteum = 0;
        int total_pessoas_mais_ciquenta = 0;
        
        while(idade != 0){
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
            if(idade < 21){
                total_pessoas_menos_vinteum++;
            }if(idade > 50){
                total_pessoas_mais_ciquenta++;
            }if(idade == 0){
                break;
            }
        }    
            System.out.println("O total de pessoas com menos de 21 anos é de: "+ total_pessoas_menos_vinteum +" pessoas");
            System.out.println("O total de pessoas com mais de 50 anos é de: "+ total_pessoas_mais_ciquenta +" pessoas");
    }
    
}
