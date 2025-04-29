package Tarea1;
// Creacion de la enumeracion
public enum PrecioProducto {
    COCACOLA(1200),
    FANTA(1200),
    SPRITE(1200),
    SUPER8(400),
    SNIKERS(600);
// se usa final para que no se modifiquen los precios
    private final int precio;
    PrecioProducto(int precio){
        this.precio=precio;
    }
    // metodo getter
    public int getPrecio(){
        return precio;
    }

}
