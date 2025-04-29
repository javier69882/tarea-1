package Tarea1;


public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5);
        Moneda m = new Moneda1500();
        try {
            //pongo PrecioProducto en vez de Expendedor
            Comprador c = new Comprador(m, PrecioProducto.COCA, exp);
            System.out.println(c.queAccionProducto());
            System.out.println("Vuelto: " + c.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
    }




}