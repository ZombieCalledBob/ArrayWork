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
public class CumulativeSum extends AbstractArrayProcessor {
    
    public CumulativeSum(String name, String description){
        super(name,description);        
    }
    @Override
    public double [] execute(double[] array){
        int i,j;
        double[] output = array.clone();
        for(i=0;i<array.length;i++){
            for(j=0;j<=i;j++){
                output[i]+=array[j];
            }
        }
        
        return output;
    }
    
}
