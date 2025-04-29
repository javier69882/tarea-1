package Tarea1;
//Creacion de la clase Producto
// Clase padre para dulce y bebida
//Me baso en la anterior clase bebida, para crearlo
public abstract class Producto {
    private int numero_serie;

    //Mismo constructor que bebida
    public Producto(int serie){
        this.numero_serie = serie;
    }
    //Metodo para obtener el numero de serie
    public int getSerie(){
        return numero_serie;
    }
    //Metodo para beber, no lo implemento, porque ya no sera solo beber
    //ahora modifico bebida y creo dulce

}
