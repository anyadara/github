/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package homework2;

import java.awt.Color;

/**
 *
 * @author Msi
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu5 = new javax.swing.JMenu();
        menu1 = new javax.swing.JPopupMenu();
        redcolor = new javax.swing.JMenuItem();
        reverse = new javax.swing.JMenuItem();
        FIELD = new javax.swing.JPopupMenu();
        COPY = new javax.swing.JMenuItem();
        past = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        panel = new javax.swing.JPanel();
        pp = new javax.swing.JTextField();

        jMenu5.setText("jMenu5");

        redcolor.setText("red");
        redcolor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redcolorActionPerformed(evt);
            }
        });
        menu1.add(redcolor);

        reverse.setText("reverse the colore");
        reverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reverseActionPerformed(evt);
            }
        });
        menu1.add(reverse);

        COPY.setText("copy");
        COPY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COPYActionPerformed(evt);
            }
        });
        FIELD.add(COPY);

        past.setText("past");
        past.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pastActionPerformed(evt);
            }
        });
        FIELD.add(past);

        cut.setText("cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        FIELD.add(cut);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                panelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 106, Short.MAX_VALUE)
        );

        pp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                ppMouseReleased(evt);
            }
        });
        pp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ppActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(pp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMouseReleased
if(evt.isPopupTrigger()){
    menu1.show(panel,evt.getX(),evt.getY());
}
        // TODO add your handling code here:
    }//GEN-LAST:event_panelMouseReleased

    private void redcolorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redcolorActionPerformed
panel.setBackground(Color.red);
// TODO add your handling code here:
    }//GEN-LAST:event_redcolorActionPerformed

    private void ppMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ppMouseReleased
if(evt.isPopupTrigger()){
    FIELD.show(pp,evt.getX(),evt.getY());}

        // TODO add your handling code here:
    }//GEN-LAST:event_ppMouseReleased

    private void COPYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COPYActionPerformed
pp.copy();

        // TODO add your handling code here:
    }//GEN-LAST:event_COPYActionPerformed

    private void pastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pastActionPerformed
      pp.paste();
    }//GEN-LAST:event_pastActionPerformed

    private void ppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ppActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ppActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
      pp.cut();    }//GEN-LAST:event_cutActionPerformed

    private void reverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reverseActionPerformed
panel.setBackground(Color.white);
        // TODO add your handling code here:
    }//GEN-LAST:event_reverseActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem COPY;
    private javax.swing.JPopupMenu FIELD;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JPopupMenu menu1;
    private javax.swing.JPanel panel;
    private javax.swing.JMenuItem past;
    private javax.swing.JTextField pp;
    private javax.swing.JMenuItem redcolor;
    private javax.swing.JMenuItem reverse;
    // End of variables declaration//GEN-END:variables
}
