/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PCBuilder;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandro Guerrero A
 */
public class JCotizacion extends javax.swing.JFrame {

    boolean one = true;

    /**
     * Creates new form JCotizacion
     */
    public JCotizacion() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cotización PC Builder");
        setResizable(false);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int x = JOptionPane.showConfirmDialog(null, "¿Seguro que desea salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (x == JOptionPane.YES_OPTION) {
                    if (ConteoUso.conteoMinutos == 0) {
                        JOptionPane.showMessageDialog(null, "¡Gracias por usar PC Builder!\nHa durado usando la aplicación " + ConteoUso.conteoSegundos + " segundos.");
                        System.exit(0);
                    } else if (ConteoUso.conteoMinutos == 1) {
                        JOptionPane.showMessageDialog(null, "¡Gracias por usar PC Builder!\nHa durado usando la aplicación " + ConteoUso.conteoMinutos + " minuto y " + ConteoUso.conteoSegundos + " segundos.");
                        System.exit(0);
                    } else {
                        JOptionPane.showMessageDialog(null, "¡Gracias por usar PC Builder!\nHa durado usando la aplicación " + ConteoUso.conteoMinutos + " minutos y " + ConteoUso.conteoSegundos + " segundos.");
                        System.exit(0);
                    }
                }
            }

        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cargarCotizacionButton = new javax.swing.JButton();
        aceptarCotButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        atrasButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Cotización PC Builder");

        cargarCotizacionButton.setText("Cargar Cotización");
        cargarCotizacionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarCotizacionButtonActionPerformed(evt);
            }
        });

        aceptarCotButton.setText("Aceptar Cotización");
        aceptarCotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarCotButtonActionPerformed(evt);
            }
        });

        jLabel2.setText("Total:");

        jLabel3.setText("0");

        atrasButton.setText("Atrás");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cargarCotizacionButton)
                                .addGap(18, 18, 18)
                                .addComponent(aceptarCotButton)
                                .addGap(18, 18, 18)
                                .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(98, 98, 98)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptarCotButton)
                    .addComponent(cargarCotizacionButton)
                    .addComponent(atrasButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarCotizacionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarCotizacionButtonActionPerformed
        try {
            if (Cotizacion.getCpu() != null || Cotizacion.getGpu() != null || Cotizacion.getHdd() != null || Cotizacion.getMobo() != null || Cotizacion.getPsu() != null || Cotizacion.getRam() != null) {
                DefaultTableModel tablaPartes = new DefaultTableModel();
                tablaPartes.addColumn("Marca");
                tablaPartes.addColumn("Modelo");
                tablaPartes.addColumn("Precio");

                for (int i = 0; i < 1; i++) {
                    //Agrega Procesador
                    if (Cotizacion.getCpu() != null) {
                        Cotizacion.precio(Cotizacion.getCpu().getPrecio());
                        Object[] a = new Object[3];
                        a[0] = Cotizacion.getCpu().marca;
                        a[1] = Cotizacion.getCpu().modelo + " @ " + Cotizacion.getCpu().clock;
                        a[2] = Cotizacion.getCpu().precio;
                        tablaPartes.addRow(a);
                        this.jTable1.setModel(tablaPartes);
                    }

                    //Agrega Tarjeta Madre
                    if (Cotizacion.getMobo() != null) {
                        Cotizacion.precio(Cotizacion.getMobo().getPrecio());
                        Object[] b = new Object[3];
                        b[0] = Cotizacion.getMobo().marca;
                        b[1] = Cotizacion.getMobo().modelo;
                        b[2] = Cotizacion.getMobo().precio;
                        tablaPartes.addRow(b);
                        this.jTable1.setModel(tablaPartes);
                    }

                    //Agrega Memoria RAM
                    if (Cotizacion.getRam() != null) {
                        Cotizacion.precio(Cotizacion.getRam().getPrecio());
                        Object[] b = new Object[3];
                        b[0] = Cotizacion.getRam().marca;
                        b[1] = Cotizacion.getRam().modelo + " @ " + Cotizacion.getRam().clock;
                        b[2] = Cotizacion.getRam().precio;
                        tablaPartes.addRow(b);
                        this.jTable1.setModel(tablaPartes);
                    }

                    //Agrega Tarjeta de Vídeo
                    if (Cotizacion.getGpu() != null) {
                        Cotizacion.precio(Cotizacion.getGpu().getPrecio());
                        Object[] b = new Object[3];
                        b[0] = Cotizacion.getGpu().marca;
                        b[1] = Cotizacion.getGpu().modelo + " " + Cotizacion.getGpu().memoriaVram;
                        b[2] = Cotizacion.getGpu().precio;
                        tablaPartes.addRow(b);
                        this.jTable1.setModel(tablaPartes);
                    }

                    //Agrega Disco Duro
                    if (Cotizacion.getHdd() != null) {
                        Cotizacion.precio(Cotizacion.getHdd().getPrecio());
                        Object[] b = new Object[3];
                        b[0] = Cotizacion.getHdd().marca;
                        b[1] = Cotizacion.getHdd().modelo + " " + Cotizacion.getHdd().memoria + " " + Cotizacion.getHdd().velocidad;
                        b[2] = Cotizacion.getHdd().precio;
                        tablaPartes.addRow(b);
                        this.jTable1.setModel(tablaPartes);
                    }

                    //Agrega Fuente de Poder
                    if (Cotizacion.getPsu() != null) {
                        Cotizacion.precio(Cotizacion.getPsu().getPrecio());
                        Object[] b = new Object[3];
                        b[0] = Cotizacion.getPsu().marca;
                        b[1] = Cotizacion.getPsu().modelo + " " + Cotizacion.getPsu().certificado + " " + Cotizacion.getPsu().wattage;
                        b[2] = Cotizacion.getPsu().precio;
                        tablaPartes.addRow(b);
                        this.jTable1.setModel(tablaPartes);
                    }

                    if (one) {
                        this.jLabel3.setText(Integer.toString(Cotizacion.getPrice()));
                        one = false;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, vaya a Crear Nueva PC y agregue partes a la lista");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un error");
        }
    }//GEN-LAST:event_cargarCotizacionButtonActionPerformed

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        Cotizacion.setPrice(0);
        new MenuPrincipal().setVisible(true);
        dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void aceptarCotButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarCotButtonActionPerformed
        try {
            if (Cotizacion.getCpu() != null || Cotizacion.getGpu() != null || Cotizacion.getHdd() != null || Cotizacion.getMobo() != null || Cotizacion.getPsu() != null || Cotizacion.getRam() != null) {
                Cotizacion c = new Cotizacion();
                int s = JOptionPane.showOptionDialog(null, "¡Gracias por cotizar con PC Builder!\n¿Desea guardar esto en un archivo?", "Aceptar Cotización", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, null, null);
                switch (s) {
                    case 0: {
                        try {
                            //Lo escribe por primera vez, sin lineas
                            File f = new File("Factura.txt");
                            f.createNewFile();
                            FileWriter fw = new FileWriter(f);
                            BufferedWriter bw = new BufferedWriter(fw);
                            bw.write(c.toString());
                            bw.close();

                            //Lo lee para guardar linea por linea y guardar cada linea en el vector
                            ArrayList<String> lineas = new ArrayList<>();
                            File n = new File("Factura.txt");
                            if (n.exists()) {
                                FileReader fr = new FileReader(n);
                                BufferedReader br = new BufferedReader(fr);
                                String x = "";
                                while ((x = br.readLine()) != null) {
                                    lineas.add(x);
                                }
                                br.close();
                            }

                            //Guarda en el archivo cada vector (cada linea)
                            File b = new File("Factura.txt");
                            b.createNewFile();
                            FileWriter fw2 = new FileWriter(b);
                            BufferedWriter bw2 = new BufferedWriter(fw2);
                            for (int i = 0; i < lineas.size(); i++) {
                                bw2.write(lineas.get(i));
                                bw2.newLine();
                            }
                            bw2.close();
                            JOptionPane.showMessageDialog(null, "¡Listo!\nSe ha guardado el archivo en un archivo llamado Factura.txt");
                            Cotizacion.setPrice(0);
                            new MenuPrincipal().setVisible(true);
                            dispose();
                            break;
                        } catch (IOException ex) {
                            Logger.getLogger(JCotizacion.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    case 1: {
                        Cotizacion.setPrice(0);
                        new MenuPrincipal().setVisible(true);
                        dispose();
                        break;
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, "Por favor, vaya a Crear Nueva PC y agregue partes a la lista");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema");
        }
    }//GEN-LAST:event_aceptarCotButtonActionPerformed

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
            java.util.logging.Logger.getLogger(JCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCotizacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCotizacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptarCotButton;
    private javax.swing.JButton atrasButton;
    private javax.swing.JButton cargarCotizacionButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
