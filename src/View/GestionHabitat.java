
package View;

import Model.Ave;
import Model.Habitat;
import Model.Mamifero;
import Model.Zoologico;
import javax.swing.DefaultListModel;
public class GestionHabitat extends javax.swing.JDialog {
    
    private Main Ventana_main;
    private Zoologico objzoo = null;
    
    public GestionHabitat(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        Ventana_main = (Main) parent;
        
        initComponents();
        this.setTitle("Gestionar Habitat");        
        this.setLocationRelativeTo(null);
        //recorre los objetos de la lista de habitas.
        
        objzoo = Ventana_main.getObj_zoo();
        
        for(Habitat obj_hab: objzoo.habitat_zoo){
            Combohabitad.addItem(obj_hab.getNombre());            
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Combohabitad = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        txtSize = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(426, 400));
        setPreferredSize(new java.awt.Dimension(426, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel3.setText("CONSULTA POR HABITAT");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 330, 31));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        Combohabitad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CombohabitadItemStateChanged(evt);
            }
        });
        getContentPane().add(Combohabitad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 310, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Total Animales :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 110));

        jLabel5.setText("Tamaño");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(txtSize, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 130, -1));

        txtdescripcion.setBackground(new java.awt.Color(204, 204, 204));
        txtdescripcion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 40));

        jLabel6.setText("Animales");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTotal.setText("0");
        txtTotal.setMinimumSize(new java.awt.Dimension(64, 28));
        txtTotal.setPreferredSize(new java.awt.Dimension(70, 37));
        getContentPane().add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 60, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back2.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CombohabitadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CombohabitadItemStateChanged
        // TODO add your handling code here:
        for(Habitat obj_hab: objzoo.habitat_zoo){
            if (Combohabitad.getSelectedItem() == obj_hab.getNombre()){
                txtSize.setText(obj_hab.getTamano());
                txtdescripcion.setText(obj_hab.getDescripcion());
                DefaultListModel<String> modelo=new DefaultListModel<>();
                jList1.setModel(modelo);
               
                for(Ave obj_ave: obj_hab.Lista_Aves){
                    modelo.addElement(obj_ave.getNombre());
                
                }
                
                for(Mamifero obj_mamifero: obj_hab.Lista_Mamiferos){
                     modelo.addElement(obj_mamifero.getNombre());
                }
                txtTotal.setText(""+jList1.getModel().getSize());
                //System.out.println("uuu"+jList1.w);
                
                
            }
        }

                
        
    }//GEN-LAST:event_CombohabitadItemStateChanged



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combohabitad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtSize;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtdescripcion;
    // End of variables declaration//GEN-END:variables
}
