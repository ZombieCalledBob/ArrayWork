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
        super(name,description);// call the parent constructor to init the parameters name and description
        this.deviance = deviance;
    }
    @Override
    public double[] execute(double[] array) {
        double[] output = array.clone();
        int i=0;
        for (i=0; i<output.length;i++){// this loop reads all the elements of the array
            output[i]=output[i]-this.deviance;// we substract the deviance from each element of the array
        }
        return output;
    }
    
}
