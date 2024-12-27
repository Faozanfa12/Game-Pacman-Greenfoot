import greenfoot.*;  

public class Point extends Actor
{
    public Point() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 8, image.getHeight() / 8);  
        setImage(image);
    }
    public void act() 
    {

    }    
}
