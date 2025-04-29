package Tarea1;

//Extiende de Producto
abstract class Bebida extends Producto {
    //private int numero_serie; , ya no es necesario

    public Bebida(int serie){
        //llamo al constructor de producto
        super(serie) ;
    }
    //public int getSerie(){
       // return numero_serie;
   // }, ya no es necesario
    public abstract String beber();
}
//No hay necesidad de modificar subclase cocacola, sprite y fanta
