
package panels;

import DataBase.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Members extends javax.swing.JPanel {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultTableModel dm;
  
    public Members() {
        initComponents();
        con = Database.ConnectDB();
        members_table_update();
    }
    
    public void members_table_update() {

        try {
            String sql = "SELECT Firstname, Lastname FROM Members_Tbl ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            MEMBERS_TABLE.setModel(DbUtils.resultSetToTableModel(rs));
            
             pst.close();
             rs.close();
        } catch (Exception e) {
          
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    private void renew(){
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MEMBERS_TABLE = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        userid = new javax.swing.JTextField();
        endfield = new javax.swing.JTextField();

        setBackground(new java.awt.Color(92, 92, 92));
        setPreferredSize(new java.awt.Dimension(1105, 567));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Members");

        MEMBERS_TABLE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Start", "End"
            }
        ));
        MEMBERS_TABLE.setToolTipText("");
        MEMBERS_TABLE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MEMBERS_TABLEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MEMBERS_TABLE);

        jButton1.setText("RENEW");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("DELETE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(endfield, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(281, 281, 281))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(userid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(endfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(42, 42, 42)
                        .addComponent(jButton2)))
                .addContainerGap(389, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MEMBERS_TABLEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MEMBERS_TABLEMouseClicked
       DefaultTableModel model = (DefaultTableModel) MEMBERS_TABLE.getModel();
        int row = MEMBERS_TABLE.getSelectedRow();
        
         String tc = MEMBERS_TABLE.getModel().getValueAt(row, 0).toString();
        try {
            String sql = "SELECT * FROM Members_Tbl WHERE Firstname = '" + tc + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                String uid = rs.getString("id");
                userid.setText(uid);
                String ends = rs.getString("End");
                endfield.setText(ends);
        

            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        members_table_update();        
    }//GEN-LAST:event_MEMBERS_TABLEMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MEMBERS_TABLE;
    private javax.swing.JTextField endfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField userid;
    // End of variables declaration//GEN-END:variables
}
