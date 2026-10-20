
package Ejercicio_3_13;

public class Empleado {
    private String nombre;
    private String apellido;
    private double salarioMensual;

    public Empleado(String nom, String ap, double salario) {
        nombre = nom;
        apellido = ap;
        if (salario > 0.0) {
            salarioMensual = salario;
        }
    }

    public void setNombre(String nom) {
        nombre = nom;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellido(String ap) {
        apellido = ap;
    }

    public String getApellido() {
        return apellido;
    }

    public void setSalarioMensual(double salario) {
        if (salario > 0.0) {
            salarioMensual = salario;
        }
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }
}