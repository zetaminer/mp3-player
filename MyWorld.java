import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Julia Cook 
 * @version v0.1
 */
public class MyWorld extends World
{
    GreenfootSound song = new GreenfootSound("binarySong.mp3");
    greenfoot.Font font = new greenfoot.Font(true,false,20); 
    GreenfootImage bg = getBackground();
    int volumeLevel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
       
    public MyWorld()
    {    
        // Create a new world with 400x300 cells with a cell size of 1x1 pixels.
        super(400, 300, 1); 
        addObject(new playButton(), 200, 230);
        addObject(new volumeUp(), 320, 230);
        addObject(new volumeDown(), 80, 230);
        bg.setFont(font);
        int startVolume = 25;
        setVolumeLevel(startVolume);
    }
    public void volumeBar()
    {
        bg.setColor(Color.WHITE); //background color
        bg.fillRect(100, 270, 200, 10); 
        bg.setColor(Color.RED);
        bg.fillRect(100, 270, volumeLevel*2, 10); 
    }
    public int getVolumeLevel()
    {   
        return this.volumeLevel;
    }
    public void setVolumeLevel(int volumeLevel)
    {
        eraseVolumeLevel();
        this.volumeLevel = volumeLevel; 
        writeVolumeLevel();
        song.setVolume(volumeLevel);
        volumeBar();
    }
    public void eraseVolumeLevel()
    {
        String stringVolume = String.valueOf(volumeLevel);
        bg.setColor(Color.BLACK);
        bg.drawString(stringVolume,310,281);
    }
    public void writeVolumeLevel()
    {
        String stringVolume = String.valueOf(volumeLevel);
        bg.setColor(Color.RED);
        bg.drawString(stringVolume,310,281);
    }
}
