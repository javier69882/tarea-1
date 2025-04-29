package Tarea1;

class Comprador {
    private String sonido;
    private int vuelto;
// reemplazo cualBebida por cual Producto
    public Comprador(Moneda m, int cualProducto, Expendedor exp) {
        sonido = null;
        vuelto = 0;

        if (m == null) return;

        limpiarVueltoAnterior(exp);
// se cambia todo lo referente a bebida por producto
        Producto p = exp.comprarProducto(m, cualProducto);
        if (p == null) {
            vuelto = m.getValor();
        }
        else {
            // cambio los metodos de sonido
            sonido = p.accionProducto();
            Moneda mon;
            while ((mon = exp.getVuelto()) != null) {
                vuelto += mon.getValor();
            }
        }
    }

    private void limpiarVueltoAnterior(Expendedor exp) {
        while (exp.getVuelto() != null) {

        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }
// se cambia el queBebiste por queAccionProducto
    public String queAccionProducto() {
        return sonido;
    }
}

