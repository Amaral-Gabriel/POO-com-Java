/*
1. Crie uma classe ContaBancaria com os atributos: numeroConta (String) e saldo (double). 

Implemente dois métodos: 

depositar(double valor) - Receber o valor de depósito como parâmetro e adicionar ao saldo da conta.

sacar(double valor) -  Receber o valor para retirada e diminuir do saldo do cliente
 */
public class Main1 {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("5156165", 100.0);
        
        conta.deposito(500.0);
        
        System.out.println(conta.saldo);

        conta.sacar(300.0);

        System.out.println(conta.saldo);
    }
}
