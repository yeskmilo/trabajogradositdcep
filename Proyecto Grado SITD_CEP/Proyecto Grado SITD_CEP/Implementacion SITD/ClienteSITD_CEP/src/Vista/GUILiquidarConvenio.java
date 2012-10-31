/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUILiquidarConvenio.java
 *
 * Created on 17/08/2012, 12:20:40 AM
 */
package Vista;

import Controlador.ControlConvenio;
import Estructural.Convenio;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import javax.swing.JOptionPane;

/**
 *
 * @author Kmilo
 */
public class GUILiquidarConvenio extends javax.swing.JFrame {

  private IServicioConvenios servicioConvenios;
  private Convenio convenio;
  private ControlConvenio controlConvenio;

  /** Creates new form GUILiquidarConvenio */
  public GUILiquidarConvenio(IServicioConvenios servicioConvenios, Convenio convenio) throws RemoteException {
    initComponents();
    this.servicioConvenios = servicioConvenios;
    this.convenio = convenio;
    controlConvenio = new ControlConvenio(servicioConvenios);
    this.setLocationRelativeTo(null);
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

    panelLiquidacion = new javax.swing.JPanel();
    lblTitulo = new javax.swing.JLabel();
    lblIcono = new javax.swing.JLabel();
    panelDatosConvenio = new javax.swing.JPanel();
    lblNumero = new javax.swing.JLabel();
    txtNumero = new javax.swing.JTextField();
    lblFecha = new javax.swing.JLabel();
    btnBuscar = new javax.swing.JButton();
    lblFechaValor = new javax.swing.JLabel();
    lblDuracion = new javax.swing.JLabel();
    lblDuracionValor = new javax.swing.JLabel();
    panelObjeto = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    txtObjeto = new javax.swing.JTextArea();
    txtEstado = new javax.swing.JLabel();
    lblEstadoValor = new javax.swing.JLabel();
    panelSaldosSociales = new javax.swing.JPanel();
    jScrollPane2 = new javax.swing.JScrollPane();
    txtSociales = new javax.swing.JTextArea();
    panelSaldosPedagogicos = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    txtPedagogicos = new javax.swing.JTextArea();
    panelResumenConvenio = new javax.swing.JPanel();
    jScrollPane4 = new javax.swing.JScrollPane();
    txtResumen = new javax.swing.JTextArea();
    btnLiquidar = new javax.swing.JButton();
    btnCancelar = new javax.swing.JButton();
    barraMenu = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Liquidación de Convenio");

    panelLiquidacion.setBackground(new java.awt.Color(255, 255, 255));

    lblTitulo.setFont(new java.awt.Font("Calibri", 3, 24));
    lblTitulo.setText("Liquidación de Convenios");

    lblIcono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/liquidarGrande.png"))); // NOI18N

    panelDatosConvenio.setBackground(new java.awt.Color(255, 255, 255));
    panelDatosConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Basicos del Convenio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    lblNumero.setFont(new java.awt.Font("Calibri", 2, 13));
    lblNumero.setText("Numero Convenio");

    txtNumero.setFont(new java.awt.Font("Calibri", 2, 13));
    txtNumero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

    lblFecha.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFecha.setText("Fecha Suscripción");

    btnBuscar.setFont(new java.awt.Font("Calibri", 3, 13));
    btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConvenio.png"))); // NOI18N
    btnBuscar.setText("Buscar");
    btnBuscar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnBuscarActionPerformed(evt);
      }
    });

    lblFechaValor.setFont(new java.awt.Font("Calibri", 2, 13));
    lblFechaValor.setText("fecha");

    lblDuracion.setFont(new java.awt.Font("Calibri", 2, 13));
    lblDuracion.setText("Duracion Convenio (Días)");

    lblDuracionValor.setFont(new java.awt.Font("Calibri", 2, 13));
    lblDuracionValor.setText("Duracion");

    panelObjeto.setBackground(new java.awt.Color(255, 255, 255));
    panelObjeto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    txtObjeto.setColumns(20);
    txtObjeto.setFont(new java.awt.Font("Calibri", 2, 13));
    txtObjeto.setRows(5);
    jScrollPane1.setViewportView(txtObjeto);

    javax.swing.GroupLayout panelObjetoLayout = new javax.swing.GroupLayout(panelObjeto);
    panelObjeto.setLayout(panelObjetoLayout);
    panelObjetoLayout.setHorizontalGroup(
      panelObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelObjetoLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelObjetoLayout.setVerticalGroup(
      panelObjetoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelObjetoLayout.createSequentialGroup()
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    txtEstado.setFont(new java.awt.Font("Calibri", 2, 13));
    txtEstado.setText("Estado Convenio");

    lblEstadoValor.setFont(new java.awt.Font("Calibri", 2, 13));
    lblEstadoValor.setText("estado");

    javax.swing.GroupLayout panelDatosConvenioLayout = new javax.swing.GroupLayout(panelDatosConvenio);
    panelDatosConvenio.setLayout(panelDatosConvenioLayout);
    panelDatosConvenioLayout.setHorizontalGroup(
      panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosConvenioLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosConvenioLayout.createSequentialGroup()
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblNumero)
              .addComponent(lblFecha))
            .addGap(53, 53, 53)
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(lblFechaValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(14, 14, 14)
            .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
          .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelDatosConvenioLayout.createSequentialGroup()
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblDuracion)
              .addComponent(txtEstado))
            .addGap(13, 13, 13)
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblEstadoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(lblDuracionValor, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE))))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    panelDatosConvenioLayout.setVerticalGroup(
      panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelDatosConvenioLayout.createSequentialGroup()
        .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelDatosConvenioLayout.createSequentialGroup()
            .addContainerGap()
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(lblNumero)
              .addGroup(panelDatosConvenioLayout.createSequentialGroup()
                .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(lblFechaValor)
                  .addComponent(lblFecha))))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(lblDuracion)
              .addComponent(lblDuracionValor))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(panelDatosConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(txtEstado)
              .addComponent(lblEstadoValor)))
          .addComponent(panelObjeto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelSaldosSociales.setBackground(new java.awt.Color(255, 255, 255));
    panelSaldosSociales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saldos Sociales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    txtSociales.setColumns(20);
    txtSociales.setRows(5);
    jScrollPane2.setViewportView(txtSociales);

    javax.swing.GroupLayout panelSaldosSocialesLayout = new javax.swing.GroupLayout(panelSaldosSociales);
    panelSaldosSociales.setLayout(panelSaldosSocialesLayout);
    panelSaldosSocialesLayout.setHorizontalGroup(
      panelSaldosSocialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelSaldosSocialesLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelSaldosSocialesLayout.setVerticalGroup(
      panelSaldosSocialesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelSaldosSocialesLayout.createSequentialGroup()
        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelSaldosPedagogicos.setBackground(new java.awt.Color(255, 255, 255));
    panelSaldosPedagogicos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saldos Pedagogicos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    txtPedagogicos.setColumns(20);
    txtPedagogicos.setRows(5);
    jScrollPane3.setViewportView(txtPedagogicos);

    javax.swing.GroupLayout panelSaldosPedagogicosLayout = new javax.swing.GroupLayout(panelSaldosPedagogicos);
    panelSaldosPedagogicos.setLayout(panelSaldosPedagogicosLayout);
    panelSaldosPedagogicosLayout.setHorizontalGroup(
      panelSaldosPedagogicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelSaldosPedagogicosLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelSaldosPedagogicosLayout.setVerticalGroup(
      panelSaldosPedagogicosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelSaldosPedagogicosLayout.createSequentialGroup()
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    panelResumenConvenio.setBackground(new java.awt.Color(255, 255, 255));
    panelResumenConvenio.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resumen del Convenio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

    txtResumen.setColumns(20);
    txtResumen.setRows(5);
    jScrollPane4.setViewportView(txtResumen);

    javax.swing.GroupLayout panelResumenConvenioLayout = new javax.swing.GroupLayout(panelResumenConvenio);
    panelResumenConvenio.setLayout(panelResumenConvenioLayout);
    panelResumenConvenioLayout.setHorizontalGroup(
      panelResumenConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelResumenConvenioLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        .addContainerGap())
    );
    panelResumenConvenioLayout.setVerticalGroup(
      panelResumenConvenioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelResumenConvenioLayout.createSequentialGroup()
        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    btnLiquidar.setFont(new java.awt.Font("Calibri", 3, 13));
    btnLiquidar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/liquidarConvenio.png"))); // NOI18N
    btnLiquidar.setText("Liquidar");
    btnLiquidar.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        btnLiquidarActionPerformed(evt);
      }
    });

    btnCancelar.setFont(new java.awt.Font("Calibri", 3, 13));
    btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
    btnCancelar.setText("Cancelar");

    javax.swing.GroupLayout panelLiquidacionLayout = new javax.swing.GroupLayout(panelLiquidacion);
    panelLiquidacion.setLayout(panelLiquidacionLayout);
    panelLiquidacionLayout.setHorizontalGroup(
      panelLiquidacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelLiquidacionLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(panelLiquidacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(panelDatosConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(panelLiquidacionLayout.createSequentialGroup()
            .addComponent(lblTitulo)
            .addGap(18, 18, 18)
            .addComponent(lblIcono))
          .addComponent(panelSaldosSociales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(panelSaldosPedagogicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(panelResumenConvenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLiquidacionLayout.createSequentialGroup()
            .addComponent(btnCancelar)
            .addGap(51, 51, 51)
            .addComponent(btnLiquidar)))
        .addContainerGap())
    );
    panelLiquidacionLayout.setVerticalGroup(
      panelLiquidacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(panelLiquidacionLayout.createSequentialGroup()
        .addGroup(panelLiquidacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(panelLiquidacionLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(lblIcono))
          .addGroup(panelLiquidacionLayout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addComponent(lblTitulo)))
        .addGap(18, 18, 18)
        .addComponent(panelDatosConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelSaldosSociales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelSaldosPedagogicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addComponent(panelResumenConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(panelLiquidacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(btnLiquidar)
          .addComponent(btnCancelar))
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
      .addComponent(panelLiquidacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(panelLiquidacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
// TODO add your handling code here:
  if (txtNumero.getText().trim().equals("")) {
    JOptionPane.showMessageDialog(rootPane, "Debe Digitar un número de Convenio", "Error número Convenio", 0);
  } else {
    int numeroConvenio = Integer.parseInt(txtNumero.getText().trim());
    try {
      Convenio convenio_consulta = controlConvenio.ConsultaConvenioNumero(numeroConvenio);
      if (convenio_consulta != null) {
        convenio = convenio_consulta;
        cargarDatos();
      } else {
        JOptionPane.showMessageDialog(rootPane, "No se encontraron convenios con el numero ingresado", "No hay resultados", 0);
      }
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
  }
}//GEN-LAST:event_btnBuscarActionPerformed

private void btnLiquidarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLiquidarActionPerformed
// TODO add your handling code here:
  if (convenio != null) {
    String saldosSociales = "";
    String saldosPedagogicos = "";
    String resumen = "";
    boolean controlDatos = true;
    if (txtSociales.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar los saldos sociales para liquidar el convenio", "Digite Saldos Sociales", 0);
      controlDatos = false;
    } else {
      saldosSociales = txtSociales.getText().trim();
    }
    if (txtPedagogicos.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar los saldos pedagogicos para liquidar el convenio", "Digite Saldos pedagogicos", 0);
      controlDatos = false;
    } else {
      saldosPedagogicos = txtPedagogicos.getText().trim();
    }
    if (txtResumen.getText().trim().equals("")) {
      JOptionPane.showMessageDialog(rootPane, "Debe Digitar un resumen para liquidar el convenio", "Digite resumen del convenio", 0);
      controlDatos = false;
    } else {
      resumen = txtResumen.getText().trim();
    }
    if (controlDatos) {
      try {
        boolean controlActualizacion = false;
        Convenio convenio_actualizado = new Convenio(convenio.getId_convenio(), convenio.getNumero_convenio(),
                convenio.getFecha_inicio_convenio(), convenio.getDuracion_convenio_dias(), saldosSociales,
                saldosPedagogicos, resumen, convenio.getObjeto_convenio(), "LIQUIDADO");
        controlActualizacion = controlConvenio.ActualizarConvenio(convenio_actualizado);
        if (controlActualizacion) {
          JOptionPane.showMessageDialog(rootPane, "Convenio Liquidado con exito", "Convenio Liquidado", 1);
          this.dispose();
        } else {
          JOptionPane.showMessageDialog(rootPane, "No se pudo liquidar el convenio", "Error en liquidacion", 0);
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
  } else {
    JOptionPane.showMessageDialog(rootPane, "Debe buscar un convenio primero", "Busque Convenio", 0);
  }
}//GEN-LAST:event_btnLiquidarActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuBar barraMenu;
  private javax.swing.JButton btnBuscar;
  private javax.swing.JButton btnCancelar;
  private javax.swing.JButton btnLiquidar;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JScrollPane jScrollPane4;
  private javax.swing.JLabel lblDuracion;
  private javax.swing.JLabel lblDuracionValor;
  private javax.swing.JLabel lblEstadoValor;
  private javax.swing.JLabel lblFecha;
  private javax.swing.JLabel lblFechaValor;
  private javax.swing.JLabel lblIcono;
  private javax.swing.JLabel lblNumero;
  private javax.swing.JLabel lblTitulo;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JPanel panelDatosConvenio;
  private javax.swing.JPanel panelLiquidacion;
  private javax.swing.JPanel panelObjeto;
  private javax.swing.JPanel panelResumenConvenio;
  private javax.swing.JPanel panelSaldosPedagogicos;
  private javax.swing.JPanel panelSaldosSociales;
  private javax.swing.JLabel txtEstado;
  private javax.swing.JTextField txtNumero;
  private javax.swing.JTextArea txtObjeto;
  private javax.swing.JTextArea txtPedagogicos;
  private javax.swing.JTextArea txtResumen;
  private javax.swing.JTextArea txtSociales;
  // End of variables declaration//GEN-END:variables

  private void cargarDatos() {
    if (convenio != null) {
      btnBuscar.setEnabled(false);
      if (convenio.getEstado_convenio().equals("LIQUIDADO")) {
        btnLiquidar.setEnabled(false);
        llenarFormulario();
      } else {
        llenarFormulario();
      }
    } else {
      lblFechaValor.setVisible(false);
      lblDuracionValor.setVisible(false);
      lblEstadoValor.setVisible(false);
    }
  }

  private void llenarFormulario() {
    lblFechaValor.setVisible(true);
    lblDuracionValor.setVisible(true);
    lblEstadoValor.setVisible(true);
    txtNumero.setText(String.valueOf(convenio.getNumero_convenio()));
    txtNumero.setEditable(false);
    lblFechaValor.setText(String.valueOf(convenio.getFecha_inicio_convenio()));
    lblDuracionValor.setText(String.valueOf(convenio.getDuracion_convenio_dias()));
    txtObjeto.setText(convenio.getObjeto_convenio());
    txtSociales.setText(convenio.getSaldos_sociales());
    txtPedagogicos.setText(convenio.getSaldos_pedagogicos());
    txtResumen.setText(convenio.getResumen_convenio());
    lblEstadoValor.setText(convenio.getEstado_convenio());
  }
}