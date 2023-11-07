
/**
 *
 * @author Elton
 */
//Criar um algoritmo que entre com o sexo de várias pessoas (M / F) e imprima o total de 
//pessoas do sexo masculino e total de pessoas do sexo feminino. Quando o valor “P” for lido, o 
//algoritmo deverá cessar sua execução.
import java.util.Scanner;

public class MasculinoFeminino {

    public static void main(String[] args) {

        String sexo;
        String nome = "";
        int total_masculino = 0;
        int total_feminino = 0;

        while (!nome.equals("P")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual é o seu nome? ");
            nome = scanner.next();
            if(nome.equals("P")){
                break;
            }
            System.out.println("Qual é o seu sexo? ");
            sexo = scanner.next();
            if (sexo.equals("M")) {
                total_masculino++;
            }
            if (sexo.equals("F")) {
                total_feminino++;
            }

        }
        System.out.println("O total de masculino é = " +total_masculino);
        System.out.println("O total de feminino é = " +total_feminino);
    }
}
