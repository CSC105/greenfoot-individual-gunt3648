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
    GreenfootSound theme = new GreenfootSound("soundtrack.mp3");
    
    public FlaminWorld()
    {    
        // Create a new world with 600x400 cells w ith a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        setPaintOrder(GameOver.class, Flamingo.class, Stone.class, Ground.class);
        
        Ground gro = new Ground();
        addObject(gro, 300, 380);
        
        Flamingo fla = new Flamingo();
        addObject(fla, 100, 315);
        
        ScoreBoard score = new ScoreBoard("Score : ");
        addObject(score, 50, 50);
        
        theme.playLoop();
   }
   
   int spawnStone = 20000, count = 0;
   
   public void act() {
        if((count += (1+Greenfoot.getRandomNumber(950))) >= spawnStone){
            Stone stupid_stone = new Stone();
            addObject(stupid_stone, 750, 345);
            count = 0;
        }
        
        ScoreBoard board = new ScoreBoard("Score : ");
        addObject(board, 50, 50);
    }
    
}
 