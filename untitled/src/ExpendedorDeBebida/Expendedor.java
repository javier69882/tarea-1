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

    // modifico el constructor, cambio numBebidas por numProducto,
    public Expendedor(int numProductos, int precioProductos) {
        this.precio = precioProductos;
        depositoCocaCola = new Deposito <Bebida>();
        depositoSprite = new Deposito <Bebida>();
        //inicializo los depositos que faltan
        depositoFanta = new Deposito<Bebida>();
        depositoSuper8 = new Deposito<Dulce>();
        depositoSnickers = new Deposito<Dulce>();

        monVu = new Deposito<Moneda> ();

        // agrego los elementos a los depositos, osea los nuevos productos, y reemplazo numBebida por numProducto
        for (int i = 0; i < numProductos; i++) {
            depositoCocaCola.addElemento(new CocaCola(1000 + i));
            depositoSprite.addElemento(new Sprite(2000 + i));
            depositoFanta.addElemento(new Fanta(3000 + i));
            depositoSuper8.addElemento(new Super8(4000 + i));
            depositoSnickers.addElemento(new Snickers(5000 + i));
        }
    }

    //modifico el metodo para que reciba producto
    public Producto comprarProducto(Moneda m, int seleccion)
            //agrego las excepciones
            throws PagoIncorrectoException, PagoInsuficienteException, NoHayProductoException{
        if (m == null)
            //AGREGO EXCEPCION
            throw new PagoIncorrectoException();

        if (m.getValor() < precio) {
            //DEVUELVE DINERO, AQUI IRA UN EXCEPCION
            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addElemento(new Moneda100());
                vuelto -= 100;
            }
            //AGREGO EXCEPCION
            throw new PagoInsuficienteException();
        }
        Producto b = null;

        if (seleccion == COCA) {
            b = depositoCocaCola.getElemento();
        } else if (seleccion == SPRITE) {
            b = depositoSprite.getElemento();
        }
        //agrego el resto de los productos
        else if (seleccion == FANTA) {
            b = depositoFanta.getElemento();
        } else if (seleccion == SUPER8) {
            b = depositoSuper8.getElemento();
        } else if (seleccion == SNIKERS) {
            b = depositoSnickers.getElemento();
        }

        if (b == null) {
            // NO HAY BEBIDA, DEVUELVE DINERO

            int vuelto = m.getValor();
            while (vuelto >= 100) {
                monVu.addElemento(new Moneda100());
                vuelto -= 100;
            }
            throw new NoHayProductoException();
        }
        // da vuelto
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
