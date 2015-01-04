import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    private Color transparent = new Color(0, 0, 0, 0);
    public GreenfootSound gm = new GreenfootSound("gm.mp3");
        /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public GameOver(int score)
    {
        gm.play();
        
        GreenfootImage img = new GreenfootImage(600, 400);
        img.setColor(new Color(0, 0, 0, 192));
        img.fill();
        
        
        GreenfootImage pg = new GreenfootImage("play again.png"); 
        GreenfootImage text = new GreenfootImage(" "+score, 53, Color.YELLOW, transparent); //The score you just got
        GreenfootImage text1 = new GreenfootImage(" " + getBest(score), 53, Color.YELLOW, transparent); //Your best score for this difficulty

        //Add all the texts to the screen
        img.drawImage(new GreenfootImage("play again.png"),190, 340);
        img.drawImage(text, 310, 245);
        img.drawImage(new GreenfootImage("GameOver.png"), 67, 50);
        img.drawImage(text1, 350, 288);
        setImage(img);
    }
      
    private int getBest(int score)
    {
        UserInfo ui = UserInfo.getMyInfo();
        if(ui != null)
        {
            int current = 0;
            current = ui.getInt(1);
        
            if(score > current) //If you have a new high score,
            {
                ui.setInt(1,score);
               
                ui.store();
                return score;
            }
            else return current;
            
        }
        else return 0;
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new Space());
        }
    }    
}
