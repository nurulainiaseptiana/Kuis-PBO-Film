//Nurul Ainia Septiana (123180042)

package Kuis;

public class Model 
{
    private String id,judul,tipe,status,episode,rating,genre,search;
    
    public void setModel(String njudul, String ntipe,  String nepisode,String ngenre, String nstatus, String nrating)
    {
        this.judul= njudul;
        this.tipe= ntipe;
        this.status = nstatus;
        this.episode= nepisode;
        this.rating= nrating;
        this.genre= ngenre;
    }
    
    public String getID()
    {
        return id;
    }
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public String getJudul()
    {
        return judul;
    }
    
    public void setJudul(String judul)
    {
        this.judul = judul;
    }
    
    public String getTipe()
    {
        return tipe;
    }
    
    public void setTipe(String tipe)
    {
        this.tipe = tipe;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String status)
    {
        this.status = status;
    }
    
    public String getEpisode()
    {
        return episode;
    }
    
    public void setEpisode(String episode)
    {
        this.episode = episode;
    }
    
    public String getRating()
    {
        return rating;
    }
    
    public void setRating(String rating)
    {
        this.rating = rating;
    }
    
    public String getGenre()
    {
        return genre;
    }
    
    public void setGenre(String genre)
    {
        this.genre = genre;
    }
    
    public String getSearch()
    {
        return search;
    }
    
    public void setSearch(String search)
    {
        this.search = search;
    }
    
}
