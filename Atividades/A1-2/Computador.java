public class Computador {
    public String tipo;
    public String marca;
    public int memoriaRam;
    public int armazenamento;

    public Computador(String tipo, String marca, int memoriaRam, int armazenamento) {
        this.tipo = tipo;
        this.marca = marca;
        this.memoriaRam = memoriaRam;
        this.armazenamento = armazenamento;
    }

    public void exibirTipoComputador(){
        System.err.println("O tipo do computador é: " + tipo);
    }

    public void exibirConfiguracoes(){
        System.err.println("Marca: " + marca + ", Mémoria RAM: " + memoriaRam + " GB, Armazenamento: " + armazenamento + "GB.");
    }
}