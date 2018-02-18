import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlaminWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlaminWorld extends World
{

    /**
     * Constructor for objects of class FlaminWorld.
     * 
     */
    public FlaminWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        //Create obj
        Flamingo fla = new Flamingo();
        
        //Add Flamingo to world
        addObject(fla, 100, getHeight()/2);
    }
}
