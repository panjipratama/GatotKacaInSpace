import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SplashScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SplashScreen extends World
{
    int jrkMeteor = 0;
    boolean canPlay = false;

    
    /**
     * Constructor for objects of class SplashScreen.
     * 
     */
    public SplashScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600,400, 1,false);
        canPlay = false;
        prepare();
        hujanMeteor();
        
    }
    
    public void act()
    {
        jrkMeteor++;
        if (jrkMeteor %150 == 0){
             hujanMeteor();
        }

    }


    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        GreenfootImage jdl = new GreenfootImage("Judul.png");          
        getBackground().drawImage(jdl,-20,-10);
        
        Play p = new Play();
        help h = new help();
        create c = new create();
        
        
        addObject(p, 370,260);
        addObject(h, 315,300);
        addObject(c, 430,300);
    }
    
    private void hujanMeteor(){
            int tinggi = Greenfoot.getRandomNumber(200);
            // membuat objek meteor
            meteor3 hujan = new meteor3();
            GreenfootImage image = hujan.getImage();
            addObject (hujan, getWidth(),getHeight()/2-image.getHeight()-tinggi+10);
        }
}
