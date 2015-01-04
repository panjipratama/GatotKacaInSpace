import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends World
{
    int jrkMeteor = 0;
    int countGatot = 0;
    int score = 0;
    int metKe1 = 225;
    int indexmunculbatu = 2;
    int banyakmeteor3 = 1;
    private boolean GameOver;
    private boolean exp;
    /**
     * Constructor for objects of class Space.
     * 
     */
    public Space()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        setPaintOrder(Meteor.class, GatotKaca.class, GameOver.class);
        
        // buat objek 
        GatotKaca GK = new GatotKaca();
        Score s = new Score();
        //Score s = new Score();
        
        // menaruh ke space(world)
        addObject(GK, 80, getHeight()/2);
        addObject(new hitungMundur(),400,280);
        addObject (s, getWidth()/2,30);
        //addObject (s, getWidth()/2,30);
    }
    
    public void act(){
       if(!GameOver){
        jrkMeteor++;
        if (jrkMeteor %100 == 0){
            buatMeteor();
        }
        
        if (jrkMeteor > metKe1){
           if (countGatot % 100==0){
               score++;
            }
           countGatot++;
        }
    }
   }
   
    private void buatMeteor(){
        int tinggi = Greenfoot.getRandomNumber(50);
            // membuat objek meteor
            Meteor1 m1 = new Meteor1();
            GreenfootImage image = m1.getImage();
            addObject (m1, getWidth(),getHeight()/2-image.getHeight()+tinggi);
            
             Meteor2 m2 = new Meteor2();
            GreenfootImage image1 = m2.getImage();
            addObject (m2, getWidth(),getHeight()/2+image1.getHeight()-tinggi);
            
            meteor3 m3 = new meteor3();
            GreenfootImage image3 = m3.getImage();
            if ( indexmunculbatu == score)
            {
               for(int x = 1; x < banyakmeteor3 ; x++)
               {
                   int tinggi1 = Greenfoot.getRandomNumber(100);
                   addObject (m3, getWidth()+tinggi1,getHeight()/2+image3.getHeight()-tinggi1);
               }
               indexmunculbatu += 1;
             
               banyakmeteor3 += 1 ;
            }
            
        }
     
       public void GameOver()
    {
        GameOver = true;
        removeObjects(getObjects(null)); //Clear the screen
        addObject(new GameOver(score), getWidth()/2, getHeight()/2);//Show the losing screen
        //Greenfoot.stop();
    }
    
}
