/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.Estudiante;
import Modelo.Profesor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class ColegioTest {
    
    @Test
    public void testAgregarYReporteEstudiantes() {
        Colegio c = new Colegio();
        c.agregarEstudiante(new Estudiante("Ana", "Dir", "123", "2005", "E1", "10"));

        String r = c.reporteEstudiantes();

        assertTrue(r.contains("Ana"));
    }

    @Test
    public void testOrdenProfesores() {
        Colegio c = new Colegio();

        Profesor p1 = new Profesor("A", "Dir", "1", "1980", "1", "Math", 50, 100);
        Profesor p2 = new Profesor("B", "Dir", "2", "1980", "2", "Math", 100, 100);

        c.agregarProfesor(p1);
        c.agregarProfesor(p2);

        String r = c.reporteProfesores();

        assertTrue(r.indexOf("B") < r.indexOf("A"));
    }
}