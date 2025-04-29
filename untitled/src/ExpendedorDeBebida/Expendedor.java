package Tarea1;

public class Expendedor {
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    //agrego lo  que falta
    public static final int FANTA = 3;
    public static final int SUPER8 = 4;
    public static final int SNIKERS = 5;


    private Deposito<Bebida> depositoCocaCola;
    private Deposito<Bebida> depositoSprite;
    //creo los depositos que faltan
    private Deposito<Bebida> depositoFanta;
    private Deposito<Dulce> depositoSuper8;
    private Deposito<Dulce> depositoSnickers;
    private Deposito<Moneda> monVu;
    private int precio;

    public Expendedor(int numBebidas, int precioBebidas) {
        this.precio = precioBebidas;
        depositoCocaCola = new Deposito <Bebida>();
        depositoSprite = new Deposito <Bebida>();
        //inicializo los depositos que faltan
        depositoFanta = new Deposito<Bebida>();
        depositoSuper8 = new Deposito<Dulce>();
        depositoSnickers = new Deposito<Dulce>();

        monVu = new Deposito<Moneda> ();

        for (int i = 0; i < numBebidas; i++) {
            depositoCocaCola.addElemento(new CocaCola(1000 + i));
            depositoSprite.addElemento(new Sprite(2000 + i));
        }
    }
    Bebida comprarBebida(Moneda m, int seleccion) {
        if (m == null) return null;

        if (m.getValor() < precio) {
            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addElemento(new Moneda100());
                vuelto -= 100;
            }
            return null;
        }
        Bebida b = null;

        if (seleccion == COCA) {
            b = depositoCocaCola.getElemento();
        } else if (seleccion == SPRITE) {
            b = depositoSprite.getElemento();
        }

        if (b == null) {

            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addElemento(new Moneda100());
                vuelto -= 100;
            }
            return null;
        }
        int diferencia = m.getValor() - precio;
        while (diferencia >= 100) {
            monVu.addElemento(new Moneda100());
            diferencia -= 100;
        }

        return b;
    }
    public Moneda getVuelto() {

        return monVu.getElemento();
    }
    public int getPrecio() {

        return precio;
    }
}
