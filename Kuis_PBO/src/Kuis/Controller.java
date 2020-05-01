//Nurul Ainia Septiana (123180042)

package Kuis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controller 
{
    Model model;
    View view;
    DAO dao;
    static String data,id,judul, tipe, status, episode, genre, rating;
    
    public Controller(Model model, View view, DAO dao)
    {
        this.model = model;
        this.view = view;
        this.dao = dao;
         
        String dataFilm[][] = dao.readFilm();
        view.tabel.setModel((new JTable(dataFilm, view.namaKolom)).getModel());
        
        view.create.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String judul = view.getJudul();
                String tipe = view.getTipe();
                String episode = view.getEpisode();
                String genre = view.getGenre();
                String status = view.getStatus();
                String rating = view.getRating();
                
                if(judul.isEmpty() || tipe.isEmpty() || episode.isEmpty() || genre.isEmpty() || status.isEmpty() || rating.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } 
                else 
                {
                    model.setModel(judul, tipe,episode,genre,status,rating);
                    dao.Insert(model);
                }
            }
        });
        
        view.refresh.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String dataFilm[][] = dao.readFilm();
                view.tabel.setModel((new JTable (dataFilm, view.namaKolom)).getModel());

                view.isijudul.setText(null);
                view.isitipe.setText(null);
                view.isistatus.setSelectedItem(null);
                view.isiepisode.setText(null);
                view.isirating.setText(null);
                view.isigenre.setText(null);
                view.cari.setText(null);
            }
        });
        
        view.tabel.addMouseListener(new MouseAdapter()
        {
           @Override
            public void mouseClicked(MouseEvent e) 
            {
                super.mouseClicked(e);
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();

                id = view.tabel.getValueAt(baris,1).toString();
                judul = view.tabel.getValueAt(baris,2).toString();
                tipe = view.tabel.getValueAt(baris,3).toString();
                episode = view.tabel.getValueAt(baris,4).toString();
                genre = view.tabel.getValueAt(baris,5).toString();
                status = view.tabel.getValueAt(baris,6).toString();
                rating = view.tabel.getValueAt(baris,7).toString();
                
                view.isijudul.setText(judul);
                view.isitipe.setText(tipe);
                view.isistatus.setSelectedItem(status);
                view.isiepisode.setText(episode);
                view.isirating.setText(rating);
                view.isigenre.setText(genre);
                
                data = view.tabel.getValueAt(baris,1).toString();
                view.delete.setEnabled(true);
            }
        });
        
        view.update.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            { 
                
                String judul = view.getJudul();
                String tipe = view.getTipe();
                String status = view.getStatus();
                String episode = view.getEpisode();
                String rating = view.getRating();
                String genre = view.getGenre();
                
                if(judul.isEmpty() || tipe.isEmpty() || status.isEmpty() || episode.isEmpty() || rating.isEmpty() || genre.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Harap isi semua field");
                } 
                else 
                {    
                    model.setID(id);
                    model.setModel(judul, tipe, episode , genre, status, rating);
                    dao.Update(model);
                    
                    String dataFilm[][] = dao.readFilm();
                    view.tabel.setModel((new JTable (dataFilm,view.namaKolom)).getModel());
                }
            }
        });
        
        view.delete.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e){
                
                int input = JOptionPane.showConfirmDialog(null, "Anda yakin ingin menghapus data ini?","Delete Contact",JOptionPane.YES_NO_OPTION);

                if (input == 0)
                {
                    model.setID(data);
                    dao.Delete(model);
                }
            }
        });
        
        view.search.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String search = view.getSearch();

                if (search.isEmpty())
                {
                    JOptionPane.showMessageDialog(null, "Maaf Judul yang Anda Cari Tidak Tersedia");
                }
                else 
                {
                    model.setSearch(search);

                    String dataFilm[][] = dao.readSearch(model);
                    view.tabel.setModel((new JTable(dataFilm, view.namaKolom)).getModel());
                }
            }
        });
        
        view.exit.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
                new login();
            }
        });
        
    }
     
   
        
}
