/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Modelo;


/**
 *
 * @author usuario
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdministrativoTest {

    @Test
    public void testConstructorYGetters() {
        Administrativo a = new Administrativo("Pedro", "Dir", "123", "1990", "Secretario");

        assertEquals("Secretario", a.getCargo());
    }

    @Test
    public void testSetCargo() {
        Administrativo a = new Administrativo("Pedro", "Dir", "123", "1990", "Secretario");

        a.setCargo("Coordinador");

        assertEquals("Coordinador", a.getCargo());
    }

    @Test
    public void testMostrarInfo() {
        Administrativo a = new Administrativo("Pedro", "Dir", "123", "1990", "Secretario");

        assertTrue(a.mostrarInfo().contains("Administrativo"));
    }
}