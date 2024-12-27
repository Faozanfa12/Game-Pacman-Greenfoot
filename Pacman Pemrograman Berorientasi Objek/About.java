import greenfoot.*;  

public class About extends World
{
    public About()
    {    
        super(800, 600, 1); 
        tampilan();
    }
    public void tampilan(){
        Kembali kembali = new Kembali();
        addObject(kembali,730,570);
    }
}