/*
5.  Crie uma classe Celular com os seguintes atributos:  marca (String), modelo (String) e nivelBateria (int).

Crie os métodos:

usarCelular(): este método deve reduzir o nível da bateria em 10% a cada vez que for chamado, exibindo uma mensagem se a bateria estiver em 0%.  

carregarCelular(): este método deve aumentar o nível da bateria em 10% a cada vez que for chamado, até atingir 100%. 
 */

 public class Main {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Apple", "Iphone 16", 15);

        celular1.usarCelular();
        System.out.println(celular1.nivelBateria);
        celular1.usarCelular();
        System.out.println(celular1.nivelBateria);

        celular1.carregarCelular();
        System.out.println(celular1.nivelBateria);
    }
}
