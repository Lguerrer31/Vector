/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacionvectores;

import javax.swing.JOptionPane;

/**
 *
 * @author lguerrer17
 */
public class Ejercicio extends javax.swing.JFrame {

    /**
     * Creates new form Ejercicio
     */
    double v[];

    public Ejercicio() {
        initComponents();
        cmdLlenar.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdMostrar.setEnabled(false);
        txtLongitud.requestFocusInWindow();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdCrear = new javax.swing.JButton();
        cmdMostrar = new javax.swing.JButton();
        cmdLlenar = new javax.swing.JButton();
        cmdB = new javax.swing.JButton();
        cmdLA = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Operaciones con vectores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos iniciales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Longitud");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtLongitud.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 160, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCrear.setText("Crear");
        cmdCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmdCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        cmdMostrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdMostrar.setText("Mostrar");
        cmdMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        cmdLlenar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLlenar.setText("Llenado manual");
        cmdLlenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLlenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        cmdB.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdB.setText("Borrar");
        cmdB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdBActionPerformed(evt);
            }
        });
        jPanel3.add(cmdB, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        cmdLA.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLA.setText("Llenado automatico");
        cmdLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLAActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 150, 240));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtRes.setEditable(false);
        txtRes.setColumns(20);
        txtRes.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRes.setRows(5);
        jScrollPane1.setViewportView(txtRes);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 170, 80));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 190, 110));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCrearActionPerformed
        // TODO add your handling code here:
        int longitud;

        if (txtLongitud.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la longitud", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        } else if (Integer.parseInt(txtLongitud.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "La longitud debe ser mayor que cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
            txtLongitud.selectAll();
        } else {
            longitud = Integer.parseInt(txtLongitud.getText());
            v = new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado satisfactoriamente!");

            cmdCrear.setEnabled(false);
            cmdLlenar.setEnabled(true);
            cmdLA.setEnabled(true);
            cmdMostrar.setEnabled(false);
            cmdB.setEnabled(true);
            txtLongitud.setEditable(false);
        }
    }//GEN-LAST:event_cmdCrearActionPerformed

    private void cmdBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdBActionPerformed
        // TODO add your handling code here:
        txtLongitud.setText("");
        txtRes.setText("");
        v = null;
        txtLongitud.requestFocusInWindow();
        txtLongitud.setEditable(true);
        cmdLlenar.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdCrear.setEnabled(true);
    }//GEN-LAST:event_cmdBActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {
            getToolkit().beep();

            evt.consume();
        }
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmdLlenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarActionPerformed
        // TODO add your handling code here:
        double n;
        boolean sw = true;
        int aux, res;
        for (int i = 0; i < v.length; i++) {
            do {
                aux = 1;

                try {
                    n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elemento en la posición: " + i));
                    v[i] = n;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "Digite la información correctamente", "Error", JOptionPane.ERROR_MESSAGE);
                    aux = 0;
                } catch (NullPointerException e) {
                    res = JOptionPane.showConfirmDialog(this, "¿Desea salir?", "Saliar", JOptionPane.YES_NO_OPTION);
                    aux = 0;
                    if (res == 0) {
                        System.out.println(res);
                        aux = 1;
                        i = v.length;
                        sw = false;
                    } else {
                        aux = 0;
                    }
                }
            } while (aux == 0);
        }
        cmdCrear.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdMostrar.setEnabled(sw);
        cmdB.setEnabled(true);
    }//GEN-LAST:event_cmdLlenarActionPerformed

    private void cmdMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMostrarActionPerformed
        // TODO add your handling code here:
        for (int i = 0; i < v.length; i++) {
            txtRes.append("" + v[i] + "\n");
        }
        txtLongitud.setEditable(false);
        cmdCrear.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdMostrar.setEnabled(false);
        cmdB.setEnabled(true);
    }//GEN-LAST:event_cmdMostrarActionPerformed

    private void cmdLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLAActionPerformed
        // TODO add your handling code here:
        int n;
        for (int i = 0; i < v.length; i++) {
            n = (int) (Math.random() * 25 + 1);
            v[i] = n;
        }

        JOptionPane.showMessageDialog(this, "Vector llenado Satisfactoriamente");

        cmdCrear.setEnabled(false);
        cmdLlenar.setEnabled(false);
        cmdLA.setEnabled(false);
        cmdMostrar.setEnabled(true);
        cmdB.setEnabled(true);
    }//GEN-LAST:event_cmdLAActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdB;
    private javax.swing.JButton cmdCrear;
    private javax.swing.JButton cmdLA;
    private javax.swing.JButton cmdLlenar;
    private javax.swing.JButton cmdMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtRes;
    // End of variables declaration//GEN-END:variables
}
