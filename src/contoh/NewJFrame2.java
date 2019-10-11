package contoh;

import javax.swing.JOptionPane;

public class NewJFrame2 extends javax.swing.JFrame {
    
    public NewJFrame2() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tambah", "Kurang", "Kali", "Bagi" }));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1)
                    .addComponent(jComboBox1, 0, 107, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        boolean a = true;
        boolean b = false;
        boolean c = !b;
        boolean d = 5 > 1;
        
        char x = '"';
        
        String nama = "";
        String literal_str = ""+nama+""
                + "A "+""
                + "B "+""
                + "C ";
        //System.out.println(literal_str);
        
        char ch = literal_str.charAt(0);
        System.out.println(ch);
        
        boolean literal_bol = literal_str.contains("X");
        System.out.println(literal_bol);
        
        String vT1 = jTextField1.getText();
        if(vT1.isEmpty()){
            //JOptionPane.showMessageDialog(this, "Anda belum mengisi nama");
        }else {
            //boolean endW = vT1.endsWith("X");
            //JOptionPane.showMessageDialog(this, endW);
        }
        
        String y = "A1";
        String z = "a1";
        
        if(y.equals(z)){
            System.out.println("Sama");
        }else{
            System.out.println("Tidak Sama");
        }
        
        System.out.println("================");
        if(y.equalsIgnoreCase(z)){
            System.out.println("Sama");
        }else{
            System.out.println("Tidak Sama");
        }
        
        int i = jComboBox1.getSelectedIndex();
        switch (i) {
            case Konstan.TAMBAH:
                
                break;
            case Konstan.KURANG:
                
                break;
            case Konstan.KALI:
                
                break;
            case Konstan.BAGI:
                
                break;
            default:
                break;
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame2().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
