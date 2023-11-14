
import java.util.ArrayList;


/**
 *
 * @author Elton
 */
//Criar um algoritmo que possa ler um conjunto de pedidos de compra e calcule o valor total 
//da compra. Cada pedido é composto pelos seguintes campos: número, preço e quantidade. O 
//algoritmo deverá processar novos pedidos até que o usuário digite zero para número de 
//pedido.
public class PedidosDeCompras {

    public static void main(String[] args) {

        ArrayList<Pedido> pedidos = new ArrayList<>(); 
        
        Pedido pedido_danilo = new Pedido(1);
        
        Produto camisa = new Produto(1, 12.1, 2);
        Produto calca = new Produto(3, 25.5, 3);

        pedido_danilo.produtos.add(camisa);
        pedido_danilo.produtos.add(calca);
        
        pedidos.add(pedido_danilo);
        
        
        Pedido pedido_elton = new Pedido(2);
        
        Produto sapato = new Produto(7, 50.0, 3);
        Produto meia = new Produto(11, 15.0, 2);
        
        pedido_elton.produtos.add(sapato);
        pedido_elton.produtos.add(meia);
        
        
    }

    public static class Produto {

        private int codigo;
        private double preco;
        private int quantidade;

        public Produto(int codigo, double preco, int quantidade) {
            this.codigo = codigo;
            this.preco = preco;
            this.quantidade = quantidade;
        }

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }
    }

    public static class Pedido {

        private int numero;
        private ArrayList<Produto> produtos;
        private double valor_total;

        public Pedido(int numero) {
            this.numero = numero;
            this.produtos = new ArrayList<Produto>();
            this.valor_total = 0;
        }
        public double CalcularValorPedido(){
            
            
            return 0;
        }
        
    }
}
