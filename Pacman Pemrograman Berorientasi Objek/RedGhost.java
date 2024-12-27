import greenfoot.*;

public class RedGhost extends Ghost {
    public void act() {
        if (direction.equals("right")) {
            setLocation(getX() + speed, getY());
        } else if (direction.equals("left")) {
            setLocation(getX() - speed, getY());
        } 
        checkWall();
    }

    public void changeDirection() {
        if (direction.equals("right")) {
            direction = "left";
        } else if (direction.equals("left")) {
            direction = "right";
        } 
    }

    public void checkWall() {
        Actor wall = getOneIntersectingObject(Wall.class);
        if (wall != null) {
            changeDirection();
        }
    }
}
