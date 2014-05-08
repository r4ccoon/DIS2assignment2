/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignmenttwodistwo;

import de.rwth.hci.Graphics.GraphicsEventSystem;
import java.awt.Color;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author rohan
 */
public class WindowSystem extends GraphicsEventSystem {
    
    private final int width ;
    private final int height ;

   
    private enum ratioConvertType 
    {
        ratioHeight , ratioWidth
    }
    
    public WindowSystem(int width, int height) {
        
        super(width, height);
        this.width = width ;
        this.height = height ;
        
    }
    
    @Override
    protected void handlePaint() {
        //throw new UnsupportedOperationException("Not supported yet.");        
        //To change body of generated methods, choose Tools | Templates
      
        this.setColor(Color.BLUE ) ;
        drawTheLine ( 0.2f , 0.3f , 0.8f , 0.7f ) ;

    }

     private int convert(ratioConvertType ratioConvertType, float startX) {
         
         switch( ratioConvertType)
         {
             case ratioWidth:
                 return ( int ) (startX * this.width ) ;
                 
             case ratioHeight:
                 return ( int ) ( startX * this.height ) ;
                 
             default:
                 return 0 ;
         } 
         
    }

   public void drawTheLine ( float startX , float startY , float endX , float endY )
   {
       int pointStartX = convert( ratioConvertType.ratioWidth , startX ) ;
       int pointStartY = convert( ratioConvertType.ratioHeight , startY ) ;
       
       int pointEndX = convert( ratioConvertType.ratioWidth , endX ) ;
       int pointEndY = convert( ratioConvertType.ratioHeight , endY ) ;
       
       this.drawLine(pointStartX, pointStartY, pointEndX, pointEndY);

   }

   
}
