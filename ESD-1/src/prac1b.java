

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class prac1b {
     public static void main(String[] args) {
        Connection con = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(prac1b.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/myUse","root", "");
        } catch (SQLException ex) {
            Logger.getLogger(prac1b.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            statement = con.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM Users" );
            ResultSetMetaData metaData =  resultSet.getMetaData();
            int numberOfColumns = metaData.getColumnCount();

            for (int i = 1; i <= numberOfColumns; i++)   
                System.out.print(metaData.getColumnName(i)+"\t");     
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= numberOfColumns; i++)
                    System.out.print(resultSet.getObject(i)+"\t");
                System.out.println();
            }
        resultSet.close();
        statement.close(); 		
        con.close();                                     
        }
        catch (SQLException s){
            System.out.println("SQL statement is not executed!");
            s.printStackTrace();
        }

    }
}
