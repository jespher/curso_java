package course1.application.entidades;

public class Product {

    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProdutos(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

    public String toString(){
        return "Produto: " + nome + "\nValor: "
                + " R$ " + String.format("%.2f", preco)
                + "\nQuantidade: "
                + quantidade
                + " unidades "
                + " \nTotal: R$ "
                + String.format("%.2f", valorTotalEmEstoque());
    }
}
