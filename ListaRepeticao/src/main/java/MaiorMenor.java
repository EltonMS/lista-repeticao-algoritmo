
/**
 *
 * @author Elton
 */
//11- Criar um algoritmo que leia vários números e imprima o maior e o menor deles. Quando 
//for lido o valor zero o finaliza o processamento.
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int maior_numero = 0;
        int menor_numero = 0;
        int numero_digitado = -1;

        while (numero_digitado != 0) {
            if (numero_digitado > maior_numero) {
                maior_numero = numero_digitado;
            }

            if (numero_digitado < menor_numero && numero_digitado != -1) {
                menor_numero = numero_digitado;
            }

            System.out.println("Digite um número:");
            numero_digitado = scanner.nextInt();
        }

        System.out.println("Maior número: " + maior_numero);

        System.out.println("Menor número: " + menor_numero);
    }
}
