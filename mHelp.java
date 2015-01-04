import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mHelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mHelp extends World
{
    int jrkMeteor = 0;
    /**
     * Constructor for objects of class mHelp.
     * 
     */
    public mHelp()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        GreenfootImage jdl = new GreenfootImage("Menu Help.png");          
        getBackground().drawImage(jdl,-20,-10);
        
        back b = new back();
        addObject(b, 500,300);
        hujanMeteor();
    }
    
     public void act()
    {
        jrkMeteor++;
        if (jrkMeteor %150 == 0){
             hujanMeteor();
        }
       
    }
    
     private void hujanMeteor(){
            int tinggi = Greenfoot.getRandomNumber(200);
            // membuat objek meteor
            meteor3 hujan = new meteor3();
            GreenfootImage image = hujan.getImage();
            addObject (hujan, getWidth(),getHeight()/2-image.getHeight()-tinggi+10);
        }
}
