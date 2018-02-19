import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    private void prepare()
    {
        startButton button = new startButton();
        addObject(button, 300, 200);
        GreenfootImage image = button.getImage();
        image.scale(image.getWidth() - 300, image.getHeight() - 300);
        button.setImage(image);
        return;
    }
}
