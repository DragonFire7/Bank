import java.sql.*;

public class Datenbankverbindung
{
    private Connection conn;

    public Datenbankverbindung()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:mysql://172.16.90.247/q11_bank?user=q11_bank&password=q11_bank");
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void benutzerAusgeben()
    {
        try
        {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM benutzer");
            while(rs.next())
            {
                System.out.println("Benutzer " + rs.getInt("id") + ": " + rs.getString("name"));
            }
            rs.close();
            st.close();


        }catch(Exception e)
        {
            e.printStackTrace();
        }


    }

}