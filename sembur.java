import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sembur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sembur extends Actor
{
    /**
     * Act - do whatever the sembur wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(90);
        if((isTouching(meteor3.class)) ||(isAtEdge()))
        {
            if(isTouching(meteor3.class))
            {
              getWorld().removeObject(this);
            }
        }
    }   
}
