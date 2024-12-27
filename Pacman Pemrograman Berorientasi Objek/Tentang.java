import greenfoot.*;  

public class Tentang extends Tombol
{
    public Tentang() {
        super();
    }

    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new About());
        }
    }
}
