
package panels;

import DataBase.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JPanel {

    Connection con= null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    public Register() {
        initComponents();
        con = Database.ConnectDB();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RG_NAME = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        labelpw = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RG_LASTNAME = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        SAVE = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        RG_USERNAME = new javax.swing.JTextField();
        RG_PASSWORD = new javax.swing.JPasswordField();
        RG_CONFIRMPASSWORD = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);

        jLabel17.setText("Name");

        jLabel18.setText("Last Name");

        labelpw.setText("Password");

        jLabel20.setText("Confirm Password");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "User" }));

        SAVE.setText("SAVE");
        SAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAVEActionPerformed(evt);
            }
        });

        jLabel19.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(labelpw)
                    .addComponent(jLabel18)
                    .addComponent(jLabel17))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SAVE, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(RG_NAME)
                    .addComponent(RG_LASTNAME)
                    .addComponent(RG_USERNAME)
                    .addComponent(RG_PASSWORD)
                    .addComponent(RG_CONFIRMPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(438, 438, 438))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(RG_NAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(RG_LASTNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(RG_USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelpw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel20))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(RG_PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RG_CONFIRMPASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(SAVE)
                .addContainerGap(141, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAVEActionPerformed
        String name = RG_NAME.getText();
        String lastname = RG_LASTNAME.getText();
        String username = RG_USERNAME.getText();
        String password = new String(RG_PASSWORD.getPassword());   
        String confirmpassword = new String(RG_CONFIRMPASSWORD.getPassword()); 
        String opt = jComboBox1.getSelectedItem().toString();
      
        
        if((RG_NAME.getText().trim().isEmpty())){
                          JOptionPane.showMessageDialog(null,"Fill out the important information","Error", JOptionPane.ERROR_MESSAGE);
                      }
                 else if(RG_LASTNAME.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(null,"Fill out the important information","Error", JOptionPane.ERROR_MESSAGE);
                      }
                 else if(RG_USERNAME.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(null,"Fill out the important information","Error", JOptionPane.ERROR_MESSAGE);
                      }
                 else if(RG_PASSWORD.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(null,"Fill out the important information","Error", JOptionPane.ERROR_MESSAGE);
                      }
                 else if(RG_CONFIRMPASSWORD.getText().trim().isEmpty()){
                          JOptionPane.showMessageDialog(null,"Fill out the important information","Error", JOptionPane.ERROR_MESSAGE);
                      }
                 else
            
        try{
                pst=con.prepareStatement("INSERT into Login_Tbl(name, lastname, username, password, confirm_password, options) values (?,?,?,?,?,?)");
                
                pst.setString(1, RG_NAME.getText());
                pst.setString(2, RG_LASTNAME.getText());
                pst.setString(3, RG_USERNAME.getText());
                pst.setString(4, password);
                pst.setString(5, confirmpassword);
                pst.setString(6, opt);
                
                if(password.equals(confirmpassword)){
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this,"User Successfully Registered", "success",JOptionPane.INFORMATION_MESSAGE);
//                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(this,"Username & Password did not matched!","User not registered",JOptionPane.ERROR_MESSAGE);
                }
                RG_NAME.setText(null);
                RG_LASTNAME.setText(null);
                RG_USERNAME.setText(null);
                RG_PASSWORD.setText(null);
                RG_CONFIRMPASSWORD.setText(null);
                
            }catch(Exception e){
                e.printStackTrace();         
            }
    }//GEN-LAST:event_SAVEActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField RG_CONFIRMPASSWORD;
    private javax.swing.JTextField RG_LASTNAME;
    private javax.swing.JTextField RG_NAME;
    private javax.swing.JPasswordField RG_PASSWORD;
    private javax.swing.JTextField RG_USERNAME;
    private javax.swing.JButton SAVE;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel labelpw;
    // End of variables declaration//GEN-END:variables

   
}
