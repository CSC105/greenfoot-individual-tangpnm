import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dd extends World
{
    int ran;
    int rand;
    int temp = 0;
    /**
     * Constructor for objects of class dd.
     * 
     */
    public dd()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Flamingo Flamingo1 = new Flamingo();
        addObject(Flamingo1, 300, 300);
      
    }
    public void act() 
    {
        if(temp%50 == 0){
            ran = Greenfoot.getRandomNumber(11);
            rand = Greenfoot.getRandomNumber(100);
            if(ran%2 == 0){
                addObject(new shinchan2(), 0, 300);
            }
            if(rand%5 == 0){
                addObject(new bomb(), 600, 300);
            }
        }
        temp++;
    }
}
