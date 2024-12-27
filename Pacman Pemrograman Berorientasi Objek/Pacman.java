import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Pacman extends Actor
{
    private GreenfootImage pacmanimage1 = new GreenfootImage("pacman.png");
    private GreenfootImage pacmanimage2 = new GreenfootImage("pacman2.png");
    private GreenfootImage gameoverimage = new GreenfootImage("gameover.png");
    private GreenfootImage wingameimage = new GreenfootImage("youwin.png");
    private int lives = 5;
    private int score;
    private int pointEaten;
    private int level = 1;
    private boolean gamePaused = false;

    public void act() 
    {
        if (!gamePaused){
        pacmanMove();
        detectGhost();
        detectPortal();
        eatPoint();
        showStatus();
        youWin();
        }
    }
    public void animate()
    {
        if(getImage()==pacmanimage1){
            setImage(pacmanimage2);
        }
        else{
            setImage(pacmanimage1);
        }
    }
    public void pacmanMove()
    {
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+4, getY());
            setRotation(360);
            animate();
            Actor wall = getOneIntersectingObject(Wall.class);
            if (wall !=null)
            {
                setLocation (getX()-4,getY());
            }
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-4, getY());
            setRotation(180);
            animate();
            Actor wall = getOneIntersectingObject(Wall.class);
            if (wall !=null)
            {
                setLocation (getX()+4,getY());
            }
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+4);
            setRotation(90);
            animate();
            Actor wall = getOneIntersectingObject(Wall.class);
            if (wall !=null)
            {
                setLocation (getX(),getY()-4);
            }
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-4);
            setRotation(-90);
            animate();
            Actor wall = getOneIntersectingObject(Wall.class);
            if (wall !=null)
            {
                setLocation (getX(),getY()+4);
            }
        }
    }
    public void detectGhost()
    {
        if(isTouching(Ghost.class)){
            Greenfoot.playSound("hurt03.wav");
            setLocation(28,39);
            removeLife();
        }
    }
    public void detectPortal()
    {
        if(isTouching(Portal.class)){
            level++;
            Greenfoot.playSound("cartoon-yuppie.wav");
            setLocation(28,39);
            MyWorld myworld = (MyWorld)getWorld();
            myworld.increaseLevel();
        }
    }
    public void eatPoint()
    {
        if(isTouching(Point.class)){
            Greenfoot.playSound("nom.wav");
            removeTouching(Point.class);
            increaseScore();
        }
    }
    public void removeLife()
    {
        lives--;
        gameOver();
        showStatus();
    }
    public void youWin()
    {
        if(level > 3){
            setImage(wingameimage);
            Greenfoot.playSound("windah.wav");
            setLocation(422,353);
            setRotation(360);
            gamePaused = true;
        }
    }
    
    public void gameOver()
    {
        if(lives <= 0){
            setImage(gameoverimage);
            setLocation(422,353);
            setRotation(360);
            Greenfoot.playSound("NTnt.wav");
            gamePaused = true;
            removeall();
        }
    }
    
    private void removeall() {
    // Ambil semua objek HorizontalWall dari dunia
    List<HorizontalWall> horizontalWalls = getWorld().getObjects(HorizontalWall.class);
    // Ambil semua objek VerticalWall dari dunia
    List<VerticalWall> verticalWalls = getWorld().getObjects(VerticalWall.class);
    List<Portal> portals = getWorld().getObjects(Portal.class);
    List<Point> points = getWorld().getObjects(Point.class);
    // Ambil semua objek RedGhost dari dunia
    List<RedGhost> redGhosts = getWorld().getObjects(RedGhost.class);
    // Ambil semua objek BlueGhost dari dunia
    List<BlueGhost> blueGhosts = getWorld().getObjects(BlueGhost.class);

    // Hapus semua objek HorizontalWall dari dunia
    for (HorizontalWall horizontalWall : horizontalWalls) {
        getWorld().removeObject(horizontalWall);
    }
    // Hapus semua objek VerticalWall dari dunia
    for (VerticalWall verticalWall : verticalWalls) {
        getWorld().removeObject(verticalWall);
    }
    for (Portal portal : portals) {
        getWorld().removeObject(portal);
    }
    for (Point point : points) {
        getWorld().removeObject(point);
    }
    // Hapus semua objek RedGhost dari dunia
    for (RedGhost redGhost : redGhosts) {
        getWorld().removeObject(redGhost);
    }
    // Hapus semua objek BlueGhost dari dunia
    for (BlueGhost blueGhost : blueGhosts) {
        getWorld().removeObject(blueGhost);
    }
}

    
    public void increaseScore()
    {
        score+=10;
        showStatus();
    }
    
    public void showStatus()
    {
        getWorld().showText("Level  : "+level, 60, 510);
        getWorld().showText("Lives  : "+lives, 60, 540);
        getWorld().showText("Score : "+score, 60, 570);
    }
    
    public void resumeGame(){
        gamePaused = false;
    }
}
