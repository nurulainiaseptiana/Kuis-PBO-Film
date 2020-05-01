//Nurul Ainia Septiana (123180042)

package Kuis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DAO 
{
    private int jmlData;
    private Connection koneksi;
    private Statement statement;
    
    public DAO()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/film";
            koneksi = DriverManager.getConnection(url, "root", "");
            statement = koneksi.createStatement();
        } catch (ClassNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null, "Class Not Found : " + ex);
        } catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(null, "SQL Exception : " + ex);
        }
    }
    
    public void Insert(Model Model)
    {
        try
        {
            String query = "INSERT INTO data_film VALUES (NULL,'"+Model.getJudul()+"',"
                            + "'"+Model.getTipe()+"','"+Model.getEpisode()+"','"+Model.getGenre()+"',"
                            + "'"+Model.getStatus()+"','"+Model.getRating()+"')";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Data disimpan");
        } catch (Exception sql)
        {
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void Update(Model Model) 
    {
        try
        {
            
            String query = "UPDATE data_film SET judul = '"+Model.getJudul()+"', tipe = '"+Model.getTipe()+
                    "', episode = '"+Model.getEpisode()+"', genre = '"+Model.getGenre()+"', status = '"+Model.getStatus()+
                    "', rating = '"+Model.getRating()+"' WHERE id = '"+Model.getID()+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di Update");
        } catch (SQLException sql){
            System.out.println(sql.getMessage());
        }
    }
    
     public void Delete(Model Model)
    {
        try
        {
            String query = "DELETE FROM data_film WHERE id = '"+Model.getID()+"'";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil di Hapus");
        } catch (SQLException sql)
        {
            System.out.println(sql.getMessage());
        }
    }
    
    public String[][] readFilm()
    {
        try
        {
            int jmlData = 0;
            String data[][] = new String[getJmldata()][8];
            
            String query = "SELECT * FROM data_film";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            { 
                data[jmlData][0] = String.valueOf(jmlData+1);
                data[jmlData][1] = resultSet.getString("id");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("tipe");
                data[jmlData][4] = resultSet.getString("episode");
                data[jmlData][5] = resultSet.getString("genre");
                data[jmlData][6] = resultSet.getString("status");
                data[jmlData][7] = resultSet.getString("rating");
                jmlData++; 
            }
            return data;
        } catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getJmldata()
    {
        int jmlData = 0;
        try
        {
            String query = "SELECT * FROM data_film";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public String[][] readSearch(Model Model)
    {
        try
        {
            int jmlData = 0;
            String judul = Model.getSearch();
            String data[][] = new String[getJmlsearch(judul)][8];
            String query = "SELECT * FROM data_film WHERE judul LIKE '%" + Model.getSearch() + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                data[jmlData][0] = String.valueOf(jmlData+1);
                data[jmlData][1] = resultSet.getString("id");
                data[jmlData][2] = resultSet.getString("judul");
                data[jmlData][3] = resultSet.getString("tipe");
                data[jmlData][4] = resultSet.getString("episode");
                data[jmlData][5] = resultSet.getString("genre");
                data[jmlData][6] = resultSet.getString("status");
                data[jmlData][7] = resultSet.getString("rating");
                jmlData++;
            }
            return data;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
        }
    }
    
    public int getJmlsearch(String judul)
    {
        int jmlData = 0;
        try
        {
            String query = "SELECT * FROM data_film WHERE judul LIKE '%" + judul + "%'";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next())
            {
                jmlData++;
            }
            return jmlData;
        } catch (SQLException e)
        {
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
     
}
