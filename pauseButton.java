import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pauseButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pauseButton extends Actor
{
    /**
     * Act - do whatever the pauseButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
        {
             MyWorld world = (MyWorld)getWorld();
             world.song.pause();
             world.removeObject(this);
             world.addObject(new playButton(), 200, 230);
        }
    }
}
