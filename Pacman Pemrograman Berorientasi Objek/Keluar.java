import greenfoot.*;  

public class Keluar extends Tombol
{
    public Keluar() {
        super();
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 2, image.getHeight() / 2);
        setImage(image);
    }

    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new Homepage());
        }
    }
}
