package View;

import Model.Ave;
import Model.Habitat;
import Model.Mamifero;
import Model.Zoologico;
import javax.swing.DefaultListModel;


public class Acciones extends javax.swing.JDialog {
    private Main Ventana_main;
    private Zoologico objzoo = null;
    DefaultListModel<String> modelo=new DefaultListModel<>();
    
    public Acciones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Ventana_main = (Main) parent;
        
        initComponents();
        this.setTitle("Gestionar Animales");        
        this.setLocationRelativeTo(null);
        //recorre los objetos de la lista de habitas.
        
        objzoo = Ventana_main.getObj_zoo();
        
        Listanimales.setModel(modelo);
        
        for(Habitat obj_hab: objzoo.habitat_zoo){
                for(Ave obj_ave: obj_hab.Lista_Aves){
                    modelo.addElement(obj_ave.getNombre());
                
                }
                for(Mamifero obj_mamifero: obj_hab.Lista_Mamiferos){
                     modelo.addElement(obj_mamifero.getNombre());
                }
        }

        Listanimales.setModel(modelo);            
    }
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Listanimales = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textsound = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textmove = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(426, 400));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel2.setText("ANIMALES EN EL ZOOLOGICO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        Listanimales.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                ListanimalesComponentMoved(evt);
            }
        });
        Listanimales.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListanimalesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Listanimales);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 169, 133));

        jLabel1.setText("Sonido");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));
        getContentPane().add(textsound, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 230, 30));

        jLabel3.setText("Moviliza");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, -1, -1));
        getContentPane().add(textmove, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back2.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ListanimalesComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ListanimalesComponentMoved
        
    }//GEN-LAST:event_ListanimalesComponentMoved

    private void ListanimalesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListanimalesValueChanged
        // TODO add your handling code here:
        
        for(Habitat obj_hab: objzoo.habitat_zoo){
                for(Ave obj_ave: obj_hab.Lista_Aves){
                    if (Listanimales.getSelectedValue() == obj_ave.getNombre()){
                        textsound.setText(obj_ave.accion_sonido());
                        textmove.setText(obj_ave.accion_desplazar());
                        }
                }
                for(Mamifero obj_mamifero: obj_hab.Lista_Mamiferos){
                     if (Listanimales.getSelectedValue() == obj_mamifero.getNombre()){
                        textsound.setText(obj_mamifero.accion_sonido());
                        textmove.setText(obj_mamifero.accion_desplazar());
                        }
                }
        }

    }//GEN-LAST:event_ListanimalesValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Listanimales;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textmove;
    private javax.swing.JTextField textsound;
    // End of variables declaration//GEN-END:variables
}
