 package alvoradaalgiii;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author alexandre
 */


public class AlvoradaAlgIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ExercicioUm eUm = new ExercicioUm();        
        eUm.runExerciseOne(getPathFile());
        
    }   
    
    public static final String getPathFile() {
        
         final JFileChooser fc = new JFileChooser();//Por que fina?
        int returnValue = fc.showOpenDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            
          File seleFile = fc.getSelectedFile();
          return seleFile.getAbsolutePath();
          
        } 
        
        return null;
        
    }
    
}
