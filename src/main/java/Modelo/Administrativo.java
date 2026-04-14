/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class Administrativo  extends Persona {
    private String cargo;

    public Administrativo(String nombre, String direccion, String telefono, String fechaNacimiento, String cargo) {
        super(nombre, direccion, telefono, fechaNacimiento);
        this.cargo = cargo;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    @Override
    public String mostrarInfo() {
        return "Administrativo: " + getNombre() + " - " + cargo;
    }
}
    

