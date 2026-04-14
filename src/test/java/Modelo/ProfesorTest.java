/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author usuario
 */




public class ProfesorTest {

    @Test
    public void testCalculoSalarioBase() {
        Profesor p = new Profesor("Luis", "Dir", "123", "1980", "999", "Math", 50, 100);

        assertEquals(6500, p.calcularSalario());
    }

    @Test
    public void testCalculoSalarioConBono() {
        Profesor p = new Profesor("Luis", "Dir", "123", "1980", "999", "Math", 50, 100);

        assertEquals(7000, p.calcularSalario(500));
    }

    @Test
    public void testPrestaciones() {
        Profesor p = new Profesor("Luis", "Dir", "123", "1980", "999", "Math", 50, 100);

        assertEquals(1300, p.prestaciones());
    }

    @Test
    public void testSettersYGetters() {
        Profesor p = new Profesor("Luis", "Dir", "123", "1980", "999", "Math", 50, 100);

        p.setArea("Fisica");

        assertEquals("Fisica", p.getArea());
    }

    @Test
    public void testMostrarInfo() {
        Profesor p = new Profesor("Luis", "Dir", "123", "1980", "999", "Math", 50, 100);

        assertTrue(p.mostrarInfo().contains("Profesor"));
    }
}