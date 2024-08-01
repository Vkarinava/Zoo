package View;


public class Acciones extends javax.swing.JDialog {

    public Acciones() {
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(426, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 169, 133));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setText("Sonido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setText("SALIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 390, 80, 40));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 230, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("ANIMALES EN EL ZOOLOGICO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setText("Moviliza");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 230, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back2.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
