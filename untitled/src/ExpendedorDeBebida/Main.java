package Tarea1;


public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(5, 1200);
        Moneda m = new Moneda1500();
        Comprador c = new Comprador(m, Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste());
        System.out.println("Vuelto: " + c.cuantoVuelto());
    }




}