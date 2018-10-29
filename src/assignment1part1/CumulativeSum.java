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
        super(name,description);//calling the constructor of the parent class to initialize the parameters name and description        
    }
    @Override
    public double [] execute(double[] array){
        int i,j;
        double[] output = array.clone();
        for(i=0;i<array.length;i++){ // that loop read all the elements of the array
            output[i]=0; // each element is set to zero to allow the cumulative sum to be calculated 
            for(j=0;j<=i;j++){ // for every element of the array we add all the previous elements together including itself and return to value to the current element
                output[i]+=array[j];
            }
        }
        
        return output;
    }
    
}
