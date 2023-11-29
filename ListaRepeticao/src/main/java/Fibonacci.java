
/**
 *
 * @author Elton
 */
//12- Criar um algoritmo que imprima os 20 primeiros termos da série Fibonacci: 1, 1, 2, 3, 5, 8, 
//13, 21 ...
public class Fibonacci {

    public static void main(String[] args) {
        //iniciallização do termo anterior a 1 para se ter uma ordem de calculo
        int termo_anterior = 0;
        
        //inicialização do proximo termo para mudar o valor do mesmo no looping
        int proximo_termo = 0;
        
        //setar a quantidade de termos fibonacci que a questão pede
        int quantidade_termos = 0;
        
        //criação da variavel termo atual onde ela será o termo fibbonacci começando com 1
        //quantidade de termos repetindo até 20 (menor que 20)
        //incremento da quantidade de termos
        for (int termo_atual = 1; quantidade_termos < 20; quantidade_termos++) {
            
            //proximo termo recebe o termo anterior 0 + termo atual 1
            //proximo termo = 1 (no primeiro loop)
            //                   0                1
            proximo_termo = termo_anterior + termo_atual;
            
            //o termo anterior (0) recebe o termo atual (1) que é 1 neste primeiro loop
            termo_anterior = termo_atual;
            
            //imprime o termo atual que é 1 como é setado no for
            System.out.println(termo_atual);
           
            //após imprimir o termo atual (1) recebe o proximo termo(0+1) = 1
            termo_atual = proximo_termo;
            
           //retorna para o for
        }
          
    }
}
