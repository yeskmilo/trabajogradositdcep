/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUIEditarPrograma.java
 *
 * Created on 26/08/2012, 10:51:40 AM
 */
package Vista.Profesoral;

import Controlador.Profesoral.ControlPrograma;
import Estructural.Convenio;
import Estructural.Programa;
import Modelo.IServicioProfesoral;
import javax.swing.JOptionPane;

/**
 *
 * @author Kmilo
 */
public class GUIEditarPrograma extends javax.swing.JFrame {

  private IServicioProfesoral servicioProfesoral;
  private ControlPrograma controlPrograma;
  private Programa programa = null;
  private Convenio convenio = null;

  /** Creates new form GUIEditarPrograma */
  public GUIEditarPrograma(IServicioProfesoral servicioProfesoral) {
    initComponents();
    this.servicioProfesoral = servicioProfesoral;
    controlPrograma = new ControlPrograma(servicioProfesoral);
    this.setLocationRelativeTo(null);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelEditarPrograma = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    lblIcono = new javax.swing.JLabel();
    panelDatosIniciales = new javax.swing.JPanel();
    lblCohorteBuscar = new javax.swing.JLabel();
    btnBuscarPrograma = new javax.swing.JButton();
    txtCohorteBuscar = new javax.swing.JTextField();
    btnSeleccionarPrograma = new javax.swing.JButton();
    panelDatosPrograma = new javax.swing.JPanel();
    lblCohorte = new javax.swing.JLabel();
    lblNombrePrograma = new javax.swing.JLabel();
    lblFecha = new javax.swing.JLabel();
    lblValor = new javax.swing.JLabel();
    lblParticipantes = new javax.swing.JLabel();
    lblEstado = new javax.swing.JLabel();
    txtCohorte = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    comboFecha = new datechooser.beans.DateChooserCombo();
    txtValor = new javax.swing.JTextField();
    spinParticipantes = new javax.swing.JSpinner();
    comboEstado = new javax.swing.JComboBox();
    panelDatosConvenio = new javax.swing.JPanel();
    radioConvenioSi = new javax.swing.JRadioButton();
    radioConvenioNo = new javax.swing.JRadioButton();
    lblNumeroConvenio = new javax.swing.JLabel();
    txtNumeroConvenio = new javax.swing.JTextField();
    btnBuscarConvenio = new javax.swing.JButton();
    lblEstadoConvenio = new javax.swing.JLabel();
    lblEstadoConvenioValor = new javax.swing.JLabel();
    btnEditarPrograma = new javax.swing.JButton();
    btnSalir = new javax.swing.JButton();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Edicion de Programas");

    panelEditarPrograma.setBackground(new java.awt.Color(255, 255, 255));

    lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
    lblTitulo.setText("Edición de Programas");

    lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarGrande.png"))); // NOI18N

    panelDatosIniciales.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosIniciales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblCohorteBuscar.setFont(new java.awt.Font("Calibri", 2, 13));
    lblCohorteBuscar.setText("Cohorte del Programa");

    btnBuscarPrograma.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnBuscarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarRubro.png"))); // NOI18N
    btnBuscarPrograma.setText("Buscar Programa");
    btnBuscarPrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarProgramaActionPerformed(evt);
      }
    });

    txtCohorteBuscar.setFont(new java.awt.Font("Calibri", 2, 13));
    txtCohorteBuscar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    btnSeleccionarPrograma.setFont(new java.awt.Font("Calibri", 3, 13));
    btnSeleccionarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe.png"))); // NOI18N
    btnSeleccionarPrograma.setText("Seleccionar de un Listado");

    javax.swing.GroupLayout panelDatosInicialesLayout = new javax.swing.GroupLayout(panelDatosIniciales);
    panelDatosIniciales.setLayout(panelDatosInicialesLayout);
    panelDatosInicialesLayout.setHorizontalGroup(
      panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosInicialesLayout.createSequentialGroup()
        .addGap(22, 22, 22)
        .addGroup(panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addComponent(lblCohorteBuscar)
          .addComponent(btnSeleccionarPrograma))
        .addGap(18, 18, 18)
        .addGroup(panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(txtCohorteBuscar)
          .addComponent(btnBuscarPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))
        .addGap(20, 20, 20))
    );
    panelDatosInicialesLayout.setVerticalGroup(
      panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosInicialesLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCohorteBuscar)
          .addComponent(txtCohorteBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(panelDatosInicialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnSeleccionarPrograma)
          .addComponent(btnBuscarPrograma))
        .addContainerGap(34, Short.MAX_VALUE))
    );

    panelDatosPrograma.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosPrograma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Programa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblCohorte.setFont(new java.awt.Font("Calibri", 2, 13));
    lblCohorte.setText("Cohorte del Programa");

    lblNombrePrograma.setFont(new java.awt.Font("Calibri", 2, 13));
    lblNombrePrograma.setText("Nombre del Programa");

    lblFecha.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFecha.setText("Fecha Inicio");

    lblValor.setFont(new java.awt.Font("Calibri", 2, 13));
    lblValor.setText("Valor Programa");

    lblParticipantes.setFont(new java.awt.Font("Calibri", 2, 13));
    lblParticipantes.setText("Número de Participantes");

    lblEstado.setFont(new java.awt.Font("Calibri", 2, 13));
    lblEstado.setText("Estado del Programa");

    txtCohorte.setEditable(false);
    txtCohorte.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    txtCohorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    txtNombre.setFont(new java.awt.Font("Calibri", 2, 13));
    txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    txtValor.setFont(new java.awt.Font("Calibri", 2, 13));
    txtValor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    spinParticipantes.setFont(new java.awt.Font("Calibri", 2, 13));
    spinParticipantes.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    spinParticipantes.setMinimumSize(new java.awt.Dimension(31, 20));

    comboEstado.setFont(new java.awt.Font("Calibri", 2, 13));
    comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vendido", "No Vendido" }));
    comboEstado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    spinParticipantes.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));

    javax.swing.GroupLayout panelDatosProgramaLayout = new javax.swing.GroupLayout(panelDatosPrograma);
    panelDatosPrograma.setLayout(panelDatosProgramaLayout);
    panelDatosProgramaLayout.setHorizontalGroup(
      panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosProgramaLayout.createSequentialGroup()
        .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDatosProgramaLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                .addComponent(lblCohorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(txtCohorte, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                .addComponent(lblFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblValor)
              .addComponent(lblNombrePrograma))
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                  .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblParticipantes)
                    .addGap(35, 35, 35))
                  .addGroup(panelDatosProgramaLayout.createSequentialGroup()
                    .addGap(4, 4, 4)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(174, 174, 174)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(panelDatosProgramaLayout.createSequentialGroup()
            .addGap(201, 201, 201)
            .addComponent(lblEstado)
            .addGap(29, 29, 29)
            .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    panelDatosProgramaLayout.setVerticalGroup(
      panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosProgramaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelDatosProgramaLayout.createSequentialGroup()
            .addComponent(lblNombrePrograma)
            .addGap(18, 18, 18)
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblValor)
              .addComponent(lblParticipantes)
              .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(spinParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(panelDatosProgramaLayout.createSequentialGroup()
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblCohorte)
              .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(txtCohorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblFecha)
              .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        .addGap(18, 18, 18)
        .addGroup(panelDatosProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblEstado)
          .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelDatosConvenio.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Convenio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    radioConvenioSi.setBackground(new java.awt.Color(255, 255, 255));
    radioConvenioSi.setFont(new java.awt.Font("Calibri", 2, 13));
    radioConvenioSi.setText("Programa en Convenio");
    radioConvenioSi.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioConvenioSiActionPerformed(evt);
      }
    });

    radioConvenioNo.setBackground(new java.awt.Color(255, 255, 255));
    radioConvenioNo.setFont(new java.awt.Font("Calibri", 2, 13));
    radioConvenioNo.setText("Programa sin Convenio");
    radioConvenioNo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        radioConvenioNoActionPerformed(evt);
      }
    });

    lblNumeroConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    lblNumeroConvenio.setText("Número Convenio");

    txtNumeroConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    txtNumeroConvenio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    btnBuscarConvenio.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnBuscarConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConvenio.png"))); // NOI18N
    btnBuscarConvenio.setText("Buscar Convenio");
    btnBuscarConvenio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarConvenioActionPerformed(evt);
      }
    });

    lblEstadoConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    lblEstadoConvenio.setText("Estado Convenio");

    lblEstadoConvenioValor.setFont(new java.awt.Font("Calibri", 2, 13));
    lblEstadoConvenioValor.setText("estado");

    javax.swing.GroupLayout panelDatosConvenioLayout = new javax.swing.GroupLayout(panelDatosConvenio);
    panelDatosConvenio.setLayout(panelDatosConvenioLayout);
    panelDatosConvenioLayout.setHorizontalGroup(
      panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosConvenioLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDatosConvenioLayout.createSequentialGroup()
            .addComponent(radioConvenioSi)
            .addGap(80, 80, 80)
            .addComponent(lblNumeroConvenio)
            .addGap(30, 30, 30)
            .addComponent(txtNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(30, 30, 30)
            .addComponent(btnBuscarConvenio))
          .addGroup(panelDatosConvenioLayout.createSequentialGroup()
            .addComponent(radioConvenioNo)
            .addGap(144, 144, 144)
            .addComponent(lblEstadoConvenio)
            .addGap(51, 51, 51)
            .addComponent(lblEstadoConvenioValor)))
        .addGap(60, 60, 60))
    );
    panelDatosConvenioLayout.setVerticalGroup(
      panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosConvenioLayout.createSequentialGroup()
        .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioConvenioSi)
          .addComponent(txtNumeroConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(lblNumeroConvenio)
          .addComponent(btnBuscarConvenio))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
        .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(radioConvenioNo)
          .addComponent(lblEstadoConvenio)
          .addComponent(lblEstadoConvenioValor))
        .addContainerGap())
    );

    btnEditarPrograma.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnEditarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
    btnEditarPrograma.setText("Editar Programa");
    btnEditarPrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarProgramaActionPerformed(evt);
      }
    });

    btnSalir.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelEditarProgramaLayout = new javax.swing.GroupLayout(panelEditarPrograma);
    panelEditarPrograma.setLayout(panelEditarProgramaLayout);
    panelEditarProgramaLayout.setHorizontalGroup(
      panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelEditarProgramaLayout.createSequentialGroup()
        .addGroup(panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarProgramaLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(panelDatosIniciales, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addComponent(lblIcono)
            .addGap(18, 18, 18)
            .addComponent(lblTitulo))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarProgramaLayout.createSequentialGroup()
            .addGap(7, 7, 7)
            .addComponent(panelDatosPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addContainerGap())
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEditarProgramaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelEditarProgramaLayout.createSequentialGroup()
            .addComponent(btnSalir)
            .addGap(31, 31, 31)
            .addComponent(btnEditarPrograma))
          .addComponent(panelDatosConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE))
        .addGap(14, 14, 14))
    );
    panelEditarProgramaLayout.setVerticalGroup(
      panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelEditarProgramaLayout.createSequentialGroup()
        .addGap(21, 21, 21)
        .addGroup(panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(panelEditarProgramaLayout.createSequentialGroup()
            .addGroup(panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelEditarProgramaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo))
              .addComponent(lblIcono))
            .addGap(86, 86, 86))
          .addGroup(panelEditarProgramaLayout.createSequentialGroup()
            .addComponent(panelDatosIniciales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
        .addComponent(panelDatosPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelDatosConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addGroup(panelEditarProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnEditarPrograma)
          .addComponent(btnSalir))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuArchivo.png"))); // NOI18N
    menuArchivo.setText("Archivo");
    menuArchivo.setFont(new java.awt.Font("Calibri", 2, 13));
    barraMenu.add(menuArchivo);

    menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuAyuda.png"))); // NOI18N
    menuAyuda.setText("Ayuda");
    menuAyuda.setFont(new java.awt.Font("Calibri", 2, 13));
    barraMenu.add(menuAyuda);

    setJMenuBar(barraMenu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelEditarPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelEditarPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void radioConvenioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConvenioSiActionPerformed
// TODO add your handling code here:
  if (radioConvenioSi.isSelected()) {
    radioConvenioNo.setSelected(false);
    mostrarBusquedaConvenio();
  } else {
    radioConvenioNo.setSelected(true);
    ocultarBusquedaConvenio();
  }
}//GEN-LAST:event_radioConvenioSiActionPerformed

private void radioConvenioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioConvenioNoActionPerformed
// TODO add your handling code here:
  if (radioConvenioNo.isSelected()) {
    radioConvenioSi.setSelected(false);
    ocultarBusquedaConvenio();
  } else {
    radioConvenioSi.setSelected(true);
    mostrarBusquedaConvenio();
  }
}//GEN-LAST:event_radioConvenioNoActionPerformed

private void btnBuscarConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConvenioActionPerformed
// TODO add your handling code here:
  int numeroConvenio = 0;
  boolean controlDatos = true;
  if (txtNumeroConvenio.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Digitar un número de Convenio", "Error número Convenio", 0);
    controlDatos = false;
  } else {
    try {
      numeroConvenio = Integer.parseInt(txtNumeroConvenio.getText().trim());
    } catch (Exception e) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar un número de Convenio que\n"
              + "contenga digitos entre 0 y 9 Ej: 0674", "Error número Convenio", 0);
      controlDatos = false;
      System.out.println(e.getMessage());
    }
  }
  if (controlDatos) {
    try {
      convenio = controlPrograma.ConsultaConvenio(numeroConvenio);
      if (convenio != null) {
        txtNumeroConvenio.setText(String.valueOf(convenio.getNumero_convenio()));
        txtNumeroConvenio.setEditable(false);
        lblEstadoConvenioValor.setText(convenio.getEstado_convenio());
      } else {
        JOptionPane.showMessageDialog(rootPane, "El número de convenio ingresado no arrojo resultados\n"
                + "Si desea usar este numero de convenio, debe ser \ncreado por el encargado de Convenios", "No se encontraron resultados", 0);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnBuscarConvenioActionPerformed

private void btnBuscarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProgramaActionPerformed
// TODO add your handling code here:
  String cohorte = "";
  boolean controlDatos = true;
  if (txtCohorteBuscar.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Digitar una cohorte para buscar Programa", "Digite Cohorte", 0);
    controlDatos = false;
  } else {
    cohorte = txtCohorteBuscar.getText().trim();
  }
  if (controlDatos) {
    try {
      programa = controlPrograma.ConsultarPrograma(cohorte);
      if (programa != null) {
        llenarFormulario();
      } else {
        JOptionPane.showMessageDialog(rootPane, "No se ha encontrado ningun programa con la cohorte digitada", "No se encontraron programas", 0);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnBuscarProgramaActionPerformed

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
// TODO add your handling code here:
  this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnEditarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProgramaActionPerformed
// TODO add your handling code here:
  boolean controlDatos = true;
  if (programa == null) {
    JOptionPane.showMessageDialog(rootPane, "Debe buscar un Programa para Editar", "Busque Programa", 0);
    controlDatos = false;
  } else {
    if (txtNombre.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar un Nombre para el Programa", "Digite Nombre", 0);
      controlDatos = false;
    } else {
      programa.setNombre_programa(txtNombre.getText().trim());
    }
    if (txtValor.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar un valor para el programa", "Digite Valor", 0);
      controlDatos = false;
    } else {
      try {
        programa.setValor(Double.parseDouble(txtValor.getText().trim()));
      } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "Debe digitar un valor para el programa que\n"
                + "contenga digitos entre 0 y 9", "Valor invalido", 0);
        controlDatos = false;
        System.out.println(e.getMessage());
      }
    }
    if (convenio != null) {
      if (convenio.getEstado_convenio().equals("SUSPENDIDO") || convenio.getEstado_convenio().equals("LIQUIDADO")) {
        JOptionPane.showMessageDialog(rootPane, "El estado del convenio no permite que se\nvincule algun programa al mismo", "Estado de convenio", 0);
        controlDatos = false;
      } else {
        programa.setNumero_convenio(convenio.getNumero_convenio());
      }
    }
  }
  if (controlDatos) {
    try {
      boolean controlActualizacion = controlPrograma.EditarPrograma(programa);
      if (controlActualizacion) {
        JOptionPane.showMessageDialog(rootPane, "El programa se creo correctamente", "Programa Creado", 1);
        limpiarFormulario();
      } else {
        JOptionPane.showMessageDialog(rootPane, "No se pudo editar el programa", "Edición faliida", 2);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnEditarProgramaActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JButton btnBuscarConvenio;
  private javax.swing.JButton btnBuscarPrograma;
  private javax.swing.JButton btnEditarPrograma;
  private javax.swing.JButton btnSalir;
  private javax.swing.JButton btnSeleccionarPrograma;
  private javax.swing.JComboBox comboEstado;
  private datechooser.beans.DateChooserCombo comboFecha;
  private javax.swing.JLabel lblCohorte;
  private javax.swing.JLabel lblCohorteBuscar;
  private javax.swing.JLabel lblEstado;
  private javax.swing.JLabel lblEstadoConvenio;
  private javax.swing.JLabel lblEstadoConvenioValor;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblIcono;
  private javax.swing.JLabel lblNombrePrograma;
  private javax.swing.JLabel lblNumeroConvenio;
  private javax.swing.JLabel lblParticipantes;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JLabel lblValor;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JPanel panelDatosConvenio;
  private javax.swing.JPanel panelDatosIniciales;
  private javax.swing.JPanel panelDatosPrograma;
  private javax.swing.JPanel panelEditarPrograma;
  private javax.swing.JRadioButton radioConvenioNo;
  private javax.swing.JRadioButton radioConvenioSi;
  private javax.swing.JSpinner spinParticipantes;
  private javax.swing.JTextField txtCohorte;
  private javax.swing.JTextField txtCohorteBuscar;
  private javax.swing.JTextField txtNombre;
  private javax.swing.JTextField txtNumeroConvenio;
  private javax.swing.JTextField txtValor;
  // End of variables declaration//GEN-END:variables

  public void AsignarPrograma(Programa programa) {
    this.programa = programa;
    llenarFormulario();
  }

  private void llenarFormulario() {
    txtCohorte.setText(programa.getCohorte_programa());
    txtCohorte.setEditable(false);
    txtNombre.setText(programa.getNombre_programa());
    txtValor.setText(String.valueOf(programa.getValor()));
    comboFecha.setText(programa.getFecha_inicio_programa().toString());
    comboEstado.setSelectedItem(programa.getEstado());
    spinParticipantes.setValue(programa.getParticipantes());
    txtCohorteBuscar.setText("");
    datosConvenio();
  }

  private void mostrarBusquedaConvenio() {
    txtNumeroConvenio.setEditable(true);
    txtNumeroConvenio.setText("");
    lblNumeroConvenio.setVisible(true);
    txtNumeroConvenio.setVisible(true);
    btnBuscarConvenio.setVisible(true);
    lblEstadoConvenio.setVisible(true);
    lblEstadoConvenioValor.setVisible(true);
    lblEstadoConvenioValor.setText("");
    convenio = null;
  }

  private void ocultarBusquedaConvenio() {
    lblNumeroConvenio.setVisible(false);
    txtNumeroConvenio.setVisible(false);
    btnBuscarConvenio.setVisible(false);
    lblEstadoConvenio.setVisible(false);
    lblEstadoConvenioValor.setVisible(false);
    convenio = null;
  }

  private void datosConvenio() {
    if (programa.getNumero_convenio() != 0) {
      txtNumeroConvenio.setText(String.valueOf(programa.getNumero_convenio()));
      btnBuscarConvenio.doClick();
      panelDatosConvenio.setVisible(true);
    } else {
      panelDatosConvenio.setVisible(false);
    }
  }

  private void limpiarFormulario() {
    txtCohorte.setText("");
    txtNombre.setText("");
    txtValor.setText("");
    spinParticipantes.setValue(1);
    txtNumeroConvenio.setText("");
    lblEstadoConvenioValor.setText("");
    programa = null;
    ocultarBusquedaConvenio();
  }
}
