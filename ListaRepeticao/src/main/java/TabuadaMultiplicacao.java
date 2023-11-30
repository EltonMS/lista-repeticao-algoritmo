
/**
 *
 * @author Elton
 */
//Criar um algoritmo que imprima a tabuada de multiplicação de um determinado número 
//lido (variando de 1 a 10).
import java.util.Scanner;

public class TabuadaMultiplicacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero_digitado = 0;
        int segundo_fator;
        int produto;
        System.out.println("Digite um valor: ");
        numero_digitado = scanner.nextInt();
        for (segundo_fator = 1; segundo_fator <= 10; segundo_fator++) {

            produto = numero_digitado * segundo_fator;

            System.out.println(numero_digitado + " x " + segundo_fator);

            System.out.println(produto);

        }

    }
}
