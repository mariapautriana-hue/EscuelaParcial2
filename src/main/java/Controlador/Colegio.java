/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;
import Modelo.*;
import java.util.*;

/**
 *
 * @author usuario
 */
    
public class Colegio {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public void agregarProfesor(Profesor p) {
        profesores.add(p);
    }

    public String reporteEstudiantes() {
        String r = "LISTA DE ESTUDIANTES:\n";
        for (Estudiante e : estudiantes) {
            r += e.mostrarInfo() + "\n";
        }
        return r;
    }

    
    public String reporteProfesores() {
        profesores.sort((a, b) -> Double.compare(b.calcularSalario(), a.calcularSalario()));

        String r = "PROFESORES ORDENADOS:\n";
        for (Profesor p : profesores) {
            r += p.getNombre() + " - $" + p.calcularSalario() +
                 " Prestaciones: $" + p.prestaciones() + "\n";
        }
        return r;
    }
}
