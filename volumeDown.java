import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volumeDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volumeDown extends Actor
{
    /**
     * Act - do whatever the volumeDown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
        
        if (Greenfoot.mouseClicked(this))
        {
            int volume = world.getVolumeLevel();
             if (volume >= 3)
            {
                world.setVolumeLevel(volume - 3);
            } 
            if (volume == 1)
            {
                world.setVolumeLevel(volume - 1);
            }
        }// Add your action code here.
    } 
}
