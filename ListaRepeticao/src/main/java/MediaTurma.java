/**
 *
 * @author Elton
 */
//Criar um algoritmo para ler a nota da 1ª avaliação e 2ª avaliação de 100 alunos. Imprimir a 
//listagem, contendo: nome e média da cada aluno, no final, informe a média geral da turma.

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome_aluno;
        Double media_aluno = 0.0;
        Double media_turma = 0.0;
        Double primeira_nota;
        Double segunda_nota;
        Double media_anterior = 0.0;
        for(int alunos = 1; alunos <= 5; alunos++){
            System.out.println("Digite seu nome: ");
            nome_aluno = scanner.nextLine();
            System.out.println("Digite a primeira nota: ");
            primeira_nota = scanner.nextDouble();
            System.out.println("Digite a segunda nota: ");
            segunda_nota = scanner.nextDouble();
            media_aluno = (primeira_nota + segunda_nota)/2;
            System.out.println("A média do aluno " +nome_aluno+ " é:" + media_aluno );
            
            media_anterior = media_aluno + media_anterior;    
            media_aluno = media_anterior;
            
            
            
        }
        media_turma = media_aluno / 5;
        System.out.println("A média da turma é: " + media_turma);
    }
}
