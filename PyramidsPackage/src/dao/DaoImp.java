
package dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pyramids.Pyramids;


/**
 *
 * @author lenovo
 */
public class DaoImp implements PyramidsDao {

    @Override
    public List<Pyramids> GetObjectsFromTxt(String path) {
         List<Pyramids> allPyramids = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File(path));
 
                if (sc.hasNextLine()) sc.nextLine();
            
            while (sc.hasNextLine()) {
            String line = sc.nextLine();

    
            
                String[] row = line.split(",",-1);
                 
                String Pharaoh          = "".equals(row[0])  ? "" : row[0].trim();
                String Ancient_name     = "".equals(row[1])  ? "" : row[1].trim();
                String Modern_name      = "".equals(row[2])  ? "" : row[2].trim();
                int    Dynasty          = "".equals(row[3])  ? 0  : Integer.valueOf(row[3].trim());
                String Site             = "".equals(row[4])  ? "" : row[4].trim();
                double Base1_m          = "".equals(row[5])  ? 0  : Double.valueOf(row[5].trim());
                double Base2_m          = "".equals(row[6])  ? 0  : Double.valueOf(row[6].trim());
                double Height_m         = "".equals(row[7])  ? 0  : Double.valueOf(row[7].trim());
                       
                Pyramids p = new Pyramids( Pharaoh,  Ancient_name,  Modern_name,  Dynasty,  Site,  Base1_m,  Base2_m,  Height_m);
                allPyramids.add(p);
                
                
            
        }}
            catch (FileNotFoundException ex) {
                ex.printStackTrace();
        }
        
       
        System.out.println("number of imported records = " + allPyramids.size());
        return allPyramids;
    }
    
}
