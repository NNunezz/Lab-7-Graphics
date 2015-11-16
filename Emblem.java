import java.awt.*;
import java.applet.*;

class Emblem
{
    public static void drawShield(Graphics g) 
    {
        Expo.setColor(g,Expo.silver);// The Swords
        Expo.fillPolygon(g,725,125,350,475,250,575,350,500,738,138);//Right Sword
        Expo.fillPolygon(g,275,125,650,475,750,575,650,500,263,138);//Left Sword
        Expo.setColor(g,Expo.darkGray);
        Expo.fillPolygon(g,238,138,250,150,288,113,275,100);//Guard Left one
        Expo.fillPolygon(g,763,138,750,150,713,113,725,100);//Guard Right One
        Expo.setColor(g,Expo.brown);
        Expo.fillPolygon(g,263,113,250,125,225,100,238,88);//Left Hilt
        Expo.fillPolygon(g,738,113,750,125,775,100,763,88);//Right Hilt
        Expo.setColor(g,Expo.white);
        Expo.fillCircle(g,225,88,11);//Left Gem holder
        Expo.fillCircle(g,775,88,11);// Right Gem holder
        Expo.setColor(g,Expo.gold);
        Expo.fillCircle(g,225,88,9);//Left Gem
        Expo.fillCircle(g,775,88,9);// Right Gem
        Expo.setColor(g,Expo.white);// The trim of Shield
        Expo.fillRectangle(g,345,145,655,505);
        Expo.fillArc(g,500,500,155,155,90,270);
        Expo.setColor(g,Expo.teal);// The Shield
        Expo.fillRectangle(g,350,150,650,500);
        Expo.fillArc(g,500,500,150,150,90,270);
        Expo.setColor(g,Expo.white);// The trim of inner
        Expo.fillRectangle(g,370,170,630,555);
        Expo.fillArc(g,500,500,130,130,90,270);
        Expo.setColor(g,Expo.cyan);// The inner Shield
        Expo.fillRectangle(g,375,175,625,550);
        Expo.fillArc(g,500,500,125,125,90,270);
        
    }
}  
