/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package Vista;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.*;

/**
 *
 * @author usuario
 */
public class VentanaPrincipalTest {
    
   @Test
    public void testVentana() {
        VentanaPrincipal v = new VentanaPrincipal();

        assertEquals("Sistema Colegio", v.getTitle());
    }

    @Test
    public void testComponentes() {
        VentanaPrincipal v = new VentanaPrincipal();

        assertTrue(v.getContentPane().getComponentCount() > 0);
    }

    @Test
    public void testBotonClick() {
        VentanaPrincipal v = new VentanaPrincipal();

        for (java.awt.Component c : v.getContentPane().getComponents()) {
            if (c instanceof JButton) {
                ((JButton) c).doClick();
                break;
            }
        }

        assertTrue(true);
    }
}
