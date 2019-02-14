package ecuaciones;

public class EcuacionLineal {
    private int a;
    private int b;

    public EcuacionLineal(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double resolverEcuacion(int a, int b) {
        double resultado = -b/a;
        return resultado;
    }
}
