public class Celular {
    public String marca;
    public String modelo;
    public int nivelBateria;

    public Celular(String marca, String modelo, int nivelBateria){
        this.marca = marca;
        this.modelo = modelo;
        this.nivelBateria = nivelBateria;
    }

    public int usarCelular(){
        if (nivelBateria > 0){
            nivelBateria -= 10;
            if(nivelBateria < 0){
                nivelBateria = 0;
            }
            return nivelBateria;
        }
        else{
            System.out.println("Bateria descarregada.");
            return nivelBateria;
        }
    }

    public int carregarCelular(){
        if (nivelBateria < 100){
            nivelBateria += 10;
            if(nivelBateria > 100){
                nivelBateria = 100;
            }
            return nivelBateria;
        }
        else{
            System.out.println("Bateria totalmente carregada.");
            return nivelBateria;
        }
    }
}
