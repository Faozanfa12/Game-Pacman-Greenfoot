import greenfoot.*;  

public class Homepage extends World
{
    public Homepage()
    {    
        super(800, 600, 1); 
        tampilan();
    }
    public void tampilan(){
        Play play = new Play();
        addObject(play,400,350);
        Tentang tentang = new Tentang();
        addObject(tentang,400,450);
    }
}