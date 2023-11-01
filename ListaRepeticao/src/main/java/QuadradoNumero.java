
/**
 *
 * @author Elton
 */
//2- Criar um algoritmo que entre com cem números e imprima o quadrado de cada número.
import java.util.Scanner;

public class QuadradoNumero {

    public static void main(String[] args) {
        QuadradoDeCadaNumero();
        System.out.println("O Quadrado do numéro é: ");
    }

    public static void QuadradoDeCadaNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero_aleatorio = 0;

        for (int indice = 1; indice <= 5; indice++) {
            System.out.println("Digite um valor: ");
            numero_aleatorio = scanner.nextInt();
            int quadrado_numero = numero_aleatorio * numero_aleatorio;
            System.out.println("O Quadrado do numéro é: " + quadrado_numero);

        }

    }
}
