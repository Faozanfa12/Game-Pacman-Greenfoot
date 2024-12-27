import greenfoot.*;  

public class Tombol extends Actor
{
    public Tombol() {
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 3, image.getHeight() / 3); 
        setImage(image);
    }
    
    public void act() {
        if (Greenfoot.mousePressed(this)) {
            int newWidth = (int)Math.round(getImage().getWidth() * 0.9);
            int newHeight = (int)Math.round(getImage().getHeight() * 0.9);
            getImage().scale(newWidth, newHeight);
        }
    }
}
