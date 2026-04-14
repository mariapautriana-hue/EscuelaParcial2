/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
import java.util.ArrayList;

public class Curso {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre) {
        this.nombre = nombre;
        estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }
}
