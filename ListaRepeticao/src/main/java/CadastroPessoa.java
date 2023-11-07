
/**
 *
 * @author Elton
 */
//- Criar um algoritmo que entre com o nome, idade e sexo de 200 pessoas (M / F). Imprimir o 
//nome se a pessoa for do sexo masculino e tiver mais de 21 anos.
import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int i = 0;
        String nome = "";
        String sexo = "";
        int idade = 0;

        for (int i = 0; i <= 5; i++) {
            System.out.println("Digite seu nome: ");
            nome = scanner.next();
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            System.out.println("Digite seu sexo; ");
            sexo = scanner.next();
            if (sexo.equals("M") && idade > 21) {
                System.out.println(nome);
            }

        }

    }
}
