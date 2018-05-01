import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class playButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class playButton extends Actor
{
    
    //GreenfootSound sound = new GreenfootSound("binarySong.mp3");
    //GreenfootSound sound = ((MyWorld) getWorld()).song;
    
    /**
     * Act - do whatever the playButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
         MyWorld world = (MyWorld)getWorld();
         world.song.play();
         world.removeObject(this);
         world.addObject(new pauseButton(), 200, 230);
        } 
    }
   
   
   
   
    
    
}
