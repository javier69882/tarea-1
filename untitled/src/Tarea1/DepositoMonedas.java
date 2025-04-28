package Tarea1;
import java.util.ArrayList;

public class DepositoMonedas {
    private ArrayList<Moneda> almacen;

    public DepositoMonedas() {
        almacen = new ArrayList<>();
    }

    public void addMoneda(Moneda m) {
        almacen.add(m);
    }

    public Moneda getMoneda() {
        if (almacen.size() > 0) {
            return almacen.remove(0);
        }
        return null;
    }
}
