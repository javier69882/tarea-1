package Tarea1;
import java.util.ArrayList;

public class Deposito {
    private ArrayList<Bebida> almacen;

    public Deposito() {
        almacen = new ArrayList<Bebida>();
    }

    public void addBebida(Bebida b) {
        almacen.add(b);
    }

    public Bebida getBebida() {
        Bebida b = null;
        if (almacen.size() > 0) {
            b = almacen.remove(0);
        }
        return b;
    }

}
