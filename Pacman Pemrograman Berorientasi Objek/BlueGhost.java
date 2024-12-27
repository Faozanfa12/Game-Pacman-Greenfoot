import greenfoot.*;

public class BlueGhost extends Ghost {
    public void act() {
        setLocation(getX(), getY() + speed);
        atWall();
    }

    public void changeDirection() {
        if (direction.equals("down")) {
            direction = "up";
        }
    }

    public void atWall() {
        Actor wall = getOneIntersectingObject(Wall.class);
        if (wall != null) {
            speed = -speed;
            changeDirection();
        }
    }   
}
