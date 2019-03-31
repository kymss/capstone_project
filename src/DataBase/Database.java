
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class Database {
    
    static Connection con = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection con =DriverManager.getConnection("jdbc:sqlite:C:\\Users\\User1\\Documents\\NetBeansProjects\\FitnessCampSystem\\Database.db");
//            JOptionPane.showMessageDialog(null,"Connection Established!");
            System.out.println("success");
            return con;
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
                    return null; 
        }
}
    
    public static Connection getConn(){
    return con;
}    
    
    void UpdateRenewl(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
