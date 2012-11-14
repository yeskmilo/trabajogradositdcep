/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUIEditarAsignacionViaticos.java
 *
 * Created on 13/11/2012, 01:08:38 PM
 */
package Vista.Profesoral;

import Controlador.Profesoral.ControlAsignaciones;
import Controlador.Profesoral.ControlConferencista;
import Controlador.Profesoral.ControlModulo;
import Controlador.Profesoral.ControlPrograma;
import Estructural.Asignacion_tiquete;
import Estructural.Conferencista;
import Estructural.Modulo;
import Estructural.Programa;
import Modelo.IServicioProfesoral;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kmilo
 */
public class GUIEditarAsignacionTiquetes extends javax.swing.JFrame {

  private IServicioProfesoral servicioProfesoral;
  private ControlModulo controlModulo;
  private ControlConferencista controlConferencista;
  private ControlPrograma controlPrograma;
  private ControlAsignaciones controlAsignaciones;
  private Programa programa = null;
  private Conferencista conferencista = null;
  public Modulo modulo;
  private DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
  private ArrayList<Modulo> modulos = null;
  private ArrayList<Asignacion_tiquete> asignaciones = null;
  private Asignacion_tiquete asignacion = null;

  /** Creates new form GUIEditarAsignacionViaticos */
  public GUIEditarAsignacionTiquetes(IServicioProfesoral servicioProfesoral) throws RemoteException {
    initComponents();
    this.setLocationRelativeTo(null);
    this.servicioProfesoral = servicioProfesoral;
    controlConferencista = new ControlConferencista(servicioProfesoral);
    controlPrograma = new ControlPrograma(servicioProfesoral);
    controlAsignaciones = new ControlAsignaciones(servicioProfesoral);
    controlModulo = new ControlModulo(servicioProfesoral);
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelAsignarViaticos = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    lblIcono = new javax.swing.JLabel();
    panelDatosAsignacion = new javax.swing.JPanel();
    lblFechaSolicitud = new javax.swing.JLabel();
    comboFechaSolicitud = new datechooser.beans.DateChooserCombo();
    lblFechaSalida = new javax.swing.JLabel();
    comboFechaSalida = new datechooser.beans.DateChooserCombo();
    lblFechaRegreso = new javax.swing.JLabel();
    comboFechaRegreso = new datechooser.beans.DateChooserCombo();
    lblCiudadOrigen = new javax.swing.JLabel();
    txtCiudadOrigen = new javax.swing.JTextField();
    lblCiudadDestino = new javax.swing.JLabel();
    txtCiudadDestino = new javax.swing.JTextField();
    txtAerolinea = new javax.swing.JTextField();
    lblAerolinea = new javax.swing.JLabel();
    btnEditarAsignacion = new javax.swing.JButton();
    PanelListadoAsignacion = new javax.swing.JPanel();
    scrollListadoAsignacion = new javax.swing.JScrollPane();
    tableAsignaciones = new javax.swing.JTable();
    panelDatosBusquedaPrograma = new javax.swing.JPanel();
    lblCohorte = new javax.swing.JLabel();
    txtCohorte = new javax.swing.JTextField();
    btnBuscarPrograma = new javax.swing.JButton();
    panelResultadosBusquedaModulo = new javax.swing.JPanel();
    scrollResultados = new javax.swing.JScrollPane();
    tablaResultadosBusqueda = new javax.swing.JTable();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Edicion de Asignacion de Viaticos");

    panelAsignarViaticos.setBackground(new java.awt.Color(255, 255, 255));

    lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
    lblTitulo.setText("Edición de Asignación de Tiquetes");

    lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addTicketGrande.png"))); // NOI18N

    panelDatosAsignacion.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Asignación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblFechaSolicitud.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    lblFechaSolicitud.setText("Fecha de Solicitud");

    lblFechaSalida.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFechaSalida.setText("Fecha de Salida");

    lblFechaRegreso.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFechaRegreso.setText("Fecha de Regreso");

    lblCiudadOrigen.setFont(new java.awt.Font("Calibri", 2, 13));
    lblCiudadOrigen.setText("Ciudad de Origen");

    txtCiudadOrigen.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N

    lblCiudadDestino.setFont(new java.awt.Font("Calibri", 2, 13));
    lblCiudadDestino.setText("Ciudad de Destino");

    txtCiudadDestino.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N

    txtAerolinea.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N

    lblAerolinea.setFont(new java.awt.Font("Calibri", 2, 13));
    lblAerolinea.setText("Aerolinea");

    btnEditarAsignacion.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnEditarAsignacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addTicket.png"))); // NOI18N
    btnEditarAsignacion.setText("Editar Asignacion");
    btnEditarAsignacion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnEditarAsignacionActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelDatosAsignacionLayout = new javax.swing.GroupLayout(panelDatosAsignacion);
    panelDatosAsignacion.setLayout(panelDatosAsignacionLayout);
    panelDatosAsignacionLayout.setHorizontalGroup(
      panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
            .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
                .addComponent(lblFechaSolicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(comboFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
                .addComponent(lblCiudadOrigen)
                .addGap(10, 10, 10)
                .addComponent(txtCiudadOrigen)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(lblCiudadDestino)
              .addComponent(lblFechaSalida))
            .addGap(10, 10, 10)
            .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
              .addComponent(txtCiudadDestino)
              .addComponent(comboFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(12, 12, 12)
            .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosAsignacionLayout.createSequentialGroup()
                .addComponent(lblAerolinea)
                .addGap(10, 10, 10)
                .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
                .addComponent(lblFechaRegreso)
                .addGap(10, 10, 10)
                .addComponent(comboFechaRegreso, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE))))
          .addComponent(btnEditarAsignacion, javax.swing.GroupLayout.Alignment.TRAILING))
        .addContainerGap())
    );
    panelDatosAsignacionLayout.setVerticalGroup(
      panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblFechaSolicitud)
          .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
              .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(lblFechaSalida)
                .addComponent(comboFechaSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtCiudadDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCiudadDestino)))
            .addGroup(panelDatosAsignacionLayout.createSequentialGroup()
              .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(comboFechaSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                  .addComponent(lblFechaRegreso)
                  .addComponent(comboFechaRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
              .addGroup(panelDatosAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(txtCiudadOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblCiudadOrigen)
                .addComponent(txtAerolinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAerolinea)))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(btnEditarAsignacion)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    PanelListadoAsignacion.setBackground(new java.awt.Color(255, 255, 255));
    PanelListadoAsignacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asignaciones de tiquetes vinculadas al Modulo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    tableAsignaciones.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fecha Solicitud", "Fecha Salida", "Fecha de Regreso", "Origen", "Destino", "Aerolinea"
      }
    ));
    tableAsignaciones.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tableAsignacionesMouseClicked(evt);
      }
    });
    scrollListadoAsignacion.setViewportView(tableAsignaciones);

    javax.swing.GroupLayout PanelListadoAsignacionLayout = new javax.swing.GroupLayout(PanelListadoAsignacion);
    PanelListadoAsignacion.setLayout(PanelListadoAsignacionLayout);
    PanelListadoAsignacionLayout.setHorizontalGroup(
      PanelListadoAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(PanelListadoAsignacionLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(scrollListadoAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        .addContainerGap())
    );
    PanelListadoAsignacionLayout.setVerticalGroup(
      PanelListadoAsignacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelListadoAsignacionLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(scrollListadoAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        .addContainerGap())
    );

    panelDatosBusquedaPrograma.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosBusquedaPrograma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda Inicial de Programa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblCohorte.setFont(new java.awt.Font("Calibri", 2, 13));
    lblCohorte.setText("Cohorte del Programa");

    txtCohorte.setFont(new java.awt.Font("Calibri", 2, 13));
    txtCohorte.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    btnBuscarPrograma.setFont(new java.awt.Font("Calibri", 3, 13));
    btnBuscarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarModulo.png"))); // NOI18N
    btnBuscarPrograma.setText("Buscar");
    btnBuscarPrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarProgramaActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelDatosBusquedaProgramaLayout = new javax.swing.GroupLayout(panelDatosBusquedaPrograma);
    panelDatosBusquedaPrograma.setLayout(panelDatosBusquedaProgramaLayout);
    panelDatosBusquedaProgramaLayout.setHorizontalGroup(
      panelDatosBusquedaProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosBusquedaProgramaLayout.createSequentialGroup()
        .addGap(113, 113, 113)
        .addComponent(lblCohorte)
        .addGap(21, 21, 21)
        .addComponent(txtCohorte, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(18, 18, 18)
        .addComponent(btnBuscarPrograma)
        .addContainerGap(248, Short.MAX_VALUE))
    );
    panelDatosBusquedaProgramaLayout.setVerticalGroup(
      panelDatosBusquedaProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosBusquedaProgramaLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosBusquedaProgramaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblCohorte)
          .addComponent(btnBuscarPrograma)
          .addComponent(txtCohorte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelResultadosBusquedaModulo.setBackground(new java.awt.Color(255, 255, 255));
    panelResultadosBusquedaModulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modulos Vinculados al Programa", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    tablaResultadosBusqueda.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Nombre Modulo", "Duración Modulo (Horas)", "Fecha de Inicio", "Valor Hora", "Cohorte Programa", "Cedula Conferencista"
      }
    ));
    tablaResultadosBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        tablaResultadosBusquedaMouseClicked(evt);
      }
    });
    scrollResultados.setViewportView(tablaResultadosBusqueda);

    javax.swing.GroupLayout panelResultadosBusquedaModuloLayout = new javax.swing.GroupLayout(panelResultadosBusquedaModulo);
    panelResultadosBusquedaModulo.setLayout(panelResultadosBusquedaModuloLayout);
    panelResultadosBusquedaModuloLayout.setHorizontalGroup(
      panelResultadosBusquedaModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelResultadosBusquedaModuloLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(scrollResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 764, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelResultadosBusquedaModuloLayout.setVerticalGroup(
      panelResultadosBusquedaModuloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelResultadosBusquedaModuloLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(scrollResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout panelAsignarViaticosLayout = new javax.swing.GroupLayout(panelAsignarViaticos);
    panelAsignarViaticos.setLayout(panelAsignarViaticosLayout);
    panelAsignarViaticosLayout.setHorizontalGroup(
      panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addComponent(panelDatosAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addComponent(lblTitulo)
            .addGap(18, 18, 18)
            .addComponent(lblIcono))
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addComponent(panelDatosBusquedaPrograma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addComponent(PanelListadoAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())))
      .addGroup(panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
          .addContainerGap()
          .addComponent(panelResultadosBusquedaModulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addContainerGap()))
    );
    panelAsignarViaticosLayout.setVerticalGroup(
      panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
        .addGroup(panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(lblTitulo))
          .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblIcono)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelDatosBusquedaPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 225, Short.MAX_VALUE)
        .addComponent(PanelListadoAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelDatosAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
      .addGroup(panelAsignarViaticosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(panelAsignarViaticosLayout.createSequentialGroup()
          .addGap(162, 162, 162)
          .addComponent(panelResultadosBusquedaModulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addContainerGap(302, Short.MAX_VALUE)))
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
      .addComponent(panelAsignarViaticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelAsignarViaticos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void btnBuscarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProgramaActionPerformed
// TODO add your handling code here:
  String cohorte = "";
  if (txtCohorte.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe digitar una cohorte de Programa para buscar", "Digite cohorte del programa", 0);
  } else {
    cohorte = txtCohorte.getText().trim();
    try {
      modulos = controlModulo.BuscarModuloPrograma(cohorte);
      if (modulos.isEmpty()) {
        JOptionPane.showMessageDialog(rootPane, "No se encontraton modulos vinculados al programa", "No hay resultados que mostrar", 0);
        limpiarTablaResultados();
      } else {
        cargarModulos(modulos);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnBuscarProgramaActionPerformed

private void tablaResultadosBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaResultadosBusquedaMouseClicked
// TODO add your handling code here:
  int fila = tablaResultadosBusqueda.getSelectedRow();
  if (fila != -1) {
    modulo = modulos.get(fila);
    try {
      limpiarAsignaciones();
      asignaciones = controlAsignaciones.BuscarAsignacionTiquetes(modulo.getId_modulo());
      cargarAsignaciones();
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_tablaResultadosBusquedaMouseClicked

private void tableAsignacionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAsignacionesMouseClicked
// TODO add your handling code here:
  int fila = tableAsignaciones.getSelectedRow();
  if (fila != -1) {
    asignacion = asignaciones.get(fila);
    cargarAsignacion();
  }
}//GEN-LAST:event_tableAsignacionesMouseClicked

private void btnEditarAsignacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarAsignacionActionPerformed
// TODO add your handling code here:
  boolean controlDatos = true;
  Date fechaSolicitud = null;
  Date fechaSalida = null;
  Date fechaRegreso = null;
  String ciudadOrigen = "";
  String ciudadDestino = "";
  String aerolinea = "";
  if (modulo == null || asignacion == null) {
    JOptionPane.showMessageDialog(rootPane, "Debe buscar un modulo y seleccionar uno\npara poder actualizar alguna asignación", "Error", 2);
    controlDatos = false;
  }
  if (txtCiudadOrigen.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Ingresar una Ciudad de Origen para la generación de Tiquetes", "Ciudad de Origen", 0);
    controlDatos = false;
  } else {
    ciudadOrigen = txtCiudadOrigen.getText().trim();
  }
  if (txtCiudadDestino.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Ingresar una Ciudad de Destino para la generación de Tiquetes", "Ciudad de Destino", 0);
    controlDatos = false;
  } else {
    ciudadDestino = txtCiudadDestino.getText().trim();
  }
  if (txtAerolinea.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Ingresar una Aerolinea para la generación de Tiquetes", "Aerolinea", 0);
    controlDatos = false;
  } else {
    aerolinea = txtAerolinea.getText().trim();
  }
  if (controlDatos) {
    try {
      fechaSolicitud = formatoFecha.parse(comboFechaSolicitud.getText());
      fechaSalida = formatoFecha.parse(comboFechaSalida.getText());
      fechaRegreso = formatoFecha.parse(comboFechaRegreso.getText());
      Asignacion_tiquete asignacionTiquete = new Asignacion_tiquete(asignacion.getId_tiquete(), fechaSolicitud, fechaSalida, fechaRegreso, ciudadOrigen, ciudadDestino, aerolinea, asignacion.getid_modulo());
      boolean controlAsignacion = controlAsignaciones.EditarAsignacionTiquete(asignacionTiquete);
      if (controlAsignacion) {
        JOptionPane.showMessageDialog(rootPane, "Se ha editado la asignación de Tiquetes", "Edicion Exitosa", 1);
      } else {
        JOptionPane.showMessageDialog(rootPane, "No se puede editar la asignación de Tiquetes", "Edición fallida", 0);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnEditarAsignacionActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel PanelListadoAsignacion;
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JButton btnBuscarPrograma;
  private javax.swing.JButton btnEditarAsignacion;
  private datechooser.beans.DateChooserCombo comboFechaRegreso;
  private datechooser.beans.DateChooserCombo comboFechaSalida;
  private datechooser.beans.DateChooserCombo comboFechaSolicitud;
  private javax.swing.JLabel lblAerolinea;
  private javax.swing.JLabel lblCiudadDestino;
  private javax.swing.JLabel lblCiudadOrigen;
  private javax.swing.JLabel lblCohorte;
  private javax.swing.JLabel lblFechaRegreso;
  private javax.swing.JLabel lblFechaSalida;
  private javax.swing.JLabel lblFechaSolicitud;
  private javax.swing.JLabel lblIcono;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JPanel panelAsignarViaticos;
  private javax.swing.JPanel panelDatosAsignacion;
  private javax.swing.JPanel panelDatosBusquedaPrograma;
  private javax.swing.JPanel panelResultadosBusquedaModulo;
  private javax.swing.JScrollPane scrollListadoAsignacion;
  private javax.swing.JScrollPane scrollResultados;
  private javax.swing.JTable tablaResultadosBusqueda;
  private javax.swing.JTable tableAsignaciones;
  private javax.swing.JTextField txtAerolinea;
  private javax.swing.JTextField txtCiudadDestino;
  private javax.swing.JTextField txtCiudadOrigen;
  private javax.swing.JTextField txtCohorte;
  // End of variables declaration//GEN-END:variables

  private void cargarModulos(ArrayList<Modulo> modulos) {
    int fila = 0;
    for (int i = 0; i < modulos.size(); i++) {
      if (tablaResultadosBusqueda.getRowCount() == fila) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tablaResultadosBusqueda.getModel();
        Object nuevo[] = {null, null, null, null, null, null};
        tablaTemp.addRow(nuevo);
      }
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getNombre_modulo(), i, 0);
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getDuracion_modulo_horas(), i, 1);
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getFecha_inicio_modulo(), i, 2);
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getValor_hora(), i, 3);
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getCohorte_programa(), i, 4);
      tablaResultadosBusqueda.setValueAt(modulos.get(i).getCedula_conferencista(), i, 5);
      fila++;
    }
    if (tablaResultadosBusqueda.getRowCount() > fila) {
      DefaultTableModel tablaTemp = (DefaultTableModel) tablaResultadosBusqueda.getModel();
      tablaTemp.removeRow(fila);
    }
  }

  private void limpiarTablaResultados() {
    for (int i = 0; i < tablaResultadosBusqueda.getRowCount(); i++) {
      tablaResultadosBusqueda.setValueAt("", i, 0);
      tablaResultadosBusqueda.setValueAt("", i, 1);
      tablaResultadosBusqueda.setValueAt("", i, 2);
      tablaResultadosBusqueda.setValueAt("", i, 3);
      tablaResultadosBusqueda.setValueAt("", i, 4);
      tablaResultadosBusqueda.setValueAt("", i, 5);
    }
  }

  private void cargarAsignaciones() {
    int fila = 0;
    for (int i = 0; i < asignaciones.size(); i++) {
      if (tableAsignaciones.getRowCount() == fila) {
        DefaultTableModel tablaTemp = (DefaultTableModel) tableAsignaciones.getModel();
        Object nuevo[] = {null, null, null, null, null, null};
        tablaTemp.addRow(nuevo);
      }
      tableAsignaciones.setValueAt(asignaciones.get(i).getFecha_solicitud(), i, 0);
      tableAsignaciones.setValueAt(asignaciones.get(i).getFecha_salida(), i, 1);
      tableAsignaciones.setValueAt(asignaciones.get(i).getFecha_regreso(), i, 2);
      tableAsignaciones.setValueAt(asignaciones.get(i).getCiudad_origen(), i, 3);
      tableAsignaciones.setValueAt(asignaciones.get(i).getCiudad_destino(), i, 4);
      tableAsignaciones.setValueAt(asignaciones.get(i).getAerolinea(), i, 5);
      fila++;
    }
    if (tableAsignaciones.getRowCount() > fila) {
      DefaultTableModel tablaTemp = (DefaultTableModel) tableAsignaciones.getModel();
      tablaTemp.removeRow(fila);
    }
  }

  private void limpiarAsignaciones() {
    for (int i = 0; i < tableAsignaciones.getRowCount(); i++) {
      tableAsignaciones.setValueAt("", i, 0);
      tableAsignaciones.setValueAt("", i, 1);
      tableAsignaciones.setValueAt("", i, 2);
      tableAsignaciones.setValueAt("", i, 3);
      tableAsignaciones.setValueAt("", i, 4);
      tableAsignaciones.setValueAt("", i, 5);
    }
  }

  private void cargarAsignacion() {
    comboFechaSolicitud.setText(formatoFecha.format(asignacion.getFecha_solicitud()));
    comboFechaSalida.setText(formatoFecha.format(asignacion.getFecha_salida()));
    comboFechaRegreso.setText(formatoFecha.format(asignacion.getFecha_regreso()));
    txtCiudadOrigen.setText(asignacion.getCiudad_origen());
    txtCiudadDestino.setText(asignacion.getCiudad_destino());
    txtAerolinea.setText(asignacion.getAerolinea());
  }
}