package panels;

import DataBase.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class NEW_MEMBERS extends javax.swing.JPanel {

    Connection con = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    DefaultTableModel dm;

    static String setFirstname = "";

    public NEW_MEMBERS() {
        initComponents();

        con = Database.ConnectDB();
    }

    private void update_table() {

        try {
            String sql = "SELECT FirstName, LastName, Start, End FROM Members_Tbl ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));

            pst.close();
            rs.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    

    private void computations() {
        SimpleDateFormat datefmt = new SimpleDateFormat("MM/dd/yyyy");
        String dates = ((JTextField) start.getDateEditor().getUiComponent()).getText();
        Date date = start.getDate();
        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);

        if (month.getSelectedItem().equals("1 month")) {
            cal.add(Calendar.MONTH, 1); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
            cal.add(Calendar.MONTH, 2); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
        } else if (month.getSelectedItem().equals("3 months")) {
            cal.add(Calendar.MONTH, 3); // Add 30 day=
            end.setText("" + datefmt.format(cal.getTime()));
        } else if (month.getSelectedItem().equals("4 months")) {
            cal.add(Calendar.MONTH, 4); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
        } else if (month.getSelectedItem().equals("5 months")) {
            cal.add(Calendar.MONTH, 5); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
        } else if (month.getSelectedItem().equals("6 months")) {
            cal.add(Calendar.MONTH, 6); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
        } else if (month.getSelectedItem().equals("1 year")) {
            cal.add(Calendar.MONTH, 12); // Add 30 days
            end.setText("" + datefmt.format(cal.getTime()));
        }
    }

//    public void clear_operation() {
//        fname.setText("");
//        mname.setText("");
//        lname.setText("");
//        age.setText("");
//        gender.setSelectedIndex(0);
//        contact.setText("");
//        email.setText("");
//        membership.setSelectedIndex(0);
//        date_ch.setCalendar(null);
////        ((JTextField)date_ch.getDateEditor().getUiComponent()).setText("");
//        Expiration.setText("");
//        xmonth.setSelectedIndex(0);
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstnameField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lastnameField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        contactnumberField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        healthconcernField = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        hobbiesField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        currentweightField = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        targetweightField = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        contactpersonField = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel20 = new javax.swing.JLabel();
        start = new com.toedter.calendar.JDateChooser();
        month = new javax.swing.JComboBox();
        end = new javax.swing.JTextField();
        Delete_btn = new javax.swing.JButton();
        UPDATE_BUTTON = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        superadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        search = new javax.swing.JTextField();

        setBackground(new java.awt.Color(204, 204, 204));

        firstnameField1.setBackground(new java.awt.Color(252, 252, 252));
        firstnameField1.setForeground(new java.awt.Color(46, 46, 46));
        firstnameField1.setBorder(null);
        firstnameField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        firstnameField1.setOpaque(false);
        firstnameField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                firstnameField1MouseClicked(evt);
            }
        });

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        lastnameField.setBackground(new java.awt.Color(252, 252, 252));
        lastnameField.setForeground(new java.awt.Color(46, 46, 46));
        lastnameField.setBorder(null);
        lastnameField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lastnameField.setOpaque(false);

        jLabel3.setText("Occupation");

        occupationField.setBackground(new java.awt.Color(252, 252, 252));
        occupationField.setForeground(new java.awt.Color(46, 46, 46));
        occupationField.setBorder(null);
        occupationField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        occupationField.setOpaque(false);

        jLabel4.setText("Address");

        addressField.setBackground(new java.awt.Color(252, 252, 252));
        addressField.setForeground(new java.awt.Color(46, 46, 46));
        addressField.setBorder(null);
        addressField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addressField.setOpaque(false);

        jLabel6.setText("Contact Number");

        contactnumberField.setBackground(new java.awt.Color(252, 252, 252));
        contactnumberField.setForeground(new java.awt.Color(46, 46, 46));
        contactnumberField.setBorder(null);
        contactnumberField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contactnumberField.setOpaque(false);

        jLabel5.setText("Health Concern?");

        healthconcernField.setBackground(new java.awt.Color(252, 252, 252));
        healthconcernField.setForeground(new java.awt.Color(46, 46, 46));
        healthconcernField.setBorder(null);
        healthconcernField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        healthconcernField.setOpaque(false);

        jLabel7.setText("Hobbies");

        hobbiesField.setBackground(new java.awt.Color(252, 252, 252));
        hobbiesField.setForeground(new java.awt.Color(46, 46, 46));
        hobbiesField.setBorder(null);
        hobbiesField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        hobbiesField.setOpaque(false);

        jLabel8.setText("Current Weight");

        currentweightField.setBackground(new java.awt.Color(252, 252, 252));
        currentweightField.setForeground(new java.awt.Color(46, 46, 46));
        currentweightField.setBorder(null);
        currentweightField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        currentweightField.setOpaque(false);

        jLabel16.setText("Target Weight");

        targetweightField.setBackground(new java.awt.Color(252, 252, 252));
        targetweightField.setForeground(new java.awt.Color(46, 46, 46));
        targetweightField.setBorder(null);
        targetweightField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        targetweightField.setOpaque(false);

        contactpersonField.setBackground(new java.awt.Color(252, 252, 252));
        contactpersonField.setForeground(new java.awt.Color(46, 46, 46));
        contactpersonField.setBorder(null);
        contactpersonField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contactpersonField.setOpaque(false);

        jLabel20.setText("Contact Person");

        month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "1 month", "2 months", "3 months", "4 months", "5 months", "6 months", "1 year" }));
        month.setToolTipText("");
        month.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthActionPerformed(evt);
            }
        });

        end.setEditable(false);

        Delete_btn.setBackground(new java.awt.Color(255, 102, 102));
        Delete_btn.setText("Delete");
        Delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Delete_btnActionPerformed(evt);
            }
        });

        UPDATE_BUTTON.setBackground(new java.awt.Color(204, 255, 255));
        UPDATE_BUTTON.setText("Update");
        UPDATE_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATE_BUTTONActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 255));
        jButton1.setText("Clear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        superadd.setBackground(new java.awt.Color(204, 255, 204));
        superadd.setText("Save");
        superadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                superaddActionPerformed(evt);
            }
        });

        table.setAutoCreateRowSorter(true);
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "FirstName", "LastName", "Date", "end"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }

        });
        table.setMinimumSize(new java.awt.Dimension(80, 0));
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(118, 118, 118))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(67, 67, 67)
                                    .addComponent(firstnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(68, 68, 68)
                                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(64, 64, 64)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(79, 79, 79)
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(contactnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(39, 39, 39)
                                    .addComponent(healthconcernField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(80, 80, 80)
                                    .addComponent(hobbiesField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(44, 44, 44)
                                    .addComponent(currentweightField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(49, 49, 49)
                                    .addComponent(targetweightField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel20)
                                    .addGap(44, 44, 44)
                                    .addComponent(contactpersonField, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(118, 118, 118)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UPDATE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(superadd, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1))
                            .addComponent(firstnameField1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4))
                                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(contactnumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel5))
                                    .addComponent(healthconcernField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel7))
                                            .addComponent(hobbiesField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel8))
                                            .addComponent(currentweightField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel16))
                                            .addComponent(targetweightField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addComponent(jLabel20))
                                            .addComponent(contactpersonField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(superadd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(UPDATE_BUTTON, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(36, 36, 36)
                                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(end, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked

        DefaultTableModel model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();

        String tc = table.getModel().getValueAt(row, 0).toString();

        try {
            String sql = "SELECT * FROM Members_Tbl WHERE Firstname = '" + tc + "'";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();

            if (rs.next()) {
                String name = rs.getString("Firstname");
                firstnameField1.setText(name);
                String lastname = rs.getString("Lastname");
                lastnameField.setText(lastname);
                String occupation = rs.getString("Occupation");
                occupationField.setText(occupation);
                String address = rs.getString("Address");
                addressField.setText(address);
                String contactnumber = rs.getString("ContactNumber");
                contactnumberField.setText(contactnumber);
                String healthconcern = rs.getString("Healthconcern");
                healthconcernField.setText(healthconcern);
                String hobbies = rs.getString("Hobbies");
                hobbiesField.setText(hobbies);
                String currentweight = rs.getString("Currentweight");
                currentweightField.setText(currentweight);
                String targetweight = rs.getString("Targetweight");
                targetweightField.setText(targetweight);
                String contactperson = rs.getString("Contactperson");
                contactpersonField.setText(contactperson);
                String mo = rs.getString("Month");
                month.setSelectedItem(mo);
                String date = rs.getString("Start");
                ((JTextField) start.getDateEditor().getUiComponent()).setText(date);
                String ex = rs.getString("End");
                end.setText(ex);

                setFirstname = rs.getString("FirstName");
            }
            pst.close();
            rs.close();
        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
        }
        update_table();
    }//GEN-LAST:event_tableMouseClicked

    private void searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyPressed
        final TableRowSorter rowSorter = new TableRowSorter<>(table.getModel());
        //        rowSorter = new TableRowSorter<>(table.getModel());
        table.setRowSorter(rowSorter);
        search.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e) {
                String text = search.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            public void removeUpdate(DocumentEvent e) {
                String text = search.getText();
                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            public void changedUpdate(DocumentEvent e) {
            }
        });
    }//GEN-LAST:event_searchKeyPressed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased

    }//GEN-LAST:event_searchKeyReleased

    private void Delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Delete_btnActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "Are you sure to Delete this information?", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            String sql = "DELETE FROM Members_Tbl WHERE Firstname = ? ";
            try {
                pst = con.prepareStatement(sql);
                pst.setString(1, firstnameField1.getText());
                pst.execute();
                //                JOptionPane.showMessageDialog(null,"Deleted")

                pst.close();
                rs.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
        update_table();
    }//GEN-LAST:event_Delete_btnActionPerformed

    private void UPDATE_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATE_BUTTONActionPerformed
        String sql = "UPDATE Members_Tbl SET Firstname=?,Lastname= ?, Occupation= ?, Address = ?, ContactNumber= ?, Healthconcern= ?,"
                + "Hobbies = ?, Currentweight= ?, Targetweight= ?, Contactperson= ?, Month= ?, Start= ?, End=? WHERE Firstname=? ";
        try {
            con = Database.ConnectDB();
            PreparedStatement pst = con.prepareStatement(sql);
            //
            pst.setString(1, firstnameField1.getText());
            pst.setString(2, lastnameField.getText());
            pst.setString(3, occupationField.getText());
            pst.setString(4, addressField.getText());
            pst.setString(5, contactnumberField.getText());
            pst.setString(6, healthconcernField.getText());
            pst.setString(7, hobbiesField.getText());
            pst.setString(8, currentweightField.getText());
            pst.setString(9, targetweightField.getText());
            pst.setString(10, contactpersonField.getText());
            pst.setString(11, month.getSelectedItem().toString());
            pst.setString(12, ((JTextField) start.getDateEditor().getUiComponent()).getText());
            pst.setString(13, end.getText());
            pst.setString(14, setFirstname);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "UPDATED!");
            update_table();

            pst.close();
            rs.close();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_UPDATE_BUTTONActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        clear_operation();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void monthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthActionPerformed
        computations();
    }//GEN-LAST:event_monthActionPerformed

    private void superaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_superaddActionPerformed
        if ((firstnameField1.getText().trim().isEmpty())) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (lastnameField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (occupationField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (addressField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (contactnumberField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (healthconcernField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (contactpersonField.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Fill out the important information", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String sql = "INSERT INTO Members_Tbl(Firstname,Lastname,Occupation,Address,ContactNumber,Healthconcern,"
                        + "Hobbies,Currentweight,Targetweight,Contactperson,Month,Start,End)"
                        + "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)";

                pst = con.prepareStatement(sql);
                pst.setString(1, firstnameField1.getText());
                pst.setString(2, lastnameField.getText());
                pst.setString(3, occupationField.getText());
                pst.setString(4, addressField.getText());
                pst.setString(5, contactnumberField.getText());
                pst.setString(6, healthconcernField.getText());
                pst.setString(7, hobbiesField.getText());
                pst.setString(8, currentweightField.getText());
                pst.setString(9, targetweightField.getText());
                pst.setString(10, contactpersonField.getText());

                String hv = month.getSelectedItem().toString();
                pst.setString(11, hv);

                String dt = ((JTextField) start.getDateEditor().getUiComponent()).getText();
                pst.setString(12, dt);
                pst.setString(13, end.getText());

                pst.execute();

                JOptionPane.showMessageDialog(null, "saved");
                pst.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }

        update_table();
    }//GEN-LAST:event_superaddActionPerformed

    private void firstnameField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_firstnameField1MouseClicked
//        DateFormat df = new SimpleDateFormat("MMM-dd-yyyy");
//        Date date = new Date();
//        start.setDate(date);
    }//GEN-LAST:event_firstnameField1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete_btn;
    private javax.swing.JButton UPDATE_BUTTON;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField contactnumberField;
    private javax.swing.JTextField contactpersonField;
    private javax.swing.JTextField currentweightField;
    public javax.swing.JTextField end;
    private javax.swing.JTextField firstnameField1;
    private javax.swing.JTextField healthconcernField;
    private javax.swing.JTextField hobbiesField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JComboBox month;
    private javax.swing.JTextField occupationField;
    private javax.swing.JTextField search;
    private com.toedter.calendar.JDateChooser start;
    private javax.swing.JButton superadd;
    private javax.swing.JTable table;
    private javax.swing.JTextField targetweightField;
    // End of variables declaration//GEN-END:variables
}
