package Tarea1;

abstract class Bebida {
    private int numero_serie;

    public Bebida(int serie){
        this.numero_serie = serie;
    }
    public int getSerie(){
        return numero_serie;
    }
    public abstract String beber();
}
