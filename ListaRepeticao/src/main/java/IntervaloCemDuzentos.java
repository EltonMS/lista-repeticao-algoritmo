
/**
 *
 * @author Elton
 */
//Ler vários números e informar quantos números entre 100 e 200 foram digitados. Quando o 
//valor zero for lido, o algoritmo deverá cessar sua execução.
import java.util.Scanner;

public class IntervaloCemDuzentos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros_entre_cem_duzentos = 0;
        int numero_digitado = 1;
  
        while (numero_digitado != 0) {
            System.out.println("Digite um Numero: ");
            numero_digitado = scanner.nextInt();
            if (numero_digitado >= 100 && numero_digitado <= 200) {
                numeros_entre_cem_duzentos++;
            }
            if (numero_digitado == 0) {
                break;
            }
        }
        System.out.println("O total de numeros entre 100 e 200 é: " + numeros_entre_cem_duzentos);
    }
}
