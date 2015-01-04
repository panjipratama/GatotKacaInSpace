import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    int jrkSkr = 0;
    int countGatot = 0;
    int metKe1 = 225;
    public int score;
    private Color transparent = new Color(0, 0, 0, 0);
    public Score(){
        setKe(0);
        up();
    }
    
    private void setKe(int angka){
        score = 0;
        up();
    }
    
     public void act(){
        jrkSkr++;
         if (jrkSkr > metKe1){
           if (countGatot % 100==0){
               score++;
               up();
            }
           countGatot++;
        }
    }
    
     private void up(){
        GreenfootImage text = new GreenfootImage(""+score,50, Color.YELLOW, transparent);
        
        setImage(text);
    }
    
}
