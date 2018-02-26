import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score=0;
    
    public ScoreBoard(String a){
        GreenfootImage board = new GreenfootImage(a +score / 10,20,Color.BLACK, Color.WHITE);
        setImage(board);
    }
    
    public void act() 
    {
        
    }   
    
}
