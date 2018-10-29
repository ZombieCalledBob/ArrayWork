/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1part1;

/**
 *
 * @author werickpasson
 */
public class Assignment1Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //this is your main method of your Main class (Assignment1Part1) 
        //that method is the one that runs when you run your application
        AbstractArrayProcessor deviance, cumulative ;
        // We could have replaced AbstratArrayProcessor by ArrayProcessor
        //we instanciated a deviance object with a name, a description and a double value as deviance
        deviance = new Deviance("Deviance","This is a deviance object",1.0);
        cumulative = new CumulativeSum("Cumulative","This is a cumulative object");
        
        String devString  = deviance.example();
        String cumString  = cumulative.example();
        
                
        System.out.println(devString);
        System.out.println(cumString);
        
    }
    
}
