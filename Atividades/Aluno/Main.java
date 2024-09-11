/*
4.  Crie uma classe chamada Aluno com os seguintes atributos:  nome (String) atv1Nota (double) atv2Nota (double)    

Crie os métodos:

calcularMedia(): este método deve calcular e exibir a média entre as duas notas.

verificarAprovacao(): este método deve verificar se a média é maior ou igual a 6.0 e exibir uma mensagem informando se o aluno está aprovado ou reprovado.
 */

 public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Gabriel",7.5,9.5);

        aluno1.calcularMedia();
        aluno1.verificarAprovacao();
    }
}
