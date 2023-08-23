/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurpleAmerica;
import edu.princeton.cs.algs4.*;

/**
 *
 * @author ianut
 */
public class Main {

    
    public static void drawHappyFace (double x, double y, double radius) {
        
        StdDraw.circle(x, y, radius); // drawing the head
        StdDraw.arc(x, y, radius*0.5, 180, 360); // drawing the mouth
        StdDraw.circle(x-(radius*0.3),y+(radius*0.3),(radius/10)); // drawing the left eye
        StdDraw.circle(x+(radius*0.3),y+(radius*0.3),(radius/10)); // drawing the right eye
        }
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 1 ; i <=3 ; i++) {
            double x = i/4.0;
            double y = 1-(i/4.0);
        drawHappyFace(x,y,0.15); // x=0.75, y=0.25
                                 // x=0.5, y=0.5
                                 // x=0.25, y=0.75
        System.out.println("Face " + i + " with coordinates (" + x + "," + y + ")");  
        System.out.println();
        }
    }
    
}
