
import java.util.ArrayList;
import java.util.Date;

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

        System.out.println(pedido_danilo.CalcularValorPedido());
        System.out.println("O valor de black-friday é :" + pedido_danilo.CalcularValorPedidoBlackFriday());

        //Novo pedido
        Pedido pedido_elton = new Pedido(2);

        Produto sapato = new Produto(7, 50.0, 3);
        Produto meia = new Produto(11, 15.0, 2);

        pedido_elton.produtos.add(sapato);
        pedido_elton.produtos.add(meia);

        Date date = new Date(2014, 12, 25);

        Cliente cliente_elton = new Cliente("Elton", 0125245345, date);

        pedido_elton.setCliente(cliente_elton);

        System.out.println(pedido_elton.CalcularValorPedido());

        System.out.println("O valor de black-friday é :" + pedido_elton.CalcularValorPedidoBlackFriday());
    }

    public static class Cliente {

        private String nome;
        private int cpf;
        private Date data_de_emissao;

        public Cliente(String nome, int cpf, Date data_de_emissao) {
            this.nome = nome;
            this.cpf = cpf;
            this.data_de_emissao = data_de_emissao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getCpf() {
            return cpf;
        }

        public void setCpf(int cpf) {
            this.cpf = cpf;
        }

        public Date getData_de_emissao() {
            return data_de_emissao;
        }

        public void setData_de_emissao(Date data_de_emissao) {
            this.data_de_emissao = data_de_emissao;
        }

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
        private double valor_total = 0;
        private Cliente cliente;

        public Pedido(int numero) {
            this.numero = numero;
            this.produtos = new ArrayList<Produto>();
        }

        //preciso entender melhor para que serve
        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public double CalcularValorPedido() {
            // para cada 'produto_contido_no_array' da variável 'produtos' da classe ArrayList<Produto> faça: 
            for (Produto produto_contido_no_array : produtos) {
                //Calcula o valor parcial do 1° produto no 1° loop
                valor_total = valor_total + (produto_contido_no_array.preco * produto_contido_no_array.quantidade);
            }

            return valor_total;
        }

        // Aplicar um desconto de 15% no valor total da compra
        public double CalcularValorPedidoBlackFriday() {
            double valor_black_friday = valor_total - (15 * valor_total / 100);

            return valor_black_friday;
        }

        // Aplicar um desconto de até R$ 150 no valor total da compra para clientes com até 5 anos de cadastro no sistema
        public double CalcularValorPedidoDescontoClientesMaisde5Anos() {

            double valor_pedido = CalcularValorPedido();
            //
            int ano_cadastro = cliente.data_de_emissao.getYear();

            Date now = new Date();

            int idade = now.getYear() - ano_cadastro;

            if (idade >= 5) {
                return valor_pedido - 150;
            }

            return valor_pedido;
        }
    }
}
