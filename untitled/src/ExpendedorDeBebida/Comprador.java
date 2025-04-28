package Tarea1;

class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        sonido = null;
        vuelto = 0;

        if (m == null) return;

        limpiarVueltoAnterior(exp);

        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b == null) {
            vuelto = m.getValor();
        }
        else {
            sonido = b.beber();
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

    public String queBebiste() {
        return sonido;
    }
}

