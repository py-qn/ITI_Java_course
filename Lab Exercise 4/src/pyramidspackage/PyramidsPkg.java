/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pyramidspackage;

import dao.DaoImp;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import pyramids.Pyramids;

/**
 *
 * @author lenovo
 */
public class PyramidsPkg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaoImp pd = new DaoImp();
        List<Pyramids> d = pd.GetObjectsFromTxt("pyramids.csv");
        
        int size = d.size();
        
        
        d.stream().sorted((o1, o2) -> {
            return (int)(o1.getHeight_m() - o2.getHeight_m()); //To change body of generated lambdas, choose Tools | Templates.
        }).forEach((t) -> { System.out.println(t.getHeight_m());
        });
        
        
        double mean = d.stream().map(t -> t.getHeight_m()).reduce(Double::sum).get()/size;
        
        System.out.println("the avarege = "  + mean );
        
        Pyramids median_height = d.stream().sorted((o1, o2) -> {
            return (int)(o1.getHeight_m() - o2.getHeight_m()); //To change body of generated lambdas, choose Tools | Templates.
        }).collect(Collectors.toList()).get(size/2);
        
        System.out.println("median height = "  + median_height.getHeight_m());
        
        
        Pyramids q1_height = d.stream().sorted((o1, o2) -> {
            return (int)(o1.getHeight_m() - o2.getHeight_m()); //To change body of generated lambdas, choose Tools | Templates.
        }).collect(Collectors.toList()).get(size/4);
        
        System.out.println("Q1 height = "  + q1_height.getHeight_m());
        
        Pyramids q3_height = d.stream().sorted((o1, o2) -> {
            return (int)(o1.getHeight_m() - o2.getHeight_m()); //To change body of generated lambdas, choose Tools | Templates.
        }).collect(Collectors.toList()).get(size*3/4);
        
        System.out.println("Q3 height = "  + q3_height.getHeight_m());
    
}}
