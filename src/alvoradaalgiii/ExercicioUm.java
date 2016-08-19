package alvoradaalgiii;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author1
 * @author2
 * @author3
 * @author4
 */


public class ExercicioUm {
    
  /**
 * Return 
 *
 * @param  String address path of the sequency number file.
 * @return  String  pinpoint the end of process.
 * @see      array
 */
    public String runExerciseOne (String path) {
        
        File fl = new File(path);
        String line = null;
        String[] arrayStringNumber;
        
        try {
            
            BufferedReader  br = new BufferedReader(new FileReader(fl));
            
            line = br.readLine();             
            arrayStringNumber = line.split(";");
            int[] arrayNumber = new int[arrayStringNumber.length];
            
            for (int i = 0; i < arrayStringNumber.length; i++){
                
                arrayNumber[i] = Integer.parseInt(arrayStringNumber[i]);
               
                
            }
            
            //insira aqui o seu código para responder este problema.
            //passe como paramentro o arranjo arrayNumber
          
        } catch (FileNotFoundException ex) {
            
            System.out.println("File Not found.");
            Logger.getLogger(ExercicioUm.class.getName()).log(Level.SEVERE, null, ex);
            
        } catch (IOException ex) {
            
             System.out.println("Line Read Error. ");
            Logger.getLogger(ExercicioUm.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        
          return "Over Exercise One";
        
    }
    
}
