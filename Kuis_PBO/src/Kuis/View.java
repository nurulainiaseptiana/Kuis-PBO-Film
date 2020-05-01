//Nurul Ainia Septiana (123180042)

package Kuis;

import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class View extends JFrame
{
    JLabel ljudul,ltipe,lepisode,lgenre,lstatus,lrating;
    JTextField isijudul,isitipe,isiepisode,isigenre,isirating,cari;
    JComboBox isistatus;
    JButton refresh,create,update,delete,search,exit;
    JTable tabel;
    DefaultTableModel tableModel;
    JScrollPane scrollPane;
    Object namaKolom[] = {"#", "ID", "Judul", "Tipe", "Episode","Genre","Status","Rating"};
    Statement statement;
    
    public View()
    {
        tableModel = new DefaultTableModel(namaKolom,0);
        tabel = new JTable(tableModel);
        scrollPane = new JScrollPane(tabel);
        
        ljudul = new JLabel("Judul");
        ltipe = new JLabel("Tipe");  
        lepisode = new JLabel("Episode");
        lgenre= new JLabel("Genre");
        lstatus = new JLabel("Status");  
        lrating = new JLabel("Rating");

        isijudul = new JTextField("");
        isitipe = new JTextField("");
        isiepisode = new JTextField("");
        isigenre = new JTextField("");
        isirating = new JTextField("");
        cari = new JTextField("");
        
        String[] nama_status = {"Selesai", "Belum" };
        isistatus = new JComboBox(nama_status);
        
        refresh = new JButton("Refresh");
        create = new JButton("Create");
        update = new JButton("Update");
        delete = new JButton("Delete");
        search = new JButton("Search");
        exit = new JButton("Exit");
        
        setLayout(null);
        add(ljudul);
        add(ltipe);
        add(lepisode);
        add(lgenre);
        add(lstatus);
        add(lrating);
        add(isijudul);
        add(isitipe);
        add(isiepisode);
        add(isigenre);
        add(isirating);
        add(isistatus);
        add(cari);
        add(refresh);
        add(create);
        add(update);
        add(delete);
        add(search);
        add(exit);
        add(scrollPane);
        
        scrollPane.setBounds(50, 40, 900, 300);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        ljudul.setBounds(50, 360, 50, 30);
        isijudul.setBounds(50, 390, 350, 30);
        ltipe.setBounds(50, 430, 50, 30);
        isitipe.setBounds(50, 460, 150, 30);
        lepisode.setBounds(50, 500, 50, 30);
        isiepisode.setBounds(50, 530, 150, 30);
        cari.setBounds(500, 390, 200, 30);
        search.setBounds(750, 390, 80, 30);
        lstatus.setBounds(250, 430, 50, 30);
        isistatus.setBounds(250, 460, 150, 30);
        lrating.setBounds(250, 500, 50, 30);
        isirating.setBounds(250, 530, 150, 30);
        lgenre.setBounds(50, 570, 50, 30);
        isigenre.setBounds(50, 600, 350, 30);
        refresh.setBounds(450, 600, 80, 30);
        create.setBounds(550, 600, 80, 30);
        update.setBounds(650, 600, 80, 30);
        delete.setBounds(750, 600, 80, 30);
        exit.setBounds(850, 600, 80, 30);
        
        setSize(1000,700); 
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public String getJudul()
    {
        return isijudul.getText();
    }
    
    public String getTipe()
    {
        return isitipe.getText();
    }
    
    public String getEpisode()
    {
        return isiepisode.getText();
    }
    
    public String getGenre()
    {
        return isigenre.getText();
    }
    
    public String getStatus()
    {
        return isistatus.getSelectedItem().toString();
    }
    
    public String getRating()
    {
        return isirating.getText();
    }
    
    public String getSearch()
    {
        return cari.getText();
    }
    
}
