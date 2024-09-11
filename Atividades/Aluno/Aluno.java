public class Aluno {
    public String nome;
    public Double atv1Nota;
    public Double atv2Nota;
    public Double media;

    public Aluno(String nome, Double atv1Nota, Double atv2Nota){
        this.nome = nome;
        this.atv1Nota = atv1Nota;
        this.atv2Nota = atv2Nota;
    }

    public Double calcularMedia(){
        media = (atv1Nota + atv2Nota) / 2;
        return media;
    }
    
    public void verificarAprovacao(){
        if (media >= 6){
            System.out.println("Aluno aprovado!");
        }
        else{
            System.out.println("Aluno reprovado!");
        }
    }
}
