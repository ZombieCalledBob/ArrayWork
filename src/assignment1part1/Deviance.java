/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1part1;

/**
 *
 * @author darklord
 */

public class Deviance extends AbstractArrayProcessor {
    private double deviance = 0;
    public Deviance(String name, String description, double deviance){
        super(name,description);
        this.deviance = deviance;
    }
    @Override
    public double[] execute(double[] array) {
        double[] output = array.clone();
        for (double e : output){
            e = e - this.deviance;
        }
        return output;
    }
    
}
