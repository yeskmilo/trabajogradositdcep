/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
package Vista.Profesoral;

import Controlador.Profesoral.ControlConferencista;
import Estructural.Conferencista;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author juanpanlo
 */
public class GUIAdicionarConferencista extends javax.swing.JFrame {

    private IServicioProfesoral servicioProfesoral;
    private ControlConferencista controlConferencista;
    private DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");

    /**
     * Creates new form GUIAdicionarConferencista
     */
    public GUIAdicionarConferencista(IServicioProfesoral servicioProfesoral) {
        initComponents();
        this.servicioProfesoral = servicioProfesoral;
        controlConferencista = new ControlConferencista(servicioProfesoral);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAddConferencista = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        lblImagen = new javax.swing.JLabel();
        panelDatosBasicos = new javax.swing.JPanel();
        lblCedula = new javax.swing.JLabel();
        lblNombres = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        comboFecha = new datechooser.beans.DateChooserCombo();
        lblGenero = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblCelular = new javax.swing.JLabel();
        txtCelular = new javax.swing.JTextField();
        panelDatosBancarios = new javax.swing.JPanel();
        lblNumeroCuenta = new javax.swing.JLabel();
        lblTipoCuenta = new javax.swing.JLabel();
        lblBanco = new javax.swing.JLabel();
        txtNumeroCuenta = new javax.swing.JTextField();
        comboTipoCuenta = new javax.swing.JComboBox();
        txtBanco = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnGuardarConferencista = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Conferencista");

        panelAddConferencista.setBackground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
        lblTitulo.setText("Adicion de Conferencista");

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addConferencistaGrande.png"))); // NOI18N

        panelDatosBasicos.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosBasicos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Datos Personales", 0, 0, new java.awt.Font("Calibri", 2, 13))); // NOI18N

        lblCedula.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblCedula.setText("Cedula");

        lblNombres.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblNombres.setText("Nombres");

        lblApellidos.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblApellidos.setText("Apellidos");

        lblFecha.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblFecha.setText("Fecha de Nacimiento");

        lblGenero.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblGenero.setText("Genero");

        comboGenero.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        comboGenero.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        comboGenero.setBorder(new javax.swing.border.SoftBevelBorder(1));

        txtCedula.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtCedula.setBorder(new javax.swing.border.SoftBevelBorder(1));

        txtNombres.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtNombres.setBorder(new javax.swing.border.SoftBevelBorder(1));

        txtApellidos.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtApellidos.setBorder(new javax.swing.border.SoftBevelBorder(1));

        lblCorreo.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblCorreo.setText("Correo Electrónico");

        txtCorreo.setBorder(new javax.swing.border.SoftBevelBorder(1));

        lblDireccion.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblDireccion.setText("Dirección Vivienda");

        txtDireccion.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtDireccion.setBorder(new javax.swing.border.SoftBevelBorder(1));

        lblTelefono.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblTelefono.setText("Telefono");

        txtTelefono.setBorder(new javax.swing.border.SoftBevelBorder(1));

        lblCelular.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblCelular.setText("Celular");

        txtCelular.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtCelular.setBorder(new javax.swing.border.SoftBevelBorder(1));

        javax.swing.GroupLayout panelDatosBasicosLayout = new javax.swing.GroupLayout(panelDatosBasicos);
        panelDatosBasicos.setLayout(panelDatosBasicosLayout);
        panelDatosBasicosLayout.setHorizontalGroup(
            panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addComponent(lblCedula)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblNombres))
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addComponent(lblFecha)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblGenero)))
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblApellidos))
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCorreo)))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
                            .addComponent(txtApellidos)))
                    .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDireccion)
                            .addComponent(lblCelular))
                        .addGap(18, 18, 18)
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(lblTelefono)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        panelDatosBasicosLayout.setVerticalGroup(
            panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGenero)
                        .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCorreo)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosBasicosLayout.createSequentialGroup()
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCedula)
                            .addComponent(lblNombres)
                            .addComponent(lblApellidos)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDireccion))
                .addGap(18, 18, 18)
                .addGroup(panelDatosBasicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCelular)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelDatosBancarios.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosBancarios.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Bancarios", 0, 0, new java.awt.Font("Calibri", 2, 13))); // NOI18N

        lblNumeroCuenta.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblNumeroCuenta.setText("Número de Cuenta");

        lblTipoCuenta.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblTipoCuenta.setText("Tipo de Cuenta");

        lblBanco.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        lblBanco.setText("Banco");

        txtNumeroCuenta.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtNumeroCuenta.setBorder(new javax.swing.border.SoftBevelBorder(1));

        comboTipoCuenta.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        comboTipoCuenta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ahorros", "Corriente" }));
        comboTipoCuenta.setBorder(new javax.swing.border.SoftBevelBorder(1));

        txtBanco.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtBanco.setBorder(new javax.swing.border.SoftBevelBorder(1));

        javax.swing.GroupLayout panelDatosBancariosLayout = new javax.swing.GroupLayout(panelDatosBancarios);
        panelDatosBancarios.setLayout(panelDatosBancariosLayout);
        panelDatosBancariosLayout.setHorizontalGroup(
            panelDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBancariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNumeroCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTipoCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(lblBanco)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBanco)
                .addContainerGap())
        );
        panelDatosBancariosLayout.setVerticalGroup(
            panelDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosBancariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosBancariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroCuenta)
                    .addComponent(lblTipoCuenta)
                    .addComponent(lblBanco)
                    .addComponent(txtNumeroCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboTipoCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBanco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalir.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGuardarConferencista.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
        btnGuardarConferencista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addConferencista.png"))); // NOI18N
        btnGuardarConferencista.setText("Guardar Conferencista");
        btnGuardarConferencista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarConferencistaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAddConferencistaLayout = new javax.swing.GroupLayout(panelAddConferencista);
        panelAddConferencista.setLayout(panelAddConferencistaLayout);
        panelAddConferencistaLayout.setHorizontalGroup(
            panelAddConferencistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddConferencistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddConferencistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelDatosBancarios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosBasicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelAddConferencistaLayout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(10, 10, 10)
                        .addComponent(lblImagen)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddConferencistaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir)
                        .addGap(32, 32, 32)
                        .addComponent(btnGuardarConferencista)))
                .addContainerGap())
        );
        panelAddConferencistaLayout.setVerticalGroup(
            panelAddConferencistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddConferencistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelAddConferencistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen)
                    .addGroup(panelAddConferencistaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblTitulo)))
                .addGap(18, 18, 18)
                .addComponent(panelDatosBasicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelDatosBancarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddConferencistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir)
                    .addComponent(btnGuardarConferencista))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuArchivo.png"))); // NOI18N
        menuArchivo.setText("Archivo");
        menuArchivo.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        barraMenu.add(menuArchivo);

        menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuAyuda.png"))); // NOI18N
        menuAyuda.setText("Ayuda?");
        menuAyuda.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        barraMenu.add(menuAyuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddConferencista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAddConferencista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGuardarConferencistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarConferencistaActionPerformed
        // TODO add your handling code here:
        int cedula = 0;
        String nombres = "";
        String apellidos = "";
        Date fecha = null;
        String genero = "";
        String direccion = "";
        String telefono = "";
        String celular = "";
        String correo = "";
        String numero_cuenta = "";
        String tipo_cuenta = "";
        String banco = "";
        String estado = "AC";
        boolean controlDatos = true;
        if (txtCedula.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar un número de cedula para el conferencista", "Cedula Conferencista", 0);
            controlDatos = false;
        } else {
            try {
                cedula = Integer.parseInt(txtCedula.getText().trim());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor para la cedula que\n"
                        + "contenga digitos entre 0 y 9", "Valor invalido", 0);
                controlDatos = false;
            }
        }
        if (txtNombres.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el nombre del conferencista", "Nombres Conferencista", 0);
            controlDatos = false;
        } else {
            nombres = txtNombres.getText().trim();
        }
        if (txtApellidos.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el apellido del conferencista", "Apellidos Conferencista", 0);
            controlDatos = false;
        } else {
            apellidos = txtApellidos.getText().trim();
        }
        if (txtCorreo.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe el correo electronico del conferencista", "Correo Conferencista", 0);
            controlDatos = false;
        } else {
            correo = txtCorreo.getText().trim();
        }
        if (txtDireccion.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite la dirección del conferencista", "Dirección Conferencista", 0);
            controlDatos = false;
        } else {
            direccion = txtDireccion.getText().trim();
        }
        if (txtNumeroCuenta.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Digite el número de cuenta del conferencista", "Número Cuenta Conferencista", 0);
            controlDatos = false;
        } else {
            numero_cuenta = txtNumeroCuenta.getText().trim();
        }
        if (txtBanco.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Debe digitar el banco donde pertenece la cuenta", "Banco Conferencista", 0);
            controlDatos = false;
        } else {
            banco = txtBanco.getText().trim();
        }
        if (!txtTelefono.getText().trim().equals("")) {
            telefono = txtTelefono.getText().trim();
        }
        if (!txtCelular.getText().trim().equals("")) {
            celular = txtCelular.getText().trim();
        }
        if (controlDatos) {
            try {
                fecha = formatoFecha.parse(comboFecha.getText());
                genero = comboGenero.getSelectedItem().toString();
                tipo_cuenta = comboTipoCuenta.getSelectedItem().toString();
                Conferencista conferencista = new Conferencista(0, cedula, nombres, apellidos, fecha, genero, direccion, telefono, celular, correo, numero_cuenta, tipo_cuenta, banco, estado);
                boolean controlIngreso = false;
                try {
                    controlIngreso = controlConferencista.IngresarConferencista(conferencista);
                    if (controlIngreso) {
                        JOptionPane.showMessageDialog(rootPane, "El conferencista se creo correctamente en el sistema", "Conferencista Creado", 1);
                        limpiarFormulario();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "No se pudo crear el conferencista", "Creación faliida", 2);
                    }
                } catch (RemoteException ex) {
                    JOptionPane.showMessageDialog(rootPane, "No se pudo crear el conferencista", "Creación faliida", 2);
                }
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnGuardarConferencistaActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnGuardarConferencista;
    private javax.swing.JButton btnSalir;
    private datechooser.beans.DateChooserCombo comboFecha;
    private javax.swing.JComboBox comboGenero;
    private javax.swing.JComboBox comboTipoCuenta;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblBanco;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCelular;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblNumeroCuenta;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTipoCuenta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JPanel panelAddConferencista;
    private javax.swing.JPanel panelDatosBancarios;
    private javax.swing.JPanel panelDatosBasicos;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBanco;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumeroCuenta;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        txtCedula.setText("");;
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtNumeroCuenta.setText("");
        txtBanco.setText("");
        txtTelefono.setText("");
    }
}
