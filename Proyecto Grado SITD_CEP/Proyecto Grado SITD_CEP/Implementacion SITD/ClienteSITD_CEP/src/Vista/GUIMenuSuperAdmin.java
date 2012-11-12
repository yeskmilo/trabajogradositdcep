/*
 * Sistema de Información para la toma de Decisiones
 * Centro de Educación Permanente
 * Autor: 
 * Yesid Camilo Ortiz Castillo 
 */
/*
 * GUIMenuSuperAdmin.java
 *
 * Created on 10/02/2012, 11:13:04 AM
 */
package Vista;

import Estructural.Convenio;
import Estructural.Entidad_convenio;
import Modelo.IServicioConvenios;
import Modelo.IServicioGeneralSITD;
import Modelo.IServicioProfesoral;
import Vista.Profesoral.*;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kmilo
 */
public class GUIMenuSuperAdmin extends javax.swing.JFrame {

  private IServicioGeneralSITD servicioGeneral;
  private IServicioConvenios servicioConvenios;
  private IServicioProfesoral servicioProfesoral;

  /**
   * Creates new form GUIMenuSuperAdmin
   */
  public GUIMenuSuperAdmin(IServicioGeneralSITD servicioGeneral, GUILoginInicio guiLogin, int categoriaLogin) throws RemoteException {
    initComponents();
    this.servicioGeneral = servicioGeneral;
    if (categoriaLogin == 1) {
      servicioConvenios = servicioGeneral.InstanciaServicioConvenio();
      servicioProfesoral = servicioGeneral.InstanciaServicioProfesoral();
    } else if (categoriaLogin == 2) {
      servicioProfesoral = servicioGeneral.InstanciaServicioProfesoral();
      deshabilitarMenus();
    } else if (categoriaLogin == 3) {
      servicioConvenios = servicioGeneral.InstanciaServicioConvenio();
      deshabilitarMenus();
    }
    guiLogin.dispose();
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    menuAdministrador = new javax.swing.JMenuBar();
    menuArchivo = new javax.swing.JMenu();
    itemSalir = new javax.swing.JMenuItem();
    menuConvenios = new javax.swing.JMenu();
    itemNuevoConvenio = new javax.swing.JMenuItem();
    itemModificaConvenio = new javax.swing.JMenuItem();
    itemLiquidaConvenio = new javax.swing.JMenuItem();
    itemConsultaConvenio = new javax.swing.JMenu();
    itemConsultaConvNumero = new javax.swing.JMenuItem();
    itemEditarEntidad = new javax.swing.JMenuItem();
    menuProfesoral = new javax.swing.JMenu();
    subMenuPrograma = new javax.swing.JMenu();
    itemNuevoPrograma = new javax.swing.JMenuItem();
    itemEditarPrograma = new javax.swing.JMenuItem();
    itemInformePrograma = new javax.swing.JMenuItem();
    subMenuModulo = new javax.swing.JMenu();
    itemNuevoModulo = new javax.swing.JMenuItem();
    itemAsignaViaticos = new javax.swing.JMenuItem();
    itemAsignarTiquetes = new javax.swing.JMenuItem();
    itemAsignarHonorarios = new javax.swing.JMenuItem();
    subMenuConferencista = new javax.swing.JMenu();
    itemNuevoConferencista = new javax.swing.JMenuItem();
    itemEditarConferencista = new javax.swing.JMenuItem();
    menuEscalafon = new javax.swing.JMenu();
    menuAyuda = new javax.swing.JMenu();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("Menu Principal Administrador Sistema");

    jPanel1.setBackground(new java.awt.Color(255, 255, 255));

    jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/edificioCEP.jpg"))); // NOI18N

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1)
    );
    jPanel1Layout.setVerticalGroup(
      jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel1)
    );

    menuAdministrador.setInheritsPopupMenu(true);

    menuArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuArchivo.png"))); // NOI18N
    menuArchivo.setText("Archivo");
    menuArchivo.setFont(new java.awt.Font("Calibri", 2, 13));

    itemSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
    itemSalir.setText("Salir");
    itemSalir.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemSalirActionPerformed(evt);
      }
    });
    menuArchivo.add(itemSalir);

    menuAdministrador.add(menuArchivo);

    menuConvenios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ConvenioPequeño.png"))); // NOI18N
    menuConvenios.setText("Gestión Convenios");
    menuConvenios.setFont(new java.awt.Font("Calibri", 2, 13));

    itemNuevoConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    itemNuevoConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregarConvenio.png"))); // NOI18N
    itemNuevoConvenio.setText("Agregar nuevo Convenio");
    itemNuevoConvenio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemNuevoConvenioActionPerformed(evt);
      }
    });
    menuConvenios.add(itemNuevoConvenio);

    itemModificaConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    itemModificaConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modificacionConvenio.png"))); // NOI18N
    itemModificaConvenio.setText("Modificación de Convenios");
    itemModificaConvenio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemModificaConvenioActionPerformed(evt);
      }
    });
    menuConvenios.add(itemModificaConvenio);

    itemLiquidaConvenio.setFont(new java.awt.Font("Calibri", 2, 13));
    itemLiquidaConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/liquidarConvenio.png"))); // NOI18N
    itemLiquidaConvenio.setText("Liquidación Convenios");
    itemLiquidaConvenio.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemLiquidaConvenioActionPerformed(evt);
      }
    });
    menuConvenios.add(itemLiquidaConvenio);

    itemConsultaConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscarConvenio.png"))); // NOI18N
    itemConsultaConvenio.setText("Consulta de Convenios");
    itemConsultaConvenio.setFont(new java.awt.Font("Calibri", 2, 13));

    itemConsultaConvNumero.setFont(new java.awt.Font("Calibri", 2, 13));
    itemConsultaConvNumero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/convenioNumero.png"))); // NOI18N
    itemConsultaConvNumero.setText("Consultar por número de convenio");
    itemConsultaConvNumero.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemConsultaConvNumeroActionPerformed(evt);
      }
    });
    itemConsultaConvenio.add(itemConsultaConvNumero);

    menuConvenios.add(itemConsultaConvenio);

    itemEditarEntidad.setFont(new java.awt.Font("Calibri", 2, 13));
    itemEditarEntidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
    itemEditarEntidad.setText("Editar Entidad");
    itemEditarEntidad.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemEditarEntidadActionPerformed(evt);
      }
    });
    menuConvenios.add(itemEditarEntidad);

    menuAdministrador.add(menuConvenios);

    menuProfesoral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuConferen.png"))); // NOI18N
    menuProfesoral.setText("Gestion Profesoral");
    menuProfesoral.setFont(new java.awt.Font("Calibri", 2, 13));
    menuProfesoral.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        menuProfesoralActionPerformed(evt);
      }
    });

    subMenuPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/programa.png"))); // NOI18N
    subMenuPrograma.setText("Programa");
    subMenuPrograma.setFont(new java.awt.Font("Calibri", 2, 13));

    itemNuevoPrograma.setFont(new java.awt.Font("Calibri", 2, 13));
    itemNuevoPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/nuevoPrograma.png"))); // NOI18N
    itemNuevoPrograma.setText("Agregar Programa");
    itemNuevoPrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemNuevoProgramaActionPerformed(evt);
      }
    });
    subMenuPrograma.add(itemNuevoPrograma);

    itemEditarPrograma.setFont(new java.awt.Font("Calibri", 2, 13));
    itemEditarPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
    itemEditarPrograma.setText("Editar Programa");
    itemEditarPrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemEditarProgramaActionPerformed(evt);
      }
    });
    subMenuPrograma.add(itemEditarPrograma);

    itemInformePrograma.setFont(new java.awt.Font("Calibri", 2, 13));
    itemInformePrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/informe.png"))); // NOI18N
    itemInformePrograma.setText("Informe de Programas");
    itemInformePrograma.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemInformeProgramaActionPerformed(evt);
      }
    });
    subMenuPrograma.add(itemInformePrograma);

    menuProfesoral.add(subMenuPrograma);

    subMenuModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/modulo.png"))); // NOI18N
    subMenuModulo.setText("Modulo");
    subMenuModulo.setFont(new java.awt.Font("Calibri", 2, 13));

    itemNuevoModulo.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    itemNuevoModulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addModule.png"))); // NOI18N
    itemNuevoModulo.setText("Adición de nuevo Modulo");
    itemNuevoModulo.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemNuevoModuloActionPerformed(evt);
      }
    });
    subMenuModulo.add(itemNuevoModulo);

    itemAsignaViaticos.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    itemAsignaViaticos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addViatico.png"))); // NOI18N
    itemAsignaViaticos.setText("Asignar Viaticos");
    subMenuModulo.add(itemAsignaViaticos);

    itemAsignarTiquetes.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    itemAsignarTiquetes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addTicket.png"))); // NOI18N
    itemAsignarTiquetes.setText("Asignar Tiquetes");
    subMenuModulo.add(itemAsignarTiquetes);

    itemAsignarHonorarios.setFont(new java.awt.Font("Calibri", 2, 13)); // NOI18N
    itemAsignarHonorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addHonorarios.png"))); // NOI18N
    itemAsignarHonorarios.setText("Asignar Honorarios");
    subMenuModulo.add(itemAsignarHonorarios);

    menuProfesoral.add(subMenuModulo);

    subMenuConferencista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuConferen.png"))); // NOI18N
    subMenuConferencista.setText("Conferencista");
    subMenuConferencista.setFont(new java.awt.Font("Calibri", 2, 13));

    itemNuevoConferencista.setFont(new java.awt.Font("Calibri", 2, 13));
    itemNuevoConferencista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/addConferencista.png"))); // NOI18N
    itemNuevoConferencista.setText("Agregar Conferencista");
    itemNuevoConferencista.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemNuevoConferencistaActionPerformed(evt);
      }
    });
    subMenuConferencista.add(itemNuevoConferencista);

    itemEditarConferencista.setFont(new java.awt.Font("Calibri", 2, 13));
    itemEditarConferencista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editarConferencista.png"))); // NOI18N
    itemEditarConferencista.setText("Editar Conferencista");
    itemEditarConferencista.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        itemEditarConferencistaActionPerformed(evt);
      }
    });
    subMenuConferencista.add(itemEditarConferencista);

    menuProfesoral.add(subMenuConferencista);

    menuAdministrador.add(menuProfesoral);

    menuEscalafon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuEscalafon.png"))); // NOI18N
    menuEscalafon.setText("Gestion Escalafon Docente");
    menuEscalafon.setFont(new java.awt.Font("Calibri", 2, 13));
    menuAdministrador.add(menuEscalafon);

    menuAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/menuAyuda.png"))); // NOI18N
    menuAyuda.setText("Ayuda ?");
    menuAyuda.setFont(new java.awt.Font("Calibri", 2, 13));
    menuAdministrador.add(menuAyuda);

    setJMenuBar(menuAdministrador);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

private void itemNuevoConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoConvenioActionPerformed
// TODO add your handling code here:    
  try {
    AdicionConvenio adicion_Convenio = new AdicionConvenio(servicioConvenios);
  } catch (RemoteException ex) {
    Logger.getLogger(GUIMenuSuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
  }
}//GEN-LAST:event_itemNuevoConvenioActionPerformed

private void itemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemSalirActionPerformed
// TODO add your handling code here:
  this.dispose();
}//GEN-LAST:event_itemSalirActionPerformed

private void itemConsultaConvNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultaConvNumeroActionPerformed
// TODO add your handling code here:
  try {
    ConsultaConvenioNumero ConsultaConvenioNumero = new ConsultaConvenioNumero(servicioConvenios);
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemConsultaConvNumeroActionPerformed

private void itemEditarEntidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarEntidadActionPerformed
// TODO add your handling code here:
  try {
    Entidad_convenio entidad = null;
    GUIEditarEntidad guiEditarEntidad = new GUIEditarEntidad(servicioConvenios, entidad);
    guiEditarEntidad.show();
  } catch (RemoteException ex) {
    Logger.getLogger(GUIMenuSuperAdmin.class.getName()).log(Level.SEVERE, null, ex);
  }
}//GEN-LAST:event_itemEditarEntidadActionPerformed

private void itemModificaConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemModificaConvenioActionPerformed
// TODO add your handling code here:
  try {
    ConsultaConvenioNumero ConsultaConvenioNumero = new ConsultaConvenioNumero(servicioConvenios);
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemModificaConvenioActionPerformed

private void itemLiquidaConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemLiquidaConvenioActionPerformed
// TODO add your handling code here:
  try {
    Convenio convenio = null;
    GUILiquidarConvenio guiLiquidarConvenio = new GUILiquidarConvenio(servicioConvenios, convenio);
    guiLiquidarConvenio.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemLiquidaConvenioActionPerformed

private void menuProfesoralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProfesoralActionPerformed
// TODO add your handling code here:  
}//GEN-LAST:event_menuProfesoralActionPerformed

private void itemNuevoProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoProgramaActionPerformed
// TODO add your handling code here:
  try {
    GUIAdicionarPrograma guiAdicionarPrograma = new GUIAdicionarPrograma(servicioProfesoral);
    guiAdicionarPrograma.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemNuevoProgramaActionPerformed

private void itemInformeProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemInformeProgramaActionPerformed
// TODO add your handling code here:
  try {
    GUIEditarPrograma guiEditarPrograma = null;
    GUIInformePrograma guiInformePrograma = new GUIInformePrograma(servicioProfesoral, guiEditarPrograma);
    guiInformePrograma.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemInformeProgramaActionPerformed

private void itemEditarProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarProgramaActionPerformed
// TODO add your handling code here:
  try {
    GUIEditarPrograma guiEditarPrograma = new GUIEditarPrograma(servicioProfesoral);
    guiEditarPrograma.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemEditarProgramaActionPerformed

    private void itemNuevoConferencistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoConferencistaActionPerformed
      // TODO add your handling code here:
      try {
        GUIAdicionarConferencista guiAdicionarConferencista = new GUIAdicionarConferencista(servicioProfesoral);
        guiAdicionarConferencista.show();
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }//GEN-LAST:event_itemNuevoConferencistaActionPerformed

private void itemEditarConferencistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditarConferencistaActionPerformed
// TODO add your handling code here:
  try {
    GUIEditarConferencista guiEditarConferencista = new GUIEditarConferencista(servicioProfesoral);
    guiEditarConferencista.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemEditarConferencistaActionPerformed

private void itemNuevoModuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNuevoModuloActionPerformed
// TODO add your handling code here:
  try {
    GUIAdicionarModulo guiAdicionarModulo = new GUIAdicionarModulo(servicioProfesoral);
    guiAdicionarModulo.show();
  } catch (Exception e) {
    System.out.println(e.getMessage());
  }
}//GEN-LAST:event_itemNuevoModuloActionPerformed
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JMenuItem itemAsignaViaticos;
  private javax.swing.JMenuItem itemAsignarHonorarios;
  private javax.swing.JMenuItem itemAsignarTiquetes;
  private javax.swing.JMenuItem itemConsultaConvNumero;
  private javax.swing.JMenu itemConsultaConvenio;
  private javax.swing.JMenuItem itemEditarConferencista;
  private javax.swing.JMenuItem itemEditarEntidad;
  private javax.swing.JMenuItem itemEditarPrograma;
  private javax.swing.JMenuItem itemInformePrograma;
  private javax.swing.JMenuItem itemLiquidaConvenio;
  private javax.swing.JMenuItem itemModificaConvenio;
  private javax.swing.JMenuItem itemNuevoConferencista;
  private javax.swing.JMenuItem itemNuevoConvenio;
  private javax.swing.JMenuItem itemNuevoModulo;
  private javax.swing.JMenuItem itemNuevoPrograma;
  private javax.swing.JMenuItem itemSalir;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JMenuBar menuAdministrador;
  private javax.swing.JMenu menuArchivo;
  private javax.swing.JMenu menuAyuda;
  private javax.swing.JMenu menuConvenios;
  private javax.swing.JMenu menuEscalafon;
  private javax.swing.JMenu menuProfesoral;
  private javax.swing.JMenu subMenuConferencista;
  private javax.swing.JMenu subMenuModulo;
  private javax.swing.JMenu subMenuPrograma;
  // End of variables declaration//GEN-END:variables

  private void deshabilitarMenus() {
    if (servicioConvenios != null && servicioProfesoral == null) {
      menuProfesoral.setVisible(false);
      menuEscalafon.setVisible(false);
    } else if (servicioConvenios == null && servicioProfesoral != null) {
      menuConvenios.setVisible(false);
    }
  }
}
