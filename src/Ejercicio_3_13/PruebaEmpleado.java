
package Ejercicio_3_13;

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog("Nombre empleado 1:");
        String ap1 = JOptionPane.showInputDialog("Apellido empleado 1:");
        double sal1 = Double.parseDouble(JOptionPane.showInputDialog("Salario mensual empleado 1:"));

        Empleado emp1 = new Empleado(nom1, ap1, sal1);

        String nom2 = JOptionPane.showInputDialog("Nombre empleado 2:");
        String ap2 = JOptionPane.showInputDialog("Apellido empleado 2:");
        double sal2 = Double.parseDouble(JOptionPane.showInputDialog("Salario mensual empleado 2:"));

        Empleado emp2 = new Empleado(nom2, ap2, sal2);

        double anual1 = emp1.getSalarioMensual() * 12;
        double anual2 = emp2.getSalarioMensual() * 12;

        JOptionPane.showMessageDialog(null,
                "Salario anual de " + emp1.getNombre() + ": " + anual1 +
                        "\nSalario anual de " + emp2.getNombre() + ": " + anual2);

        // Aumento del 10%
        emp1.setSalarioMensual(emp1.getSalarioMensual() * 1.10);
        emp2.setSalarioMensual(emp2.getSalarioMensual() * 1.10);

        double nuevoAnual1 = emp1.getSalarioMensual() * 12;
        double nuevoAnual2 = emp2.getSalarioMensual() * 12;

        JOptionPane.showMessageDialog(null,
                "CON AUMENTO DEL 10%\n" +
                        emp1.getNombre() + ": " + nuevoAnual1 + "\n" +
                        emp2.getNombre() + ": " + nuevoAnual2);
    }
}
