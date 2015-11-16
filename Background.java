import java.awt.*;
import java.applet.*;


class Background 
{
    public static void drawLayer(Graphics g) 
    {
         Expo.setColor(g,Expo.indigo);// 1st
           Expo.fillRectangle(g,0,0,1000,325);
           Expo.setColor(g,Expo.lightBlue);// 2nd
           Expo.fillRectangle(g,0,325,1000,650);
           Expo.setColor(g,Expo.blue);// Borders Up and Bottom
           Expo.fillRectangle(g,0,650,1000,700);
           Expo.fillRectangle(g,0,0,1000,50);
         
    }   
}    
 