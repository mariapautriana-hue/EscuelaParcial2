/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioHora;
    private int horas;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horas) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horas = horas;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioHora() { return salarioHora; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }

    public int getHoras() { return horas; }
    public void setHoras(int horas) { this.horas = horas; }

    // POLIMORFISMO 
    public double calcularSalario() {
        double base = salarioHora * horas;
        return base + (base * 0.30);
    }

    public double calcularSalario(double bonoExtra) {
        return calcularSalario() + bonoExtra;
    }

    public double prestaciones() {
        return calcularSalario() * 0.20;
    }

    @Override
    public String mostrarInfo() {
        return "Profesor: " + getNombre() + " - $" + calcularSalario();
    }
}
