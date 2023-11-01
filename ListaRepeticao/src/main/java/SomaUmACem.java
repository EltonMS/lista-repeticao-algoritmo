
/**
 *
 * @author ELton
 */
//Criar um algoritmo que imprima a soma de todos os números de 1 até 100.
public class SomaUmACem {

    public static void main(String[] args) {

        System.out.println("SomaNumerosUmAteCemUsandoOResultadoDaSomaAnterior");
        SomaNumerosUmAteCemUsandoOResultadoDaSomaAnterior();

        System.out.println();
        System.out.println();
        
        System.out.println("SomaNumerosUmAteCemUsandoOValorAtual");
        SomaNumerosUmAteCemUsandoOValorAtual();
    }

    public static void SomaNumerosUmAteCemUsandoOResultadoDaSomaAnterior() {
        int resultado = 0;

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d + %d = %d", i, resultado, resultado + i);
            
            resultado = resultado + i;
            
            System.out.println();
        }

        System.out.printf("O resultado da soma usando o resultado anterior é: %d", resultado);
    }

    public static void SomaNumerosUmAteCemUsandoOValorAtual() {

        int anterior = 0;

        for (int atual = 1; atual <= 100; atual++) {
            System.out.printf("%d + %d = %d", atual, anterior, anterior + atual);
            System.out.println();
            anterior = atual;

        }
        //System.out.printf("O resultado da soma usando o resultado anterior é: %d", resultado);
    }
}
