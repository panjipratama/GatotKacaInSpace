import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GatotKaca here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GatotKaca extends Actor
{
    
    double nt = 0;
    double t = 0.5;
    double na = -6;
    private Space w;
    private GreenfootSound fire = new GreenfootSound("fire.mp3");
    /**
     * Act - do whatever the GatotKaca wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void addedToWorld(World world)
    {
        w = (Space) world; //Set the reference to the world
    }
    
    public void act() 
    {
        try {
        
            // jika terkena meteor, game over
            if (getOneIntersectingObject(Meteor.class) != null ){
                //GameeOverr();
                w.GameOver();
            }
            // double di convert jadi int 
            setLocation(getX(),(int)(getY()+nt));
            
            // jika tekan spasi gatotkaca naik
            if (Greenfoot.isKeyDown("space") || Greenfoot.mouseClicked(null) == true){
                nt = na;
            }
            
            // jika gatotkaca jatuh dan keluar space maka gameover
            if ( getY() > getWorld().getHeight()){
                //GameeOverr();
                w.GameOver();
            }
            
            //semburan gatot kaca
            if(Greenfoot.isKeyDown("space")){
                fire.play();
                getWorld().addObject(new sembur(),getX(),getY());
                //Greenfoot.playSound("");
            }
            
            if(isAtEdge()){
                w.GameOver();
            }
                
            
            nt = nt + t;
        }catch (Exception e)
        {
            w.GameOver();
        }
    }  
   
   /* private void GameeOverr(){
        GameOver go = new GameOver();          
        getWorld().addObject(go,getWorld().getWidth()/2, getWorld().getHeight()/2);
        Greenfoot.stop();
    }*/
}
