package Ejercicio_3_12;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el numero de pieza: ");
        String num = sc.nextLine();

        System.out.print("Ingrese la descripcion: ");
        String desc = sc.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cant = sc.nextInt();

        System.out.print("Ingrese el precio por articulo: ");
        double precio = sc.nextDouble();

        Factura factura = new Factura(num, desc, cant, precio);

        System.out.println("\n--- DATOS DE LA FACTURA ---");
        System.out.println("Numero: " + factura.getNumeroPieza());
        System.out.println("Descripcion: " + factura.getDescripcionPieza());
        System.out.println("Cantidad: " + factura.getCantidad());
        System.out.println("Precio: " + factura.getPrecioPorArticulo());
        System.out.println("Monto Total: " + factura.obtenerMontoFactura());

        sc.close();
    }
}