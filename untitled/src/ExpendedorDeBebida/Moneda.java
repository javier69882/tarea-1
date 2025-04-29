package Tarea1;
// Se implementa la interfaz de compareTo
abstract class Moneda implements Comparable<Moneda>{
    public Moneda(){

    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
    // Se agrega el metodo compareTo
    public int compareTo(Moneda otra){
        return Integer.compare(this.getValor(), otra.getValor());
    }

}
