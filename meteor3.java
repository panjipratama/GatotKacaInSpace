import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class meteor3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class meteor3 extends Meteor
{
    private boolean exp;
    private GreenfootSound ex = new GreenfootSound("meteor.mp3");
    /**
     * Act - do whatever the meteor3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.getMetC();
        setLocation(getX() + metC, getY());
        turn(Greenfoot.getRandomNumber(360)/7);
        
        if(isTouching(sembur.class)){
        ex.play();
        getWorld().removeObject(this);
    }
    }    
}
