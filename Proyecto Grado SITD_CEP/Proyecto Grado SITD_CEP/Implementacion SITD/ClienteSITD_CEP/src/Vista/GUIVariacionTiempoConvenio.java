/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUIVariacionTiempoConvenio.java
 *
 * Created on 17/08/2012, 12:20:23 AM
 */
package Vista;

import Controlador.ControlConvenio;
import Controlador.ControlVariacion;
import Estructural.Actas;
import Estructural.Convenio;
import Estructural.Variaciones_tiempo;
import Modelo.ICambioVista;
import Modelo.IServicioConvenios;
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
public class GUIVariacionTiempoConvenio extends javax.swing.JFrame implements ICambioVista {

  private IServicioConvenios servicioConvenios;
  private ControlConvenio controlConvenio;
  private Convenio convenio;
  private ControlVariacion controlVariacion;
  private DateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");

  /** Creates new form GUIVariacionTiempoConvenio */
  public GUIVariacionTiempoConvenio(IServicioConvenios servicioConvenios, Convenio convenio) throws RemoteException {
    initComponents();
    this.servicioConvenios = servicioConvenios;
    this.convenio = convenio;
    controlConvenio = new ControlConvenio(servicioConvenios);
    controlVariacion = new ControlVariacion(servicioConvenios);
    this.setLocationRelativeTo(null);
    cargarVariaciones();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelVariacion = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    lblIcono = new javax.swing.JLabel();
    panelVariacionAnteriores = new javax.swing.JPanel();
    scrollVariaciones = new javax.swing.JScrollPane();
    tablaVariaciones = new javax.swing.JTable();
    panelNuevaVariacion = new javax.swing.JPanel();
    lblFecha = new javax.swing.JLabel();
    comboFecha = new datechooser.beans.DateChooserCombo();
    lblDuracion = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    listDescripcion = new javax.swing.JList();
    btnNuevaVariacion = new javax.swing.JButton();
    lblConvenio = new javax.swing.JLabel();
    lblConvenioValor = new javax.swing.JLabel();
    spinDuracion = new javax.swing.JSpinner();
    btnSalir = new javax.swing.JButton();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Variacion de Tiempo en Convenios");

    panelVariacion.setBackground(new java.awt.Color(255, 255, 255));

    lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24));
    lblTitulo.setText("Variaciones de Tiempo en Convenios");

    lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/variacionGrande.png"))); // NOI18N

    panelVariacionAnteriores.setBackground(new java.awt.Color(255, 255, 255));
    panelVariacionAnteriores.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Variaciones Anteriores", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    tablaVariaciones.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Fecha de la Variacion", "Descripción", "Duración en días"
      }
    ));
    scrollVariaciones.setViewportView(tablaVariaciones);

    javax.swing.GroupLayout panelVariacionAnterioresLayout = new javax.swing.GroupLayout(panelVariacionAnteriores);
    panelVariacionAnteriores.setLayout(panelVariacionAnterioresLayout);
    panelVariacionAnterioresLayout.setHorizontalGroup(
      panelVariacionAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelVariacionAnterioresLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(scrollVariaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 787, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelVariacionAnterioresLayout.setVerticalGroup(
      panelVariacionAnterioresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelVariacionAnterioresLayout.createSequentialGroup()
        .addComponent(scrollVariaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
        .addContainerGap())
    );

    panelNuevaVariacion.setBackground(new java.awt.Color(255, 255, 255));
    panelNuevaVariacion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Nueva Variación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblFecha.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFecha.setText("Fecha de la Variacion");

    comboFecha.setFieldFont(new java.awt.Font("Calibri", java.awt.Font.ITALIC, 12));

    lblDuracion.setFont(new java.awt.Font("Calibri", 2, 13));
    lblDuracion.setText("Duración de la Variación (Días)");

    listDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción de la variación", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N
    listDescripcion.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    listDescripcion.setModel(new javax.swing.AbstractListModel() {
      String[] strings = { "Suspension", "Adicion de Tiempo", "Reinicio" };
      public int getSize() { return strings.length; }
      public Object getElementAt(int i) { return strings[i]; }
    });
    jScrollPane1.setViewportView(listDescripcion);

    btnNuevaVariacion.setFont(new java.awt.Font("Calibri", 3, 13));
    btnNuevaVariacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/variacion.png"))); // NOI18N
    btnNuevaVariacion.setText("Crear Nueva Variacion");
    btnNuevaVariacion.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnNuevaVariacionActionPerformed(evt);
      }
    });

    lblConvenio.setFont(new java.awt.Font("Calibri", 3, 13));
    lblConvenio.setText("Convenio");

    lblConvenioValor.setFont(new java.awt.Font("Calibri", 3, 13));
    lblConvenioValor.setText("Convenio");

    spinDuracion.setFont(new java.awt.Font("Calibri", 2, 13));
    spinDuracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

    javax.swing.GroupLayout panelNuevaVariacionLayout = new javax.swing.GroupLayout(panelNuevaVariacion);
    panelNuevaVariacion.setLayout(panelNuevaVariacionLayout);
    panelNuevaVariacionLayout.setHorizontalGroup(
      panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
            .addComponent(lblDuracion)
            .addGap(18, 18, 18)
            .addComponent(spinDuracion, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
          .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
            .addComponent(lblFecha)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
            .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(18, 18, 18)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(32, 32, 32)
        .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(btnNuevaVariacion)
          .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
            .addComponent(lblConvenio)
            .addGap(40, 40, 40)
            .addComponent(lblConvenioValor)))
        .addContainerGap())
    );
    panelNuevaVariacionLayout.setVerticalGroup(
      panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaVariacionLayout.createSequentialGroup()
            .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblConvenio)
              .addComponent(lblConvenioValor))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
            .addComponent(btnNuevaVariacion))
          .addGroup(panelNuevaVariacionLayout.createSequentialGroup()
            .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblFecha)
              .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(37, 37, 37)
            .addGroup(panelNuevaVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblDuracion)
              .addComponent(spinDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(3, 3, 3))
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE))
        .addContainerGap())
    );

    btnSalir.setFont(new java.awt.Font("Calibri", 3, 13));
    btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
    btnSalir.setText("Salir");
    btnSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnSalirActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelVariacionLayout = new javax.swing.GroupLayout(panelVariacion);
    panelVariacion.setLayout(panelVariacionLayout);
    panelVariacionLayout.setHorizontalGroup(
      panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelVariacionLayout.createSequentialGroup()
        .addGroup(panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelVariacionLayout.createSequentialGroup()
            .addGap(21, 21, 21)
            .addGroup(panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
              .addComponent(panelVariacionAnteriores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(panelVariacionLayout.createSequentialGroup()
                  .addComponent(lblTitulo)
                  .addGap(18, 18, 18)
                  .addComponent(lblIcono))
                .addComponent(panelNuevaVariacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVariacionLayout.createSequentialGroup()
            .addContainerGap(696, Short.MAX_VALUE)
            .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    panelVariacionLayout.setVerticalGroup(
      panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelVariacionLayout.createSequentialGroup()
        .addGroup(panelVariacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelVariacionLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblIcono))
          .addGroup(panelVariacionLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(lblTitulo)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelNuevaVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(panelVariacionAnteriores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(btnSalir)
        .addContainerGap())
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
      .addComponent(panelVariacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelVariacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
// TODO add your handling code here:
  this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void btnNuevaVariacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaVariacionActionPerformed
// TODO add your handling code here:
  Date fechaVariacion = null;
  int duracionVariacion = 0;
  int seleccionado = listDescripcion.getSelectedIndex();
  if (seleccionado != -1) {
    String descripcionVariacion = listDescripcion.getSelectedValue().toString();
    try {
      if (descripcionVariacion.equals("Reinicio")) {
        if (!convenio.getEstado_convenio().equals("LIQUIDADO") || !convenio.getEstado_convenio().equals("EJECUCION")) {
          fechaVariacion = formatoFecha.parse(comboFecha.getText());
          duracionVariacion = Integer.parseInt(spinDuracion.getValue().toString());
          Variaciones_tiempo variacion = new Variaciones_tiempo(0, fechaVariacion, descripcionVariacion, duracionVariacion, convenio.getNumero_convenio());
          Actas acta = new Actas(0, fechaVariacion, "Acta de " + descripcionVariacion, convenio.getNumero_convenio());
          boolean controlAdicion = false;
          controlAdicion = controlVariacion.AdicionarVariaciones_tiempo(variacion);
          if (controlAdicion) {
            JOptionPane.showMessageDialog(rootPane, "Registro de Variación Exitoso", "Variación Registrada", 1);
            controlConvenio.AdicionActa(acta);
            limpiarFormulario();
          } else {
            JOptionPane.showMessageDialog(rootPane, "No se pudo registrar la variación", "Error registro de variación", 2);
          }
        } else {
          JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una opcion valida para el estado del convenio", "Seleccione opcion", 0);
        }
      } else {
        fechaVariacion = formatoFecha.parse(comboFecha.getText());
        duracionVariacion = Integer.parseInt(spinDuracion.getValue().toString());
        Variaciones_tiempo variacion = new Variaciones_tiempo(0, fechaVariacion, descripcionVariacion, duracionVariacion, convenio.getNumero_convenio());
        Actas acta = new Actas(0, fechaVariacion, "Acta de " + descripcionVariacion, convenio.getNumero_convenio());
        boolean controlAdicion = false;
        controlAdicion = controlVariacion.AdicionarVariaciones_tiempo(variacion);
        if (controlAdicion) {
          JOptionPane.showMessageDialog(rootPane, "Registro de Variación Exitoso", "Variación Registrada", 1);
          controlConvenio.AdicionActa(acta);
          limpiarFormulario();
        } else {
          JOptionPane.showMessageDialog(rootPane, "No se pudo registrar la variación", "Error registro de variación", 2);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  } else {
    JOptionPane.showMessageDialog(rootPane, "Debe seleccionar una descripción para la variación", "Seleccione variación", 0);
  }
}//GEN-LAST:event_btnNuevaVariacionActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JButton btnNuevaVariacion;
  private javax.swing.JButton btnSalir;
  private datechooser.beans.DateChooserCombo comboFecha;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblConvenio;
  private javax.swing.JLabel lblConvenioValor;
  private javax.swing.JLabel lblDuracion;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblIcono;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JList listDescripcion;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JPanel panelNuevaVariacion;
  private javax.swing.JPanel panelVariacion;
  private javax.swing.JPanel panelVariacionAnteriores;
  private javax.swing.JScrollPane scrollVariaciones;
  private javax.swing.JSpinner spinDuracion;
  private javax.swing.JTable tablaVariaciones;
  // End of variables declaration//GEN-END:variables

  private void cargarVariaciones() {
    try {
      lblConvenioValor.setText(String.valueOf(convenio.getNumero_convenio()));
      spinDuracion.setValue(1);
      ArrayList<Variaciones_tiempo> variaciones = controlVariacion.ConsultaVariaciones_tiempoPorConvenio(convenio);
      if (!variaciones.isEmpty()) {
        int fila = 0;
        for (int i = 0; i < variaciones.size(); i++) {
          if (tablaVariaciones.getRowCount() == fila) {
            DefaultTableModel tablaTemp = (DefaultTableModel) tablaVariaciones.getModel();
            Object nuevo[] = {null, null, null};
            tablaTemp.addRow(nuevo);
          }
          tablaVariaciones.setValueAt(variaciones.get(i).getFecha_variacion(), i, 0);
          tablaVariaciones.setValueAt(variaciones.get(i).getDescripcion_variacion(), i, 1);
          tablaVariaciones.setValueAt(variaciones.get(i).getDuracion_variacion_dias(), i, 2);
          fila++;
        }
        if (tablaVariaciones.getRowCount() > fila) {
          DefaultTableModel tablaTemp = (DefaultTableModel) tablaVariaciones.getModel();
          tablaTemp.removeRow(fila);
        }
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }

  @Override
  public void CambioVista() throws RemoteException {
    cargarVariaciones();
  }

  private void limpiarFormulario() {
    spinDuracion.setValue(1);
  }
}