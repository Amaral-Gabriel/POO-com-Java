package pratica1.java;

public class Produto {
    public String nome;
    public Double preco;
    public int quantidade;

    static Double calcula (Double x, int z) {
        Double total = x * z;
        System.out.println("Valor total do estoque: "+total);
      }
}
