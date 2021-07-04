package lab.exercise.pkg2;

import lab.exercise.pkg2.*;

/**
 *
 * @author lenovo
 */
public class LabExercise2 {

    public static void main(String[] args) {

        CheckStr x = (a, b) -> a.length() > b.length();

        boolean y = x.betterString("Ahmed", "Mohamed");
        
        Letter p = a -> {
        
        for (int i=0; i<a.length(); i++ ) {
            if (! Character.isLetter(a.charAt(i))) {
                return false;
                         
            } 
         
           
        
        }  return true;
        
};

        
        boolean z = p.betterString("opaa");
        
        System.out.println(z);

    }

}
