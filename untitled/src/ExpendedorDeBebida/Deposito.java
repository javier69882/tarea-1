package Tarea1;
import java.util.ArrayList;
// Modificacion con un deposito genrico, se quito el anterior deposito de moneda y bebida

class Deposito<T> {
    private ArrayList<T> almacen;

    public Deposito() {
        almacen = new ArrayList<>();
    }

    public void addElemento(T elemento) {
        almacen.add(elemento);
    }

    public T getElemento() {
        if (almacen.size() > 0) {
            return almacen.remove(0);
        }
        return null;
    }
}