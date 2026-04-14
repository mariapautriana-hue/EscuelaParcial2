/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CursoTest {

    @Test
    public void testAgregarEstudiante() {
        Curso c = new Curso("Matematicas");
        Estudiante e = new Estudiante("Ana", "Dir", "123", "2005", "E1", "10");

        c.agregarEstudiante(e);

        assertEquals(1, c.getEstudiantes().size());
    }
}