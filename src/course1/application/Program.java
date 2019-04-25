package course1.application;

import course1.application.entidades.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Entre com o produto: ");
        System.out.print("Nome: ");
        product.nome = scanner.nextLine();
        System.out.print("Preço: ");
        product.preco = scanner.nextDouble();
        System.out.print("Quantidade em estoque: ");
        product.quantidade = scanner.nextInt();

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Entre com o número de produtos para ser adicionado ao estoque: ");
        int quantidade = scanner.nextInt();
        product.adicionarProdutos(quantidade);

        System.out.println();
        System.out.println(product);

        System.out.println();
        System.out.println("Entre com o número de produtos para ser removido do estoque: ");
        int quantidade2 = scanner.nextInt();
        product.removerProdutos(quantidade2);

        System.out.println();
        System.out.println(product);

        scanner.close();
    }
}
