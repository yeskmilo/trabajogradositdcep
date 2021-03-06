/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */

/*
 * GUIAdicionRubro.java
 *
 * Created on 22/07/2012, 08:21:37 PM
 */
package Vista;

import Controlador.ControlEntidad;
import Controlador.ControlPresupuesto;
import Controlador.ControlRubros;
import Estructural.Aporte_rubro_entidad;
import Estructural.Entidad_convenio;
import Estructural.Presupuesto;
import Estructural.Rubro_presupuestal;
import Modelo.IServicioConvenios;
import java.rmi.RemoteException;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kmilo
 */
public class GUIAdicionRubro extends javax.swing.JFrame {

    private IServicioConvenios servicioConvenios;
    private int numeroConvenio;
    private ControlRubros controlRubros;
    private ControlEntidad controlEntidad;
    private ControlPresupuesto controlPresupuesto;
    private ArrayList<ArrayList> rubroCategoria;

    /** Creates new form GUIAdicionRubro */
    public GUIAdicionRubro(IServicioConvenios servicioConvenios, int numeroConvenio) throws RemoteException {
        initComponents();
        this.servicioConvenios = servicioConvenios;
        controlRubros = new ControlRubros(servicioConvenios);
        controlEntidad = new ControlEntidad(servicioConvenios);
        controlPresupuesto = new ControlPresupuesto(servicioConvenios);
        this.numeroConvenio = numeroConvenio;
        cargarDatosIniciales();
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

        panelDatosRubros = new javax.swing.JPanel();
        panelSeleccionRubro = new javax.swing.JPanel();
        lblCategoria = new javax.swing.JLabel();
        lblRubroCatego = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaRubrosCate = new javax.swing.JList();
        lblConvenio = new javax.swing.JLabel();
        lblNumeroConvenio = new javax.swing.JLabel();
        btnAgregarRubroConvenioPer = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaCategoriasPrede = new javax.swing.JList();
        panelDatosRubro = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        lblValorUnitario = new javax.swing.JLabel();
        lblTotalRubro = new javax.swing.JLabel();
        lblTotalRubroValor = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        spinCantidad = new javax.swing.JSpinner();
        txtValor = new javax.swing.JTextField();
        panelAportesEntidad = new javax.swing.JPanel();
        scrollEntidades = new javax.swing.JScrollPane();
        tablaEntidades = new javax.swing.JTable();
        btnAgregarRubroConvenio = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblTituloRubro = new javax.swing.JLabel();
        lblImagenAddRubro = new javax.swing.JLabel();
        menuAdicionRubro = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicion de Rubros");

        panelDatosRubros.setBackground(new java.awt.Color(255, 255, 255));

        panelSeleccionRubro.setBackground(new java.awt.Color(255, 255, 255));
        panelSeleccionRubro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Rubros predeterminados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

        lblCategoria.setFont(new java.awt.Font("Calibri", 2, 13));
        lblCategoria.setText("Categoria");

        lblRubroCatego.setFont(new java.awt.Font("Calibri", 2, 13));
        lblRubroCatego.setText("Rubro por Categoria");

        listaRubrosCate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Seleccione un Rubro de la Categoria", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N
        listaRubrosCate.setFont(new java.awt.Font("Calibri", 2, 13));
        listaRubrosCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaRubrosCateMouseClicked(evt);
            }
        });
        listaRubrosCate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                listaRubrosCateKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(listaRubrosCate);

        lblConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
        lblConvenio.setText("Convenio");

        lblNumeroConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
        lblNumeroConvenio.setText("Numero del convenio");

        btnAgregarRubroConvenioPer.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
        btnAgregarRubroConvenioPer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addRubroSmall.png"))); // NOI18N
        btnAgregarRubroConvenioPer.setText("Agregar Rubro Personalizado");
        btnAgregarRubroConvenioPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRubroConvenioPerActionPerformed(evt);
            }
        });

        listaCategoriasPrede.setFont(new java.awt.Font("Calibri", 2, 13));
        listaCategoriasPrede.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Personal", "Materiales y equipos", "Gastos de viaje y manutención", "Otros" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        listaCategoriasPrede.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCategoriasPredeMouseClicked(evt);
            }
        });
        listaCategoriasPrede.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                listaCategoriasPredeFocusGained(evt);
            }
        });
        listaCategoriasPrede.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaCategoriasPredeKeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(listaCategoriasPrede);

        javax.swing.GroupLayout panelSeleccionRubroLayout = new javax.swing.GroupLayout(panelSeleccionRubro);
        panelSeleccionRubro.setLayout(panelSeleccionRubroLayout);
        panelSeleccionRubroLayout.setHorizontalGroup(
            panelSeleccionRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSeleccionRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                        .addComponent(lblCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(lblRubroCatego))
                    .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                        .addComponent(lblConvenio)
                        .addGap(18, 18, 18)
                        .addComponent(lblNumeroConvenio))
                    .addComponent(btnAgregarRubroConvenioPer))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelSeleccionRubroLayout.setVerticalGroup(
            panelSeleccionRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                .addGroup(panelSeleccionRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblRubroCatego)
                    .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnAgregarRubroConvenioPer)))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                .addComponent(lblCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(panelSeleccionRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConvenio)
                    .addComponent(lblNumeroConvenio))
                .addGap(51, 51, 51))
            .addGroup(panelSeleccionRubroLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelDatosRubro.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosRubro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Rubro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

        lblDescripcion.setFont(new java.awt.Font("Calibri", 2, 13));
        lblDescripcion.setText("Descripción");

        lblCantidad.setFont(new java.awt.Font("Calibri", 2, 13));
        lblCantidad.setText("Cantidad");

        lblValorUnitario.setFont(new java.awt.Font("Calibri", 2, 13));
        lblValorUnitario.setText("Valor Unitario");

        lblTotalRubro.setFont(new java.awt.Font("Calibri", 2, 13));
        lblTotalRubro.setText("Total Rubro");

        lblTotalRubroValor.setFont(new java.awt.Font("Calibri", 3, 14)); // NOI18N
        lblTotalRubroValor.setText("$0");

        txtDescripcion.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtDescripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        spinCantidad.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        spinCantidad.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(1), Integer.valueOf(1), null, Integer.valueOf(1)));
        spinCantidad.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        spinCantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spinCantidadMouseClicked(evt);
            }
        });
        spinCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spinCantidadKeyPressed(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
        txtValor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtValorKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        panelAportesEntidad.setBackground(new java.awt.Color(255, 255, 255));
        panelAportesEntidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aportes de las entidades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 2, 13))); // NOI18N

        scrollEntidades.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        scrollEntidades.setFont(new java.awt.Font("Calibri", 2, 13));

        tablaEntidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Entidad", "NIT Entidad", "Monto del Aporte por Entidad"
            }
        ));
        tablaEntidades.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tablaEntidadesKeyPressed(evt);
            }
        });
        scrollEntidades.setViewportView(tablaEntidades);

        javax.swing.GroupLayout panelAportesEntidadLayout = new javax.swing.GroupLayout(panelAportesEntidad);
        panelAportesEntidad.setLayout(panelAportesEntidadLayout);
        panelAportesEntidadLayout.setHorizontalGroup(
            panelAportesEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAportesEntidadLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollEntidades, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelAportesEntidadLayout.setVerticalGroup(
            panelAportesEntidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEntidades, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );

        btnAgregarRubroConvenio.setFont(new java.awt.Font("Calibri", 3, 13)); // NOI18N
        btnAgregarRubroConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addRubroSmall.png"))); // NOI18N
        btnAgregarRubroConvenio.setText("Agregar al Convenio");
        btnAgregarRubroConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarRubroConvenioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDatosRubroLayout = new javax.swing.GroupLayout(panelDatosRubro);
        panelDatosRubro.setLayout(panelDatosRubroLayout);
        panelDatosRubroLayout.setHorizontalGroup(
            panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosRubroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosRubroLayout.createSequentialGroup()
                        .addComponent(panelAportesEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosRubroLayout.createSequentialGroup()
                                .addComponent(lblTotalRubro)
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalRubroValor, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE))
                            .addComponent(btnAgregarRubroConvenio)))
                    .addGroup(panelDatosRubroLayout.createSequentialGroup()
                        .addComponent(lblDescripcion)
                        .addGap(28, 28, 28)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(lblCantidad)
                        .addGap(34, 34, 34)
                        .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lblValorUnitario)
                        .addGap(26, 26, 26)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelDatosRubroLayout.setVerticalGroup(
            panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosRubroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValorUnitario)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblDescripcion)
                        .addComponent(lblCantidad)
                        .addComponent(spinCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosRubroLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(panelAportesEntidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDatosRubroLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(panelDatosRubroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotalRubro)
                            .addComponent(lblTotalRubroValor))
                        .addGap(34, 34, 34)
                        .addComponent(btnAgregarRubroConvenio))))
        );

        btnSalir.setFont(new java.awt.Font("Calibri", 3, 13));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblTituloRubro.setFont(new java.awt.Font("Calibri", 3, 24));
        lblTituloRubro.setText("Adición de Rubros");

        lblImagenAddRubro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addRubroBig.png"))); // NOI18N

        javax.swing.GroupLayout panelDatosRubrosLayout = new javax.swing.GroupLayout(panelDatosRubros);
        panelDatosRubros.setLayout(panelDatosRubrosLayout);
        panelDatosRubrosLayout.setHorizontalGroup(
            panelDatosRubrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosRubrosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosRubrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosRubrosLayout.createSequentialGroup()
                        .addComponent(lblTituloRubro)
                        .addGap(18, 18, 18)
                        .addComponent(lblImagenAddRubro)
                        .addGap(599, 599, 599))
                    .addGroup(panelDatosRubrosLayout.createSequentialGroup()
                        .addGroup(panelDatosRubrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelDatosRubro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelSeleccionRubro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        panelDatosRubrosLayout.setVerticalGroup(
            panelDatosRubrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosRubrosLayout.createSequentialGroup()
                .addGroup(panelDatosRubrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosRubrosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImagenAddRubro))
                    .addGroup(panelDatosRubrosLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblTituloRubro)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelSeleccionRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatosRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir)
                .addGap(36, 36, 36))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuArchivo.png"))); // NOI18N
        jMenu1.setText("Archivo");
        jMenu1.setFont(new java.awt.Font("Calibri", 2, 13));
        menuAdicionRubro.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuAyuda.png"))); // NOI18N
        jMenu2.setText("Ayuda");
        jMenu2.setFont(new java.awt.Font("Calibri", 2, 13));
        menuAdicionRubro.add(jMenu2);

        setJMenuBar(menuAdicionRubro);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosRubros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_btnSalirActionPerformed

private void listaCategoriasPredeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_listaCategoriasPredeFocusGained
// TODO add your handling code here:
}//GEN-LAST:event_listaCategoriasPredeFocusGained

private void listaCategoriasPredeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaCategoriasPredeKeyPressed
// TODO add your handling code here:
    int seleccionado = listaCategoriasPrede.getSelectedIndex();
    if (seleccionado != -1) {
        listaRubrosCate.removeAll();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < rubroCategoria.get(seleccionado).size(); i++) {
            String rubro = rubroCategoria.get(seleccionado).get(i).toString();
            listModel.addElement(rubro);
        }
        listaRubrosCate.setModel(listModel);
    }
}//GEN-LAST:event_listaCategoriasPredeKeyPressed

private void listaCategoriasPredeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCategoriasPredeMouseClicked
// TODO add your handling code here:
    int seleccionado = listaCategoriasPrede.getSelectedIndex();
    listaRubrosCate.removeAll();
    if (seleccionado != -1) {
        listaRubrosCate.removeAll();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < rubroCategoria.get(seleccionado).size(); i++) {
            String rubro = rubroCategoria.get(seleccionado).get(i).toString();
            listModel.addElement(rubro);
        }
        listaRubrosCate.setModel(listModel);
    }
}//GEN-LAST:event_listaCategoriasPredeMouseClicked

private void listaRubrosCateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaRubrosCateMouseClicked
// TODO add your handling code here:
    String seleccionado = listaRubrosCate.getSelectedValue().toString();
    if (!seleccionado.equals("")) {
        txtDescripcion.setText(seleccionado);
    }
}//GEN-LAST:event_listaRubrosCateMouseClicked

private void listaRubrosCateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaRubrosCateKeyTyped
// TODO add your handling code here:
    String seleccionado = listaRubrosCate.getSelectedValue().toString();
    if (!seleccionado.equals("")) {
        txtDescripcion.setText(seleccionado);
    }
}//GEN-LAST:event_listaRubrosCateKeyTyped

private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
// TODO add your handling code here:
    double valorUnitario = 0;
    int cantidad = 0;
    if (!txtValor.getText().equals("")) {
        try {
            valorUnitario = Double.parseDouble(txtValor.getText().trim());
            cantidad = Integer.parseInt(spinCantidad.getValue().toString());
            lblTotalRubroValor.setText(String.valueOf(valorUnitario * cantidad));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe Digitar valor unitario valido para el rubro", "Error valor unitario", 0);
        }
    }
}//GEN-LAST:event_txtValorKeyTyped

private void txtValorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyPressed
// TODO add your handling code here:
    double valorUnitario = 0;
    int cantidad = 0;
    if (!txtValor.getText().equals("")) {
        try {
            valorUnitario = Double.parseDouble(txtValor.getText().trim());
            cantidad = Integer.parseInt(spinCantidad.getValue().toString());
            lblTotalRubroValor.setText(String.valueOf(valorUnitario * cantidad));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe Digitar valor unitario valido para el rubro", "Error valor unitario", 0);
        }
    }
}//GEN-LAST:event_txtValorKeyPressed

private void spinCantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spinCantidadMouseClicked
// TODO add your handling code here:
    double valorUnitario = 0;
    int cantidad = 0;
    if (!txtValor.getText().equals("")) {
        try {
            valorUnitario = Double.parseDouble(txtValor.getText().trim());
            cantidad = Integer.parseInt(spinCantidad.getValue().toString());
            lblTotalRubroValor.setText(String.valueOf(valorUnitario * cantidad));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe Digitar valor unitario valido para el rubro", "Error valor unitario", 0);
        }
    }
}//GEN-LAST:event_spinCantidadMouseClicked

private void spinCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spinCantidadKeyPressed
// TODO add your handling code here:
    double valorUnitario = 0;
    int cantidad = 0;
    if (!txtValor.getText().equals("")) {
        try {
            valorUnitario = Double.parseDouble(txtValor.getText().trim());
            cantidad = Integer.parseInt(spinCantidad.getValue().toString());
            lblTotalRubroValor.setText(String.valueOf(valorUnitario * cantidad));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe Digitar valor unitario valido para el rubro", "Error valor unitario", 0);
        }
    }
}//GEN-LAST:event_spinCantidadKeyPressed

private void tablaEntidadesKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tablaEntidadesKeyPressed
// TODO add your handling code here:
    int numeroFilas = tablaEntidades.getRowCount();
    double total = 0;
    if (numeroFilas > 0) {
        for (int i = 0; i < numeroFilas; i++) {
            double valor_fila = 0;
            try {
                valor_fila = Double.parseDouble(tablaEntidades.getValueAt(i, 2).toString());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Para ingresar el monto presione doble click sobre la celda\ny digite el valor", "Ayuda del Sistema", 2);
            }
            if (valor_fila < 0) {
                JOptionPane.showMessageDialog(rootPane, "El monto del aporte de la Entidad debe ser mayor a cero (0)", "Valor invalido", 0);
                i = numeroFilas;
            } else {
                total = total + Double.parseDouble(tablaEntidades.getValueAt(i, 2).toString());
            }
        }
        double valorRubro = Double.parseDouble(lblTotalRubroValor.getText().trim());
        if (total > valorRubro) {
            JOptionPane.showMessageDialog(rootPane, "La suma de los aportes de las entidades no\npuede ser mayor al valor del rubro", "Aportes superiores", 0);
        }
    }
}//GEN-LAST:event_tablaEntidadesKeyPressed

private void btnAgregarRubroConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRubroConvenioActionPerformed
// TODO add your handling code here:
    boolean controlDatos = true;
    String descripcion = "";
    double valorUnita = 0;
    int cantidad;
    if (txtDescripcion.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(rootPane, "Debe seleccionar un rubro predeterminado\nO escoger la opcion de insertar uno personalizado", "Descripcion de rubro vacia", 0);
        controlDatos = false;
    } else {
        descripcion = txtDescripcion.getText().trim();
    }
    if (txtValor.getText().trim().equals("")) {
        JOptionPane.showMessageDialog(rootPane, "Debe ingresar el valor unitario para el rubro", "Valor unitario vacio", 0);
        controlDatos = false;
    } else {
        try {
            valorUnita = Double.parseDouble(txtValor.getText().trim());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Debe ingresar un valor numerico valido \nEjemplo: 1000", "Valor unitario incorrrecto", 0);
            controlDatos = false;
        }
    }
    double valorControl = 0;
    for (int i = 0; i < tablaEntidades.getRowCount(); i++) {
        valorControl = valorControl + Double.parseDouble(tablaEntidades.getValueAt(i, 2).toString());
    }
    if (valorControl < Double.parseDouble(lblTotalRubroValor.getText().trim())) {
        JOptionPane.showMessageDialog(rootPane, "La suma de los aportes de la entidad deben ser \niguales a el valor total del rubro", "Valor de rubro incorrecto", 0);
        controlDatos = false;
    } else if (valorControl > Double.parseDouble(lblTotalRubroValor.getText().trim())) {
        JOptionPane.showMessageDialog(rootPane, "La suma de los aportes de las entidades no\npuede ser mayor al valor del rubro", "Aportes superiores", 0);
        controlDatos = false;
    }
    if (controlDatos) {
        Presupuesto presupuesto = null;
        try {
            presupuesto = controlPresupuesto.PresupuestoPorConvenio(numeroConvenio);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "No se ha creado un presupuesto para el\n convenio numero: " + numeroConvenio, "No hay presupuesto para el convenio", 0);
        }
        if (presupuesto != null) {
            cantidad = Integer.parseInt(spinCantidad.getValue().toString());
            Rubro_presupuestal rubro = new Rubro_presupuestal(0, descripcion, cantidad, valorUnita, presupuesto.getId_presupuesto());
            try {
                int id_rubro = controlRubros.AgregarRubro_presupuestal(rubro);
                if (id_rubro != 0) {
                    int numero_filas = tablaEntidades.getRowCount();
                    boolean controlAddRubros = true;
                    for (int i = 0; i < numero_filas; i++) {
                        boolean controlAportes = false;
                        String NIT = tablaEntidades.getValueAt(i, 1).toString();
                        double monto_aporte = 0;
                        if (!tablaEntidades.getValueAt(i, 2).toString().trim().equals("")) {
                            monto_aporte = Double.parseDouble(tablaEntidades.getValueAt(i, 2).toString());
                        }
                        Aporte_rubro_entidad aporte_rubro_entidad = new Aporte_rubro_entidad(0, NIT, monto_aporte, id_rubro);
                        try {
                            controlAportes = controlRubros.AgregarAporte_rubro_entidad(aporte_rubro_entidad);
                            if (!controlAportes) {
                                JOptionPane.showMessageDialog(rootPane, "No se pudo registrar el aporte de la entidad: "
                                        + tablaEntidades.getValueAt(i, 0), "Error registro de aporte", 0);
                                controlAddRubros = false;
                            }
                        } catch (Exception e) {
                            JOptionPane.showMessageDialog(rootPane, "No se pudo registrar el aporte de la entidad: "
                                    + tablaEntidades.getValueAt(i, 0), "Error registro de aporte", 0);
                        }
                    }
                    if(controlAddRubros){
                      JOptionPane.showMessageDialog(rootPane, "Se ha creado el rubro del presupuesto asignado al convenio N°: "+numeroConvenio, "Adición de Rubro Exitosa", 1);
                    }
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }    
    limpiarFormulario();
}//GEN-LAST:event_btnAgregarRubroConvenioActionPerformed

private void btnAgregarRubroConvenioPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarRubroConvenioPerActionPerformed
// TODO add your handling code here:
    limpiarFormulario();
}//GEN-LAST:event_btnAgregarRubroConvenioPerActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarRubroConvenio;
    private javax.swing.JButton btnAgregarRubroConvenioPer;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblConvenio;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblImagenAddRubro;
    private javax.swing.JLabel lblNumeroConvenio;
    private javax.swing.JLabel lblRubroCatego;
    private javax.swing.JLabel lblTituloRubro;
    private javax.swing.JLabel lblTotalRubro;
    private javax.swing.JLabel lblTotalRubroValor;
    private javax.swing.JLabel lblValorUnitario;
    private javax.swing.JList listaCategoriasPrede;
    private javax.swing.JList listaRubrosCate;
    private javax.swing.JMenuBar menuAdicionRubro;
    private javax.swing.JPanel panelAportesEntidad;
    private javax.swing.JPanel panelDatosRubro;
    private javax.swing.JPanel panelDatosRubros;
    private javax.swing.JPanel panelSeleccionRubro;
    private javax.swing.JScrollPane scrollEntidades;
    private javax.swing.JSpinner spinCantidad;
    private javax.swing.JTable tablaEntidades;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    private void cargarDatosIniciales() {
        lblNumeroConvenio.setText(String.valueOf(numeroConvenio));
        rubroCategoria = controlRubros.getRubrosCategorias();
        //ListModel model;       
        listaRubrosCate.removeAll();
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < rubroCategoria.size(); i++) {
            String rubro = rubroCategoria.get(0).get(i).toString();
            listModel.addElement(rubro);
        }
        listaRubrosCate.setModel(listModel);
        cargaEntidades();
    }

    private void cargaEntidades() {
        try {
            ArrayList<Entidad_convenio> entidades = controlEntidad.ConsultaEntidades(numeroConvenio);
            int fila = 0;
            for (int i = 0; i < entidades.size(); i++) {
                if (tablaEntidades.getRowCount() == fila) {
                    DefaultTableModel tablaTemp = (DefaultTableModel) tablaEntidades.getModel();
                    Object nuevo[] = {null, null, null};
                    tablaTemp.addRow(nuevo);
                }
                tablaEntidades.setValueAt(entidades.get(i).getNombre_entidad(), fila, 0);
                tablaEntidades.setValueAt(entidades.get(i).getNIT_entidad(), fila, 1);
                fila++;
            }
            if (tablaEntidades.getRowCount() > fila) {
                DefaultTableModel tablaTemp = (DefaultTableModel) tablaEntidades.getModel();
                tablaTemp.removeRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void limpiarFormulario() {
        txtDescripcion.setText("");
        spinCantidad.setValue(1);
        txtValor.setText("");
        lblTotalRubroValor.setText("0");
        int numeroFilas = tablaEntidades.getRowCount();
        for (int i = 0; i < numeroFilas; i++) {
            tablaEntidades.setValueAt("", i, 2);
        }
    }
}
