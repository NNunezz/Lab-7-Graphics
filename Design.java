import java.awt.*;
import java.applet.*;

class Design
{
    public static void drawSymbol(Graphics g) 
    {
         Expo.setColor(g,Expo.yellow);// Stars in the middle
        Expo.fillStar(g,505,350,100,12);
        Expo.setColor(g,Expo.lightYellow);
        Expo.fillStar(g,505,350,75,12);
        Expo.setColor(g,Expo.lightOrange);
        Expo.fillStar(g,505,350,50,12);
        Expo.setColor(g,Expo.bronze);
        Expo.fillStar(g,505,350,25,12);
    }
}   