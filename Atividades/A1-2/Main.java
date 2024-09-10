/*
2. Crie uma classe Computador com os seguintes atributos:  tipo (String), marca (String), memoriaRAM (int) e armazenamento (int), todos os valores em GB.

Crie os métodos:
exibirTipoComputador() - este método deve exibir o tipo do computador (Notebook, Desktop, All-in-one) no padrão abaixo:

"Tipo do computador: Notebook"

exibirConfiguracoes() -  este método deve exibir a marca, a quantidade de memória RAM e o armazenamento do computador no padrão abaixo:

"Marca: HP, Memória RAM: 16GB, Armazenamento: 256GB"
 */
public class Main {
    public static void main(String[] args) {
        
        Computador computador = new Computador("Notebook", "HP", 16, 256);
        computador.exibirTipoComputador();
        computador.exibirConfiguracoes();
    }
}

