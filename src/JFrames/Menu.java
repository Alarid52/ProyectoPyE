
package JFrames;

import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {


    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FuncionD = new javax.swing.JLabel();
        LimiteXY = new javax.swing.JLabel();
        ValorE = new javax.swing.JLabel();
        PLimitesV = new javax.swing.JLabel();
        Covarianza = new javax.swing.JLabel();
        ProyectoPYE = new javax.swing.JLabel();
        cerrarButton = new javax.swing.JLabel();
        MinButton = new javax.swing.JLabel();
        fondoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 51, 51));
        setForeground(new java.awt.Color(0, 51, 51));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FuncionD.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        FuncionD.setForeground(new java.awt.Color(51, 51, 51));
        FuncionD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FuncionD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        FuncionD.setText("Función de Distribución Lineal");
        FuncionD.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        FuncionD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(FuncionD, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 270, -1));

        LimiteXY.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        LimiteXY.setForeground(new java.awt.Color(51, 51, 51));
        LimiteXY.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LimiteXY.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        LimiteXY.setText("Límite en X y en Y");
        LimiteXY.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        LimiteXY.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(LimiteXY, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        ValorE.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        ValorE.setForeground(new java.awt.Color(51, 51, 51));
        ValorE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ValorE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        ValorE.setText("Valor Esperado en Mx y My");
        ValorE.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ValorE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(ValorE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        PLimitesV.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        PLimitesV.setForeground(new java.awt.Color(51, 51, 51));
        PLimitesV.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PLimitesV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        PLimitesV.setText("Probabilidad para Límites Variables");
        PLimitesV.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PLimitesV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(PLimitesV, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        Covarianza.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 24)); // NOI18N
        Covarianza.setForeground(new java.awt.Color(51, 51, 51));
        Covarianza.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Covarianza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Calculator_32px.png"))); // NOI18N
        Covarianza.setText("Covarianza");
        Covarianza.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Covarianza.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Covarianza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        ProyectoPYE.setFont(new java.awt.Font("Gloucester MT Extra Condensed", 1, 20)); // NOI18N
        ProyectoPYE.setForeground(new java.awt.Color(51, 51, 51));
        ProyectoPYE.setText("Proyecto Probabilidad y Estadística");
        getContentPane().add(ProyectoPYE, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, -1, -1));

        cerrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Multiply_32px.png"))); // NOI18N
        cerrarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cerrarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarButtonMouseClicked(evt);
            }
        });
        getContentPane().add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 40, 40));

        MinButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Expand_Arrow_32px.png"))); // NOI18N
        MinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinButtonMouseClicked(evt);
            }
        });
        getContentPane().add(MinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, 40));

        fondoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back.jpg"))); // NOI18N
        getContentPane().add(fondoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 425, 351));

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

 
    public static void main(String args[]) {
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Covarianza;
    private javax.swing.JLabel FuncionD;
    private javax.swing.JLabel LimiteXY;
    private javax.swing.JLabel MinButton;
    private javax.swing.JLabel PLimitesV;
    private javax.swing.JLabel ProyectoPYE;
    private javax.swing.JLabel ValorE;
    private javax.swing.JLabel cerrarButton;
    private javax.swing.JLabel fondoLabel;
    // End of variables declaration//GEN-END:variables
}
