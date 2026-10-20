package Ejercicio_3_12;

public class Factura {
    private String numeroPieza;
    private String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String num, String desc, int cant, double precio) {
        numeroPieza = num;
        descripcionPieza = desc;
        if (cant > 0) {
            cantidad = cant;
        } else {
            cantidad = 0;
        }
        if (precio > 0.0) {
            precioPorArticulo = precio;
        } else {
            precioPorArticulo = 0.0;
        }
    }

    public void setNumeroPieza(String num) { numeroPieza = num; }
    public String getNumeroPieza() { return numeroPieza; }

    public void setDescripcionPieza(String desc) { descripcionPieza = desc; }
    public String getDescripcionPieza() { return descripcionPieza; }

    public void setCantidad(int cant) {
        if (cant > 0) { cantidad = cant; }
        else { cantidad = 0; }
    }
    public int getCantidad() { return cantidad; }

    public void setPrecioPorArticulo(double precio) {
        if (precio > 0.0) { precioPorArticulo = precio; }
        else { precioPorArticulo = 0.0; }
    }
    public double getPrecioPorArticulo() { return precioPorArticulo; }

    public double obtenerMontoFactura() {
        return cantidad * precioPorArticulo;
    }
}