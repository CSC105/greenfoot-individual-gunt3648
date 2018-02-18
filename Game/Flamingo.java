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
    double g = 1.3;
    
    /**
     * Act - do whatever the Flamingo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation( getX(), (int)(getY() + dy));
        
        if(Greenfoot.isKeyDown("space")== true) {
            dy = -15;
        }
        dy = dy + g;
        
    }    
}
