
/**
 *
 * @author Elton
 */
//Criar um algoritmo que entre com a profissão de várias pessoas e imprima quantos são 
//Programadores. Quando o valor “fim” for lido, o algoritmo deverá cessar sua execução.
import java.util.Scanner;

public class Profissoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String profissao = "";
        int programador = 0;
        
 //A instrução while avalia o resultado da expressão (condição) antes de executar as instruções do bloco { }
        while(!profissao.equals("Fim")) {
            System.out.println("Digite a Profissão: ");
            profissao = scanner.nextLine();
            if (profissao.equals ("Programador")) {
                programador++;

            }         
            
        }
        
        System.out.println("A quantidade de Programadores é de: " +programador);
    }

}
