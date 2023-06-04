/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Zainab
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class available extends javax.swing.JFrame {

    /**
     * Creates new form available
     */
    Connection conn = null;
    public available() {
        super("Available");
        initComponents();
        conn = databaseconnection.connection();
        showRecord();

    }
    public void showRecord(){
        try{
        Statement stmt = conn.createStatement();
        String sql = "SELECT * FROM pharmacy ";
        ResultSet rs = stmt.executeQuery(sql);
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
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
        medid = new javax.swing.JTextField();
        returnrecords = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        back1 = new javax.swing.JButton();
        billing = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        medid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medidActionPerformed(evt);
            }
        });
        jPanel1.add(medid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 130, 30));

        returnrecords.setBackground(new java.awt.Color(10, 153, 153));
        returnrecords.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        returnrecords.setForeground(new java.awt.Color(255, 255, 255));
        returnrecords.setText("BACK");
        returnrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnrecordsActionPerformed(evt);
            }
        });
        jPanel1.add(returnrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 130, -1, 30));

        search.setBackground(new java.awt.Color(10, 153, 153));
        search.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 130, -1, 30));

        jTable1.setFont(new java.awt.Font("Dialog", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 980, 440));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/availability.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        back1.setText("jButton1");
        back1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back1ActionPerformed(evt);
            }
        });
        jPanel1.add(back1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 650, 180, 40));

        billing.setText("jButton1");
        billing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billingActionPerformed(evt);
            }
        });
        jPanel1.add(billing, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 650, 180, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void medidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medidActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        try{
            String sql = "SELECT * FROM pharmacy ";
            PreparedStatement pstmt = conn.prepareCall(sql);
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel tm= (DefaultTableModel) jTable1.getModel();
            tm.setRowCount(0);
            while(rs.next())
            {
                if(medid.getText().equals(rs.getString("medid"))){
                    Object o[] = {rs.getString("medid"),rs.getString("medname"),rs.getString("medprice"),rs.getString("medquantity"),rs.getString("medmfgdate"),rs.getString("medexpdate")};
                    tm.addRow(o);
                }
                else if(medid.getText().equals(rs.getString("medname"))){
                    Object o[] = {rs.getString("medid"),rs.getString("medname"),rs.getString("medprice"),rs.getString("medquantity"),rs.getString("medmfgdate"),rs.getString("medexpdate")};
                    tm.addRow(o);
                }
            }
              
        }
        catch(NumberFormatException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }
        
    }//GEN-LAST:event_searchActionPerformed

    private void billingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billingActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        billing obj = new billing();
        obj.setVisible(true);
    }//GEN-LAST:event_billingActionPerformed

    private void back1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        pharmacy obj = new pharmacy();
        obj.setVisible(true);
    }//GEN-LAST:event_back1ActionPerformed

    private void returnrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnrecordsActionPerformed
        // TODO add your handling code here:
        medid.setText("");
        showRecord();
    }//GEN-LAST:event_returnrecordsActionPerformed

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
            java.util.logging.Logger.getLogger(available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(available.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new available().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back1;
    private javax.swing.JButton billing;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medid;
    private javax.swing.JButton returnrecords;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
