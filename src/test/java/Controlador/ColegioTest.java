/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Controlador;

import Modelo.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */
public class ColegioTest {
    // este es el test de integracion
    @Test
    public void testFlujoCompletoSistema() {

        // Crear el sistema
        Colegio colegio = new Colegio();

        // Crear estudiantes
        Estudiante e1 = new Estudiante("Ana", "Dir1", "111", "2005", "E1", "10");
        Estudiante e2 = new Estudiante("Juan", "Dir2", "222", "2006", "E2", "11");

        // Crear profesores
        Profesor p1 = new Profesor("Carlos", "Dir3", "333", "1980", "C1", "Math", 50, 100); // 6500
        Profesor p2 = new Profesor("Laura", "Dir4", "444", "1985", "C2", "Fisica", 80, 100); // 10400

        // Integración: agregar al sistema
        colegio.agregarEstudiante(e1);
        colegio.agregarEstudiante(e2);

        colegio.agregarProfesor(p1);
        colegio.agregarProfesor(p2);

        // Generar reportes
        String reporteEst = colegio.reporteEstudiantes();
        String reporteProf = colegio.reporteProfesores();

        // VALIDACIONES

        // Estudiantes agregados correctamente
        assertTrue(reporteEst.contains("Ana"));
        assertTrue(reporteEst.contains("Juan"));

        // Profesores agregados
        assertTrue(reporteProf.contains("Carlos"));
        assertTrue(reporteProf.contains("Laura"));

        // Orden correcto (mayor salario primero)
        assertTrue(reporteProf.indexOf("Laura") < reporteProf.indexOf("Carlos"));

        // Validar cálculo interno integrado
        assertTrue(reporteProf.contains("10400")); // salario Laura
        assertTrue(reporteProf.contains("6500"));  // salario Carlos
    }
}