package Tarea1;

public abstract class Dulce extends Producto {
    // llamo constructor de producto
    public Dulce(int serie) {
        super(serie);
    }
    // disitinto a bebida
    public abstract String accionProducto();


}
