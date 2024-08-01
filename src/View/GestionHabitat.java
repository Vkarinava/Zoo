
package View;

public class GestionHabitat extends javax.swing.JDialog {

    public GestionHabitat(){
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Combohabitad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 500));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(426, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("CONSULTA POR HABITAT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 330, 31));

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setText("SALIR");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 80, 30));

        getContentPane().add(Combohabitad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 310, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setText("Animales");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 180, 110));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setText("Tamaño");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 130, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combohabitad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
