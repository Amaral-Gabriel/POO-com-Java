
public class ContaBancaria {
    public String numeroConta;
    public Double saldo;

    public ContaBancaria(String numeroConta, Double saldo){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public Double deposito(Double valor){
        saldo += valor;
        return saldo;
    }

    public Double sacar(Double valor){
        saldo -= valor;
        return saldo;
    }
}
