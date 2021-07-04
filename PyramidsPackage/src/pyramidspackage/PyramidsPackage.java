/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidspackage;

import dao.DaoImp;
import java.util.Iterator;
import java.util.List;
import pyramids.Pyramids;

/**
 *
 * @author lenovo
 */
public class PyramidsPackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoImp pd = new DaoImp();
        List<Pyramids> d = pd.GetObjectsFromTxt("pyramids.csv");
        for (Iterator<Pyramids> iterator = d.iterator(); iterator.hasNext();) {
            Pyramids next = iterator.next();
            System.out.println(next);
            
        }
    
}}
