package Tarea1;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;

    private Deposito depositoCocaCola;
    private Deposito depositoSprite;
    private DepositoMonedas monVu;
    private int precio;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precio = precioBebidas;
        depositoCocaCola = new Deposito();
        depositoSprite = new Deposito();
        monVu = new DepositoMonedas();

        for (int i = 0; i < numBebidas; i++) {
            depositoCocaCola.addBebida(new CocaCola(1000 + i));
            depositoSprite.addBebida(new Sprite(2000 + i));
        }
    }
    public Bebida comprarBebida(Moneda m, int seleccion) {
        if (m == null) return null;

        if (m.getValor() < precio) {
            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addMoneda(new Moneda100());
                vuelto -= 100;
            }
            return null;
        }
        Bebida b = null;

        if (seleccion == COCA) {
            b = depositoCocaCola.getBebida();
        } else if (seleccion == SPRITE) {
            b = depositoSprite.getBebida();
        }

        if (b == null) {

            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addMoneda(new Moneda100());
                vuelto -= 100;
            }
            return null;
        }
        int diferencia = m.getValor() - precio;
        while (diferencia >= 100) {
            monVu.addMoneda(new Moneda100());
            diferencia -= 100;
        }

        return b;
    }
    public Moneda getVuelto() {
        return monVu.getMoneda();
    }
    public int getPrecio() {
        return precio;
    }
}
