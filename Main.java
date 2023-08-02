import java.sql.*;

public class Main{
    public static void main(String args[]){
        String url="jdbc:mysql//localhost:3306/jdbs";
        String username = "root";
        String password = "";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url,username,password) ;
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery("desc tes;");
            while (resultset.next()){
                System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getString(3));
            }
            connection.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}
