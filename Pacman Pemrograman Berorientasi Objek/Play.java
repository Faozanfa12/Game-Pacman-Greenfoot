import greenfoot.*;  

public class Play extends Tombol
{
    public Play() {
        super();
    }

    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.delay(1);
            Greenfoot.setWorld(new MyWorld());
        }
    }
}
