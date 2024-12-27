import greenfoot.*;

public class MyWorld extends World
{
    int currentLevel = 1;
    private GreenfootImage youwinimage = new GreenfootImage("gameover.png");
    public MyWorld()
    {    
        super(800, 600, 1);
        prepare();
    }

    private void prepare()
    {
       Pacman pacman = new Pacman();
       addObject(pacman,38,38);
       HorizontalWall horizontalWall = new HorizontalWall();
       addObject(horizontalWall,110,101);
       HorizontalWall horizontalWall2 = new HorizontalWall();
       addObject(horizontalWall2,444,597);
       HorizontalWall horizontalWall3 = new HorizontalWall();
       addObject(horizontalWall3,462,13);
       HorizontalWall horizontalWall4 = new HorizontalWall();
       addObject(horizontalWall4,687,13);
       HorizontalWall horizontalWall5 = new HorizontalWall();
       addObject(horizontalWall5,264,240);
       HorizontalWall horizontalWall6 = new HorizontalWall();
       addObject(horizontalWall6,234,597);
       HorizontalWall horizontalWall7 = new HorizontalWall();
       addObject(horizontalWall7,626,597);
       HorizontalWall horizontalWall8 = new HorizontalWall();
       addObject(horizontalWall8,13,474);
       VerticalWall verticalWall = new VerticalWall();
       addObject(verticalWall,550,320);
       VerticalWall verticalWall2 = new VerticalWall();
       addObject(verticalWall2,363,135);
       VerticalWall verticalWall3 = new VerticalWall();
       addObject(verticalWall3,135,573);
       VerticalWall verticalWall4 = new VerticalWall();
       addObject(verticalWall4,790,430);
       VerticalWall verticalWall5 = new VerticalWall();
       addObject(verticalWall5,790,320);
       VerticalWall verticalWall6 = new VerticalWall();
       addObject(verticalWall6,550,500);
       Point point = new Point();
       addObject(point,300,109);
       Point point2 = new Point();
       addObject(point2,519,109);
       Point point3 = new Point();
       addObject(point3,690,109);
       Point point4 = new Point();
       addObject(point4,105,224);
       Point point5 = new Point();
       addObject(point5,372,528);
       Point point6 = new Point();
       addObject(point6,680,331);
       Point point7 = new Point();
       addObject(point7,486,356);
       Point point8 = new Point();
       addObject(point8,680,528);
       Point point9 = new Point();
       addObject(point9,105,361);
       Point point10 = new Point();
       addObject(point10,345,356);
       RedGhost redGhost = new RedGhost();
       addObject(redGhost,650,240);
       BlueGhost blueGhost = new BlueGhost();
       addObject(blueGhost,171,298);
       addObject(new BlueGhost(),500,358);
       Scorepanel scorepanel = new Scorepanel();
       addObject(scorepanel, 60, 540);
       Portal portal = new Portal();
       addObject(portal,769,569);
       Keluar keluar = new Keluar();
       addObject(keluar,60,475);
    }

    public void setUpLevel()
    {
        removeObjects(getObjects(HorizontalWall.class));
        removeObjects(getObjects(VerticalWall.class));
        removeObjects(getObjects(Point.class));
        removeObjects(getObjects(RedGhost.class));
        removeObjects(getObjects(BlueGhost.class));
        removeObjects(getObjects(Keluar.class));
        
        if(currentLevel == 2){ 
            HorizontalWall horizontalWall = new HorizontalWall();
            addObject(horizontalWall,110,200);
            HorizontalWall horizontalWall1 = new HorizontalWall();
            addObject(horizontalWall1,230,200);
            HorizontalWall horizontalWall2 = new HorizontalWall();
            addObject(horizontalWall2,688,212);
            HorizontalWall horizontalWall3 = new HorizontalWall();
            addObject(horizontalWall3,444,597);
            HorizontalWall horizontalWall4 = new HorizontalWall();
            addObject(horizontalWall4,462,13);
            HorizontalWall horizontalWall5 = new HorizontalWall();
            addObject(horizontalWall5,687,13);
            HorizontalWall horizontalWall6 = new HorizontalWall();
            addObject(horizontalWall6,463,430);
            HorizontalWall horizontalWall7 = new HorizontalWall();
            addObject(horizontalWall7,343,430);
            HorizontalWall horizontalWall8 = new HorizontalWall();
            addObject(horizontalWall8,234,597);
            HorizontalWall horizontalWall9 = new HorizontalWall();
            addObject(horizontalWall9,626,597);
            HorizontalWall horizontalWall10 = new HorizontalWall();
            addObject(horizontalWall10,13,474);
            VerticalWall verticalWall = new VerticalWall();
            addObject(verticalWall,589,331);
            VerticalWall verticalWall2 = new VerticalWall();
            addObject(verticalWall2,110,5);
            VerticalWall verticalWall3 = new VerticalWall();
            addObject(verticalWall3,335,230);
            VerticalWall verticalWall4 = new VerticalWall();
            addObject(verticalWall4,135,573);
            VerticalWall verticalWall5 = new VerticalWall();
            addObject(verticalWall5,790,430);
            VerticalWall verticalWall6 = new VerticalWall();
            addObject(verticalWall6,790,320);
            Point point = new Point();
            addObject(point,230,109);
            Point point2 = new Point();
            addObject(point2,519,109);
            Point point3 = new Point();
            addObject(point3,690,109);
            Point point4 = new Point();
            addObject(point4,105,300);
            Point point5 = new Point();
            addObject(point5,372,528);
            Point point6 = new Point();
            addObject(point6,486,380);
            Point point7 = new Point();
            addObject(point7,631,528);
            Point point8 = new Point();
            addObject(point8,105,361);
            Point point9 = new Point();
            addObject(point9,345,380);
            RedGhost redGhost = new RedGhost();
            addObject(redGhost,510,280);
            BlueGhost blueGhost = new BlueGhost();
            addObject(blueGhost,171,298);
            addObject(new BlueGhost(),680,358);
            Keluar keluar = new Keluar();
            addObject(keluar,60,475);
        } else if(currentLevel == 3){
            HorizontalWall horizontalWall = new HorizontalWall();
            addObject(horizontalWall,110,101);
            HorizontalWall horizontalWall2 = new HorizontalWall();
            addObject(horizontalWall2,688,212);
            HorizontalWall horizontalWall3 = new HorizontalWall();
            addObject(horizontalWall3,444,597);
            HorizontalWall horizontalWall4 = new HorizontalWall();
            addObject(horizontalWall4,462,13);
            HorizontalWall horizontalWall5 = new HorizontalWall();
            addObject(horizontalWall5,687,13);
            HorizontalWall horizontalWall6 = new HorizontalWall();
            addObject(horizontalWall6,463,430);
            HorizontalWall horizontalWall7 = new HorizontalWall();
            addObject(horizontalWall7,343,223);
            HorizontalWall horizontalWall8 = new HorizontalWall();
            addObject(horizontalWall8,234,597);
            HorizontalWall horizontalWall9 = new HorizontalWall();
            addObject(horizontalWall9,626,597);
            HorizontalWall horizontalWall10 = new HorizontalWall();
            addObject(horizontalWall10,13,474);
            VerticalWall verticalWall = new VerticalWall();
            addObject(verticalWall,589,331);
            VerticalWall verticalWall2 = new VerticalWall();
            addObject(verticalWall2,239,322);
            VerticalWall verticalWall3 = new VerticalWall();
            addObject(verticalWall3,135,573);
            VerticalWall verticalWall4 = new VerticalWall();
            addObject(verticalWall4,790,430);
            VerticalWall verticalWall5 = new VerticalWall();
            addObject(verticalWall5,790,320);
            Point point = new Point();
            addObject(point,320,109);
            Point point2 = new Point();
            addObject(point2,519,109);
            Point point3 = new Point();
            addObject(point3,690,109);
            Point point4 = new Point();
            addObject(point4,105,224);
            Point point5 = new Point();
            addObject(point5,372,528);
            Point point6 = new Point();
            addObject(point6,486,356);
            Point point7 = new Point();
            addObject(point7,631,528);
            Point point8 = new Point();
            addObject(point8,105,361);
            Point point9 = new Point();
            addObject(point9,345,356);
            RedGhost redGhost = new RedGhost();
            addObject(redGhost,510,280);
            BlueGhost blueGhost = new BlueGhost();
            addObject(blueGhost,171,298);
            addObject(new BlueGhost(),680,358);
            addObject(new RedGhost(),294,480);
            Keluar keluar = new Keluar();
            addObject(keluar,60,475);
        }
        Keluar keluar = new Keluar();
        addObject(keluar,60,475);
    }

    public void increaseLevel(){
        currentLevel++;
        setUpLevel();
    }
}
