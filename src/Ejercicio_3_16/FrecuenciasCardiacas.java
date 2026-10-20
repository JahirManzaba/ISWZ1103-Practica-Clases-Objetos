
package Ejercicio_3_16;

import java.time.LocalDate;
import java.time.Period;

public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int dia;
    private int mes;
    private int anio;

    public FrecuenciasCardiacas(String nom, String ap, int d, int m, int a) {
        nombre = nom;
        apellido = ap;
        dia = d;
        mes = m;
        anio = a;
    }

    public void setNombre(String nom) { nombre = nom; }
    public String getNombre() { return nombre; }

    public void setApellido(String ap) { apellido = ap; }
    public String getApellido() { return apellido; }

    public void setDia(int d) { dia = d; }
    public int getDia() { return dia; }

    public void setMes(int m) { mes = m; }
    public int getMes() { return mes; }

    public void setAnio(int a) { anio = a; }
    public int getAnio() { return anio; }

    public int calcularEdad() {
        LocalDate nacimiento = LocalDate.of(anio, mes, dia);
        LocalDate hoy = LocalDate.now();
        return Period.between(nacimiento, hoy).getYears();
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public double calcularFrecuenciaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    public double calcularFrecuenciaMaximaEsperada() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
}
