import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volumeUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volumeUp extends Actor
{
    /**
     * Act - do whatever the volumeUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
        
        if (Greenfoot.mouseClicked(this))
        {
            int volume = world.getVolumeLevel();
            if (volume <= 97)
            {
                world.setVolumeLevel(volume + 3);
            }
            if (volume == 99)
            {
                world.setVolumeLevel(volume + 1);
            }           
        }
    }    
}
