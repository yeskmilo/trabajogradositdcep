/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUIEditarEntidad.java
 *
 * Created on 16/08/2012, 06:26:13 PM
 */
package Vista;

import Controlador.ControlEntidad;
import Estructural.Entidad_convenio;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kmilo
 */
public class GUIEditarEntidad extends javax.swing.JFrame {

  private IServicioConvenios servicioConvenios;
  private ControlEntidad controlEntidad;
  private Entidad_convenio entidad;

  /** Creates new form GUIEditarEntidad */
  public GUIEditarEntidad(IServicioConvenios servicioConvenios, Entidad_convenio entidad) throws RemoteException {
    initComponents();
    this.servicioConvenios = servicioConvenios;
    controlEntidad = new ControlEntidad(servicioConvenios);
    this.entidad = entidad;
    cargarDatos();
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    panelEditarEntidad = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    panelDatosEntidad = new javax.swing.JPanel();
    lblNit = new javax.swing.JLabel();
    lblDescripcion = new javax.swing.JLabel();
    lblNombre = new javax.swing.JLabel();
    txtNit = new javax.swing.JTextField();
    txtNombre = new javax.swing.JTextField();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtDescripcion = new javax.swing.JTextPane();
    btnBuscarEntidad = new javax.swing.JButton();
    btnActualizar = new javax.swing.JButton();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Editar Entidad");

    panelEditarEntidad.setBackground(new java.awt.Color(255, 255, 255));

    lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24)); // NOI18N
    lblTitulo.setText("Editar Entidad");

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarGrande.png"))); // NOI18N

    panelDatosEntidad.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosEntidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la Entidad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblNit.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    lblNit.setText("NIT");

    lblDescripcion.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    lblDescripcion.setText("Descripcion");

    lblNombre.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    lblNombre.setText("Nombre o Razon Social");

    txtNit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    txtNombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    txtDescripcion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
    jScrollPane1.setViewportView(txtDescripcion);

    javax.swing.GroupLayout panelDatosEntidadLayout = new javax.swing.GroupLayout(panelDatosEntidad);
    panelDatosEntidad.setLayout(panelDatosEntidadLayout);
    panelDatosEntidadLayout.setHorizontalGroup(
      panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosEntidadLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblNombre)
          .addComponent(lblDescripcion)
          .addComponent(lblNit))
        .addGap(72, 72, 72)
        .addGroup(panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
          .addComponent(txtNit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
          .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE))
        .addContainerGap())
    );
    panelDatosEntidadLayout.setVerticalGroup(
      panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosEntidadLayout.createSequentialGroup()
        .addGroup(panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDatosEntidadLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblNit))
          .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(lblNombre)
          .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(panelDatosEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(lblDescripcion)
          .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(86, 86, 86))
    );

    btnBuscarEntidad.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnBuscarEntidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConvenio.png"))); // NOI18N
    btnBuscarEntidad.setText("Buscar Entidad");
    btnBuscarEntidad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarEntidadActionPerformed(evt);
      }
    });

    btnActualizar.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
    btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
    btnActualizar.setText("Actualizar Entidad");
    btnActualizar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnActualizarActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout panelEditarEntidadLayout = new javax.swing.GroupLayout(panelEditarEntidad);
    panelEditarEntidad.setLayout(panelEditarEntidadLayout);
    panelEditarEntidadLayout.setHorizontalGroup(
      panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelEditarEntidadLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelEditarEntidadLayout.createSequentialGroup()
            .addComponent(panelDatosEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(btnBuscarEntidad, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE))
            .addContainerGap())
          .addGroup(panelEditarEntidadLayout.createSequentialGroup()
            .addComponent(lblTitulo)
            .addGap(37, 37, 37)
            .addComponent(jLabel1)
            .addContainerGap(507, Short.MAX_VALUE))))
    );
    panelEditarEntidadLayout.setVerticalGroup(
      panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelEditarEntidadLayout.createSequentialGroup()
        .addGroup(panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelEditarEntidadLayout.createSequentialGroup()
            .addGroup(panelEditarEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addGroup(panelEditarEntidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1))
              .addGroup(panelEditarEntidadLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblTitulo)))
            .addGap(18, 18, 18)
            .addComponent(panelDatosEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(panelEditarEntidadLayout.createSequentialGroup()
            .addGap(121, 121, 121)
            .addComponent(btnBuscarEntidad)
            .addGap(18, 18, 18)
            .addComponent(btnActualizar)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuArchivo.png"))); // NOI18N
    menuArchivo.setText("Archivo");
    menuArchivo.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    barraMenu.add(menuArchivo);

    menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuAyuda.png"))); // NOI18N
    menuAyuda.setText("Ayuda");
    menuAyuda.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    barraMenu.add(menuAyuda);

    setJMenuBar(barraMenu);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelEditarEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelEditarEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void btnBuscarEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEntidadActionPerformed
// TODO add your handling code here:
  String Nit = "";
  boolean controlDatos = true;
  if (txtNit.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Digitar un NIT para buscar la entidad", "Digite el NIT", 0);
    controlDatos = false;
  } else {
    Nit = txtNit.getText().trim();
  }
  if (controlDatos) {
    try {
      Entidad_convenio entidad_convenio = controlEntidad.ConsultaEntidad(Nit);
      if (entidad_convenio == null) {
        JOptionPane.showMessageDialog(rootPane, "No se encontraron Entidades con el NIT ingresado", "No hay resultados", 1);
      } else {
        entidad = entidad_convenio;
        llenarFormulario();
      }
    } catch (Exception e) {
    }
  }
}//GEN-LAST:event_btnBuscarEntidadActionPerformed

private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
// TODO add your handling code here:
  if (entidad != null) {
    String nombre = "";
    String descripcion = "";
    boolean controlDatos = true;
    if (txtNombre.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar un Nombre para la entidad", "Digite el Nombre", 0);
      controlDatos = false;
    } else {
      nombre = txtNombre.getText().trim();
    }
    if (txtDescripcion.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar una descripción para la entidad", "Digite una descripción", 0);
      controlDatos = false;
    } else {
      descripcion = txtDescripcion.getText().trim();
    }
    if (controlDatos) {
      Entidad_convenio entidad_actualizada = new Entidad_convenio(entidad.getId_entidad(), entidad.getNIT_entidad(), nombre, descripcion);
      try {
        boolean controlActualizacion = false;
        controlActualizacion = controlEntidad.ActualizarEntidad_convenio(entidad_actualizada);
        if (controlActualizacion) {
          JOptionPane.showMessageDialog(rootPane, "Actualizada la Entidad con NIT: " + entidad.getNIT_entidad(), "Actualización exitosas", 1);
          this.dispose();
        } else {
          JOptionPane.showMessageDialog(rootPane, "No se pudo realizar la Actualización de la Entidad", "Error en la actualización", 0);
        }
      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  } else {
    JOptionPane.showMessageDialog(rootPane, "Debe buscar una entidad para Ediatr", "Busque una Entidad", 1);
  }
}//GEN-LAST:event_btnActualizarActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JButton btnActualizar;
  private javax.swing.JButton btnBuscarEntidad;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JLabel lblDescripcion;
  private javax.swing.JLabel lblNit;
  private javax.swing.JLabel lblNombre;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JPanel panelDatosEntidad;
  private javax.swing.JPanel panelEditarEntidad;
  private javax.swing.JTextPane txtDescripcion;
  private javax.swing.JTextField txtNit;
  private javax.swing.JTextField txtNombre;
  // End of variables declaration//GEN-END:variables

  private void cargarDatos() {
    if (entidad != null) {
      btnBuscarEntidad.setVisible(false);
      llenarFormulario();
    } else {
      btnActualizar.setEnabled(false);
    }
  }

  private void llenarFormulario() {
    btnActualizar.setEnabled(true);
    txtNit.setEditable(false);
    txtNit.setText(entidad.getNIT_entidad());
    txtNombre.setText(entidad.getNombre_entidad());
    txtDescripcion.setText(entidad.getDescripcion_entidad());
  }
}
