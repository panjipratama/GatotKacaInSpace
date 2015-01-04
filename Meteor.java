import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meteor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meteor extends Actor
{
    public int metC ;
    /**
     * Act - do whatever the Meteor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Meteor()
    {
        metC = -4;
    }
    public void act() 
    {
        // Add your action code here.
    }    
    
    public void setMetC(int metC)
    {
        this.metC=metC;
    }
    
    public int getMetC()
    {
        return metC;
    }
}
