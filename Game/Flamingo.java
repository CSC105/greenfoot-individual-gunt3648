import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flamingo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flamingo extends Actor
{
    double dy = 0;
    double g = 0.98;
    
    private GreenfootImage[] images = new GreenfootImage[36];
    private int num = 0;
    
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void addedToWorld(World FlaminWorld) {
      for(int i = 0; i < images.length; i++) {
          images[i] = new GreenfootImage("Flamingo_mini"+(i+1)+".png");
        }
        setImage(images[0]);
    }
    
    public void act() 
    {
        jump();
        
        dy = dy + g;
        
        animateFla();
            
        if(getY() > getWorld().getHeight()) {
            gameOver();
        }
    }
    
    public void jump() {
        if(getY()+dy <= 320)
            setLocation( getX(), (int)(getY() + dy));
        
        if(Greenfoot.isKeyDown("space")== true && onGround() == true) {
            dy = -15;
        }
        
        if(dy > -10 && dy < 0) {
            setRotation(-20);
        }
        
        else if(dy >= 0) {
            setRotation(0);
        }
    }
    
    private boolean onGround() {
        Actor x = getOneObjectAtOffset (0, 45, Ground.class);
        return x != null;
    }
    
    public void animateFla() {
        setImage(images[num]);
        num++;
        if(num >= images.length)
            num = 0;
    }
    
    public void gameOver() {
        GameOver gameOver = new GameOver();
        getWorld().addObject(gameOver, getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }
}
