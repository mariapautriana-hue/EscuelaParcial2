/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonaTest {

    @Test
    public void testConstructorYGetters() {
        Persona p = new Persona("Ana", "Dir", "123", "2000");

        assertEquals("Ana", p.getNombre());
        assertEquals("Dir", p.getDireccion());
        assertEquals("123", p.getTelefono());
        assertEquals("2000", p.getFechaNacimiento());
    }

    @Test
    public void testSetters() {
        Persona p = new Persona("Ana", "Dir", "123", "2000");

        p.setNombre("Maria");
        p.setDireccion("Nueva");
        p.setTelefono("999");

        assertEquals("Maria", p.getNombre());
        assertEquals("Nueva", p.getDireccion());
        assertEquals("999", p.getTelefono());
    }

    @Test
    public void testMostrarInfo() {
        Persona p = new Persona("Ana", "Dir", "123", "2000");

        assertTrue(p.mostrarInfo().contains("Ana"));
    }
}