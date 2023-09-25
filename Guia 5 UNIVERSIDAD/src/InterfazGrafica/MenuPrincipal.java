/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfazGrafica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author usuario
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jdpEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmAlumno = new javax.swing.JMenu();
        jmGestionAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmGestionMaterias = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmManejoInscripciones = new javax.swing.JMenuItem();
        jmManipulacionNotas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmAlumnoXmateria = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        jmAlumno.setText("Alumno");
        jmAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoActionPerformed(evt);
            }
        });

        jmGestionAlumno.setText("Formulario Alumno");
        jmGestionAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionAlumnoActionPerformed(evt);
            }
        });
        jmAlumno.add(jmGestionAlumno);

        jMenuBar1.add(jmAlumno);

        jMenu2.setText("Materia");

        jmGestionMaterias.setText("Formulario Materia");
        jmGestionMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGestionMateriasActionPerformed(evt);
            }
        });
        jMenu2.add(jmGestionMaterias);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Adminstracion");

        jmManejoInscripciones.setText("Manejo de Inscripciones");
        jmManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu5.add(jmManejoInscripciones);

        jmManipulacionNotas.setText("Manpulacion de Notas");
        jmManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu5.add(jmManipulacionNotas);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consulta");

        jmAlumnoXmateria.setText("Alumnos por Materia");
        jmAlumnoXmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnoXmateriaActionPerformed(evt);
            }
        });
        jMenu6.add(jmAlumnoXmateria);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Salir");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoActionPerformed

    }//GEN-LAST:event_jmAlumnoActionPerformed

    private void jmGestionAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionAlumnoActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        GestionAlumnos ga = new GestionAlumnos();
        ga.setVisible(true);
        jdpEscritorio.add(ga);
        jdpEscritorio.moveToFront(ga);
    }//GEN-LAST:event_jmGestionAlumnoActionPerformed

    private void jmGestionMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGestionMateriasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        GestionMaterias gm = new GestionMaterias();
        gm.setVisible(true);
        jdpEscritorio.add(gm);
        jdpEscritorio.moveToFront(gm);
    }//GEN-LAST:event_jmGestionMateriasActionPerformed

    private void jmManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionesActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        FormularioInscripcion fi = new FormularioInscripcion();
        fi.setVisible(true);
        jdpEscritorio.add(fi);
        jdpEscritorio.moveToFront(fi);

    }//GEN-LAST:event_jmManejoInscripcionesActionPerformed

    private void jmManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionNotasActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        CargaDeNotas cn = new CargaDeNotas();
        cn.setVisible(true);
        jdpEscritorio.add(cn);
        jdpEscritorio.moveToFront(cn);

    }//GEN-LAST:event_jmManipulacionNotasActionPerformed

    private void jmAlumnoXmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnoXmateriaActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ConsultaAlumnoPorMateria am = new ConsultaAlumnoPorMateria();
        am.setVisible(true);
        jdpEscritorio.add(am);
        jdpEscritorio.moveToFront(am);

    }//GEN-LAST:event_jmAlumnoXmateriaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenu jmAlumno;
    private javax.swing.JMenuItem jmAlumnoXmateria;
    private javax.swing.JMenuItem jmGestionAlumno;
    private javax.swing.JMenuItem jmGestionMaterias;
    private javax.swing.JMenuItem jmManejoInscripciones;
    private javax.swing.JMenuItem jmManipulacionNotas;
    // End of variables declaration//GEN-END:variables
}
