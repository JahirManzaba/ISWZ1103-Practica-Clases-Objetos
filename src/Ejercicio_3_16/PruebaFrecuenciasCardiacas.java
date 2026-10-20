
package Ejercicio_3_16;

import java.util.Scanner;
import java.time.DateTimeException;
import java.time.LocalDate;

public class PruebaFrecuenciasCardiacas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese apellido: ");
        String apellido = sc.nextLine();

        System.out.print("Dia de nacimiento: ");
        int dia = sc.nextInt();

        System.out.print("Mes de nacimiento: ");
        int mes = sc.nextInt();

        System.out.print("Anio de nacimiento: ");
        int anio = sc.nextInt();

        try {
            LocalDate nacimiento = LocalDate.of(anio, mes, dia);

            if (nacimiento.isAfter(LocalDate.now())) {
                System.out.println("Error: la fecha no puede ser futura.");
                return;
            }

            FrecuenciasCardiacas persona =
                    new FrecuenciasCardiacas(nombre, apellido, dia, mes, anio);

            System.out.println("\n--- RESULTADOS ---");

            System.out.println("Nombre: " +
                    persona.getNombre() + " " + persona.getApellido());

            System.out.println("Nacimiento: " +
                    persona.getDia() + "/" +
                    persona.getMes() + "/" +
                    persona.getAnio());

            System.out.println("Edad: " + persona.calcularEdad());

            System.out.println("Frecuencia Maxima: " +
                    persona.calcularFrecuenciaMaxima());

            System.out.println("Rango Esperado: " +
                    persona.calcularFrecuenciaMinima() + " a " +
                    persona.calcularFrecuenciaMaximaEsperada());

        } catch (DateTimeException e) {
            System.out.println("Error: fecha de nacimiento invalida.");
        } finally {
            sc.close();
        }
    }
}
