import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class create here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class create extends Button
{
    /**
     * Act - do whatever the create wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            select.play();
            mCreadit bw = new mCreadit();
            Greenfoot.setWorld((World)bw);
        }
    }    
}
