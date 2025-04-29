package Tarea1;


public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5, 1200);
        Moneda m = new Moneda1500();
        try {
            Comprador c = new Comprador(m, Expendedor.SNIKERS, exp);
            System.out.println(c.queAccionProducto());
            System.out.println("Vuelto: " + c.cuantoVuelto());
        } catch (PagoIncorrectoException | PagoInsuficienteException | NoHayProductoException e) {
            System.out.println("Hubo un error: " + e.getMessage());
        }
    }




}