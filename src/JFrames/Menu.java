
package JFrames;

import javax.swing.JOptionPane;
import proyectopye.Integral;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProyectoPYE = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JLabel();
        MinButton = new javax.swing.JLabel();
        fondoLabel = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("CALCULAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jTextField1.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 20, 20));

        jTextField3.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 24)); // NOI18N
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 157, 130, 40));

        jTextField2.setFont(new java.awt.Font("Bodoni MT Condensed", 2, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 200, 20, 20));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 100, 30));

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 30, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("RESULTADO:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 90, 30));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("=");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/int.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/integral.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 150, 70));

        jLabel5.setText("Particiones (n):");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 90, -1));

        ProyectoPYE.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 30)); // NOI18N
        ProyectoPYE.setForeground(new java.awt.Color(51, 51, 51));
        ProyectoPYE.setText("Proyecto Probabilidad y Estadística");
        getContentPane().add(ProyectoPYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 340, 60));

        cerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 40));

        MinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        MinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinButtonMouseClicked(evt);
            }
        });
        getContentPane().add(MinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 40, 40));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back1.jpg"))); // NOI18N
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 351));

        pack();
    }// </editor-fold>//GEN-END:initComponents
//MÉTODO PARA MINIMIZAR EL MENÚ
    private void MinButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinButtonMouseClicked
      this.setState(Menu.ICONIFIED);  
    }//GEN-LAST:event_MinButtonMouseClicked
//MÉTODO PARA CERRAR EL MENÚ
    private void cerrarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarButtonMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrarButtonMouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        String funcion = jTextField3.getText();
        String a = jTextField1.getText();
        String b = jTextField2.getText();
        String n = jTextField5.getText();
        Integral obj = new Integral();
        jTextField4.setText(obj.metodoSimpson(a, b, funcion, n));
        
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed

    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MinButton;
    private javax.swing.JLabel ProyectoPYE;
    private javax.swing.JLabel cerrarButton;
    private javax.swing.JLabel fondoLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
