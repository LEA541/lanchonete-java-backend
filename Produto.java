public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Isso mostra que você sabe encapsulamento (regra de ouro do Java)
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
}
