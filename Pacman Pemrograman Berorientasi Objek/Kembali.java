import greenfoot.*;  

public class Kembali extends Tombol
{
    public Kembali() {
        super();
        GreenfootImage image = getImage();
        image.scale(image.getWidth() / 1, image.getHeight() / 1);
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
