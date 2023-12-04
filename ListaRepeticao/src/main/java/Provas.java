
/**
 *
 * @author Elton
 */

/** Os alunos de informática tiveram cinco provas: 1, 2, 3, 4 e 5. Criar um algoritmo que entre
 * com a matrícula, nome e as notas das provas para imprimir:
 * a) Nome dos alunos que tiveram todas as notas dentro da média;
 * b) Nome dos alunos que tiveram as notas da 1ª e 4ª prova dentro da média;
 * c) A porcentagem dos alunos que tiveram notas da 3ª prova dentro da média.
 * Obs.: A média da faculdade é 7,0 e O algoritmo encerra quando for lido a matrícula zero.
 */

//criar arraylist para armazenar os alunos lidos no algoritmo
import java.util.Scanner;
import java.util.ArrayList;

public class Provas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matricula = 1;
        String nome_aluno = "";
        Double primeira_prova = 0.0;
        Double segunda_prova = 0.0;
        Double terceira_prova = 0.0;
        Double quarta_prova = 0.0;
        Double quinta_prova = 0.0;
        

        while (matricula != 0) {
            System.out.println("Digite o nome do aluno: ");
            nome_aluno = scanner.next();
            System.out.println("Digite o numero da matrícula: ");
            matricula = scanner.nextInt();
            if (matricula == 0) {
                break;
            }
            System.out.println("Digite as notas das provas: ");
            System.out.println("Primeira Prova: ");
            primeira_prova = scanner.nextDouble();
            System.out.println("Segunda Prova: ");
            segunda_prova = scanner.nextDouble();
            System.out.println("Terceira Prova: ");
            terceira_prova = scanner.nextDouble();
            System.out.println("Quarta Prova: ");
            quarta_prova = scanner.nextDouble();
            System.out.println("Quinta Prova: ");
            quinta_prova = scanner.nextDouble();
            
            Double media_aluno = primeira_prova + segunda_prova + terceira_prova + quarta_prova + quinta_prova / 5;
            if (media_aluno >= 7) {
                System.out.println(nome_aluno);
            }
            if (primeira_prova >= 7 && quarta_prova >= 7) {
                System.out.println(nome_aluno);
            }
        }

    }
}
