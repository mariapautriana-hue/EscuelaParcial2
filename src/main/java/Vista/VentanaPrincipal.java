/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;
import javax.swing.*;
import Controlador.Colegio;
import Modelo.*;
/**
 *
 * @author usuario
 */
public class VentanaPrincipal extends JFrame {

    private JTextField txtNombre, txtDireccion, txtTelefono, txtFecha;
    private JTextField txtCodigo, txtGrado;
    private JTextField txtCedula, txtArea, txtSalarioHora, txtHoras;

    private JTextArea area;
    private Colegio colegio;

    public VentanaPrincipal() {
        colegio = new Colegio();

        setTitle("Sistema Colegio");
        setSize(600, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // CAMPOS COMUNES
        JLabel l1 = new JLabel("Nombre");
        l1.setBounds(20, 20, 100, 25);
        add(l1);

        txtNombre = new JTextField();
        txtNombre.setBounds(120, 20, 150, 25);
        add(txtNombre);

        JLabel l2 = new JLabel("Direccion");
        l2.setBounds(20, 50, 100, 25);
        add(l2);

        txtDireccion = new JTextField();
        txtDireccion.setBounds(120, 50, 150, 25);
        add(txtDireccion);

        JLabel l3 = new JLabel("Telefono");
        l3.setBounds(20, 80, 100, 25);
        add(l3);

        txtTelefono = new JTextField();
        txtTelefono.setBounds(120, 80, 150, 25);
        add(txtTelefono);

        JLabel l4 = new JLabel("Fecha Nac");
        l4.setBounds(20, 110, 100, 25);
        add(l4);

        txtFecha = new JTextField();
        txtFecha.setBounds(120, 110, 150, 25);
        add(txtFecha);

        // ESTUDIANTE
        JLabel l5 = new JLabel("Codigo");
        l5.setBounds(300, 20, 100, 25);
        add(l5);

        txtCodigo = new JTextField();
        txtCodigo.setBounds(400, 20, 150, 25);
        add(txtCodigo);

        JLabel l6 = new JLabel("Grado");
        l6.setBounds(300, 50, 100, 25);
        add(l6);

        txtGrado = new JTextField();
        txtGrado.setBounds(400, 50, 150, 25);
        add(txtGrado);

        // PROFESOR
        JLabel l7 = new JLabel("Cedula");
        l7.setBounds(300, 80, 100, 25);
        add(l7);

        txtCedula = new JTextField();
        txtCedula.setBounds(400, 80, 150, 25);
        add(txtCedula);

        JLabel l8 = new JLabel("Area");
        l8.setBounds(300, 110, 100, 25);
        add(l8);

        txtArea = new JTextField();
        txtArea.setBounds(400, 110, 150, 25);
        add(txtArea);

        JLabel l9 = new JLabel("Salario Hora");
        l9.setBounds(300, 140, 100, 25);
        add(l9);

        txtSalarioHora = new JTextField();
        txtSalarioHora.setBounds(400, 140, 150, 25);
        add(txtSalarioHora);

        JLabel l10 = new JLabel("Horas");
        l10.setBounds(300, 170, 100, 25);
        add(l10);

        txtHoras = new JTextField();
        txtHoras.setBounds(400, 170, 150, 25);
        add(txtHoras);

        // BOTONES
        JButton btnAgregarEst = new JButton("Agregar Estudiante");
        btnAgregarEst.setBounds(20, 150, 200, 30);
        add(btnAgregarEst);

        JButton btnAgregarProf = new JButton("Agregar Profesor");
        btnAgregarProf.setBounds(20, 190, 200, 30);
        add(btnAgregarProf);

        JButton btnVerEst = new JButton("Reporte Estudiantes");
        btnVerEst.setBounds(20, 230, 200, 30);
        add(btnVerEst);

        JButton btnVerProf = new JButton("Reporte Profesores");
        btnVerProf.setBounds(20, 270, 200, 30);
        add(btnVerProf);

        // AREA
        area = new JTextArea();
        JScrollPane scroll = new JScrollPane(area);
        scroll.setBounds(20, 320, 530, 130);
        add(scroll);

        // EVENTOS

        btnAgregarEst.addActionListener(e -> agregarEstudiante());
        btnAgregarProf.addActionListener(e -> agregarProfesor());

        btnVerEst.addActionListener(e -> area.setText(colegio.reporteEstudiantes()));
        btnVerProf.addActionListener(e -> area.setText(colegio.reporteProfesores()));
    }

    private void agregarEstudiante() {
        try {
            Estudiante e = new Estudiante(
                txtNombre.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                txtFecha.getText(),
                txtCodigo.getText(),
                txtGrado.getText()
            );

            colegio.agregarEstudiante(e);
            JOptionPane.showMessageDialog(this, "Estudiante agregado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en datos");
        }
    }

    private void agregarProfesor() {
        try {
            Profesor p = new Profesor(
                txtNombre.getText(),
                txtDireccion.getText(),
                txtTelefono.getText(),
                txtFecha.getText(),
                txtCedula.getText(),
                txtArea.getText(),
                Double.parseDouble(txtSalarioHora.getText()),
                Integer.parseInt(txtHoras.getText())
            );

            colegio.agregarProfesor(p);
            JOptionPane.showMessageDialog(this, "Profesor agregado");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error en datos numéricos");
        }
    }
}