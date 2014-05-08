/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignmenttwodistwo;
import java.util.LinkedList;


/**
 *
 * @author rohan
 */
public class WindowManager {
    
    LinkedList windowSystemManager ;
    
    public void WindowManager( ) 
    {
       windowSystemManager = new LinkedList<>() ;
    }
    
    public WindowSystem addWindow( int width , int height )
    {
        WindowSystem variableWindowSystem = new WindowSystem( width , height );
        windowSystemManager.add(variableWindowSystem) ;
        
        return variableWindowSystem ;
        
    }
    
    public void deleteWindow( WindowSystem variablWindowSystem )
    {
        windowSystemManager.remove(variablWindowSystem);   
    }
    
}
