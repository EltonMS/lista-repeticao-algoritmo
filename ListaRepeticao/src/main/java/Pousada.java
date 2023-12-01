
/**
 *
 * @author Elton
 */
/** Uma pousada estipulou o preço para sua diária em R$ 100,00 e mais uma taxa de serviços
 * diária de:
 * a) R$ 15,00, se o número de dias for menor que 10;
 * b) R$ 8,00, se o número de dias for maior ou igual a 10.
 * Criar um algoritmo que entre com número do apartamento, nome e quantidade de dias da
 * hospedagem para informar o nome e o valor da conta de cada cliente. O algoritmo encerra
 * quando for lido o apartamento zero.
 */
import java.util.Scanner;

public class Pousada {

    public static void main(String[] args) {
        String nome_cliente;
        double valor_conta;
        int numero_ap = 1;
        Double taxa_servico;
        int dias = 0;
        Double diaria = 100.0;

        Scanner scanner = new Scanner(System.in);

        while (numero_ap != 0) {

            System.out.println("Digite o numero do apartamento: ");
            numero_ap = scanner.nextInt();

            System.out.println("Digite o seu nome: ");
            nome_cliente = scanner.next();

            System.out.println("Digite a quantidade de dias pretendidos na pousada: ");
            dias = scanner.nextInt();
        
            if (dias < 10) {
                taxa_servico = 15.0 * dias;
                valor_conta = diaria * dias + taxa_servico;
                System.out.println("O valor total da conta do cliente " + nome_cliente + "é de: " + valor_conta);
            }
            
            if (dias >= 10) {
                taxa_servico = 8.0 * dias;
                valor_conta = diaria * dias + taxa_servico;
                System.out.println("O valor total da conta do cliente " + nome_cliente + "é de: " + valor_conta);
            }
            
            if (numero_ap == 0) {
                break;
            }
        }
    }
}
